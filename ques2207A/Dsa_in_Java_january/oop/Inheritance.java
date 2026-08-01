package oop;

class pokemon{
     int power;
    String type;

    pokemon(String type,int power){
        this.power=power;
        this.type=type;
    }

    pokemon(){};

    // pokemon(int power,String type){
    //     this.power=power;
    //     this.type=type;
    // }

    int getPower(){
        return power;
    }

    void print(){
        System.out.println(this.power+" "+this.type);
    }
}

class StrongPokemon extends pokemon{
    //child class
    int speed;
}

class LegendaryPokemon extends pokemon{
    // LegendaryPokemon(String type, int power) {
    //     super(type, power);
       
    // }

    String ability;
}


class GodPokemon extends LegendaryPokemon{
    char tag;
}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo=new LegendaryPokemon();
        mewtwo.ability="Pressure";
        pokemon pikachu=new pokemon();
        GodPokemon dialog=new GodPokemon();
    }
}
