public class ZooManagementHoofdstuk4 {
     public static void main(String[] args) {
        // Werken met Strings en printstatements
        System.out.println("Onze tijger heet Zigro");   //literal + newline
        System.out.print("Onze tijger heet ");          //literal zonder newline
        System.out.println("Zigro");                    //literal met newline
        System.out.printf("%s %s\n", "Onze tijger heet" , "Zigro");   //String met subsituut %s en argumenten
        //Werken met ints en printstatements
        System.out.print("Onze tijger is ");
        System.out.print(12);
        System.out.println(" jaar oud");
        System.out.print("Dat is ");
        System.out.print(12 * 12);
        System.out.println(" maanden");
        System.out.printf("Onze tijger is %d jaar oud\nDat is %d maanden\n", 12, 12*12);
        //Werken met doubles en printstatements
        System.out.print("Onze tijger is ");
        System.out.print(12.5);
        System.out.println(" jaar");
        System.out.print("Dat is ");
        System.out.print(12 * 12.5);
        System.out.println(" maanden");
        System.out.printf("Onze tijger is %.1f jaar oud\nDat is %.1f maanden\n", 12.5, 12*12.5);
    }
}
