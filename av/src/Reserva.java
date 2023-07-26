import java.util.Scanner;

public class Reserva {
    private int id;
    private int idQuarto;
    private int idCama;
    private int idCliente;
    private String dataEntrada;
    private String dataSaida;

    public Reserva() {
        this.id = 0;
        this.idQuarto = 0;
        this.idCama = 0;
        this.idCliente = 0;
        this.dataEntrada = "";
        this.dataSaida = "";
    }

    public void obterVariaveis() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o ID do quarto: ");
        this.idQuarto = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o ID da cama: ");
        this.idCama = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o ID do cliente: ");
        this.idCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite a data de entrada: ");
        this.dataEntrada = scanner.nextLine();

        System.out.print("Digite a data de saída: ");
        this.dataSaida = scanner.nextLine();

        scanner.close();
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getIdCama() {
        return idCama;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
}