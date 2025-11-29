package Work;

public class Developer extends Employee {
    private int projectHours;

    public Developer(String name, double baseSalary, int projectHours) {
        super(name, baseSalary);
        this.projectHours = projectHours;
    }

    @Override
    public double calculateBonus() {
        return projectHours * 15.5;
    }

}
