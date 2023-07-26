import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {
    private Connection connection;
    private Statement statement;

    public DatabaseHandler() {
        try {
            // Configurar a conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/java"; // Nome do banco de dados
            String username = "root";
            String password = "020699";
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void criarTabelaClientes() {
        try {
            // Verificar se a tabela já existe no banco de dados
            DatabaseMetaData metadata = connection.getMetaData();
            ResultSet resultSet = metadata.getTables(null, null, "clientes", null);
            if (!resultSet.next()) {
                // A tabela não existe, então vamos criá-la
                String query = "CREATE TABLE clientes (id INT PRIMARY KEY, nome VARCHAR(100) NOT NULL, endereco VARCHAR(100) NOT NULL, postalCode INT NOT NULL, pais VARCHAR(20) NOT NULL, cpf INT NOT NULL, passaporte INT NOT NULL, email VARCHAR(100) NOT NULL, dataNascimento VARCHAR(20) NOT NULL)";
                statement.executeUpdate(query);
                System.out.println("Tabela criada com sucesso.");
            } else {
                System.out.println("A tabela já existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirCliente(Cliente cliente) {
        try {
            // Executar uma consulta SQL para inserir os dados na tabela
            String query = "INSERT INTO clientes (id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, cliente.getId());
            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getEndereco());
            preparedStatement.setInt(4, cliente.getPostalCode());
            preparedStatement.setString(5, cliente.getPais());
            preparedStatement.setInt(6, cliente.getCpf());
            preparedStatement.setInt(7, cliente.getPassaporte());
            preparedStatement.setString(8, cliente.getEmail());
            preparedStatement.setString(9, cliente.getDataNascimento());
            preparedStatement.executeUpdate();
            System.out.println("Cliente inserido com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarCliente(int id, Cliente cliente) {
        try {
            // Executar uma consulta SQL para alterar os dados do cliente na tabela
            String query = "UPDATE clientes SET nome = ?, endereco = ?, postalCode = ?, pais = ?, cpf = ?, passaporte = ?, email = ?, dataNascimento = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getEndereco());
            preparedStatement.setInt(3, cliente.getPostalCode());
            preparedStatement.setString(4, cliente.getPais());
            preparedStatement.setInt(5, cliente.getCpf());
            preparedStatement.setInt(6, cliente.getPassaporte());
            preparedStatement.setString(7, cliente.getEmail());
            preparedStatement.setString(8, cliente.getDataNascimento());
            preparedStatement.setInt(9, id);
            preparedStatement.executeUpdate();
            System.out.println("Cliente alterado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirCliente(int id) {
        try {
            // Executar uma consulta SQL para excluir o cliente da tabela
            String query = "DELETE FROM clientes WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Cliente excluído com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            // Executar uma consulta SQL para listar todos os clientes da tabela
            String query = "SELECT * FROM clientes";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                int postalCode = resultSet.getInt("postalCode");
                String pais = resultSet.getString("pais");
                int cpf = resultSet.getInt("cpf");
                int passaporte = resultSet.getInt("passaporte");
                String email = resultSet.getString("email");
                String dataNascimento = resultSet.getString("dataNascimento");

                Cliente cliente = new Cliente();
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setEndereco(endereco);
                cliente.setPostalCode(postalCode);
                cliente.setPais(pais);
                cliente.setCpf(cpf);
                cliente.setPassaporte(passaporte);
                cliente.setEmail(email);
                cliente.setDataNascimento(dataNascimento);

                clientes.add(cliente);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void criarTabelaQuartos() {
        try {
            // Verificar se a tabela já existe no banco de dados
            DatabaseMetaData metadata = connection.getMetaData();
            ResultSet resultSet = metadata.getTables(null, null, "quartos", null);
            if (!resultSet.next()) {
                // A tabela não existe, então vamos criá-la
                String query = "CREATE TABLE quartos (id INT PRIMARY KEY, nomeQuarto VARCHAR(100) NOT NULL, qtdeCamas INT NOT NULL, temBanheiro BOOLEAN NOT NULL, descricao VARCHAR(100))";
                statement.executeUpdate(query);
                System.out.println("Tabela quartos criada com sucesso.");
            } else {
                System.out.println("A tabela quartos já existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirQuarto(Quarto quarto) {
        try {
            String query = "INSERT INTO quartos (id, nomeQuarto, qtdeCamas, temBanheiro, descricao) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, quarto.getId());
            preparedStatement.setString(2, quarto.getNomeQuarto());
            preparedStatement.setInt(3, quarto.getQtdeCamas());
            preparedStatement.setBoolean(4, quarto.isTemBanheiro());
            preparedStatement.setString(5, quarto.getDescricao());
            preparedStatement.executeUpdate();
            System.out.println("Quarto inserido com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarQuarto(int id, Quarto quarto) {
        try {
            String query = "UPDATE quartos SET nomeQuarto = ?, qtdeCamas = ?, temBanheiro = ?, descricao = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, quarto.getNomeQuarto());
            preparedStatement.setInt(2, quarto.getQtdeCamas());
            preparedStatement.setBoolean(3, quarto.isTemBanheiro());
            preparedStatement.setString(4, quarto.getDescricao());
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            System.out.println("Quarto alterado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirQuarto(int id) {
        try {
            String query = "DELETE FROM quartos WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Quarto excluído com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Quarto> listarQuartos() {
        List<Quarto> quartos = new ArrayList<>();
        try {
            String query = "SELECT * FROM quartos";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nomeQuarto = resultSet.getString("nomeQuarto");
                int qtdeCamas = resultSet.getInt("qtdeCamas");
                boolean temBanheiro = resultSet.getBoolean("temBanheiro");
                String descricao = resultSet.getString("descricao");

                Quarto quarto = new Quarto();
                quarto.setId(id);
                quarto.setNomeQuarto(nomeQuarto);
                quarto.setQtdeCamas(qtdeCamas);
                quarto.setTemBanheiro(temBanheiro);
                quarto.setDescricao(descricao);

                quartos.add(quarto);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quartos;
    }

    public void criarTabelaCamas() {
        try {
            DatabaseMetaData metadata = connection.getMetaData();
            ResultSet resultSet = metadata.getTables(null, null, "camas", null);
            if (!resultSet.next()) {
                String query = "CREATE TABLE camas (id INT PRIMARY KEY, codigoCama INT NOT NULL, ehBeliche BOOLEAN NOT NULL, posicao VARCHAR(20) NOT NULL, descricao VARCHAR(100))";
                statement.executeUpdate(query);
                System.out.println("Tabela camas criada com sucesso.");
            } else {
                System.out.println("A tabela camas já existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirCama(Cama cama) {
        try {
            String query = "INSERT INTO camas (id, codigoCama, ehBeliche, posicao, descricao) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, cama.getId());
            preparedStatement.setInt(2, cama.getCodigoCama());
            preparedStatement.setBoolean(3, cama.isEhBeliche());
            preparedStatement.setString(4, cama.getPosicao());
            preparedStatement.setString(5, cama.getDescricao());
            preparedStatement.executeUpdate();
            System.out.println("Cama inserida com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarCama(int id, Cama cama) {
        try {
            String query = "UPDATE camas SET codigoCama = ?, ehBeliche = ?, posicao = ?, descricao = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, cama.getCodigoCama());
            preparedStatement.setBoolean(2, cama.isEhBeliche());
            preparedStatement.setString(3, cama.getPosicao());
            preparedStatement.setString(4, cama.getDescricao());
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            System.out.println("Cama alterada com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirCama(int id) {
        try {
            String query = "DELETE FROM camas WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Cama excluída com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cama> listarCamas() {
        List<Cama> camas = new ArrayList<>();
        try {
            String query = "SELECT * FROM camas";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int codigoCama = resultSet.getInt("codigoCama");
                boolean ehBeliche = resultSet.getBoolean("ehBeliche");
                String posicao = resultSet.getString("posicao");
                String descricao = resultSet.getString("descricao");

                Cama cama = new Cama();
                cama.setId(id);
                cama.setCodigoCama(codigoCama);
                cama.setEhBeliche(ehBeliche);
                cama.setPosicao(posicao);
                cama.setDescricao(descricao);

                camas.add(cama);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return camas;
    }

    public void criarTabelaReservas() {
        try {
            DatabaseMetaData metadata = connection.getMetaData();
            ResultSet resultSet = metadata.getTables(null, null, "reservas", null);
            if (!resultSet.next()) {
                String query = "CREATE TABLE reservas (id INT PRIMARY KEY, idQuarto INT NOT NULL, idCama INT NOT NULL, idCliente INT NOT NULL, dataEntrada VARCHAR(20) NOT NULL, dataSaida VARCHAR(20) NOT NULL)";
                statement.executeUpdate(query);
                System.out.println("Tabela reservas criada com sucesso.");
            } else {
                System.out.println("A tabela reservas já existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirReserva(Reserva reserva) {
        try {
            String query = "INSERT INTO reservas (id, idQuarto, idCama, idCliente, dataEntrada, dataSaida) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, reserva.getId());
            preparedStatement.setInt(2, reserva.getIdQuarto());
            preparedStatement.setInt(3, reserva.getIdCama());
            preparedStatement.setInt(4, reserva.getIdCliente());
            preparedStatement.setString(5, reserva.getDataEntrada());
            preparedStatement.setString(6, reserva.getDataSaida());
            preparedStatement.executeUpdate();
            System.out.println("Reserva inserida com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarReserva(int id, Reserva reserva) {
        try {
            String query = "UPDATE reservas SET idQuarto = ?, idCama = ?, idCliente = ?, dataEntrada = ?, dataSaida = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, reserva.getIdQuarto());
            preparedStatement.setInt(2, reserva.getIdCama());
            preparedStatement.setInt(3, reserva.getIdCliente());
            preparedStatement.setString(4, reserva.getDataEntrada());
            preparedStatement.setString(5, reserva.getDataSaida());
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
            System.out.println("Reserva alterada com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirReserva(int id) {
        try {
            String query = "DELETE FROM reservas WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Reserva excluída com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Reserva> listarReservas() {
        List<Reserva> reservas = new ArrayList<>();
        try {
            String query = "SELECT * FROM reservas";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int idQuarto = resultSet.getInt("idQuarto");
                int idCama = resultSet.getInt("idCama");
                int idCliente = resultSet.getInt("idCliente");
                String dataEntrada = resultSet.getString("dataEntrada");
                String dataSaida = resultSet.getString("dataSaida");

                Reserva reserva = new Reserva();
                reserva.setId(id);
                reserva.setIdQuarto(idQuarto);
                reserva.setIdCama(idCama);
                reserva.setIdCliente(idCliente);
                reserva.setDataEntrada(dataEntrada);
                reserva.setDataSaida(dataSaida);

                reservas.add(reserva);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservas;
    }

    public void fecharConexao() {
        try {
            // Fechar a conexão com o banco de dados
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}