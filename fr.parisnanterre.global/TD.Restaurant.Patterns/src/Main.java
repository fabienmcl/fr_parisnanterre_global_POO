import Burger.Steak;
import Burger.Burger;
import Burger.Size;

public class Main {

    public static void main(String args[]) {
        Burger b = new Burger(Steak.SOJA, Size.LARGE);
        System.out.println(b.toString());
    }
}


/*
package burger.client;

import burger.api.bigburger.BigBurgerRestaurant;
import burger.api.bigburger.DeepFriedOnions.Burger;

import static burger.api.general.Size.*;
import static burger.api.general.MenuType.*;
import static burger.api.bigburger.Meat.MeatType.*;
import static burger.api.bigburger.Sauce.SauceType.*;

import java.util.Arrays;
import java.util.List;

/**
 * DesignPatterns
 * Copyright (C) 2017 pascalpoizat (@pascalpoizat)
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
public class Main {
    public static void main(String args[]) {
        // A regular burger
        Burger alice_dinner = BigBurgerRestaurant
                .queue()
                .order_menu(FISH_MENU)
                .cook();
        // A burger with extra onions and cheese
        Burger bob_dinner = BigBurgerRestaurant
                .queue()
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();
        // Cholesterol Burger
        Burger charles_dinner = BigBurgerRestaurant
                .queue()
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}

##########

        *** Menu FiletO'Poisson ***
        - FISH (400g) -- 24,00€
        - BEARNAISE sauce (20g) -- 1,00€
        --------------------
        price:         25,00
        --------------------
        calories:      910
        calories/100g: 217
        --------------------

        *** Menu BigMarcel ***
        - BEEF (400g) -- 16,00€
        - BURGER sauce (20g) -- 1,00€
        - deep fried onions (20g) -- 0,30€
        - tomato, qty: 10 -- 0,05
        - deep fried onions (20g) -- 0,30€
        - cheddar (30g) -- 1,20€
        --------------------
        price:         18,85
        --------------------
        calories:      1206
        calories/100g: 241
        --------------------

        *** Menu Own style ***
        - BEEF (400g) -- 16,00€
        - deep fried onions (20g) -- 0,30€
        - cheddar (30g) -- 1,20€
        - BARBECUE sauce (20g) -- 1,00€
        - BEARNAISE sauce (20g) -- 1,00€
        - BURGER sauce (20g) -- 1,00€
        - cheddar (30g) -- 1,20€
        --------------------
        price:         21,70
        --------------------
        calories:      1342
        calories/100g: 249
        --------------------

 */