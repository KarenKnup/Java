import java.util.Scanner;
class Main {
    public static int Opcao() {
        int opc;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n[0] Inserir\n[1] Alterar\n[2] Remover\n[3] Listar");
        System.out.print("\nDigite uma operação: ");
        opc = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        return opc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op="";
        int opcao, id;
        boolean clientes = false;
        boolean camas = false;
        boolean quartos = false;
        boolean reservas = false;

        do{
            System.out.println("\n\n[0] Cliente\n[1] Quarto\n[2] Cama\n[3] Reserva\n[fim] Sair");
            System.out.print("\nDigite uma operação: ");
            op=sc.nextLine();
            opcao=Opcao();

            if(op.equals("0") || op.equals("1") || op.equals("2") || op.equals("3")){
                DatabaseHandler dbHandler = new DatabaseHandler();
                switch (op){
                    case "0":
                        if(!clientes){//clientes==false
                            DatabaseHandler data_clientes = new DatabaseHandler();
                            data_clientes.criarTabelaClientes();
                            data_clientes.fecharConexao();
                            clientes=true;
                        }
                        Cliente cliente = new Cliente();
                        Cliente cliente2 = new Cliente();

                        if(opcao==0){ //Inserir
                            cliente.obterVariaveis();
                            dbHandler.inserirCliente(cliente);
                        } else if(opcao==1) { //Alterar
                            System.out.print("\nID do cliente a ser alterado: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            cliente2.obterVariaveis();
                            dbHandler.alterarCliente(id, cliente2);
                        } else if(opcao==2) { //Remover
                            System.out.print("\nID do cliente a ser removido: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            dbHandler.excluirCliente(id);
                        } else { //Listar
                            dbHandler.listarClientes();
                        }
                        dbHandler.fecharConexao();
                        break;
                    case "1":
                        if(!quartos){
                            DatabaseHandler data_quartos = new DatabaseHandler();
                            data_quartos.criarTabelaQuartos();
                            data_quartos.fecharConexao();
                            quartos=true;
                        }
                        Quarto quarto = new Quarto();
                        Quarto quarto2 = new Quarto();

                        if(opcao==0){ //Inserir
                            quarto.obterVariaveis();
                            dbHandler.inserirQuarto(quarto);
                        } else if(opcao==1) { //Alterar
                            System.out.print("\nID do quarto a ser alterado: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            quarto2.obterVariaveis();
                            dbHandler.alterarQuarto(id, quarto2);
                        } else if(opcao==2) { //Remover
                            System.out.print("\nID do quarto a ser removido: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            dbHandler.excluirQuarto(id);
                        } else { //Listar
                            dbHandler.listarQuartos();
                        }
                        dbHandler.fecharConexao();
                        break;
                    case "2":
                        if(!camas){
                            DatabaseHandler data_camas = new DatabaseHandler();
                            data_camas.criarTabelaCamas();
                            data_camas.fecharConexao();
                            camas=true;
                        }
                        Cama cama = new Cama();
                        Cama cama2 = new Cama();
                        dbHandler = new DatabaseHandler();

                        if(opcao==0){ //Inserir
                            cama.obterVariaveis();
                            dbHandler.inserirCama(cama);
                        } else if(opcao==1) { //Alterar
                            System.out.print("\nID da cama a ser alterada: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            cama2.obterVariaveis();
                            dbHandler.alterarCama(id, cama2);
                        } else if(opcao==2) { //Remover
                            System.out.print("\nID da cama a ser removida: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            dbHandler.excluirCama(id);
                        } else { //Listar
                            dbHandler.listarCamas();
                        }
                        dbHandler.fecharConexao();
                        break;
                    case "3":
                        if(!reservas){
                            DatabaseHandler data_reservas = new DatabaseHandler();
                            data_reservas.criarTabelaReservas();
                            data_reservas.fecharConexao();
                            reservas=true;
                        }
                        Reserva reserva = new Reserva();
                        Reserva reserva2 = new Reserva();
                        dbHandler = new DatabaseHandler();

                        if(opcao==0){ //Inserir
                            reserva.obterVariaveis();
                            dbHandler.inserirReserva(reserva);
                        } else if(opcao==1) { //Alterar
                            System.out.print("\nID da reserva a ser alterada: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            reserva2.obterVariaveis();
                            dbHandler.alterarReserva(id, reserva2);
                        } else if(opcao==2) { //Remover
                            System.out.print("\nID da reserva a ser removida: ");
                            id=sc.nextInt();
                            sc.nextLine(); // Consumir a quebra de linha
                            dbHandler.excluirReserva(id);
                        } else { //Listar
                            dbHandler.listarReservas();
                        }
                        dbHandler.fecharConexao();
                        break;
                }
            } else {
                if(op.equals("fim")){
                    System.out.println ("\n\nPrograma finalizado!");
                } else {
                    System.out.println ("\n\nOpcao invalida! Tente novamente.");
                }
            }

        } while (!op.equals("fim"));
    }
}