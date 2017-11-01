package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
/**
 *
 * @author Thomas Klinkhammer
 */
public class Ex2Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    System.out.println("Matrix 1");
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex2Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    for (int i = 0; i<matrix.length; i++) {
        for (int j =0; j<matrix[i].length; j++) {
            if (j==matrix[i].length-1) {
                outputFile.write(matrix[i][j]);
            } else {
                outputFile.write(matrix[i][j]+",");
            }
        }
    }
  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException {
    Scanner in = new Scanner(filename);
    int r = ;
    int c = ;
    int[][] arr = new int[r][c];
    for(int i = 0; i < r; ++i)
{
    for(int j = 0; j < c; ++j)
    {
        if(Scanner.hasNextInt())
        {
            arr[i][j] = Scanner.nextInt();
        }
    }
}
    /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
     int[][] product = new int[matrix1.length][matrix2.length];
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int k = 0; k < matrix2[j].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
  }
}
