import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    /*
    @Test
    public void testZapping1(){
        assertEquals(0, Zapping.cambiarCanal(1,1));
    }

     */

    @Test
    public void testZapping2() {
        assertEquals(1, Zapping.cambiarCanal(1,2));
    }
}