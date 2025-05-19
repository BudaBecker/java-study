package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"line 1", "line 2", "line 3"};
        String path = "files-read\\src\\models\\entities\\text.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String string : lines) {
                bw.write(string);
                bw.newLine();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
