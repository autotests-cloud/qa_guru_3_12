package tests1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeTests2 {
    @Test
    void test1() {
        assertTrue(true);
    }

    @Test
    void test2() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test3() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test4() {
        assertTrue(false);
    }
}
