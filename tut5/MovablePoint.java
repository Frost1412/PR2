package PR2.tut5;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(){}
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float a) {
        this.xSpeed = a;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setYSpeed(float b) {
        this.ySpeed = b;
    }
    public void setSpeed(float c, float d) {
        this.xSpeed = c;
        this.ySpeed = d;
    }
    public float[] getSpeed (){
        float[] lmao = {this.xSpeed, this.ySpeed};
        return lmao;
    }
    public String toString(){
        return " " + x + " " + y +" " + xSpeed + " " + ySpeed;
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }








}
