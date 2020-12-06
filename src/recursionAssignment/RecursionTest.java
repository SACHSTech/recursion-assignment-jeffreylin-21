package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Test
    public void Test1_1(){
      assertEquals(0, Recursion.count7(0));
    }

    @Test
    public void Test1_2(){
      assertEquals(1, Recursion.count7(7));
    }

    @Test
    public void Test1_3(){
      assertEquals(3, Recursion.count7(777));
    }

    @Test
    public void Test1_4(){
      assertEquals(3, Recursion.count7(777638492));
    }

    @Test
    public void Test1_5(){
      assertEquals(2, Recursion.count7(12345677));
    }

    @Test
    public void Test1_6(){
      assertEquals(3, Recursion.count7(7187371));
    }

    @Test
    public void Test2_1(){
      assertEquals("", Recursion.changePi(""));
    }

    @Test
    public void Test2_2(){
      assertEquals("3.14", Recursion.changePi("pi"));
    }

    @Test
    public void Test2_3(){
      assertEquals("3.14a3.14", Recursion.changePi("piapi"));
    }

    @Test
    public void Test2_4(){
      assertEquals("3.143.143.14", Recursion.changePi("pipipi"));
    }

    @Test
    public void Test2_5(){
      assertEquals("Pi3.14Pi", Recursion.changePi("PipiPi"));
    }

    @Test
    public void Test2_6(){
      assertEquals("ILoveToEat3.14", Recursion.changePi("ILoveToEatpi"));
    }

    @Test
    public void Test3_1(){
      int[] intArray = {0};
      assertFalse(Recursion.array220(intArray, 0));
    }

    @Test
    public void Test3_2(){
      int[] intArray = {1, 10};
      assertTrue(Recursion.array220(intArray, 0));
    }

    @Test
    public void Test3_3(){
      int[] intArray = {1, 2, 3, 4, 5, 6, 60};
      assertTrue(Recursion.array220(intArray, 0));
    }

    @Test
    public void Test3_4(){
      int[] intArray = {1, 1, 1, 1, 1, 1};
      assertFalse(Recursion.array220(intArray, 0));
    }

    @Test
    public void Test3_5(){
      int[] intArray = {1, 5, 2, 6, 1, 10, 54, 20, 20, 1};
      assertTrue(Recursion.array220(intArray, 0));
    }

    @Test
    public void Test3_6(){
      int[] intArray = {-1, -2, -3, -4, -5, -6, 0};
      assertFalse(Recursion.array220(intArray, 0));
    }
    
}
