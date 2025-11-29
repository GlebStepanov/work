package Work;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> staff = new ArrayList<>();

        staff.add(new Manager("Анна", 2200, 800));
        staff.add(new Developer("Иван", 1500, 120));

        for (Employee employee : staff) {
            double bonus = employee.calculateBonus();
            double totalSalary = employee.getBaseSalary() + bonus;

            System.out.println("Сотрудник: " + employee.getName());
            System.out.println("Полная зарплата: " + totalSalary);
        }
    }
}
