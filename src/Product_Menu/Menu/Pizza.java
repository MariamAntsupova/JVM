package Product_Menu.Menu;

import Product_Menu.Product;

public class Pizza extends Product {
    private static final int Pizza_Quantity = 4;
    private double price = 6;

    public Pizza() {}

    public Pizza(String name ,int quantity,double price) {
        super(name, quantity, price);
    }

    @Override
    public int getCost() {
        return getQuantity() * Pizza_Quantity ;
    }

}