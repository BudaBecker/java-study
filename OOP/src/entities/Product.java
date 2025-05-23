package entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

    // Constructors
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business Methods
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough stock to remove that many products.");
        }
    }

    @Override
    public String toString(){
        return name
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $"
            + String.format("%.2f", totalValueInStock());
    }
}
