

	Abstraction :
Data abstraction provides the outside world with only essential information, in a process of representing essential features without including implementation details.

A good real-world example is a book. When you hear the term book, you don't know the exact specifics, such as the page count, the color, or the size, but you understand the idea, or abstraction, of a book.

The concept of abstraction is that we focus on essential qualities, rather than the specific characteristics of one particular example.

In Java, abstraction is achieved using abstract classes and interfaces.

An abstract class is defined using the abstract keyword.

- If a class is declared abstract it cannot be instantiated (you cannot create objects of that type).

- To use an abstract class, you have to inherit it from another class.

- Any class that contains an abstract method should be defined as abstract.

level
An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon): abstract void walk();

Abstract Class
For example, we can define our Animal class as abstract:

abstract class Animal {
  int legs = 0;
  abstract void makeSound();
}
JAVA
The makeSound() method is also abstract, as it has no implementation in the superclass.

We can inherit from the Animal class and define the makeSound() method for the subclass:

CODE PLAYGROUND
JAVA
class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}
Click to run
level
Every Animal makes a sound, but each has a different way to do it. That's why we define an abstract class Animal, and leave the implementation of how they make sounds to the subclasses.

This is used when there is no meaningful definition for the method in the superclass.

OBS: Combinando String e Números
String totalPrice = "Total: $" + 3; 
System.out.println(totalPrice); //Total: $3

String totalPrice = "Total: $" + 3 +2 +1; 
System.out.println(totalPrice); //Total: $321

String totalPrice = "Total: $" + (3+2+1); 
System.out.println(totalPrice); //Total: $6

OBS: Sequência de Escape:
\t - nova tabulação
\b - insere caractere de retorno
\n - nova linha
\r - retorno de carro
\f - avanço de página
\' - insere um caractere de aspas simples
\" - insere um caractere de aspas duplas
\\ - insere um caractere de barra invertida

System.out.println("O gato fez \"Miau!\" para mim."); //O gato fez "Miau!" para mim.

OBS: print x println

OBS: Conversão de tipos
int num1 = 5555;
int num2 = 6666; //solução: long num2=6666;
long num3;
num3 = num1 * num2;

int myInt;
double myPercent = 51.9;
myInt = (int)myPercent; //O número é cortado
			//myInt é 51

int ageYears = 32;
int ageDays = ageYears * 365;
long ageSeconds = ageYears*365*24L*60*60;

int num1 = (int)(1+2+3+4.0);
int num2 = (int)((1+2+3+4)*1.0);

OBS: os sublinhados não afetam o valor
x=123_456_789 == x=123456789

OBS: Converter string em int/double --> parse
int intVar1 = Integer.parseInt("100");
double doubleVar2 = Double.parseDouble("2.72");

OBS: Obter input com InputDialog
String inputString = JOptionPane.showInputDialog("??"); //ou só String inputString = JOptionPane.showInputDialog("??")+1;
int input = Integer.parseInt(inputString);

String[] values = {"1", "2", "3"};
Input2 string = (String)JOptionPane.showInputDialog(null,
						"Esta é uma pergunta?",
						"Título da Caixa de diálogo",
						2,
						null,
						values,
						values[1]);


JOptionPane.showMessageDialog(null,
			"Não há uma entrada aqui",
			"Título",
			0);


OBS: Obter input com Scanner
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
double y = sc.nextDouble();
String z = sc.next();
sc.close();

OBS: Erros possíveis:
1- InputMismatchException --> a entrada não pode ser analisada como o tpo esperado
System.out.println(sc.nextInt());
2- IllegalStateException ---> o fluxo é acessado depois de ser terminado
3- NULLPointerException ---> está apontando pra um arquivo ineistente

