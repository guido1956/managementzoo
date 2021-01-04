public class ZooManagementHoofdstuk11b {
    public static void main(String[] args) {
        //demo == en equals
        String mijnTekst1 = "Dit is mijn tekst";  // new object wordt in speciaal geheugen opgeslagen
        String mijnTekst2 = "Dit is mijn tekst"; //Java optimaliseert en laat mijnTekst2 naar hetzelfde
                                                 // object als mijnTeks1 wijzen.
        if (mijnTekst1 == mijnTekst2) {
            System.out.println("Gebruik == nooit voor vergelijken waarden van twee Strings!");
            System.out.println("In dit speciale geval wijzen de twee variabelen naar hetzelfde object");
            System.out.println("Omdat ze zonder keyword new zijn geinitialiseerd");
            System.out.println("==============");
        }

        String mijnTekst3 = new String("Dit is mijn tekst");
        String mijnTekst4 = new String("Dit is mijn tekst");

        if (mijnTekst3 == mijnTekst4) {
            // Objecten zijn niet gelijk aan elkaar dus deze tak wordt nooit uitgevoerd
        } else {

            System.out.println("De waarden van de twee objecten zijn wel hetzelfde, maar ");
            System.out.println("De objecten zijn niet hetzelfde. Vandaar dat het programma ");
            System.out.println("Deze else-tak uitvoert");
            System.out.println("==============");
        }

        if (mijnTekst3.equals(mijnTekst4)) {
            System.out.println("De waarden van deze twee objecten zijn hetzelfde");
        }
    }
}
