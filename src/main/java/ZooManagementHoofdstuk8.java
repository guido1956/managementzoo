public class ZooManagementHoofdstuk8 {
    public static void main(String[] args) {
        String naamZoo = "Dierentuin de Vrijheid";
        System.out.println(naamZoo);
        System.out.println(naamZoo.toUpperCase());
        System.out.println(naamZoo.toLowerCase());
        System.out.println(naamZoo.length());
        System.out.println(naamZoo.charAt(3));
        System.out.println(naamZoo.substring(14));
        System.out.println(naamZoo.substring(14,18));
        System.out.println(naamZoo.replaceAll("Dierentuin", "Zoo"));

    }
}
