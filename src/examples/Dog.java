package examples;

public class Dog {
    String name;
    String poroda;
    double weight;
    int speed;

    String dogData() {
        return "Name: " + name + ", Poroda: " + poroda + ", Weight: " + weight;

    }

    void run() {
        for (int i = 1; i <= speed; i++) {
            System.out.println("Бегу " + i);

        }


    }
}
