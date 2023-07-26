import java.util.Scanner;

class Main {
  static void welcome() {
  System.out.println("Welcome");
  System.out.println("I am a method");
  System.out.println("End of method");
}

  public static void bot (){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number){
			case 1:	System.out.println("Order confirmed");
			break;
			case 2: System.out.println("info@sololearn.com");
			break;
			default: System.out.println("Try again");
		}
	}

   static void Welcome(String name) {  //string name is the parameter
    System.out.println("Welcome, "+name);
  }

  static void convert (double foot){
	System.out.println(foot*12);
	}

  static double perc(double num, int percentage) {
  double res = num*percentage/100;
  return res;
}

  static boolean check(int grade) {
  if(grade >=70) {
    return true;
  } else {
    return false;
  }
}

  static double fahr(double c){
	return c*1.8 + 32;
	}
  
  public static void main(String[] args) {
    welcome();
    welcome();
    welcome();

    bot();

    //The parameters are defined in the parentheses, and can be used like variables in the method.
    Welcome("Amy"); //Amy is the argument

    //The values passed as parameters are called arguments.

     Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 

        convert(num);

    //Return values
    double x = perc(530, 23);
System.out.println("Result is: "+x);

    int x = 89;
  if(check(x) == true) {
    System.out.println("Congrats!");
  } 

    double c = sc.nextDouble();
        System.out.println(fahr(c));
  }
} 