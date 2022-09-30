import java.time.Year;

class Car {
    private String maker;
    private int model;

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
        Car c1 = new Car();
        c1.setMaker("Honda");
        c1.setModel(2017);
        System.out.println(c1.getMaker());
        System.out.println(c1.getModel());
    }
}