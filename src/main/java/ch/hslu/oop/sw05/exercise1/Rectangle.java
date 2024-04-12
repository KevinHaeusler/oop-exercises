package ch.hslu.oop.sw05.exercise1;

/**
 * The type Rectangle.
 */
public final class Rectangle extends Shape {
    private int width;
    private int height;

    /**
     * Instantiates a new Rectangle.
     *
     * @param x      the x
     * @param y      the y
     * @param width  the width
     * @param height the height
     */
    public Rectangle(final int x, final int y,
                     final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public final int getWidth() {
        return this.width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public final int getHeight() {
        return this.height;
    }

    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }

}
