import java.util.ArrayList;
import java.util.List;

public class aula10 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Marco");
        list.add("Bob");

        list.add(1, "Joanio");
        System.out.println(list.size());

        list.removeIf(x -> x.charAt(0) == 'M');

        for (String string : list) {
            System.out.println(string);
        }
    }
}
