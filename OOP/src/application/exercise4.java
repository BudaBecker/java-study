package application;

import java.util.Locale;
import java.util.Scanner;

import util.Dolar;

public class exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in R$: %.2f", Dolar.convert(price, amount));

        sc.close();
    }
}
