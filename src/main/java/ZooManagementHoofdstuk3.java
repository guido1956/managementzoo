public class ZooManagementHoofdstuk3 {
    /**
     * ZooManagementHoofdstuk3
     * Demo voor werken met Strings - ints - doubles
     * Demo voor gebruiken van System.out.println - System.out.print - System.out.printf
     */
    public static void main(String[] args) {
        // Werken met Strings en printstatements
        System.out.println("Onze tijger heet Zigro");   //literal + newline
        System.out.print("Onze tijger heet ");          //literal zonder newline
        System.out.println("Zigro");                    //literal met newline
        System.out.printf("%s %s\n", "Onze tijger heet" , "Zigro");   //String met subsituut %s en argumenten

        //Werken met ints en printstatements
        System.out.print("Onze tijger is ");
        System.out.print(12);
        System.out.println(" jaar");
        System.out.print("Dat is ");
        System.out.print(12 * 12);
        System.out.println(" maanden");
        System.out.printf("Onze tijger is %d jaar oud\nDat is %d maanden", 12, 12*12);

        //Werken met doubles en printstatements
        System.out.println("Onze tijger is ");
        System.out.print(12.5);
        System.out.println(" jaar");
        System.out.print("Dat is ");
        System.out.print(12 * 12.5);
        System.out.println(" maanden");
        System.out.printf("Onze tijger is %.1f jaar oud\nDat is %.1f maanden", 12.5, 12*12.5);
    }
}
