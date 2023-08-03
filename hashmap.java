--- HashMap
Arrays and Lists store elements as ordered collections, with each element given an integer index.

HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). 

The put, remove, and get methods are used to add, delete, and access values in the HashMap.

Example:

import java.util.HashMap;
public class MyClass {
  public static void main(String[ ] args) {
    HashMap<String, Integer> points = new HashMap<String, Integer>();
    points.put("Amy", 154);
    points.put("Dave", 42);
    points.put("Rob", 733);
    System.out.println(points.get("Dave")); 
  }
}

We have created a HashMap with Strings as its keys and Integers as its values.

Use the get method and the corresponding key to access the HashMap elements.

A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.

The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.

If you try to get a value that is not present in your map, it returns the value of null.

null is a special type that represents the absence of a value.

Example:

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("David", 22);
        ages.put("Tom", 23);
        ages.put("Robert", 32);
        ages.put("Alice", 21);
        ages.put("Sophie", 19);
        ages.put("Maria", 24);
        ages.put("John", 28);

        String[] nameArr = new String[ages.size()];
        nameArr = ages.keySet().toArray(nameArr);

        int ageLimit = scanner.nextInt();

        for (String emp : nameArr) {
            int age = ages.get(emp);
            if (age < ageLimit) {
                ages.remove(emp); // Remove the employee if their age is less than N
            }
        }

        System.out.println(ages);
    }
}


  _________________________________________________________________

    --- Sets
A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction.

One of the implementations of the Set is the HashSet class.

Example:

import java.util.HashSet;

public class MyClass {
  public static void main(String[ ] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("A");
    set.add("B");
    set.add("C");
    System.out.println(set);
  }
}

You can use the size() method to get the number of elements in the HashSet.

--- LinkedHashSet
The HashSet class does not automatically retain the order of the elements as they're added. To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in the order in which they were inserted.

What is hashing?

A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code.

So, basically, each element in the HashSet is associated with its unique hash code.

You've learned about the various collection types that are available in Java, including Lists, Maps, and Sets. The choice of which one to use is specific to the data you need to store and manipulate.
  
