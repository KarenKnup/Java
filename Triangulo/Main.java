import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Triangulo tri = new Triangulo();
    
    double xA, xB, xC, yA, yB, yC;
    System.out.print("\nDigite xA: ");
    xA = sc.nextDouble();
    System.out.print("Digite yA: ");
    yA = sc.nextDouble();
    System.out.print("Digite xB: ");
    xB = sc.nextDouble();
    System.out.print("Digite yB: ");
    yB = sc.nextDouble();
    System.out.print("Digite xC: ");
    xC = sc.nextDouble();
    System.out.print("Digite yC: ");
    yC = sc.nextDouble();
    
    tri.a = tri.Lado(xB,yB,xC,yC);
    tri.b = tri.Lado(xA,yA,xC,yC);
    tri.c = tri.Lado(xA,yA,xB,yB);

    tri.Exibe_Triangulo(xA,yA,xB,yB,xC,yC);
      
    double P = tri.Perimetro();
    System.out.print("\n\tPerímetro = "+String.format("%.2f",P));

    double A = tri.Area();
    System.out.print("\n\tÁrea = "+String.format("%.2f",A));
    
      sc.close();
  }
}