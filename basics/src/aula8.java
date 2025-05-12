
public class aula8 {

    public static void main(String[] args) {
        int higher = max(11, 12, 13);
        System.out.println(higher);
    }
    
    public static int max(int x, int y, int z) {
        int vet[] = {x, y, z};
        int high = 0;
        for (int num : vet){
            if (num > high){
                high = num;
            }
        }
        return high;
    }
}
