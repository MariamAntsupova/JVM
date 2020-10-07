package Product_Menu.Menu;

import Product_Menu.Product;

public class Combo extends Product {
    private Product[] products = new Product[3];
    private int productAmount;

    public double getPriceCount(){
        double totalPrice = 0 ;
        double finalPrice = 0 ;
        for (int i = 0 ; i < productAmount; i++){
            totalPrice = totalPrice + products[i].getCost();
            finalPrice = totalPrice - totalPrice*0.1;
        }
        return finalPrice;
    }

    public Combo() {}

    @Override
    public double getCost() {
        return 0;
    }


}
