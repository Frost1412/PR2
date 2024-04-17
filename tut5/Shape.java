package PR2.tut5;

public class Shape {
    private String color = "green";
     private boolean filled = true;

    Shape(){}
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }

    public void setColor(String newcolor){
        this.color = newcolor;
    }

    public void setFilled(boolean newfilled){
        this.filled = newfilled;
    }
    public String toString(){
        if(isFilled()){
        return "A Shape with color of "+this.color+" and filled";
        }else{
        return "A Shape with color of "+this.color+" and not filled";
        }
    }
}
