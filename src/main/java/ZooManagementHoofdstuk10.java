public class ZooManagementHoofdstuk10 {
    public static void main(String[] args) {
        String tekst1 = "olifant";
        String tekst2 = tekst1;   //twee variabelen die naar hetzelfde object wijzen
        tekst1 = tekst1.toUpperCase();  // er zijn nu twee objecten en twee variabelen!
        System.out.println(tekst1);
        System.out.println(tekst2);
        String tekst3 = tekst1;
        tekst1 = "Giraf";  //Er zijn nu drie objecten en drie variabelen.
        System.out.println(tekst1);
        System.out.println(tekst2);
        System.out.println(tekst3);
    }
}
