import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @Test
    public void divisiblePor3Test1() {
        assertEquals("SI", Divisible3.compruebaDivisiblePor3(2));
    }

    @Test
    public void divisiblePor3Test2() {
        assertEquals("SI", Divisible3.compruebaDivisiblePor3(6));
    }

    @Test
    public void divisiblePor3Test3() {
        assertEquals("NO", Divisible3.compruebaDivisiblePor3(4));
    }

    @Test
    public void divisiblePor3Test4() {
        assertEquals("NO", Divisible3.compruebaDivisiblePor3(13));
    }

    @Test
    public void divisiblePor3Test5() {
        assertEquals("NO", Divisible3.compruebaDivisiblePor3(10));
    }
}