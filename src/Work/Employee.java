package Work;

public abstract class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if (salary > 0) {
            this.baseSalary = salary;
        } else {
            System.out.println("Ошибка: зарплата должна быть больше нуля!");
        }
    }

    public abstract double calculateBonus();
}
