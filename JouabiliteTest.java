import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JouabiliteTest {

    @Test
    public void testAtteintMax_true() {
        int[][] grille = {
                {0, 0, 0, 0},
                {0, 2048, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertTrue(Jouabilite.atteintMax(grille));
    }

    @Test
    public void testPeutEncoreJouer_true_siZeroPresent() {
        int[][] grille = {
                {2, 4, 8, 16},
                {32, 64, 128, 256},
                {512, 1024, 2, 4},
                {8, 16, 32, 0}
        };

        assertTrue(Jouabilite.peutEncoreJouer(grille));
    }

    @Test
    public void testPeutEncoreJouer_true_siFusionPossible() {
        int[][] grille = {
                {2, 4, 8, 16},
                {32, 64, 128, 256},
                {512, 1024, 4, 4},   // fusion possible ici
                {8, 16, 32, 64}
        };

        assertTrue(Jouabilite.peutEncoreJouer(grille));
    }

    @Test
    public void testPeutEncoreJouer_false_siBloque() {
        int[][] grille = {
                {2, 4, 8, 16},
                {32, 64, 128, 256},
                {512, 1024, 2, 4},
                {8, 16, 32, 64}
        };

        assertFalse(Jouabilite.peutEncoreJouer(grille));
    }

    @Test
    public void testGrilleChange_true_siDifferent() {
        int[][] avant = {
                {0, 2, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] apres = {
                {2, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertTrue(Jouabilite.grilleChange(avant, apres));
    }

    @Test
    public void testGrilleChange_false_siIdentique() {
        int[][] avant = {
                {2, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] apres = {
                {2, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertFalse(Jouabilite.grilleChange(avant, apres));
    }

    @Test
    public void testGrilleChange_false_siDeplacementImpossible() {
        int[][] avant = {
                {2, 4, 8, 16},
                {32, 64, 128, 256},
                {512, 1024, 2, 4},
                {8, 16, 32, 64}
        };

        int[][] apres = {
                {2, 4, 8, 16},
                {32, 64, 128, 256},
                {512, 1024, 2, 4},
                {8, 16, 32, 64}
        };

        assertFalse(Jouabilite.grilleChange(avant, apres));
    }

}
