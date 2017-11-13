package Burger;

public class ConcretIngredient implements Ingredient{

    protected double default_value;
    protected double grams;
    protected double default_calories;

    @Override
    public double get_grams() {
        return this.grams;
    }

    @Override
    public double get_calories() {
        return (default_calories/100)*grams;
    }

    @Override
    public double get_prices() {
        return (default_value/100)*grams;
    }
}