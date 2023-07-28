


	Creating Classes:
In order to create your own custom objects, you must first create the corresponding classes. This is accomplished by right clicking on the src folder in Eclipse and selecting Create->New->Class. Give your class a name and click Finish to add the new class to your project
As you can see, Eclipse has already added the initial code for the class.
Now let's create a simple method in our new class.

Animal.java

public class Animal {
  void bark() {
    System.out.println("Woof-Woof");
  }
}

We declared a bark() method in our Animal class.
Now, in order to use the class and it's methods, we need to declare an object of that class.


	Creating Objects:
Let's head over to our main and create a new object of our class.

MyClass.java

class MyClass {
  public static void main(String[ ] args) {
    Animal dog = new Animal();
    dog.bark();
  }
}

Now, dog is an object of type Animal. Thus we can call its bark() method, using the name of the object and a dot.
The dot notation is used to access the object's attributes and methods.
You have just created your first object!


	Defining Attributes:
A class has attributes and methods. The attributes are basically variables within a class.
Let's create a class called Vehicle, with its corresponding attributes and methods.

public class Vehicle {
  int maxSpeed;
  int wheels;
  String color;
  double fuelCapacity;  

  void horn() {
    System.out.println("Beep!");
  }  
}

maxSpeed, wheels, color, and fuelCapacity are the attributes of our Vehicle class, and horn() is the only method.
You can define as many attributes and methods as necessary.


	Creating Objects:
Next, we can create multiple objects of our Vehicle class, and use the dot syntax to access their attributes and methods.

class MyClass {
  public static void main(String[ ] args) {
    Vehicle v1 = new Vehicle();
    Vehicle v2 = new Vehicle();
    v1.color = "red";
    v2.horn();
  }
}

Example:
public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       //set customer's data to object here
            customer.firstName=firstName;
            customer.secondName=secondName;
            customer.age=age;
            customer.roomNumber=roomNumber;
            customer.saveCustomerInfo();
      
   }
}

class Customer {
   //add all necessary attributes here
   String firstName;
   String secondName;
   int age;
   int roomNumber;
   
  
   public void saveCustomerInfo() {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}

