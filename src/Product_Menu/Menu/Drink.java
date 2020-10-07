package Product_Menu.Menu;

import Product_Menu.Product;

public class Drink extends Product {
    private static final int Drink_Quantity = 2 ;
    private final double price = 1.2;
    double drinkFinalPrice = getQuantity() * Drink_Quantity  * getPrice() ;

    public Drink() {}

    public Drink(String name ,int quantity,double price) {
        super(name,quantity,price);
    }

    @Override
    public double getCost() {
        return drinkFinalPrice ;
    }

}