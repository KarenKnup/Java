import java.util.Scanner;
import java.lang.Math;

public class Calculadora  {
	private static float x, y;
  private static double m,n;
	
	public static void DecideOperacao (String op) {
    Scanner sc = new Scanner(System.in);

    if(!op.equals("r") && !op.equals("^")){
      System.out.print("Digite x: ");
      x=sc.nextFloat();
      System.out.print("Digite y: ");
      y=sc.nextFloat();
    } else {
      if(op.equals("r")){
        System.out.print("Digite x: ");
        m=sc.nextDouble();
      } else {
        System.out.print("Digite x: ");
        m=sc.nextDouble();
        System.out.print("Digite y: ");
        n=sc.nextDouble();
      }
    }
   
    switch(op){
      case "+":
        System.out.println("\n\tSoma = "+Soma(x,y));
        break;
      case "-":
        System.out.println("\n\tSubtração = "+Subtrai(x,y));
        break;
      case "*":
        System.out.println("\n\tMultiplicação = "+Multiplica(x,y));
        break;
      case "/":
        System.out.println("\n\tDivisão = "+Divide(x,y));
        break;
      case "^":
        System.out.println("\n\tPotência de "+m+" elevado a "+n+" = "+Potencia(m,n));
        break;
      case "r":
        System.out.println("\n\tRaiz de "+m+" = "+Raiz(m));
        break;
    }
		
		
	}
	
	public static float Soma (float x, float y) {
		return x+y;
	}
	
	public static float Subtrai (float x, float y) {		
		return x-y;
	}
	
	public static float Multiplica (float x, float y) {		
		return x*y;
	}
	
	public static float Divide (float x, float y) {		
		return x/y;
	}

  public static double Potencia (double x, double y) {
		return Math.pow(x,y);
	}

  public static double Raiz (double x) {		
		return Math.sqrt(x);
	}
}