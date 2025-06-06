package model.entities;

public class Product implements Comparable<Product> {

    protected String name;
    protected Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        return name
                + " $"
                + String.format("%.2f", price);
    }

    @Override
    public String toString() {
        return name
                + ", "
                + String.format("%.2f", price);
    }

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }
}
