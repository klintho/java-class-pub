package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("---Task 1---");
    System.out.println("Hello World");
    System.out.println();
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    System.out.println("---Task 2---");
    for (int i = 1; i <= 100; i++) {
        if (i%3==0 && i%5==0) {
            System.out.println("huh");
        } else if (i%3==0) {
            System.out.println("foo");
        } else if (i%5==0) {
            System.out.println("bar");
        } else {
            System.out.println(i);
        }
    }
    System.out.println();
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    System.out.println("---Task 3---");
    int _sum = 0;
    for (int i = 1; i <= 100; i++) {
        if (i%7==0) {
            _sum+=i;
        }
    }
    System.out.println("The sum of all the multiples of 7 between 1 and 100 is " + _sum);
    System.out.println();
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
      System.out.println("---Task 4---");
      int _sum = 0;
      int _product = 1;
      for (int i = 1; i <= 20; i++) {
          _sum+=i;
          _product=_product*i;
      }
      System.out.println("The sum of all numbers between 1 and 20 is " + _sum);
      System.out.println("The product of all numbers between 1 and 20 is " + _product);
      System.out.println();
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    System.out.println("---Task 5---");
    Scanner keyboard = new Scanner(System.in);
    String fullname ="";
    String initials ="";
    System.out.println("Enter your full name:");
    fullname = keyboard.nextLine();
    String[] names = fullname.split(" ");
    for (int i = 0; i<names.length; i++) {
        initials = initials + names[i].charAt(0);
    }
    System.out.println(initials);
    System.out.println();
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    System.out.println("---Task 6---");
    int array_size = 10;
    int[] numbers = new int[array_size];
    for (int i = 0; i<=numbers.length; i++) {
        System.out.print(" "+ i*i*i);
    }
    System.out.println();
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    System.out.println("---Task 7---");
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rnd.nextInt(100);
    }
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a number from 1 to 100:");
    String guessstr = "";
    guessstr = keyboard.nextLine();
    Integer guess = Integer.valueOf(guessstr);
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == guess) {
            System.out.printf("%d was found in the array", guess);
            break;
        } else {
            System.out.printf("%d was NOT found in the array", guess);
        }
    }
        
}
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
<<<<<<< HEAD
  public static int task8(int[] numbers) {
   System.out.println("---Task 8---");
      int total = 0;
      for (int i=0; i < numbers.length; i++){
      total += numbers[i];
=======
  public static int task8() {
   System.out.println("---Task 8---");
   int[] numbers = new int[10];
   int total = 0;
   for (int i=0; i < numbers.length; i++){
      total += i;
>>>>>>> 13bdf99842e911e55a5deef94ddb8e2a6ad7c879
   }
   System.out.printf("The sum of the array is %d", total);
   return total;
   
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    System.out.println("---Task 9---");
    String word = "";
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a word");
    word = keyboard.nextLine();
<<<<<<< HEAD
    boolean found = false;
    for (int i = 0; i < word.length()-1; i++) {
        if(word.charAt(i) >= word.charAt(i+1)) {
            found = false;
        } else {
            found = true;
        }
    }
    return found;
=======
    for (int i = 0; i < word.length()-1; i++) {
        if(word.charAt(i) >= word.charAt(i+1)) {
            System.out.println("The letters are not in order");
        }
    }
>>>>>>> 13bdf99842e911e55a5deef94ddb8e2a6ad7c879
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    throw new UnsupportedOperationException("Task 10 is not implemented yet.");
  }

}
