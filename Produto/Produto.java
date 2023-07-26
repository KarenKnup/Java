public class Produto {
  String nome;
  double valor;//nextDouble
  int qtde; //nextInt
  String descricao; //next ou  nextLine
  String cod_barras;

    public void Exibe_Dados() {
      System.out.println("\n ---- Dados do Produto ----\n");
    System.out.println("Nome do produto: " + nome);
    System.out.println("Valor do produto: " + valor);
    System.out.println("Quantidade de unidades desse produto: " + qtde);
    System.out.println("Descrição do produto: " + descricao);
    System.out.println("Código de barras do produto: " + cod_barras);
  }
}