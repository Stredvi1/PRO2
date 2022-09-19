package models;

public class PizzaMenuItem {

    private String name;
    private int price;

    public PizzaMenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return name + " - " + price + " kč";
    }
    @Override
    public boolean equals(Object obj) {
        PizzaMenuItem pizzaToCompare = (PizzaMenuItem) obj;
        if(price != pizzaToCompare.getPrice()) {
            return false;
        }
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
