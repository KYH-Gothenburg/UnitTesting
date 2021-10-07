import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestMax {
    @Test
    public void testFindMaxPositive() {
        // Anropar vår metod findMax i Main och skickar in en array
        // med integers. findMax skall returnera det största värdet i arrayen
        int maxValue = Main.findMax(new int[]{3, 5, 7, 1, 4, 2, 9, 6});
        // Kollar om det största värdet är 9
        assertEquals(9, maxValue);
    }

    @Test
    public void testFindMaxNegative() {
        // Gör samma test som ovan fast med negativa tal
        int maxValue = Main.findMax(new int[]{-4, -7, -14, -1, -6});
        // Kollar om det största värdet är -1
        assertEquals(-1, maxValue);
    }

    @Test
    public void testFindMaxPositiveAndNegative() {
        // Nu blandar vi talen från testen ovan
        int maxValue = Main.findMax(new int[]{-4, 7, -14, -1, 6});
        // Kollar om det största värdet är 7
        assertEquals(7, maxValue);
    }

    @Test
    public void testFindMaxOneValue() {
        // Nu testar vi en array med endast ett värdet i
        int maxValue = Main.findMax(new int[]{3});
        // Kollar om det största värdet är 3
        assertEquals(3, maxValue);
    }

    @Test
    public void testFindMaxZeroValue() {
        // Om vi skickar in en tom array, då vill vi att vår metod skall kasta
        // en IndexOutOfBounds exception.
        // För att assertThrows skall kunna kontrollera att rätt exception
        // kastas, så måste anropet till vår metod ligga i en lambda, alltså en namnlös funktion
        // Den funktionen kommer att anropas av assertThrows, och den har då kontroll över vilka
        // exceptions som kastas
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Main.findMax(new int[]{});
        });
    }

    @Test
    public void testFindMaxOnlyZero() {
        // Nu testar vi en array med endast ett värdet i
        int maxValue = Main.findMax(new int[]{0, 0, 0});
        // Kollar om det största värdet är 0
        assertEquals(0, maxValue);
    }
}
