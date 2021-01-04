import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DemoTest {
    @Test
    @DisplayName("demotest die test of 1 gelijk is aan 1 :-)")
    void testEenIsEen() {
        assertEquals( 1, 1, "1 wordt niet gezien als een");
    }

    @Test
    @DisplayName("Aantonen dat toUpperCase correct werkt")
    void testToUpperCase() {
        String test = "diTisEenStringvoortesten toUpperCASE1#$%^";
        String expectedResult = "DITISEENSTRINGVOORTESTEN TOUPPERCASE1#$%^";
        String actualResult = test.toUpperCase();
        assertEquals(expectedResult, actualResult, "toUpperCase werkt niet goed");
    }
}

