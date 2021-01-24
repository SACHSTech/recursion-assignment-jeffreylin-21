package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

/**
* ICS4U TDD and Recursion Assignment Test Cases
* @author: J. Lin
*
*/

public class RecursionTest{
    
  // Test cases for count7

  // Test when there are no 7's in the int, expects 0
  @Test
  public void Test1_1() {
    assertEquals(0, Recursion.count7(0));
  }

  // Test when there is one 7 in the int, expects 1
  @Test
  public void Test1_2() {
    assertEquals(1, Recursion.count7(7));
  }

  // Test when there are only 7's in the int, expects 3
  @Test
  public void Test1_3() {
    assertEquals(3, Recursion.count7(777));
  }

  // Test when there are 7's and other digits in the int, expects 3
  @Test
  public void Test1_4() {
    assertEquals(3, Recursion.count7(777638492));
  }

  // Test when there are 7's only at the end and other digits in the int, expects 2
  @Test
  public void Test1_5() {
    assertEquals(2, Recursion.count7(12345677));
  }

  // Test when there are 7's and other digits mixed throughout the int, expects 3
  @Test
  public void Test1_6() {
    assertEquals(3, Recursion.count7(7187371));
  }

  // Tests for changePi

  // Test when the string is empty, expects empty string
  @Test
  public void Test2_1() {
    assertEquals("", Recursion.changePi(""));
  }

  // Test when the string is "pi", expects "3.14"
  @Test
  public void Test2_2() {
    assertEquals("3.14", Recursion.changePi("pi"));
  }

  // Test when the string is a mix of "pi" and other characters, expects "3.14a3.14"
  @Test
  public void Test2_3() {
    assertEquals("3.14a3.14", Recursion.changePi("piapi"));
  }

  // Test when the string is a several "pi" in a row, expects "3.143.143.14"
  @Test
  public void Test2_4() {
    assertEquals("3.143.143.14", Recursion.changePi("pipipi"));
  }

  // Test when the string is a several "pi" in a row but with capitalization, expects "Pi3.14Pi"
  @Test
  public void Test2_5() {
    assertEquals("Pi3.14Pi", Recursion.changePi("PipiPi"));
  }

   // Test when string contains "pi", numbers, and special characters, expects 25.3.14,89
  @Test
  public void Test2_6() {
    assertEquals("25.3.14,89", Recursion.changePi("25.pi,89"));
  }

  // Tests for array220

  // Test when array only contains 0, expects false
  @Test
  public void Test3_1() {
    int[] intArray = { 0 };
    assertFalse(Recursion.array220(intArray, 0));
  }

  // Test when elements in array are 1, 10, expects true
  @Test
  public void Test3_2() {
    int[] intArray = { 1, 10 };
    assertTrue(Recursion.array220(intArray, 0));
  }

  // Test when array is empty, expects false
  @Test
  public void Test3_3() {
    int[] intArray = { };
    assertFalse(Recursion.array220(intArray, 0));
  }

  // Test when array is does not fufill conditions, expects false
  @Test
  public void Test3_4() {
    int[] intArray = { 1, 1, 1, 1, 1, 1 };
    assertFalse(Recursion.array220(intArray, 0));
  }

  // Test when array fufills conditions, but has a lot of elements, expects true
  @Test
  public void Test3_5() { 
    int[] intArray = { 1, 5, 2, 6, 1, 10, 54, 20, 20, 1 };
    assertTrue(Recursion.array220(intArray, 0));
  }

  // Test when array fufills conditions, but consists of negative numbers, expects true
  @Test
  public void Test3_6() {
    int[] intArray = { -1, -2, -3, -30, -5, -6, 0 };
    assertTrue(Recursion.array220(intArray, 0));
  }
    
}
