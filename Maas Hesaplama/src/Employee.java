public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private final int currentYear = 2021;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama metodu
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama metodu
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı hesaplama metodu
    public void raiseSalary() {
        int yearsWorked = currentYear - hireYear;
        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    // Bilgiyi toString metoduyla döndüren metot
    @Override
    public String toString() {
        return "Employee Name: " + name + "\nSalary: " + salary + " TL\nWork Hours: " + workHours + " hours\nHire Year: " + hireYear;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1200, 45, 2015);
        double tax = employee.tax();
        double bonus = employee.bonus();
        employee.raiseSalary();
        System.out.println(employee.toString());
        System.out.println("Tax: " + tax + " TL");
        System.out.println("Bonus: " + bonus + " TL");
    }
}
