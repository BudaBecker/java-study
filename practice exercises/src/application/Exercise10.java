package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> students = new HashSet<>();

        System.out.print("How many students for course 1? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID for course 1: ");
            students.add(sc.nextInt());
        }

        System.out.print("\nHow many students for course 2? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID for course 2: ");
            students.add(sc.nextInt());
        }

        System.out.print("\nHow many students for course 3? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID for course 3: ");
            students.add(sc.nextInt());
        }

        System.out.println("\nTotal students: " + students.size());

        sc.close();
    }
}
