package examples;

public class Monster {
    int eyes;
    int hands;
    int legs;


    Monster(){
        this(3);
    }

    Monster( int pocet){
        this(pocet, pocet, pocet);
    }

    Monster(int eyes, int hands, int legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    void voice(){
        voice(1);
    }

    void voice(int pocet){
    voice(pocet, "AAAAAAAAAAA");
    }

    void voice(int pocet, String word){
        for(int i = 0; i < pocet; i++){
            System.out.println(word);
        }
    }
}
