-- Type Casting:
Assigning a value of one type to a variable of another type is known as Type Casting.

To cast a value to a specific type, place the type in parentheses and position it in front of the value.

Example:
int a = (int) 3.14;

The code above is casting the value 3.14 to an integer, with 3 as the resulting value.

Another example:

double a = 42.571;
int b = (int) a;
System.out.println(b);

Java supports automatic type casting of integers to floating points, since there is no loss of precision.

On the other hand, type casting is mandatory when assigning floating point values to integer variables.

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       char a = read.next().charAt(0);
       
       // Cast the character to an integer and print its numeric value
       int numericValue = (int) a;
       System.out.println(numericValue);
    }   
}

What is the output of this code? //3

public static void main(String[ ] args) { 
  double x = 1.5;
  double y = 2.65;
  sum((int)x, (int)y);
}

static void sum(int x, int y) {
   System.out.println(x + y);
}

