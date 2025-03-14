

	Packages :
Packages are used to avoid name conflicts and to control access to classes.

A package can be defined as a group made up of similar types of classes, along with sub-packages.

Creating a package in Java is quite easy. Simply right click on your src directory and click New->Package. Give your package a name and click Finish.

You will notice that the new package appears in the project directory. Now you can move and create classes inside that package. We have moved our Vehicle, Counter and Animal classes to the package samples.

When you move/create a class in your package, the following code will appear at the top of the list of files.

package samples;

This indicates the package to which the class belongs.

Now, we need to import the classes that are inside a package in our main to be able to use them.

The following example shows how to use the Vehicle class of the samples package.

import samples.Vehicle;

class MyClass {
  public static void main(String[ ] args) {
    Vehicle v1 = new Vehicle();
    v1.horn();
  }
}

Two major results occur when a class is placed in a package. First, the name of the package becomes a part of the name of the class. Second, the name of the package must match the directory structure where the corresponding class file resides.

Use a wildcard to import all classes in a package.

For example, import samples.* will import all classes in the samples package.

	Encapsulation:
There are 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.

The idea behind encapsulation is to ensure that implementation details are not visible to users. The variables of one class will be hidden from the other classes, accessible only through the methods of the current class. This is called data hiding.

To achieve encapsulation in Java, declare the class' variables as private and provide public setter and getter methods to modify and view the variables' values.

For example:

class BankAccount {
  private double balance=0;
  public void deposit(double x) {
    if(x > 0) {
      balance += x;
    }
  }
}
JAVA
This implementation hides the balance variable, enabling access to it only through the deposit method, which validates the amount to be deposited before modifying the variable.

level
In summary, encapsulation provides the following benefits:

- Control of the way data is accessed or modified

- More flexible and easily changed code

- Ability to change one part of the code without affecting other parts