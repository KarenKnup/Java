

Method Overriding
As we saw in the previous lesson, a subclass can define a behavior that's specific to the subclass type, meaning that a subclass can implement a parent class method based on its requirement.

This feature is known as method overriding.

Example:

CODE PLAYGROUND
JAVA
class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
Click to run
In the code above, the Cat class overrides the makeSound() method of its superclass Animal.

Rules for Method Overriding:

- Should have the same return type and arguments

- The access level cannot be more restrictive than the overridden method's access level (Example: If the superclass method is declared public, the overriding method in the sub class can be neither private nor protected)

- A method declared final or static cannot be overridden

- If a method cannot be inherited, it cannot be overridden

- Constructors cannot be overridden

level
Method overriding is also known as runtime polymorphism.