
	Value Types :
Value types are the basic types, and include byte, short, int, long, float, double, boolean, and char.

These data types store the values assigned to them in the corresponding memory locations.

So, when you pass them to a method, you basically operate on the variable's value, rather than on the variable itself.

Example:
public class MyClass {
  public static void main(String[ ] args) {
    int x = 5;
    addOneTo(x);
    System.out.println(x);       
  }
  static void addOneTo(int num) {
    num = num + 1;
  }
}

The method from the example above takes the value of its parameter, which is why the original variable is not affected and 5 remains as its value.

What is the output of this code?//4

public static void main(String[ ] args) {

   int x = 4;

   square(x);

   System.out.println(x); 

}

static void square(int x) {

   x = x*x;

}
