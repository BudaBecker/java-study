import java.util.Locale;
import java.util.Scanner;

public class aula6 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char end;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0*C/5.0 + 32.0;
            System.out.printf("Equivalante a Fahrenheit: %.2f\n", F);
            System.out.print("Deseja continuar? (s/n) ");
            end = sc.next().charAt(0);
        } while (end != 'n');
        
        sc.close();
    }
}
