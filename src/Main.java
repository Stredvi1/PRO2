import models.PizzaMenu;
import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int num = 10;
        int num2 = 15;

        int num3 = num + num2;
        if(num == num2) {

        }
        else if (num > num2) {
        }

        PizzaMenuItem pizzaItem1 = new PizzaMenuItem("Hawai", 220);
        PizzaMenuItem pizzaItem2 = new PizzaMenuItem("Hawai", 220);

        if (pizzaItem1 == pizzaItem2) {
            System.out.println("piza match");
        }

        int[] intArr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[][] intArr2 = new int[][]{
                {1, 1},
                {1, 2},
                {2, 1},
                {2, 2}
        };

        List<PizzaMenuItem> pizzaList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            pizzaList.add(new PizzaMenuItem("Pizza " +i, 150 + (i*10)));
        }
        System.out.println(pizzaList.get(5));

        for (int i = 0; i < pizzaList.size(); i++) {
            System.out.println(pizzaList.get(i));
        }

        PizzaMenu menu1 = new PizzaMenu(); //Zapouzdření objektu v objektu - více možností nastavování
        menu1.addItem(new PizzaMenuItem("Hawai", 200));
        menu1.addItem(new PizzaMenuItem("Polo", 220));

        for (PizzaMenuItem pizza :
        menu1.getMenuItems()) {
            System.out.println(pizza);
        }

        PizzaMenu menu2 = new PizzaMenu(); //Zapouzdření objektu v objektu - více možností nastavování
        menu1.addItem(new PizzaMenuItem("Hawai", 200));
        menu1.addItem(new PizzaMenuItem("Polo", 220));

        if (menu1.equals(menu2)) {
            System.out.println("menu match");
        }

    }
}