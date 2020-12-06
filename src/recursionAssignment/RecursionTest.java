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

    // add more tests
    
}
