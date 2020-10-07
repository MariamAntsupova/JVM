package Product_Menu.Menu;

import Product_Menu.Product;

public class Burger extends Product {
    private static final int Burger_Quantity = 6;
    final double price = 5;
    double burgerFinalPrice = getQuantity() * Burger_Quantity * getPrice();

    public Burger() {}

    public Burger(String name ,int quantity,double price) {

        super(name, quantity, price);
    }
    @Override
    public double getCost() {
        return burgerFinalPrice;
    }

}
