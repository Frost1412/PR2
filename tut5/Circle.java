package PR2.tut5;

public class Circle extends Shape {
    private double radius = 1.0;
    Circle(){}
    Circle(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newradius){
        this.radius = newradius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle[Shape[color="+",filled="+"],radius="+this.radius+"]";
    }
}
