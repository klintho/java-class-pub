package exercise4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Thomas Klinkhammer
 */
public class Ex4Driver {
  /*
Define a function that takes 1 integer as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
    */
public Integer task1(Integer n) {
    //n = 5;
    return n;
}
/*
Define a function that takes 1 string as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task2(String str) {
    int n = str.length();
    return n;
}
/*
Define a function that takes 1 character as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task3(Character c) {
    int n = c;
    return n;
}
/*
Define a function that takes 1 string as a parameter and returns a character. Write 2 unit tests to verify the function validity.
*/
public Character task4(String str) {
    Character c = str.charAt(0);
    return c;
}
/*
Define a function that takes 2 integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task5(Integer n, Integer m) {
    int o = n*m;
    return o;
}
/*
Define a function that takes a string and an integer as parameters and returns a Character. Write 2 unit tests to verify the function validity.
*/
public Character task6(String str, Integer n) {
    Character c = str.charAt(n);
    return c;
}
/*
Define a function that takes an array of integers as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task7(Integer[] arr) {
    int n = arr[1];
    return n;
}
/*
Define a function that takes an array of integers and an integer as parameters and returns a boolean. Write 2 unit tests to verify the function validity.
*/
public Boolean task8(Integer[] arr, Integer n) {
    boolean bool = false;
    for (int i=0; i<arr.length; i++) {
        if (arr[i] == n){
            bool = true;
            break;
        }
    }
    return bool;
}
/*
Define a function that takes an ArrayList of Strings as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
*/
public Integer task9(ArrayList<String> arrlst) {
    int n = arrlst.size();
    return n;
}
/*
Define a function that takes a HashMap (exact details are up to you) as a parameter and returns an integer. Write 2 unit tests to verify the function validity.
  */
public Integer task10(HashMap<Integer, String> hash) {
    int n = hash.size();
    return n;
}

}
