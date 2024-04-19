package PR2.old;

public class Rectangle {

        private float width;
        private float height;

        public Rectangle() {
            this.width = 1.0f;
            this.height = 1.0f;
        }

        public Rectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public float getArea() {
            return width * height;
        }

        public float getPerimeter() {
            return 2 * (width + height);
        }

        public String toString() {
            return "Rectangle[width=" + width + ",height=" + height+"]";
        }
    }

