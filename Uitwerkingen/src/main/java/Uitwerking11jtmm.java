public class Uitwerking11jtmm {
    public static void main(String[] args) {
        String papegaai1 = "Ara";
        String pagegaai2 = "Scheldmajoor";
        String pagegaai3 = "Echolalie";
        int leeftijd1 = 45;
        int leeftijd2 = 103;
        int leeftijd3 = 38;

        // Opgave j
        System.out.printf("De pagegaaien zijn samen %d jaar oud\n", leeftijd1 + leeftijd2 + leeftijd3);

        //Opgave l
        String naamOudste2;
        int leeftijdOudste;
        if (leeftijd1 > leeftijd2) {
            if (leeftijd1 > leeftijd3) {
                leeftijdOudste = leeftijd1;
            } else {
                leeftijdOudste = leeftijd3;
            }
        } else {
            if (leeftijd2 > leeftijd3) {
                leeftijdOudste = leeftijd2;
            } else {
                leeftijdOudste = leeftijd3;
            }
        }
        System.out.printf("De oudste papagaai is %d jaar oud\n", leeftijdOudste );

        }
    }

