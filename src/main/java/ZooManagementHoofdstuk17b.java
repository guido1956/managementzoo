import java.util.Scanner;

public class ZooManagementHoofdstuk17b {
    public static void main(String[] args) {
        Dierenbeheer();
    }

    public static void Dierenbeheer() {

       String[] dieren = new String[7];
       for (int teller = 0 ; teller < 7 ; teller++) {
           dieren[teller] = voerDierOp();
       }

       for (String dier : dieren) {
           System.out.println(dier);
       }
    }


    public static String voerDierOp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de naam van het dier in");
        return scanner.nextLine();
    }
}


