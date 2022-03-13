
package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one() {
        assertEquals(Math.calculatePower(1,1),1);
    }

    @Test
    public void two_raised_to_one_is_two() { assertEquals(Math.calculatePower(2,1),2); }

    @Test
    public void two_raised_to_two_is_four() {
        assertEquals(Math.calculatePower(2,2),4);
    }

    @Test
    public void three_raised_to_two_is_nine() {
        assertEquals(Math.calculatePower(3,2),9);
    }
}
