package util;

public class Dolar {
    
    private static double IOF = 6;
    
    public static double convert(double price, double amount) {
        return price*amount*(1 + IOF/100);
    }
}
