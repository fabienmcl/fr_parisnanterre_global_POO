package Burger;

public interface BugerRestaurant {
    BugerBuilder order_menu(MenuType menu);
    BurgerBuilder order_personal(Size size, Steak steak);
}
