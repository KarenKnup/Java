
Inheritance
Inheritance is the process that enables one class to acquire the properties (methods and variables) of another. With inheritance, the information is placed in a more manageable, hierarchical order.

The class inheriting the properties of another is the subclass (also called derived class, or child class); the class whose properties are inherited is the superclass (base class, or parent class).

To inherit from a class, use the extends keyword.

This example shows how to have the class Dog to inherit from the class Animal.

class Dog [b]extends[/b] Animal {
 // some code
}
JAVA
level
Here, Dog is the subclass, and Animal is the superclass.

When one class is inherited from another class, it inherits all of the superclass' non-private variables and methods.

Example:

class Animal {
  protected int legs;
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Dog [b]extends [/b]Animal {
  Dog() {
    legs = 4;
  }
}
JAVA
As you can see, the Dog class inherits the legs variable from the Animal class.

We can now declare a Dog object and call the eat method of its superclass:

CODE PLAYGROUND
JAVA
class MyClass {
  public static void main(String[ ] args) {
    Dog d = new Dog();
    d.eat();
  }
}
Click to run
level
Recall the protected access modifier, which makes the members visible only to the subclasses.

Constructors are not member methods, and so are not inherited by subclasses.

However, the constructor of the superclass is called when the subclass is instantiated.

Example:

CODE PLAYGROUND
JAVA
class A {
  public A() {
    System.out.println("New A");
  }
}
class B extends A {
  public B() {
    System.out.println("New B");
  }
}

class Program {
  public static void main(String[ ] args) {
      B obj = new B();//New ANew B
  }
}
Click to run
level
You can access the superclass from the subclass using the super keyword.

For example, super.var accesses the var member of the superclass.

//be attentive to access modifiers
class Standard {
   protected void draw() {
       System.out.println("Drawing");
   }

   protected void write() {
       System.out.println("Writing");
   }
}
//fix the class
class Pro extends Standard{

   protected void useEffects() {
       System.out.println("Using Effects");
   }

   protected void changeResolution() {
       System.out.println("Changing Resolution");
   }
}

public class Main {
   public static void main(String[] args) {
       Standard standard1 = new Standard();
       Pro pro1 = new Pro();
       
       //standard version
       standard1.draw();
       standard1.write();
       
       //Pro version
       pro1.draw();
       pro1.write();
       pro1.useEffects();
       pro1.changeResolution();
   }
}
