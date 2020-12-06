package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        assertEquals(0, Recursion.count7(0));
    }

    @Test
    public void Test2(){
        assertEquals(1, Recursion.count7(7));
    }

    @Test
    public void Test3(){
        assertEquals(3, Recursion.count7(777));
    }

    @Test
    public void Test4(){
        assertEquals(3, Recursion.count7(777638492));
    }

    @Test
    public void Test5(){
        assertEquals(2, Recursion.count7(12345677));
    }

    @Test
    public void Test6(){
        assertEquals(3, Recursion.count7(7187371));
    }

    // add more tests
    
}
