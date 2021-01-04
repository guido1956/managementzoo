import java.util.Scanner;

public class ZooManagementHoofdstuk13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welk dier zie je het liefst in een dierentuin?");
        String lievelingsdier = scanner.nextLine();
        System.out.println("Mij lievelingsdier is: " + lievelingsdier);
        System.out.println("Hoe vaak heb je dat dier al gezien?");
        int aantalKeerGezien = scanner.nextInt();
        System.out.println("Ik heb een " + lievelingsdier + " al " + aantalKeerGezien + " keer gezien.");
    }
}
