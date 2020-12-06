package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * An initial test
     */
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

    // add more tests
    
}
