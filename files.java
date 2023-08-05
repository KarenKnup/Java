--- Working with Files
The java.io package includes a File class that allows you to work with files.

To start, create a File object and specify the path of the file in the constructor.

import java.io.File;
...
File file = new File("C:\\data\\input-file.txt");

With the exists() method, you can determine whether a file exists.

import java.io.File;

public class MyClass {
  public static void main(String[ ] args) {
    File x = new File("C:\\sololearn\\test.txt");
    if(x.exists()) {
     System.out.println(x.getName() +  "exists!");
    }
    else { 
     System.out.println("The file does not exist");
    }
  }
}

The code above prints a message stating whether or not the file exists at the specified path.

The getName() method returns the name of the file.

Note that we used double backslashes in the path, as one backslash should be escaped in the path String.


Example: Fill in the blanks to determine whether the file exists:

class A {
   public static void main(String args[ ]) {
   File file = new File("a.txt");
   if(file.exists()) {
     System.out.println("Yes");
   }
}
}

--- Reading a File
Files are useful for storing and retrieving data, and there are a number of ways to read from a file.

 One of the simplest ways is to use the Scanner class from the java.util package.

The constructor of the Scanner class can take a File object as input.

To read the contents of a text file at the path "C:\\sololearn\\test.txt", we would need to create a File object with the corresponding path and pass it to the Scanner object.

try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);      
}
 catch (FileNotFoundException e) {

}

We surrounded the code with a try/catch block, because there's a chance that the file may not exist.

The Scanner class inherits from the Iterator, so it behaves like one.

We can use the Scanner object's next() method to read the file's contents.

try {
  File x = new File("C:\\sololearn\\test.txt");
  Scanner sc = new Scanner(x);
  while(sc.hasNext()) {
    System.out.println(sc.next());
  }
  sc.close();
} catch (FileNotFoundException e) {
  System.out.println("Error");
}

The file's contents are output word by word, because the next() method returns each word separately.

It is always good practice to close a file when finished working with it. One way to do this is to use the Scanner's close() method.

--- Creating Files
Formatter, another useful class in the java.util package, is used to create content and write it to files.

Example:

import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\sololearn\\test.txt");
  } catch (Exception e) {
      System.out.println("Error");
  }
  }
}

This creates an empty file at the specified path. If the file already exists, this will overwrite it.

Again, you need to surround the code with a try/catch block, as the operation can fail.

Once the file is created, you can write content to it using the same Formatter object's format() method.

Example:

import java.util.Formatter;

public class MyClass {
   public static void main(String[ ] args) {
  try {
    Formatter f = new Formatter("C:\\sololearn\\test.txt");
    f.format("%s %s %s", "1","John", "Smith \r\n");
    f.format("%s %s %s", "2","Amy", "Brown");
    f.close();    
  } catch (Exception e) {
    System.out.println("Error");
  }
  }
}

The format() method formats its parameters according to its first parameter.

%s mean a string and get's replaced by the first parameter after the format. The second %s get's replaced by the next one, and so on. So, the format %s %s %s denotes three strings that are separated with spaces.

Note: \r\n is the newline symbol in Windows.

The code above creates a file with the following content:

1 John Smith
2 Amy Brown

Don't forget to close the file once you're finished writing to it!

Example:
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Formatter;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("tasks.txt");
            int count = 0;
            
            // Taking names of 3 tasks as input and writing them to the file
            while (count < 3) {
                String task = input.nextLine();
                f.format("%s%n", task); // Adding \n to create a new line
                count++;
            }
            
            f.close();
            
            // Calling the method to read and output the tasks from the file
            readFile("tasks.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Method to read and output tasks from a file
    public static void readFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String task = scanner.nextLine();
                System.out.println(task);
            }
            
            scanner.close();
        } catch (IOException | NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
