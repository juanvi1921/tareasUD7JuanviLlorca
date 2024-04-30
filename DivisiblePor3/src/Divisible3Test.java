import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {
    @Test
    public void divisiblePor3Test1() {
        assertEquals("SI", Divisible3.compruebaDivisiblePor3(2));
    }
}