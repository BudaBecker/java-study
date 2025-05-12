public class aula7 {
    public static void main(String[] args) {
        
        String str = "abcde FGHIJ ABC abc DEFG   ";
        
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replaceAll(" ", "-"));
        System.out.println(str.length());
        System.out.println(str.trim() + "-");
        System.out.println(str.substring(2, 7));
        System.out.println(str.split(" ")[2]);
    }
}
