import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class programaTest{

    // -----------------------
    // ZENBAKIAREN TESTAK
    // -----------------------

    @Test
    public void testZenbTooSmall() {
        assertEquals("ER1", Programa.balidatuZenbakia(50));
    }

    @Test
    public void testZenbTooLarge() {
        assertEquals("ER1", Programa.balidatuZenbakia(1500));
    }

    @Test
    public void testZenbCorrect() {
        assertEquals("OK", Programa.balidatuZenbakia(123));
    }


    // -----------------------
    // SAILAREN TESTAK
    // -----------------------

    @Test
    public void testSailaTooSmall() {
        assertEquals("ER2", Programa.balidatuSaila(5));
    }

    @Test
    public void testSailaTooLarge() {
        assertEquals("ER2", Programa.balidatuSaila(150));
    }

    @Test
    public void testSailaCorrect() {
        assertEquals("OK", Programa.balidatuSaila(20));
    }


    // -----------------------
    // LANAREN TESTAK
    // -----------------------

    @Test
    public void testLanaProgramatzailea() {
        assertEquals("2000", Programa.balidatuLana("programatzailea"));
    }

    @Test
    public void testLanaAnalista() {
        assertEquals("2500", Programa.balidatuLana("analista"));
    }

    @Test
    public void testLanaDiseinatzailea() {
        assertEquals("1500", Programa.balidatuLana("diseinatzailea"));
    }

    @Test
    public void testLanaOkerra() {
        assertEquals("ER3", Programa.balidatuLana("mekanikaria"));
    }

    @Test
    public void testLanaHutsa() {
        assertEquals("ER3", Programa.balidatuLana(""));
    }

    @Test
    public void testLanaMayuskulaz() {
        assertEquals("ER3", Programa.balidatuLana("Programatzailea"));
    }
}
