package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Exercise5 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data:");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Rent day (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService =  new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("\nINVOICE:");
        System.out.printf("Basic payment: %.2f\n", cr.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f\n", cr.getInvoice().getTax());
        System.out.printf("Total payment: %.2f\n", cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
