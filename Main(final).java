

	final :
Use the final keyword to mark a variable constant, so that it can be assigned only once.

Example:

class MyClass {
  public static final double PI = 3.14; 
  public static void main(String[ ] args) {
    System.out.println(PI);
  }
}

PI is now a constant. Any attempt to assign it a value will cause an error.

Methods and classes can also be marked final. This serves to restrict methods so that they can't be overridden and classes so that they can't be subclassed.

These concepts will be covered in the next module.
