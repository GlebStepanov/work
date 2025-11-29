package examples;

public class Truck extends Transport {

    private boolean isLoaded;

    Truck(int weight, byte[] coordinates){
         super(weight, coordinates);
    }


            public void setValues(float speed, int weight, String colour, byte[] coordinates, boolean isLoaded){
             super.setValues(speed, weight, colour, coordinates);
        System.out.println("2 metoj");
    }

    Truck(int weight, byte[] coordinates, boolean isLoaded){
         super(weight, coordinates);
         this.isLoaded = isLoaded;
    }

    @Override
    public String getValue() {

        System.out.println( super.getValue());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getLoaded(){
        if (isLoaded)
            return "Грузовик загружен";
        else
            return "Грузовик не загружен";
    }
}
