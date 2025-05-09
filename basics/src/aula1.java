import java.util.Locale;

public class aula1 {

    public static void main(String[] args) {
        
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f \n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %f metros \n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha %.2f reais.\n", nome, idade, renda);

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100;
        double price2 = 650.5;
        double measure = 53.234567;

        System.out.printf("\nProducts:\n%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
        System.out.printf("\nMeasure with eight decimal places: %f", measure);
        System.out.printf("\nRounded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}