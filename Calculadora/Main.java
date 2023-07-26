package faeterj;
  
import java.util.Scanner;
public class Main {
   public static void Dados(float n1, float n2){
       
      //sc.close();
  }
  
	public static void main(String[] args) {
    String op;
    float n1=0,n2=0;
    int n3=0, n4=0;

    do{
       op=Calculadora.menu();
       if (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")){
         Scanner sc=new Scanner(System.in);
              System.out.print("\nDigite o primeiro número: ");
              n1 = sc.nextFloat();
              System.out.print("Digite o segundo número: ");
              n2 = sc.nextFloat();
       } else if (op.equals("^")){
         Scanner sc=new Scanner(System.in);
         System.out.print("\nDigite o primeiro número: ");
              n3 = sc.nextInt();
              System.out.print("Elevado a: ");
              n4 = sc.nextInt();
       } else if (op.equals("r")){
         Scanner sc=new Scanner(System.in);
         System.out.print("\nRaiz quadrada de: ");
              n3 = sc.nextInt();
       } else {
        op=Calculadora.menu();
       }
      
      switch(op){
        case "+": System.out.println("\n\t Soma = "+n1+" + "+n2 +" = "+Calculadora.Soma(n1,n2));
        System.out.println("________________________________________");
                break;
        case "-": System.out.println("\n\t Subtração = "+n1+" - "+n2 +" = "+Calculadora.Subtrai(n1,n2));
        System.out.println("________________________________________");
                break;
        case "*": System.out.println("\n\t Multiplicação = "+n1+" * "+n2 +" = "+Calculadora.Multiplica(n1,n2));
        System.out.println("________________________________________");
                break;
        case "/": System.out.println("\n\t Divisão = "+n1+" / "+n2 +" = "+Calculadora.Divide(n1,n2));
        System.out.println("________________________________________");
                break;
       case "^": System.out.println("\n\t Potência = "+n3+" elevado a "+n4 +" = "+Calculadora.Potencia(n3,n4));
        System.out.println("________________________________________");
                break;
        case "r": System.out.println("\n\t Raiz Quadrada de "+n3+" = "+Calculadora.Raiz(n3));
        System.out.println("________________________________________");
                break;
        case "0":         System.out.println("________________________________________");
System.out.println("\n\tPrograma finalizado!");
                break;
        default: System.out.println("\n\tOpção inválida! Tente novamente!");
          break;
      }
    } while (!(op.equals("0")));
    
    
  }
}