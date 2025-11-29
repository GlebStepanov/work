package box;

public class Box {
    double length;
    double width;
    double height;

    Box(){
        this(10);
    }
    double getVolume(){
        return length * width * height;

    }

    Box(double size){
        this(size, size, size);
    }

    void showVolume(){
        System.out.println(getVolume());
    }

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    int compare(Box another){
       double currentVolume = getVolume();
       double anotherVolume = getVolume();
       int i;
       if (currentVolume > anotherVolume){
           return 1;
       } else if (currentVolume < anotherVolume){
           return -1;

       } else {
           return 0;
       }

    }
}
