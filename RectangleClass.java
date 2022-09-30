class Rectangle {
    private double width;
    private double length;

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
        Rectangle r1 = new Rectangle();
        r1.setLength(8.5);
        System.out.println(r1.getLength());
    }
}