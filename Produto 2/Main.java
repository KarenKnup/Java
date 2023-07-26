import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String continua="";
    ArrayList<Produto> produtos = new ArrayList();

     while(!continua.equals("fim")){
        Produto p = new Produto();
        System.out.print("\n ---- Preencher dados do Produto ----\n");
       System.out.print("Nome do produto: ");
        p.nome = sc.nextLine();
        System.out.print("Valor do produto: ");
        p.valor = sc.nextDouble();
        sc.nextLine();
        System.out.print("Quantidade de unidades desse produto: ");
        p.qtde = sc.nextInt();
        sc.nextLine(); // consume the newline character in the buffer
        System.out.print("Descrição do produto: ");
        p.descricao = sc.nextLine();
        System.out.print("Código de barras do produto: ");
        p.cod_barras = sc.nextLine();
        
           produtos.add(p);
       System.out.print("\n\tDeseja adicionar mais algum produto? (Digite 'fim' para sair) ");
        continua = sc.nextLine();
      }
    
    //imprimir dados do vetor em Produtos (imprime 1 objeto por vez)
    
    /*for(int i=0; i<produtos.size(); i++){
      produtos.get(i).Exibe_Dados();
    }*/
    
    for(Produto prd : produtos){
      prd.Exibe_Dados();
    }
    
  }
}