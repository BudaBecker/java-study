package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Product;

public class Exercise9 {
    public static void main(String[] args) {
        
        Set<Product> set = new TreeSet<>(); //compare using Comparable interface

        set.add(new Product("TV", 900.00));
        set.add(new Product("Notebook", 1200.00));
        set.add(new Product("Tablet", 450.00));
        set.add(new Product("Smartphone", 800.00));
        set.add(new Product("Smartwatch", 300.00));
        set.add(new Product("Headphones", 150.00));
        set.add(new Product("Monitor", 600.00));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
