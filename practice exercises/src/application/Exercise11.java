package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Exercise11 {
    public static void main(String[] args) {
        
        Map<String, Integer> votes = new HashMap<>();
        String path = "src\\txt\\exercise11.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                if (votes.containsKey(fields[0])) {
                    votes.put(fields[0], votes.get(fields[0]) + Integer.parseInt(fields[1]));
                    
                } else {
                    votes.put(fields[0], Integer.parseInt(fields[1]));
                }

                line = br.readLine();
            }

            System.out.println("Vote counts:");
            for (Map.Entry<String, Integer> entry : votes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
