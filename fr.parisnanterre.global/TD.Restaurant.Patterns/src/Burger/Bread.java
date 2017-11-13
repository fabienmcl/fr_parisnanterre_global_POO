package Burger;

public class Bread extends ConcretIngredient {


    protected double default_value;
    protected double grams;
    protected double default_calories;

    public Bread(){
        this.grams = 100;
        this.default_value = 0.0;
        this.default_calories = 298;
    }

}
