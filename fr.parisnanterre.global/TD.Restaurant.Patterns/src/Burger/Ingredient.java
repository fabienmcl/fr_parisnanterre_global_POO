package Burger;

public interface Ingredient {

    double get_grams();
    double get_calories();
    double get_prices();

    default String get_print(){
        return "- "+this+" ("+get_grams()+"g) -- "+get_prices()+"€\n";
    }

}
