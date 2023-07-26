public class Triangulo {
  public double a, b, c; //lados

  public double Lado (double x1, double y1, double x2, double y2){
    double dx = x2 - x1;
    double dy = y2 - y1;
    return Math.sqrt(dx*dx + dy*dy);
  }

   public static void Exibe_Triangulo (double x1, double y1, double x2, double y2, double x3, double y3){
     System.out.print("\n\tA = (" +String.format("%.2f",x1)+","+String.format("%.2f",y1)+")");
     System.out.print("\n\tB = (" +String.format("%.2f",x2)+","+String.format("%.2f",y2)+")");
     System.out.print("\n\tC = (" +String.format("%.2f",x3)+","+String.format("%.2f",y3)+")\n");
   }

  public double Perimetro (){
    this.a = a;
    this.b = b;
    this.c = c;
    return a+b+c;
  }
  
  public double Area (){
    this.a = a;
    this.b = b;
    this.c = c;
    double semip = Perimetro()/2;
      return Math.sqrt(semip*(semip-a)*(semip-b)*(semip-c));
  }
}