package PR2.tut5;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    Point(){}
    public Point(float x, float y) {
        this.x = x;
        this.y = y;

    }
    public float getX() {
        return x;
    }

    public void setX(float a) {
        this.x = a;
    }

    public float getY() {
        return y;
    }

    public void setY(float b) {
        this.y = b;
    }

    public void setXY(float c, float d) {
        this.x = c;
        this.y = d;
    }
    public float[] getXY() {
        float[] troll = {this.x, this.y};
        return troll;
    }
    public String toString() {
        return ""+x + y;

    }





}
