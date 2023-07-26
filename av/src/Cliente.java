import java.util.Scanner;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private int postalCode;
    private String pais;
    private int cpf;
    private int passaporte;
    private String email;
    private String dataNascimento;

    public Cliente() { //construtor da classe
        this.id = 0;
        this.nome = "0";
        this.endereco = "0";
        this.postalCode = 0;
        this.pais = "0";
        this.cpf = 0;
        this.passaporte = 0;
        this.email = "0";
        this.dataNascimento = "0";
    }

    public void obterVariaveis() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite o endereço: ");
        this.endereco = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        this.postalCode = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o país: ");
        this.pais = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        this.cpf = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o número do passaporte: ");
        this.passaporte = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o e-mail: ");
        this.email = scanner.nextLine();

        System.out.print("Digite a data de nascimento: ");
        this.dataNascimento = scanner.nextLine();

        scanner.close();

    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(int passaporte) {
        this.passaporte = passaporte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}