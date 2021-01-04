public class ZooManagementHoofdstuk9 {
    public static void main(String[] args) {
        String mijnEersteDier = "Sissel de slang";
        System.out.println(mijnEersteDier.replaceAll("de slang" , "the snake").toUpperCase());
        System.out.println(mijnEersteDier.toUpperCase().replaceAll("de slang" , "the snake"));
        System.out.println(mijnEersteDier.toUpperCase());

    }
}
