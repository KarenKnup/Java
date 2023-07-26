package faeterj;

import java.util.Scanner;
import java.lang.Math;

public class Calculadora {

   public static String menu (){
     String op;
    System.out.println("\n(+) Soma");
    System.out.println("(-) Subtração");
    System.out.println("(*) Multiplicação");
    System.out.println("(/) Divisão");
    System.out.println("(^) Potência");
    System.out.println("(r) Raiz Quadrada");
    System.out.println("(0) Sair");
     Scanner sc=new Scanner(System.in);
     System.out.print("\nDigite a sua opção: ");
		  op=sc.next();
     //sc.close();
     return op;
  }

  public static float Soma (float n1,float n2){
    return n1+n2;
  }

  public static float Subtrai (float n1,float n2){
    return n1-n2;
  }

  public static float Multiplica (float n1,float n2){
    return n1*n2;
  }

  public static float Divide (float n1,float n2){
    return n1/n2;
  }

  public static double Potencia (int n3, int n4){
    return Math.pow(n3,n4);
  }

  public static double Raiz (int n3){
    return Math.sqrt(n3);
  }
}