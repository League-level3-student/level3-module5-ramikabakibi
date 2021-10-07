package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        assertEquals(3, RecursionMath.recursiveDivision(36, 12));
        
    }

    @Test 
    public void testPower() {
      assertEquals(9, RecursionMath.recursivePower(3, 2));
    }
}
