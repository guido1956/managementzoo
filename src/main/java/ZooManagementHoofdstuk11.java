public class ZooManagementHoofdstuk11 {
    public static void main(String[] args) {
        // demo if
        if (23 % 2 == 1 ) {
            System.out.println("23 is een oneven getal");
        }
        // demo's if..else
        boolean statuszijnGevoederd = true;
        if (statuszijnGevoederd) {
            System.out.println("De dieren zijn gevoederd");
        } else {
            System.out.println("De dieren zijn niet gevoederd");
        }
        statuszijnGevoederd = false;
        if (statuszijnGevoederd) {
            System.out.println("De dieren zijn gevoederd");
        } else {
            System.out.println("De dieren zijn niet gevoederd");
        }
    }
}
