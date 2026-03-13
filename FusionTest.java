import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FusionTest {

    @Test
    public void testFusionGauche_uneFusion_scoreOK() {
        int[][] grille = {
                {2, 2, 0, 0},
                {0, 0, 0, 0},
                {4, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int score = Fusion.fusionGauche(grille);

        // Score
        assertEquals(4, score);

        // Ligne 0 attendue : 4 0 0 0
        assertEquals(4, grille[0][0]);
        assertEquals(0, grille[0][1]);
        assertEquals(0, grille[0][2]);
        assertEquals(0, grille[0][3]);

        // Ligne 2 inchangée : 4 0 0 0
        assertEquals(4, grille[2][0]);
        assertEquals(0, grille[2][1]);
        assertEquals(0, grille[2][2]);
        assertEquals(0, grille[2][3]);
    }

    @Test
    public void testFusionGauche_pasDeDoubleFusion() {
        // 2 2 2 0 -> fusion seule => 4 0 2 0, score = 4
        int[][] grille = {
                {2, 2, 2, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int score = Fusion.fusionGauche(grille);

        assertEquals(4, score);

        // Ligne 0 attendue : 4 0 2 0
        assertEquals(4, grille[0][0]);
        assertEquals(0, grille[0][1]);
        assertEquals(2, grille[0][2]);
        assertEquals(0, grille[0][3]);
    }

    @Test
    public void testFusionGauche_deuxFusionsDansLaMemeLigne() {
        // 2 2 2 2 -> fusion seule => 4 0 4 0, score = 8
        int[][] grille = {
                {2, 2, 2, 2},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int score = Fusion.fusionGauche(grille);

        assertEquals(8, score);

        // Ligne 0 attendue : 4 0 4 0
        assertEquals(4, grille[0][0]);
        assertEquals(0, grille[0][1]);
        assertEquals(4, grille[0][2]);
        assertEquals(0, grille[0][3]);
    }
}
