package examples;

public class Employer {
String name;
String place;
Integer mzda;

    Employer(){
        this.name = "Steven";
        this.place = "admin";
        this.mzda = 1000;
    }

    void showInfo(){
        System.out.println(name);
        System.out.println(mzda);
        System.out.println(place);
    }

    public Employer(String name, String place, Integer mzda) {
        this.name = name;
        this.place = place;
        this.mzda = mzda;
    }
}
