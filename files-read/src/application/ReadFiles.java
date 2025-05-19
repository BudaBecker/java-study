package application;

import java.io.File;
import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args) {
        
        File file = new File("files-read\\src\\models\\entities\\text.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}