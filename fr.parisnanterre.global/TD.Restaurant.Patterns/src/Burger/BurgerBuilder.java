package Burger;

import java.util.ArrayList;
import java.util.List;

public interface BurgerBuilder {
    
    String name();
    List<Ingredient> ingredients = new ArrayList<Ingredient>();
    BurgerBuilder with_cheese();
    BurgerBuilder with_onions();
}
