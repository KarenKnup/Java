import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String op="";

  do{
         System.out.println("\n\n[+] Soma\n[-] Subtração\n[*] Multiplicação\n[/] Divisão\n[^] Potência\n[r] Raiz\n[fim] Sair");
			System.out.print("\nDigite uma operação: ");
			op=sc.nextLine();

    if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("r") || op.equals("^")){
      Calculadora.DecideOperacao(op);
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