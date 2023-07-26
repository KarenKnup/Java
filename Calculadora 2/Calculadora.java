import java.util.Scanner;

public class Calculadora  {
	private float resultado=0;
	
	public float DecideOperacao (String op) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite x: ");
    float x=sc.nextFloat();
    System.out.print("Digite y: ");
    float y=sc.nextFloat();

		if(op.equals("+")){
      resultado=Soma(x,y);
    } else {
      if(op.equals("-")){
        resultado=Subtrai(x,y);
      } else {
        if(op.equals("*")){
          resultado=Multiplica(x,y);
        } else {
          if(op.equals("/")){
            resultado=Divide(x,y);
          }
        }
      }
    }
		return resultado;
	}
	
	public float Soma (float x, float y) {
		resultado=x+y;
		
		return resultado;
	}
	
	public float Subtrai (float x, float y) {
		resultado=x-y;
		
		return resultado;
	}
	
	public float Multiplica (float x, float y) {
		resultado=x*y;
		
		return resultado;
	}
	
	public float Divide (float x, float y) {
		resultado=x/y;
		
		return resultado;
	}
	
}