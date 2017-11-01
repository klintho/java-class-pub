package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Thomas Klinkhammer
 */
public class Ex2Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numberArr = new int[10];
    for (int i = 0; i < 10; i++) {
      numberArr[i] = rnd.nextInt(100);
    }
    ArrayList<Integer> numberLst = new ArrayList();
    for (int i = 0; i < 10; i++) {
      numberLst.add(rnd.nextInt(100));
    }
    task1(3);
    System.out.println(task2(numberArr, 90));
    System.out.println(task3(numberArr, 75));
    task4(numberArr);
    task5(numberArr);
    task6();
    task7();
    System.out.println(task8(numberLst, 75));
    task9();
    task10(task9());
  }

  /**
   * TODO: Task 1: Define and call a function nHeads() that takes a number (n) as a parameter and prints the result of coin flips ("Heads" or "Tails" with equal probability) until there are n "Heads" in a row. Seed the randomizer in the main() function.
   * @param n
   */
  public static void task1(int n) {
      System.out.println("---Task 1---");
       int heads_count = 0;
       Random rnd = new Random();
       while (heads_count != n) {
           int flip = rnd.nextInt(2);
           if (flip == 1) {
               System.out.println("Tails");
               heads_count=0;
           } else {
              System.out.println("Heads");
              heads_count+=1;
           }
    }
  }
  /**
   * TODO: Task 2: Define a function that takes an array of integers and a number as parameters and returns boolean True if the number provided is larger than every element of the array, False otherwise.
   * @param arr
   * @param n
   * @return 
   */
  public static boolean task2(int[] arr, int n) {
      System.out.println();
      System.out.println("---Task 2---");
      for ( int i = 0; i < arr.length; i++) {
          if (arr[i] < n) {
              return false;
          }
      }
      return true;
  }
  /**
   * TODO: Task 3: Write a function that takes an array of integers and a threshold and prints how many values are below the threshold.
   * @param arr
   * @param threshold
   * @return 
   */
  public static int task3(int[] arr, int threshold) {
      System.out.println();
      System.out.println("---Task 3---");
       int count = 0;
      for ( int i =0; i < arr.length; i++) {
        if (arr[i] < threshold) {
            count+=1;
        }
    }
      return count;
  }
  /**
   * TODO: Task 4: Write a function that takes an array of integers as a parameter, finds the difference between 100 and the largest element of the array and adds this difference to every element in the array. (Note: after this function call the largest value in the array must be 100.)
   * @param arr
   */
  public static void task4(int[] arr) {
      System.out.println();
      System.out.println("---Task 4---");
      int max =0;
    for ( int i =0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    int diff = 100 - max;
    for (int i =0; i<arr.length; i++) {
        arr[i]+=diff;
    }
  }
  /**
   * TODO: Task 5: Write a function that takes an array of integers as a parameter and, assuming the values are scores, prints number of students with 'A', 'B', 'C', 'D' and 'F'.
   * @param arr
   */
  public static void task5(int[] arr) {
      System.out.println();
      System.out.println("---Task 5---");
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;
    int countF = 0;
    for (int i =0; i < arr.length; i++) {
        if (arr[i] > 89) {
            countA+=1;
        } else if (arr[i] < 90 && arr[i] > 79) {
            countB+=1;
        } else if (arr[i] < 80 && arr[i] > 69) {
            countC+=1;
        } else if (arr[i] < 70 && arr[i] > 59) {
            countC+=1;
        } else if (arr[i] < 60) {
            countF+=1;
        }
    }
    System.out.printf("There are %d students who earned an A%n", countA);
    System.out.printf("There are %d students who earned an B%n", countB);
    System.out.printf("There are %d students who earned an C%n", countC);
    System.out.printf("There are %d students who earned an D%n", countD);
    System.out.printf("There are %d students who earned an F%n", countF);
  }
  /**
   * TODO: Task 6: Create an ArrayList of double values and ask a user to start entering numbers. Keep asking and adding numbers to the ArrayList until the user enters 0, then stop and print all the values in the ArrayList. Use function add() to add a number to an ArrayList.
   */
  public static void task6() {
    ArrayList<Double> arr = new ArrayList();
    Scanner keyboard = new Scanner(System.in);
    double number = 1.0;
    System.out.printf("%n---Task 6---%n");
    System.out.printf("Please enter a number. Press enter to add another number. (enter 0 to print the list)%n");
    while (number != 0) {
        number = keyboard.nextInt();
        arr.add(number);
       }
    System.out.println(arr);
    
  }
  /**
   * TODO: Task 7: Create an ArrayList of integer values of size 10 and initialize each element of the ArrayList to a random number between 50 and 100.
   */
  public static void task7() {
    System.out.printf("---Task 7---%n");
    ArrayList<Integer> arrint = new ArrayList(10);
    Random rnd = new Random();
    for (int i = 0; i < 10; i++) {
        arrint.add(50 + rnd.nextInt(50));
    }
  }
  /**
   * TODO: Task 8: Define a function that takes an ArrayList of integer values and a threshold as parameters and returns the number of values in the ArrayList below a threshold. You may use the ArrayList created at the previous step.
   * @param arrLst
   * @param threshold
   * @return 
   */
  public static int task8(ArrayList<Integer> arrLst, int threshold) {
    System.out.printf("---Task 8---%n");
    int count = 0;
    for (int i =0; i < arrLst.size(); i++) {
        if (arrLst.get(i) < threshold) {
            count+=1;
        }
    }
    return count;
  }
  /**
   * TODO: Task 9: Generate a 2-dimensional array of size 10x10. Initialize values in the array to the values in the multiplication table of size 10. (e.g. values in the intersections must start with 1 (1x1) and go all the way up to 100). Print the array and return it.
   * @return 
   */
  public static int[][] task9() {
    System.out.printf("---Task 9---%n");
    int[][] multtable = new int[10][10];
    
    for (int row = 0; row < multtable.length; row++) {
        for ( int col = 0; col <multtable[row].length; col++) {
        multtable[row][col] = (row+1)*(col+1);
        System.out.printf("%5d", multtable[row][col]);
        }
        System.out.println();
    }
    
    return multtable;
  }
  /**
   * TODO: Task 10: Calculate and print the sum of values in each row and each column of the matrix generated at the previous step.
   * @param matrix
   */
  public static void task10(int[][] matrix) {
      System.out.printf("%n---Task 10---%n");
      int sum = 0;
      long product = 1;
      int rownumber = 0;
    for ( int row = 0; row < matrix.length; row++) {
        rownumber+=1;
        for (int col =0; col < matrix[row].length; col++) {
            sum += matrix[row][col];
            product *= matrix[row][col];
        }
        System.out.printf("The sum of row %d is %d%n", rownumber, sum);
        System.out.printf("The product of row %d is %d%nd", rownumber, product);
        sum = 0;
        product = 1;
    }
  }

}
