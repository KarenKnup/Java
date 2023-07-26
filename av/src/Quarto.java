import java.util.Scanner;

public class Quarto {
    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;

    public Quarto() {
        this.id = 0;
        this.nomeQuarto = "";
        this.qtdeCamas = 0;
        this.temBanheiro = false;
        this.descricao = "";
    }

    public void obterVariaveis() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do quarto: ");
        this.nomeQuarto = scanner.nextLine();

        System.out.print("Digite a quantidade de camas: ");
        this.qtdeCamas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("O quarto tem banheiro? (true/false): ");
        this.temBanheiro = scanner.nextBoolean();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite a descrição do quarto: ");
        this.descricao = scanner.nextLine();

        scanner.close();
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public int getQtdeCamas() {
        return qtdeCamas;
    }

    public void setQtdeCamas(int qtdeCamas) {
        this.qtdeCamas = qtdeCamas;
    }

    public boolean isTemBanheiro() {
        return temBanheiro;
    }

    public void setTemBanheiro(boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}