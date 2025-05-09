import java.util.Scanner;

public class aula3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia;
        dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.err.println("domingo");
                break;
            case 2:
                System.err.println("segunda");
                break;
            case 3:
                System.err.println("terca");
                break;
            case 4:
                System.err.println("querta");
                break;
            case 5:
                System.err.println("quinta");
                break;
            case 6:
                System.err.println("sexta");
                break;
            case 7:
                System.err.println("sabado");
                break;

            default:
            System.err.println("Dia invalido");
                break;
        }
        
        sc.close();
    }
}