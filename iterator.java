--- Iterators
An Iterator is an object that enables to cycle through a collection, obtain or remove elements. 

Before you can access a collection through an iterator, you must obtain one. Each of the collection classes provides an iterator() method that returns an iterator to the start of the collection. By using this iterator object, you can access each element in the collection, one element at a time.

The Iterator class provides the following methods:

hasNext(): Returns true if there is at least one more element; otherwise, it returns false.

next(): Returns the next object and advances the iterator.

remove(): Removes the last object that was returned by next from the collection.

The Iterator class must be imported from the java.util package.

Example:
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
   public static void main(String[ ] args) {
  LinkedList<String> animals = new LinkedList<String>();
  animals.add("fox");
  animals.add("cat");
  animals.add("dog");
  animals.add("rabbit");

  Iterator<String> it = animals.iterator();
  String value = it.next();
  System.out.println(value);
}
}

it.next() returns the first element in the list and then moves the iterator on to the next element.

Each time you call it.next(), the iterator moves to the next element of the list.

Typically, iterators are used in loops. At each iteration of the loop, you can access the corresponding list element.

Example:

import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
  public static void main(String[ ] args) {
    LinkedList<String> animals = new LinkedList<String>();
    animals.add("fox");
    animals.add("cat");
    animals.add("dog");
    animals.add("rabbit");
     
    Iterator<String> it = animals.iterator();
    while(it.hasNext()) {
      String value = it.next();
      System.out.println(value);   
     }
  }
}
/*
fox
cat
dog
rabbit
*/

Here, the while loop determines whether the iterator has additional elements, prints the value of the element, and advances the iterator to the next.

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> nums = new LinkedList<Integer>();

        // Taking 5 numbers from the user and adding them to the LinkedList
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        // Calculating the sum using an iterator and while loop
        int sum = 0;
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }

        // Outputting the sum
        System.out.println(sum);
    }
}
