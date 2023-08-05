--- Sorting Lists
For the manipulation of data in different collection types, the Java API provides a Collections class, which is included in the java.util package.

One of the most popular Collections class methods is sort(), which sorts the elements of your collection type. The methods in the Collections class are static, so you don't need a Collections object to call them.

Example:

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("tiger");
    animals.add("cat");
    animals.add("snake");
    animals.add("dog");
       
    Collections.sort(animals);
       
    System.out.println(animals);
  }
}
  
As you can see, the elements have been sorted alphabetically.

You can call the sort() methods on different types of Lists, such as Integers.

import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
  public static void main(String[ ] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(3);
    nums.add(36);
    nums.add(73);
    nums.add(40);
    nums.add(1);

    Collections.sort(nums);
    System.out.println(nums);
  }
}

Other useful methods in the Collections class:

- max(Collection c): Returns the maximum element in c as determined by natural ordering.
- min(Collection c): Returns the minimum element in c as determined by natural ordering.
- reverse(List list): Reverses the sequence in list.
- shuffle(List list): Shuffles (i.e., randomizes) the elements in list.

Example:

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        while (nums.size() < 5) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println(max);
        System.out.println(min);
    }
}

Fill in the blanks to add three items to the list, sort it,  and print 2.

List<Integer> list = new ArrayList<Integer>();
list.add(4);
list.add(2);
list.add(1);
Collections.sort(list);
System.out.println(list.get(1));