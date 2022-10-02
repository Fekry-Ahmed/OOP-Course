class Rectangle {

    private double width;
    private double length;

    // Initialize the Object with default values
    public Rectangle() {
        length = 1;
        width = 1;
        System.out.println("new object created");
    }

    // Initialize the Object with values that passed by user
    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public double getWidth() {
        return width;
    };

    public void setWidth(double w) {
        width = w;
    };

    public double getLength() {
        return length;
    };

    public void setLength(double l) {
        length = l;
    };
}

class RectangleClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8.5, 8.5);
        System.out.println(r1.getLength());
    }
}