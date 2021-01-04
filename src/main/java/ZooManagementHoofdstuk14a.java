import java.util.Scanner;

public class ZooManagementHoofdstuk14a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de naam van de locatie?");
        String naamLocatie = scanner.nextLine();
        System.out.println("Hoeveel dieren kunnen er in het nachthok?");
        int aantalInNachthok = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Op welke dag worden de nachthokken schoongemaakt?");
        String dagSchoonmaak = scanner.nextLine();
        System.out.println(naamLocatie + " " + aantalInNachthok + " " + dagSchoonmaak);
    }
}
