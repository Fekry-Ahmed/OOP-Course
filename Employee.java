public class Employee {
    private int emp_id;
    private String emp_name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident;

    public Employee() {
        emp_name = "no name";
        salary = 3000;
        bonus = 0;
        depart = "not assigned";
        resident = true;
    }

    public Employee(int id, String name) {
        emp_id = id;
        emp_name = name;
    }

    public Employee(int id, String name, boolean r) {
        this(id, name);
        resident = r;
    }

    public Employee(int id, String name, String d, boolean r, double b, double s) {
        this(id, name, r);
        bonus = b;
        salary = s;
        depart = d;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalaryAndBonus(double salary, double bonus) {
        this.setSalary(salary);
        this.bonus = bonus;
    }

    public void printData() {
        System.out.println("id : " + emp_id);
        System.out.println("name : " + emp_name);
        System.out.println("depart : " + depart);
        System.out.println("salary : " + salary);
        System.out.println("bonus : " + bonus);
        System.out.println("resident : " + resident);
    }
}

class EmployeeClass {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "fekry", "egypt", true, 100, 1000);
        e1.setSalaryAndBonus(4000, 200);
        e1.printData();
    }
}