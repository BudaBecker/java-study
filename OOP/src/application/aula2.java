package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        System.out.print("Enter number of poducts to be added to the stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("Updated data: " + product);
        System.out.print("Enter number of poducts to be removed from the stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
