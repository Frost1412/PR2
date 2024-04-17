package PR2.tut6;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(int length, int width, String color) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }
    public String toString() {
        return "rectangle";
    }

}
