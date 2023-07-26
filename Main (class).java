
class Demo {//The opening bracket can also be written below the class name, but it's generally common to write it on the same line to save space.

}

In Java, every line of code that can actually run needs to be inside a class.

Our program includes one more thing that we need to cover:

class Demo {
  public static void main(String[] args) {
    System.out.println("Hi there");
  }
}

As you can see, the Demo class includes the following line:

public static void main(String[] args) {

}

In Java, each application has an entry point, or a starting point, which is a method called main.

We will cover public, static and void keywords definition in later lessons, when learning about methods. For now, remember that the main method needs to be declared identically to the code above.

Notice that the main method, similar to the class, opens and closes with curly brackets.

public static void main(String[] args) {
  System.out.println("Hi there");
}

The main method contains the code that executes when we run our program.
In this case, the println method will be executed, when we run our program.

The main method can contain multiple statements, for example:

class Demo {
  public static void main(String[] args) {
    System.out.println("Welcome");
    System.out.println("This is a demo"); 
    System.out.println("Bye");
  }
}