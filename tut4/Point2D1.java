package PR2.tut4;

public class Point2D1 {
    private double x;
    private double y;

    public Point2D1() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point2D1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D1 otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return "Point2D [ x = " + getX() + " y = " + getY() + " ]";
    }
}
