package Burger;

public class Bread implements Ingredient {
    @Override
    public int get_grams() {
        return 100;
    }

    @Override
    public int get_calories() {
        return 298;
    }

    @Override
    public int get_prices() {
        return 0;
    }
}
