package model.services;

public class BrazilTaxService implements TaxService{
    
    public double tax(double amout) {
        if (amout <= 100.0) {
            return amout*0.2;
        }
        else {
            return amout*0.15;
        }
    }

}
