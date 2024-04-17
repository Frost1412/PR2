package PR2.tut6;

public class Triangle extends Shape {

    int base;
    int height;

    public Triangle(int base, int height, String color) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return this.base * this.height;
    }

    public String toString() {
        return "triangle";
    }



}
