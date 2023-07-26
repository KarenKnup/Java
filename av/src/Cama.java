import java.util.Scanner;

public class Cama {
    private int id;
    private int codigoCama;
    private boolean ehBeliche;
    private String posicao;
    private String descricao;

    public Cama() {
        this.id = 0;
        this.codigoCama = 0;
        this.ehBeliche = false;
        this.posicao = "";
        this.descricao = "";
    }

    public void obterVariaveis() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o código da cama: ");
        this.codigoCama = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("A cama é beliche? (true/false): ");
        this.ehBeliche = scanner.nextBoolean();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite a posição da cama: ");
        this.posicao = scanner.nextLine();

        System.out.print("Digite a descrição da cama: ");
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

    public int getCodigoCama() {
        return codigoCama;
    }

    public void setCodigoCama(int codigoCama) {
        this.codigoCama = codigoCama;
    }

    public boolean isEhBeliche() {
        return ehBeliche;
    }

    public void setEhBeliche(boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}