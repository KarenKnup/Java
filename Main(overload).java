



Method Overloading
When methods have the same name, but different parameters, it is known as method overloading.

This can be very useful when you need the same method functionality for different types of parameters.

The following example illustrates a method that returns the maximum of its two parameters.

int max(int a, int b) {
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}
JAVA
The method shown above will only work for parameters of type integer.

However, we might want to use it for doubles, as well. For that, you need to overload the max method:

CODE PLAYGROUND
JAVA
double max(double a, double b) {
  if(a > b) {
    return a;
  }
  else {
    return b;
  }
}
Click to run
Now, our max method will also work with doubles.

An overloaded method must have a different argument list; the parameters should differ in their type, number, or both.

level
Another name for method overloading is compile-time polymorphism.

Example:
public class Main {
    public static void main(String[] args) {
        
        int a = 5;
        double b = 10.2;
        
        System.out.println(doubleTheValue(a));
        System.out.println(doubleTheValue(b));
                
    }
    //complete the method for integer value type
    public static int doubleTheValue(int a) {
        return a*2;
    }
    //overload the method for double value type
    public static double doubleTheValue(double b) {
        return b*2;
    }
}