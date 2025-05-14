package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter number of products to be added to the stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter number of products to be removed from the stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
