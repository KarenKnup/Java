import java.util.Scanner;
import java.util.ArrayList;

class Produto {
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
  
  public void Incluir_Produto() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n---- Preencher dados do Produto ----\n");
    System.out.print("ID do produto: ");
    this.ID = sc.nextInt();
    sc.nextLine();
    System.out.print("SKU do produto: ");
    this.sku = sc.nextInt();
    sc.nextLine();
    System.out.print("Nome do produto: ");
    this.nome = sc.nextLine();
    System.out.print("Valor do produto (R$): ");
    this.valor = sc.nextDouble();
    sc.nextLine();
    System.out.print("Descrição do produto: ");
    this.descricao = sc.nextLine();
    System.out.print("Código de barras do produto: ");
    this.cod_barras = sc.nextLine();
    System.out.print("Categoria do produto: ");
    this.categoria = sc.nextLine();
    System.out.print("Peso do produto (Kg): ");
    this.peso = sc.nextDouble();
    sc.nextLine();
    System.out.print("Fabricante do produto: ");
    this.fabricante = sc.nextLine();
  }

  public static void produto (Produto p) {
      System.out.println("\n~~~~~~ Dados do Produto ~~~~~~\n");
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
  
   public static void Listar_Produtos (ArrayList<Produto> produtos) {
  System.out.println("\n---- Lista de Produtos ----");
    for (Produto p : produtos) {
      produto(p);
    }
  }

  public static void Listar_Produto (ArrayList<Produto> produtos) {
        System.out.println("\n---- Listar Produto ----");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto a ser listado: ");
        String nome_prod = sc.nextLine();

        for (Produto p : produtos) {
            if (nome_prod.equals(p.nome)) {
                produto(p);
                break;
            }
        }  
    }

  public static void Excluir_Produto (ArrayList<Produto> produtos) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o nome do produto a ser removido: ");
        String nome_prod = sc.nextLine();
    
    for (Produto p : produtos) {
            if (nome_prod.equals(p.nome)) {
              produtos.remove(p);
            }
        }
  }

  public static void Alterar_Produto (ArrayList<Produto> produtos) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite o nome do produto a ser alterado: ");
        String nome_prod = sc.nextLine();
    
    for (int i=0; i<produtos.size(); i++) {
            if (nome_prod.equals(produtos.get(i).nome)) {
             Produto p2 = new Produto();
             p2.Incluir_Produto();
             produtos.set(i,p2);
            }
        }
  }
  
}