--- Anonymous Classes:
Anonymous classes are a way to extend the existing classes on the fly.

For example, consider having a class Machine:

class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}

When creating the Machine object, we can change the start method on the fly.

public static void main(String[ ] args) {
  Machine m = new Machine() {
    @Override public void start() {
      System.out.println("Wooooo");
    }
  };
  m.start();
}

After the constructor call, we have opened the curly braces and have overridden the start method's implementation on the fly.

The @Override annotation is used to make your code easier to understand, because it makes it more obvious when methods are overridden.

The modification is applicable only to the current object, and not the class itself. So if we create another object of that class, the start method's implementation will be the one defined in the class.

class Machine {
  public void start() {
    System.out.println("Starting...");
  }
}  

public static void main(String[ ] args) {
  Machine m1 = new Machine() {
    @Override public void start() {
      System.out.println("Wooooo");
    }
  };
  Machine m2 = new Machine();
  m2.start();
  }

Exemplo 2:
public class Main {
    public static void main(String[] args) {

        Purchase customer = new Purchase();
        Purchase specialCustomer = new Purchase() {
            @Override
            public int totalAmount(int price) {
                return price - (price * 20) / 100;
            }
        };

        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
    }
}

class Purchase {
    int price;

    public int totalAmount(int price) {
        return price - (price * 10) / 100;
    }
}

Drag and drop from the options below to print "Hello".
class A {
public void print() {
System.out.println("A");
  }
}

class B {
public static void main(String[ ] args) {
A object = new A() {
@Override public void print() {
System.out.println("Hello");
      }
    };
object.print();
  }
}