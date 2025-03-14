
	Access Modifiers:
Now let's discuss the public keyword in front of the main method.

public static void main(String[ ] args)

public is an access modifier, meaning that it is used to set the level of access. You can use access modifiers for classes, attributes, and methods.
For classes, the available modifiers are public or default (left blank), as described below:
<<public>>: The class is accessible by any other class.
<<default>>: The class is accessible only by classes in the same package.

The following choices are available for attributes and methods:
<<default>>: A variable or method declared with no access control modifier is available to any other class in the same package.
<<public>>: Accessible from any other class.
<<protected>>: Provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass (Subclasses and superclasses are covered in upcoming lessons).
<<private>>: Accessible only within the declared class itself.

Example:

public class Vehicle {
  private int maxSpeed;
  private int wheels;
  private String color;
  private double fuelCapacity;

  public void horn() {
    System.out.println("Beep!");
  }
}

It's a best practice to keep the variables within a class private. The variables are accessible and modified using Getters and Setters.
