package Product_Menu.Menu;

import Product_Menu.Product;

public class Drink extends Product {
    private static final int Drink_Quantity = 2 ;
    private final double price = 1.2;

    public Drink() {}

    public Drink(String name ,int quantity,double price) {
        super(name,quantity,price);
    }

    @Override
    public int getCost() {
        return getQuantity() * Drink_Quantity  ;
    }

}