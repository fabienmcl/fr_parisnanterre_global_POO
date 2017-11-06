package Burger;

import java.util.ArrayList;
import java.util.List;

public class Burger {


    List<Ingredient> ingredients;

    int cheese;
    int onions;
    int tomato;
    Sauce sauce;

    public static enum Sauce{
        MAYONNAISE,
        KETCHUP,
        BERNAISE,
        POIVRE,
        SAMOURAI,
        CHILI;
    }

    Steak steak;
    Size size;

    public Burger(Steak steak,Size size) {

        ingredients = new ArrayList<Ingredient>();


        this.steak = steak;
        this.size =  size;
        this.cheese = 0;
        this.onions = 0;
    }

    public void with_cheese(){
        cheese++;
    }

    public void with_onions(){
        onions++;
    }

    public void with_tomato(){
        tomato++;
    }
    public void with_sauce(Sauce sauce){
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "cheese=" + cheese +
                ", onions=" + onions +
                ", steak=" + steak +
                '}';
    }
}
