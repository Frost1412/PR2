package PR2.tut5;

import PR2.tut5.Shape;

class Rectangle extends Shape {
    public double width = 1.0;
    public double length = 1.0;
    Rectangle(){}
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        setColor(color);
        setFilled(filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    public void setWidth(double newwidth){
        this.width  =newwidth;
    }
    public void setLength(double newlength){
        this.length = newlength;
    }
    public String toString(){
        return "Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"],width="+this.width+",length="+this.length+"]";
    }
}
