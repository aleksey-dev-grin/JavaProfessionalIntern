package grin.aleksey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();

    @Test
    public void calculatorPlusTest() {
        assertEquals(5, app.calculatorPlus(2,3));
    }

    @Test
    public void calculatorMinusTest() {
        assertEquals(1, app.calculatorMinus(3,2));
    }
}
