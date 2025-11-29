package examples;

public class Person {
   private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(String name,int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
