import java.util.Locale;
import java.util.Scanner;

public class aula9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vetor = new double[N];
        double avg_height = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
            avg_height += vetor[i]/N;
        }
        System.out.println("AVERAGE HEIGHT = " + String.format("%.2f", avg_height));

        sc.close();
    }
}