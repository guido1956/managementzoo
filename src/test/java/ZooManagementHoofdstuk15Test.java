import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooManagementHoofdstuk15Test {
    @Test
    @DisplayName("Testen berekenen korting")
    void testBerekenKortingBedragbevatdrieCijfersAchterDeKomma() {
        double expectedResult = 2.457;
        double actualResult = ZooManagementHoofdstuk15.berekenKorting(24.57);
        assertEquals(expectedResult, actualResult, "Korting is niet juist berekend met met drie cijfers achter de komma");
    }
}



