import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.nextLine();
        System.err.println(x);

        char y;
        y = sc.next().charAt(0);
        System.out.println(y);

        sc.close();

        System.out.println(Math.sqrt(2));
    }
}
