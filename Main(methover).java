

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

    //-----------------------------------------------------------------------------------

    Polimorfismo em tempo de compilação: Sempre que um objeto é vinculado à sua funcionalidade no tempo de compilação, isso é conhecido como polimorfismo em tempo de compilação. Em tempo de compilação, o java sabe qual método chamar, verificando as assinaturas do método. Portanto, isso é chamado de polimorfismo em tempo de compilação ou vinculação estática ou inicial. O polimorfismo em tempo de compilação é obtido através da sobrecarga do método. Sobrecarga de método diz que você pode ter mais de uma função com o mesmo nome em uma classe com um protótipo diferente. A sobrecarga de funções é uma das maneiras de se atingir o polimorfismo, mas depende da tecnologia e do tipo de polimorfismo que adotamos. Em java, conseguimos sobrecarga de função em tempo de compilação. A seguir está um exemplo onde o polimorfismo em tempo de compilação pode ser observado. 
 

// Java program to demonstrate
// compile-time polymorphism
public class GFG {
 
    // First addition function
    public static int add(int a, int b)
    {
        return a + b;
    }
 
    // Second addition function
    public static double add(
        double a, double b)
    {
        return a + b;
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Here, the first addition
        // function is called
        System.out.println(add(2, 3));
 
        // Here, the second addition
        // function is called
        System.out.println(add(2.0, 3.0));
    }
}
Saída: 
5
5.0
 

Polimorfismo de tempo de execução: sempre que um objeto é vinculado à funcionalidade em tempo de execução, isso é conhecido como polimorfismo de tempo de execução. O polimorfismo de tempo de execução pode ser obtido substituindo o método . A máquina virtual Java determina o método adequado a ser chamado no tempo de execução, não no tempo de compilação. Também é chamado de vinculação dinâmica ou tardia. A sobreposição de método diz que a classe filha tem o mesmo método declarado na classe pai. Isso significa que se a classe filha fornece a implementação específica do método que foi fornecido por uma de suas classes pai, ela é conhecida como substituição de método. A seguir está um exemplo em que o polimorfismo do tempo de execução pode ser observado. 
 

// Java program to demonstrate
// runtime polymorphism
 
// Implementing a class
class Test {
 
    // Implementing a method
    public void method()
    {
        System.out.println("Method 1");
    }
}
 
// Defining a child class
public class GFG extends Test {
 
    // Overriding the parent method
    public void method()
    {
        System.out.println("Method 2");
    }
 
    // Driver code
    public static void main(String args[])
    {
        Test test = new GFG();
 
        test.method();
    }
}
Saída: 
Método 2
