package Burger;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    String name;

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

        this.name = "Own style";
        ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Bread());
        this.steak = steak;
        this.size =  size;
        steak.set_size(size);
        ingredients.add(steak);
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
        return ingredients.get(0).get_print();
    }
}
