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

    // add more tests
    
}
