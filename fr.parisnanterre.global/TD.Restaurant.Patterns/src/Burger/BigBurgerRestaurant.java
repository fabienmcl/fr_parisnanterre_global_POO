package Burger;

public class BigBurgerRestaurant implements BugerRestaurant {

    private static BigBurgerRestaurant instance = null;

    @Override
    public BugerBuilder order_menu(MenuType menu) {
        BurgerBuilder b = null;
        switch (menu){
            case MEAT_MENU :
                b = new BigBurgerBuilder(gdfh)
                        .with_dnsj()
        }

        return b;
    }

    @Override
    public BurgerBuilder order_personal(Size size, Steak steak) {
        return null;
    }
}
