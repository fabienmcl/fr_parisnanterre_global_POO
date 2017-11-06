package Burger;

public enum Steak implements Ingredient {
    SOJA,
    BEEF,
    CHICKEN,
    FISH;

    Size size;

    public void set_size(Size s){
        this.size = s;
    }

    @Override
    public int get_grams(){
        switch (this.size){
            case LARGE: return 400;
            case MEDIUM: return 200;
            case SMALL: return 100;
        }
        return 0;

    }
    @Override
    public int get_calories(){
        int mult = get_grams()/100;
        switch (this){
            case SOJA: return 422*mult;
            case FISH: return 80*mult;
            case BEEF: return 148*mult;
            case CHICKEN: return 195*mult;
        }
        return 0;
    }
    @Override
    public int get_prices(){
        switch (this.size){
            case LARGE: return 20;
            case MEDIUM: return 15;
            case SMALL: return 10;
        }
        return 0;
    }


}
