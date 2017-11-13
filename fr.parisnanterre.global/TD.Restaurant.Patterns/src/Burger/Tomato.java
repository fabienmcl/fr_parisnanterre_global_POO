package Burger;

public class Tomato extends ConcretIngredient{


    protected double default_value;
    protected double grams;
    protected double default_calories;

    public Tomato(double grams){
        this.grams = grams;
        this.default_value = 0.50;
        this.default_calories = 18;
    }


}
