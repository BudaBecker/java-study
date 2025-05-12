import java.util.Scanner;

public class aula4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int soma = 0;
        while (i != 0) {
            soma += i;
            i = sc.nextInt();
        }
        System.err.println(soma);
        sc.close();
    }
}