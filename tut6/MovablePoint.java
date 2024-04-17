package PR2.tut6;

public class MovablePoint implements Movable {
    int x;
    int y;


    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + x + ", y: " + y;

    }

    public void moveUp() {
        this.y -= 1;
    }
    public void moveDown() {
        this.y +=1;
    }
    public void moveLeft() {
        this.x -= 1;

    }
    public void moveRight() {
        this.x +=1;
    }



}
