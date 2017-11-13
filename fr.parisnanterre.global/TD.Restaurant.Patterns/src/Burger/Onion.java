package Burger;

public class Onion {

    protected double default_value;
    protected double grams;
    protected double default_calories;

    public Onion(double grams){
        this.grams = grams;
        this.default_value = 0.30;
        this.default_calories = 40;
    }
}
