import java.util.Scanner;

public class Produto {
  public String nome;
  public double valor;
  public String descricao;
  public String cod_barras;
  public String categoria;
  public double peso;
  public String fabricante;
  public int ID;
  public int sku;

  public static int Menu() {
    int op = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n(1) Incluir produto");
    System.out.println("(2) Alterar produto");
    System.out.println("(3) Excluir produto");
    System.out.println("(4) Listar todos os produtos");
    System.out.println("(5) Listar produto");
    System.out.println("(0) Sair");

    System.out.print("\nDigite uma opção: ");
    op = sc.nextInt();
    sc.nextLine();

    return op;
  }
  
  public Produto Incluir_Produto() {
    Scanner sc = new Scanner(System.in);
    Produto produto = new Produto();
    System.out.println("\n---- Preencher dados do Produto ----\n");
    System.out.print("ID do produto: ");
    produto.ID = sc.nextInt();
    sc.nextLine();
    System.out.print("SKU do produto: ");
    produto.sku = sc.nextInt();
    sc.nextLine();
    System.out.print("Nome do produto: ");
    produto.nome = sc.nextLine();
    System.out.print("Valor do produto (R$): ");
    produto.valor = sc.nextDouble();
    sc.nextLine();
    System.out.print("Descrição do produto: ");
    produto.descricao = sc.nextLine();
    System.out.print("Código de barras do produto: ");
    produto.cod_barras = sc.nextLine();
    System.out.print("Categoria do produto: ");
    produto.categoria = sc.nextLine();
    System.out.print("Peso do produto (Kg): ");
    produto.peso = sc.nextDouble();
    sc.nextLine();
    System.out.print("Fabricante do produto: ");
    produto.fabricante = sc.nextLine();

    return produto;
  }


  public void produto (Produto p) {
      System.out.println("\n---- Dados do Produto ----\n");
     System.out.println("ID do produto: " + p.ID);
      System.out.println("SKU do produto: " + p.sku);
      System.out.println("Nome do produto: " + p.nome);
      System.out.println("Valor do produto: R$ " + p.valor);
      System.out.println("Descrição do produto: " + p.descricao);
      System.out.println("Código de barras do produto: " + p.cod_barras);
      System.out.println("Categoria do produto: " + p.categoria);
      System.out.println("Peso do produto: " + p.peso + " Kg");
      System.out.println("Fabricante do produto: " + p.fabricante);   
  }

  public void Listar_Produtos(ArrayList<Produto> produtos) {
    System.out.println("\n---- Lista de Produtos ----\n");
    for (Produto p : produtos) {
      produto(p);
    }
  
}

public void Listar_Produto(ArrayList<Produto> produtos) {
  System.out.println("\n---- Listar Produto ----\n");
  String nome_prod;
  Scanner sc = new Scanner(System.in);

  System.out.print("Digite o nome do produto: ");
  nome_prod = sc.nextLine();

  boolean produtoEncontrado = false;
  for (Produto p : produtos) {
    if (p.nome.equalsIgnoreCase(nome_prod)) {
      produto(p);
      produtoEncontrado = true;
      break;
    }
  }
  
  if (!produtoEncontrado) {
    System.out.println("Produto não encontrado!");
  }
}

}
