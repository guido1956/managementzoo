public class ZooManagementHoofdstuk5 {
    public static void main(String[] args) {
        System.out.println("Deze tekst komt op " + "een regel");
        System.out.println(3 + 4);  // uitkomst 7
        System.out.println("Drie + vier = " + 3 + 4 ); //concatenatie: 34
        System.out.println("" + 3 + 4 );  //concatenatie 34
        System.out.println("" + (3 + 4)); // eerst haakjes weg dus eerst optellen
        System.out.println(("dit is een test") + (3 + 4));  // eerst haakjes weg dus -toch- optellen
    }
}
