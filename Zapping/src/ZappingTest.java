import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {
    @Test
    public void testZapping1(){
        assertEquals(0, Zapping.cambiarCanal(1,1));
    }

    @Test
    public void testZapping2() {
        assertEquals(1, Zapping.cambiarCanal(1,2));
    }

    @Test
    public void testZapping3() {
        assertEquals(20, Zapping.cambiarCanal(10,30));
    }

    @Test
    public void testZapping4() {
        assertEquals(2, Zapping.cambiarCanal(2,99));
    }

    @Test
    public void testZapping5(){
        assertEquals(41, Zapping.cambiarCanal(5,63));
    }

    @Test
    public void testZapping6() {
        assertEquals(41, Zapping.cambiarCanal(63, 5));
    }

    @Test
    public void testZapping7() {
        assertEquals(49, Zapping.cambiarCanal(1,51));
    }
}