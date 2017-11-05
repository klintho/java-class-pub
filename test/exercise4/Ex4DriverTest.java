/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author klinth02
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer n = 5;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);   
        
        n = n%2;
        expResult = 1;
        result = instance.task1(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String str = "python";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 6;
        Integer result = instance.task2(str);
        assertEquals(expResult, result);
        
        str="hi";
        expResult=2;
        result=instance.task2(str);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character c = 'a';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 97;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        
        c='z';
        expResult=122;
        result=instance.task3(c);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String str = "Test string";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'T';
        Character result = instance.task4(str);
        assertEquals(expResult, result);
        
        str="A";
        expResult='A';
        result=instance.task4(str);
        assertEquals(expResult, result);
        }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer n = 2;
        Integer m = 3;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 6;
        Integer result = instance.task5(n, m);
        assertEquals(expResult, result);
        
        n = 5;
        m=10;
        expResult=50;
        result=instance.task5(n, m);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String str = "Here's a test string";
        Integer n = 5;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 's';
        Character result = instance.task6(str, n);
        assertEquals(expResult, result);
        
        str="Another test string";
        n=3;
        expResult='t';
        result=instance.task6(str, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] arr = {1, 2, 3, 4};
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 2;
        Integer result = instance.task7(arr);
        assertEquals(expResult, result);
        
        arr[0]=56;
        arr[1]=89;
        arr[3]=65;
        expResult=89;
        result=instance.task7(arr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] arr = {1,2,3,4,5};
        Integer n = 3;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = true;
        Boolean result = instance.task8(arr, n);
        assertEquals(expResult, result);
        
        n=6;
        expResult=false;
        result=instance.task8(arr, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> arrlst = new ArrayList<String>();
        arrlst.add("item 1");
        arrlst.add("item 2");
        arrlst.add("item 3");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task9(arrlst);
        assertEquals(expResult, result);
        
        arrlst.add("5");
        expResult = 4;
        result = instance.task9(arrlst);
        assertEquals(expResult, result);
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "item 1");
        hash.put(2, "item 2");
        hash.put(3, "item 3");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task10(hash);
        assertEquals(expResult, result);
        
        hash.remove(3);
        expResult=2;
        result=instance.task10(hash);
        assertEquals(expResult, result);
    }
    
}
