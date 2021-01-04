import java.util.Scanner;

public class ZooManagementHoofdstuk15 {

    public static void main(String[] args) {
        kopenGroepskaart();
    }

    public static void kopenGroepskaart() {
        int aantalVolwassenen = bepaalAantal("volwassenen");
        int aantalKinderen = bepaalAantal("kinderen");

        double prijsZonderKortingVolwassenen = berekenPrijsZonderKorting("volwassenen" , aantalVolwassenen);
        double prijsZonderKortingKinderen = berekenPrijsZonderKorting("kinderen" , aantalKinderen);
        double prijsTotaalZonderKorting= berekenTotaalprijsZonderKorting(prijsZonderKortingVolwassenen, prijsZonderKortingKinderen);

        boolean krijgtKorting = rechtOpKorting(aantalVolwassenen, aantalKinderen);
        double korting = 0.00;
        double eindprijs = prijsTotaalZonderKorting;
        if (krijgtKorting) {
            korting = berekenKorting(prijsTotaalZonderKorting);
            eindprijs = berekenEindprijs(prijsTotaalZonderKorting, korting);
        }
        drukKaartje(aantalVolwassenen,aantalKinderen, prijsZonderKortingVolwassenen, prijsZonderKortingKinderen,
                prijsTotaalZonderKorting, korting, eindprijs);
    }

    public static int bepaalAantal(String soort) {
        if (soort.equals("volwassenen")) {
            System.out.println("Uit hoeveel volwassenen bestaat de groep?");
        }
        if (soort.equals("kinderen")) {
            System.out.println("Uit hoeveel kinderen bestaat de groep?");
        }
        Scanner scanner = new Scanner((System.in));
        return scanner.nextInt();
    }

    public static double berekenPrijsZonderKorting(String soort, int aantal) {
        double prijs = 0.0;
        if (soort.equals("volwassenen")) {
            prijs = 12.50;
        }
        if (soort.equals("kinderen")) {
            prijs = 8.0;
        }
       return aantal * prijs;
    }

    public static double berekenTotaalprijsZonderKorting(double prijsVolwassenen, double prijsKinderen) {
        return prijsVolwassenen + prijsKinderen;
    }

    public static boolean rechtOpKorting(int aantalVolwassenen, int aantalKinderen) {
        if (aantalVolwassenen < 2) {
            return false;
        }
        if (aantalKinderen < 2)  {
            return false;
        }
        return true;
    }

    public static double berekenKorting(double prijs) {
        return prijs / 10;
    }

    public static double berekenEindprijs(double prijs, double korting) {
        return prijs - korting;
    }

    public static void drukKaartje(int aantalVolwassenen,int aantalKinderen, double prijsZonderKortingVolwassenen,
                                   double prijsZonderKortingKinderen, double prijsTotaalZonderKorting,
                                   double korting, double eindprijs) {

        System.out.printf("Aantal volwassenen: %3d prijs pp 12,50 totaal %8.2f\n" , aantalVolwassenen,
                prijsZonderKortingVolwassenen);
        System.out.printf("Aantal kinderen:    %3d prijs pp  8,00 totaal %8.2f\n" , aantalKinderen,
                prijsZonderKortingKinderen);
        if (korting > 0.00) {
            System.out.printf("prijs:  %8.2f\n", prijsTotaalZonderKorting);
            System.out.printf("korting 10 procent : %8.2f\n" , korting);


        }
        System.out.printf("Te betalen:  %.2f\n", eindprijs);
    }
}
