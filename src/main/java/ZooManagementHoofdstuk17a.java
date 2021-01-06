import java.util.Scanner;

public class ZooManagementHoofdstuk17a {
    public static void main(String[] args) {
        Dierenbeheer();
    }

    public static void Dierenbeheer() {

        // opvoeren dierennamen
        String dier001 = voerDierOp();
        String dier002 = voerDierOp();
        String dier003 = voerDierOp();
        String dier004 = voerDierOp();
        String dier005 = voerDierOp();
        String dier006 = voerDierOp();
        String dier007 = voerDierOp();

        //afdrukken dierennamen
        System.out.println(dier001);
        System.out.println(dier002);
        System.out.println(dier003);
        System.out.println(dier004);
        System.out.println(dier005);
        System.out.println(dier006);

    }

    public static String voerDierOp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de naam van het dier in");
        return scanner.nextLine();
    }
}


