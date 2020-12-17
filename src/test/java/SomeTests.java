import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeTests {
    @Test
    void test1() {
        assertTrue(true);
    }

    @Test
    void test2() {
        assertTrue(true);
    }

    @Test
    void test3() {
        assertTrue(true);
    }

    @Test
    void test4() {
        assertTrue(false);
    }

    @Test
    @Disabled
    void test5() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void test6() {
        assertTrue(true);
    }
}
