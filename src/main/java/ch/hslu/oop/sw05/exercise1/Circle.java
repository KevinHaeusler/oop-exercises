package ch.hslu.oop.sw05.exercise1;

/**
 * The type Circle.
 */
public final class Circle extends Shape {
    private int diameter;

    /**
     * Instantiates a new Circle.
     *
     * @param x        the x
     * @param y        the y
     * @param diameter the diameter
     */
    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.setDiameter(diameter);
    }

    /**
     * Gets diameter.
     *
     * @return the diameter
     */
    public int getDiameter() {
        return this.diameter;
    }

    /**
     * Sets diameter.
     *
     * @param newDiameter the new diameter
     */
    public void setDiameter(int newDiameter) {
        this.diameter = newDiameter;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * this.getDiameter() * Math.PI);
    }

    @Override
    public int getArea() {
        return (int) (Math.pow(this.getDiameter(), 2) * Math.PI);
    }
}