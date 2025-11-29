package test;

public class List {

    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("Daniil");
        for(int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.getArray(i));
        }
    }

    private static MyArrayList getEmployees(){
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}
