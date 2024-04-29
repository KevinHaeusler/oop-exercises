package ch.hslu.oop.sw06.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    public void testConstructorAndGetters() {
        Point point = new Point(23, 45);
        assertEquals(23, point.getX());
        assertEquals(45, point.getY());
    }

    @Test
    public void testDefaultConstructor() {
        Point point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    public void testCopyConstructor() {
        Point originalPoint = new Point(23, 45);
        Point copiedPoint = new Point(originalPoint);
        assertEquals(23, copiedPoint.getX());
        assertEquals(45, copiedPoint.getY());
    }

    @Test
    public void testSetX() {
        Point point = new Point();
        point.setX(23);
        assertEquals(23, point.getX());
    }

    @Test
    public void testSetY() {
        Point point = new Point();
        point.setY(45);
        assertEquals(45, point.getY());
    }

    @Test
    public void testMoveRelativeWithPositiveNumbers() {
        Point point = new Point(23, 45);
        point.moveRelative(77, 55);
        assertEquals(100, point.getX());
        assertEquals(100, point.getY());
    }

    @Test
    public void testMoveRelativeWithNegativeNumbers() {
        Point point = new Point(23, 45);
        point.moveRelative(-46, -90);
        assertEquals(-23, point.getX());
        assertEquals(-45, point.getY());
    }

    @Test
    public void testMoveRelativeWithVector() {
        Point vector = new Point(-46, -90);
        Point point = new Point(23, 45);
        point.moveRelative(vector);
        assertEquals(-23, point.getX());
        assertEquals(-45, point.getY());
    }

    @Test
    public void testMoveRelativeWithPolarCoordinates() {
        Point point = new Point();
        point.moveRelative(22.6d, 13d);
        assertEquals(12, point.getX());
        assertEquals(5, point.getY());
    }

}
