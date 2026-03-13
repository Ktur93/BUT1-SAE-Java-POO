import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControlesTest {

    @Test
    public void testDeplacerGauche_simple() {
        int[][] grille = {
                {0, 2, 0, 4},
                {0, 0, 0, 0},
                {2, 0, 2, 0},
                {4, 4, 0, 0}
        };

        Controles.deplacerGauche(grille);

        // Ligne 0 attendue : 2 4 0 0
        assertEquals(2, grille[0][0]);
        assertEquals(4, grille[0][1]);
        assertEquals(0, grille[0][2]);
        assertEquals(0, grille[0][3]);

        // Ligne 1 attendue : 0 0 0 0
        assertEquals(0, grille[1][0]);
        assertEquals(0, grille[1][1]);
        assertEquals(0, grille[1][2]);
        assertEquals(0, grille[1][3]);

        // Ligne 2 attendue : 2 2 0 0
        assertEquals(2, grille[2][0]);
        assertEquals(2, grille[2][1]);
        assertEquals(0, grille[2][2]);
        assertEquals(0, grille[2][3]);

        // Ligne 3 attendue : 4 4 0 0
        assertEquals(4, grille[3][0]);
        assertEquals(4, grille[3][1]);
        assertEquals(0, grille[3][2]);
        assertEquals(0, grille[3][3]);
    }

    @Test
    public void testDeplacerDroit_simple() {
        int[][] grille = {
                {0, 2, 0, 4},
                {2, 0, 2, 0},
                {0, 0, 0, 0},
                {4, 4, 0, 0}
        };

        Controles.deplacerDroit(grille);

        // Ligne 0 attendue : 0 0 2 4
        assertEquals(0, grille[0][0]);
        assertEquals(0, grille[0][1]);
        assertEquals(2, grille[0][2]);
        assertEquals(4, grille[0][3]);

        // Ligne 1 attendue : 0 0 2 2
        assertEquals(0, grille[1][0]);
        assertEquals(0, grille[1][1]);
        assertEquals(2, grille[1][2]);
        assertEquals(2, grille[1][3]);

        // Ligne 2 attendue : 0 0 0 0
        assertEquals(0, grille[2][0]);
        assertEquals(0, grille[2][1]);
        assertEquals(0, grille[2][2]);
        assertEquals(0, grille[2][3]);

        // Ligne 3 attendue : 0 0 4 4
        assertEquals(0, grille[3][0]);
        assertEquals(0, grille[3][1]);
        assertEquals(4, grille[3][2]);
        assertEquals(4, grille[3][3]);
    }
}
