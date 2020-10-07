package Product_Menu;

public abstract class Product {
    private String name;

    private int quantity;

    private double price;

    public Product() {
    }

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price ;
    }
    public void setPrice() {
        this.price = price ;
    }
    public void increasequantity() {
        this.quantity++;
    }

    public abstract double getCost();
}
