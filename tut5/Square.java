package PR2.tut5;
public class Square extends Rectangle{
    public Square(double side){
        super(side,side);
        this.length = side;
        this.width = side;
    }
    public Square(double side, String color, boolean filled){
        setColor(color);
        setFilled(filled);
        setLength(side);
        setWidth(side);
    }

    public void setWidth(double newwidth){
        this.width=newwidth;
        this.length=newwidth;
    }
    public void setLength(double newlength){
        this.length = newlength;
        this.width = newlength;
    }

    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    public String toString(){
        return "Square[Rectangle[Shape[color="+getColor()+",filled="+isFilled()+"],width="+this.width+",length="+this.length+"]";
    }

    public static void main(String[] args){
        Square a = new Square(5,"red",false);
        System.out.println(a.getWidth());
        System.out.println(a);
        System.out.println(a.getArea());
    }

}
