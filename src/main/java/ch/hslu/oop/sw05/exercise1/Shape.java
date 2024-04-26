package ch.hslu.oop.sw05.exercise1;

/**
 * SW05 Shape
 * KevinHaeusler
 * 2024 OOP
 */
public abstract class Shape {
    private int x;
    private int y;

    /**
     * Instantiates a new Shape.
     *
     * @param x the x
     * @param y the y
     */
    protected Shape(final int x, final int y) {
        this.move(x, y);

    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public final int getX() {
        return this.x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public final int getY() {
        return this.y;
    }

    /**
     * Move.
     *
     * @param newX the new x
     * @param newY the new y
     */
    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }

    /**
     * Gets perimeter.
     *
     * @return the perimeter
     */
    public abstract int getPerimeter();

    /**
     * Gets area.
     *
     * @return the area
     */
    public abstract int getArea();
}
