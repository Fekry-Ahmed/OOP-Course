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

    public void modifyObject(Rectangle obj) {
        // This will modify the object passed to the method
        obj.length = 30;
        obj.width = 20;
    }

    public static Rectangle addObjects(Rectangle obj1, Rectangle obj2) {
        Rectangle result = new Rectangle();

        result.setLength(obj1.getLength() + obj2.getLength());
        result.setWidth(obj1.getWidth() + obj2.getWidth());

        return result;
    }
}

class RectangleClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8.5, 8.5);
        // System.out.println(r1.getLength());

        Rectangle myInputObj = new Rectangle(1, 2);

        System.out.println(myInputObj.getWidth());
        System.out.println(myInputObj.getLength());

        r1.modifyObject(myInputObj);

        System.out.println(myInputObj.getWidth());
        System.out.println(myInputObj.getLength());
    }
}