import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
			Calculadora calc = new Calculadora();
			
			String operacao = "";
			
			System.out.println("\n\n[+] Soma\n[-] Subtração\n[*] Multiplicação\n[/] Divisão\n[fim] Sair");
			System.out.print("\nDigite uma operação: ");
			operacao=sc.nextLine();
			
			do {
        if((!operacao.equals("fim")) && (operacao.equals("+") || operacao.equals("*") || operacao.equals("-") || operacao.equals("/"))){
          	float resultado = calc.DecideOperacao(operacao);
                 if(operacao.equals("+")){
            System.out.println("\n\tSoma = x + y = "+resultado);
          } else {
            if(operacao.equals("-")){
              System.out.println("\n\tSubtração = x - y = "+resultado);
            } else {
              if(operacao.equals("*")){
                System.out.println("\n\tMultiplicação = x * y = "+resultado);
              } else {
                if(operacao.equals("/")){
                  System.out.println("\n\tDivisão = x / y = "+resultado);
                } 
              }
            }
          }
        } else {
          if(operacao.equals("fim")){
            break;
          } else {
            System.out.println("\n\tOperação inválida! Tente novamente.\n");
          }
        }

       
			System.out.println("\n\n[+] Soma\n[-] Subtração\n[*] Multiplicação\n[/] Divisão\n[fim] Sair");
			System.out.print("\nDigite uma operação: ");
			operacao=sc.nextLine();	
			} while(!(operacao.equals("fim")));
			sc.close();
	}

}