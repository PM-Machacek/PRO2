package cz.uhk.machafi1.pro2;

import cz.uhk.machafi1.pro2.modules.PizzaMenu;
import cz.uhk.machafi1.pro2.modules.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        PizzaMenu menu = new PizzaMenu();
        menu.addItem(new PizzaMenuItem("Šunková", "rajčatový základ, mozzarella, šunka, eidam", 100));
        menu.addItem(new PizzaMenuItem("Marherita", "desc", 200));

        for (PizzaMenuItem pizzaMenuItem : menu.getItems()){
            System.out.println(pizzaMenuItem.toString());
        }

        System.out.println("Last update " + menu.getLastUpdate());


    }
}
