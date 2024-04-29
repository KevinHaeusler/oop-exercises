package ch.hslu.oop.sw06.exercise1;

/**
 * Modell eines Punktes im 2D-Raum.
 * Klasse ist NICHT mehr Immutable implementiert.
 */
public class Point {

    /**
     * Punkt keinem Quadrant zugeordnet.
     */
    private static final int NO_QUADRANT = 0;

    /**
     * Quadrant 1. Positiv x, Positiv y.
     */
    private static final int QUADRANT_1 = 1;

    /**
     * Quadrant 1. Negativ x, Positiv y.
     */
    private static final int QUADRANT_2 = 2;

    /**
     * Quadrant 1. Negativ x, Negativ y.
     */
    private static final int QUADRANT_3 = 3;

    /**
     * Quadrant 4. Positiv x, Negativ y.
     */
    private static final int QUADRANT_4 = 4;

    private int x;
    private int y;

    /**
     * Konstruktor für Punkt mit Koordinaten.
     * 
     * @param x x-Koordinate.
     * @param y y-Koordinate.
     */
    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Konstruktor für Punkt aus einem Punkt.
     * 
     * @param point
     */
    public Point(Point point) {
        this(point.getX(), point.getY());
    }

    /*
     * Konstruktor falls nichts angegeben, erstelle einen Punkt im Nullpunkt.
     */
    public Point() {
        this(0, 0);
    }

    /**
     * Liefert x-Koordinate zurück.
     * 
     * @return x-Koordinate des Punktes.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Liefert y-Koordinate zurück.
     * 
     * @return y-Koordinate des Punktes.
     */
    public int getY() {
        return this.y;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public void moveRelative(int x, int y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    public void moveRelative(Point point) {
        this.moveRelative(point.getX(), point.getY());
    }

    public void moveRelative(double degree, double radius) {

        degree = (float) Math.toRadians(degree);
        int x = (int) Math.round(Math.cos(degree) * radius);
        int y = (int) Math.round(Math.sin(degree) * radius);

        this.moveRelative(x, y);
    }

    /**
     * Liefert den Quadranten in welchem der Punkt liegt.
     * Liegen die Koordinaten auf den Achsen oder
     * auf dem Nullpunkt, liefert die Funktion den Wert 0 zurück.
     * 
     * @return Nummer des Quadranten.
     */
    public int getQuadrant() {
        int quadrant = NO_QUADRANT;
        if (this.x != 0 && this.y != 0) {
            if (this.x > 0) {
                if (this.y > 0) {
                    quadrant = QUADRANT_1;
                } else {
                    quadrant = QUADRANT_4;
                }
            } else {
                if (this.y > 0) {
                    quadrant = QUADRANT_2;
                } else {
                    quadrant = QUADRANT_3;
                }
            }
        }
        return quadrant;
    }
}
