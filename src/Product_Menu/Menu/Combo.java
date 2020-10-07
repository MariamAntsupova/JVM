package Product_Menu.Menu;

import Product_Menu.Product;

public class Combo extends Product {
    private Product[] products = new Product[3];
    private int productAmount;

    public Combo() {}
    public Combo(String name ,int quantity) {
        super(name,quantity);
    }
    @Override
    public int getCost() {
        return 0 ;
    }
    public void addProduct(Product product) {
        products[productAmount] = product;
        productAmount++;
    }
}
