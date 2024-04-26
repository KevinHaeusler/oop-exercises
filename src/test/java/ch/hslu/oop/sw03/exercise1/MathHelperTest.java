package ch.hslu.oop.sw03.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathHelperTest {
    @Test
    void testMaxTwoInts() {
        assertEquals(5, MathHelper.max(1, 5));
        assertEquals(5, MathHelper.max(5, 1));
    }

    @Test
    void testMaxTwoInts2() {
        assertEquals(5, MathHelper.max2(1, 5));
        assertEquals(5, MathHelper.max2(5, 1));

    }

    @Test
    void testMaxTwoInts3() {
        assertEquals(5, MathHelper.max3(1, 5));
        assertEquals(5, MathHelper.max3(5, 1));

    }

    @Test
    void testMaxThreeInts() {
        assertEquals(5, MathHelper.max(1, 5, 2));
        assertEquals(5, MathHelper.max(5, 1, 2));
        assertEquals(5, MathHelper.max(3, 1, 5));
    }

    @Test
    void testMaxThreeInts2() {
        assertEquals(5, MathHelper.max2(1, 5, 2));
        assertEquals(5, MathHelper.max2(5, 1, 2));
        assertEquals(5, MathHelper.max2(3, 1, 5));
    }

    @Test
    void testMaxThreeInts3() {
        assertEquals(5, MathHelper.max3(1, 5, 2));
        assertEquals(5, MathHelper.max3(5, 1, 2));
        assertEquals(5, MathHelper.max3(3, 1, 5));
    }

}
