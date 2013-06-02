package ss.arena.demo.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionsTest {
    @Test
    public void testLinear() {
        assertEquals(5, Functions.linear(2, 2, 1), 0);
    }
}
