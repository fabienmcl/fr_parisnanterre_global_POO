package Burger;

public interface Ingredient {

    int get_grams();
    int get_calories();
    int get_prices();

    default String get_print(){
        return "- "+this+" ("+get_grams()+"g) -- "+get_prices()+"€\n";
    }

}
