package application;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffReader {
    public static void main(String[] args) {
        
        String path = "files-read\\src\\models\\entities\\text.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
