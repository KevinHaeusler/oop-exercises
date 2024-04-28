package ch.hslu.oop.sw04.exercise3;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(final Point startPoint, final Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(final int x1, final int y1, final int x2, final int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStartPoint() {
        return (new Point(this.startPoint.getX(), this.startPoint.getY()));
    }

    public Point getEndPoint() {
        return (new Point(this.endPoint.getX(), this.endPoint.getY()));
    }

    public Point getStartPointCopy() {
        return new Point(this.startPoint);
    }

    public Point getEndPointCopy() {
        return new Point(this.endPoint);
    }

    public void setStartPoint(final Point startPoint) {
        this.startPoint = new Point(startPoint);
    }

    public void setEndPoint(final Point endPoint) {
        this.endPoint = new Point(endPoint);
    }

    public void setStartPoint(final int x, final int y) {
        this.startPoint.setX(x);
        this.startPoint.setY(y);
    }

    public void setEndPoint(final int x, final int y) {
        this.endPoint.setX(x);
        this.endPoint.setY(y);
    }

}
