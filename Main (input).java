import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
//After importing the Scanner class, we need to create a Scanner object:

Scanner sc = new Scanner(System.in);

    String nome = sc.nextLine();
    int age = sc.nextInt();

    //Inputs múltiplos
    Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int age = sc.nextInt();
System.out.println(name+": "+age);

    double bill=sc.nextDouble();
		System.out.println(bill * 15 / 100);
    
    sc.close();
  }
}