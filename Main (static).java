

	Static :
When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance. This means that only one instance of a static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.

Example:

public class Counter {
  public static int COUNT=0;
  Counter() {
    COUNT++;
  }
}

The COUNT variable will be shared by all objects of that class.

Now, we can create objects of our Counter class in main, and access the static variable.

public class MyClass {
  public static void main(String[ ] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    System.out.println([b]Counter.COUNT[/b]);
  }
}

The output is 2, because the COUNT variable is static and gets incremented by one each time a new object of the Counter class is created. In the code above, we created 2 objects.

You can also access the static variable using any object of that class, such as c1.COUNT.

It’s a common practice to use upper case when naming a static variable, although not mandatory.

The same concept applies to static methods.

public class Vehicle {
  public static void horn() {
    System.out.println("Beep");
  }
}

Now, the horn method can be called without creating an object:

public class MyClass {
  public static void main(String[ ] args) {
    Vehicle.horn(); //não precisa criar um objeto
  }
}

Another example of static methods are those of the Math class, which is why you can call them without creating a Math object.

Also, the main method must always be static.

  //--------------------------------------------------------------------------------------------
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    Main myObj = new Main(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
