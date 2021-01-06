public class ZooManagementHoofdstuk17c {
    public static void main(String[] args) {
        int[] aantalEierenLocatieA = {14 ,25,13};   // eieren gevonden in 3 hokken
        int[] aantalEierenLocatieB = {12,15,18,23,25}; //eieren gevonden in 5 hokkken

        double gemiddeldA = berekenGemiddelde(aantalEierenLocatieA);
        double gemiddeldB = berekenGemiddelde (aantalEierenLocatieB);

        System.out.printf("Op locatie A zijn gemiddeld %.2f eieren per hok geraapt\n" , gemiddeldA );
        System.out.printf("Op locatie B zijn gemiddeld %.2f eieren per hok geraapt\n" , gemiddeldB );
    }

    public static double berekenGemiddelde(int[] aantallen) {
        int omvang = aantallen.length;
        int totaal = 0;
        for (int i : aantallen) {
            totaal += i;
        }
        double gemiddelde = (double) totaal / (double) omvang;
        return gemiddelde;
    }
}
