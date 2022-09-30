class Car {
    private String maker;
    private int model;

    // Initialize the Object with default values
    public Car() {
        model = 2015;
        maker = "Honda";

    }

    // Initialize the Object with values that passed by user
    public Car(String m, int mo) {
        maker = m;
        model = mo;
    }

    public String getMaker() {
        return maker;
    };

    public void setMaker(String m) {
        maker = m;
    };

    public int getModel() {
        return model;
    };

    public void setModel(int year) {
        if (year > 2010) {
            model = year;
        }
    };
}

class CarClass {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2017);

        System.out.println(c1.getMaker());
        System.out.println(c1.getModel());
    }
}