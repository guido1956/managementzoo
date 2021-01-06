import java.util.ArrayList;
import java.util.Scanner;

public class ZooManagementHoofdstuk18 {
    public static void main(String[] args) {

        ArrayList<String> dieren = new ArrayList<>();
        beheerDieren(dieren);
    }

    public static ArrayList<String> voerDierenIn(ArrayList<String> namen) {
        boolean doorgaan = true;
        do {
            String dier = voerDierIn();
            if (!dier.equals("stop")) {
                namen.add(dier);
            } else {
                doorgaan = false;
            }
        } while (doorgaan);
        return namen;
    }

    public static void beheerDieren(ArrayList<String> dieren) {
        int keuze = 0;
        do {
             keuze = toonMenu();
             if (keuze == 1) {
                 drukOverzicht(dieren);
             }
             if (keuze == 2) {
                 dieren = voerDierenIn(dieren);
             }





        } while (keuze != 9);


    }

    public static void drukOverzicht(ArrayList<String> dieren) {
        for (String dier : dieren) {
            System.out.println(dier);
        }



    }

    public static String voerDierIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer een dierennaam in, of stop om invoer te beeindigen");
        return scanner.nextLine();
    }

    public static int toonMenu() {
        System.out.println("1 = druk overzicht");
        System.out.println("2 = voer dieren in");
        System.out.println("3 = verwijder dier");
        System.out.println("4 = wijzig dier");
        System.out.println("9 = stoppen");
        System.out.println("Maak een keuze");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }
}
