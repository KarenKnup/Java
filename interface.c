--- Interfaces:
An interface is a completely abstract class that contains only abstract methods.

Some specifications for interfaces:
- Defined using the interface keyword.
- May contain only static final variables.
- Cannot contain a constructor because interfaces cannot be instantiated.
- Interfaces can extend other interfaces.
- A class can implement any number of interfaces.

An example of a simple interface:

interface Animal {
  public void eat();
  public void makeSound();
}

Interfaces have the following properties:
- An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
- Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
- Methods in an interface are implicitly public.

A class can inherit from just one superclass, but can implement multiple interfaces!

  Use the implements keyword to use an interface with your class.

interface Animal {
  public void eat();
  public void makeSound();
}

class Cat implements Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
  public void eat() {
    System.out.println("omnomnom");
  }
}

When you implement an interface, you need to override all of its methods.

interface Swimmer {
   void swim();
}

interface Player {
   void play();
}

// Implementar las interfaces Swimmer y Player en la clase Animal
abstract class Animal implements Swimmer, Player {
   public abstract void swim();
   public abstract void play();
}

class Dog extends Animal {
    // Sobreescribir los métodos swim() y play()
    public void swim(){
       System.out.println("Dog is swimming");
    }

    public void play(){
       System.out.println("Dog is playing");
    }
}

class Cat extends Animal {
    // Sobreescribir los métodos swim() y play()
    public void swim(){
       System.out.println("Cat is swimming");
    }

    public void play(){
       System.out.println("Cat is playing");
    }
}

class Main {
   public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       
       dog.swim();
       dog.play();
       cat.swim();
       cat.play();
   }
}
