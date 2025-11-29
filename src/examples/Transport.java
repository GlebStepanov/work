package examples;

public class Transport {

    private float speed;
    private String colour;
    private int weight;
    private byte[] coordinates;



    Transport(float speed, int weight, String colour, byte[] coordinates){
        System.out.println("Object created");
        setValues(speed, weight, colour, coordinates);
        System.out.println(getValue());
    }

    Transport(int weight, byte[] coordinates){
        this.weight = weight;
        this.coordinates = coordinates;
     //   System.out.println(getValue());
    }
    protected void setValues(float speed, int weight, String colour, byte[] coordinates){
        speed = this.speed;
        colour = this.colour;
        weight = this.weight;
        coordinates = this.coordinates;
    }

    public String getValue(){
        String infoCoordinates = "Coordinates:\n";
        String info =  "Object speed: " + speed + ". Weight: " + weight + ". Colour: " + colour ;
        for (int i = 0; i < coordinates.length; i++){
            infoCoordinates += coordinates[i] + "\n";
        }
        return info + infoCoordinates ;
    }


}
