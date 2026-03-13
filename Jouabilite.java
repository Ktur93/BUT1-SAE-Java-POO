public class Jouabilite {

    public static boolean atteintMax(int[][] jeu2048) {
        boolean reponse = false;

        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
                if (jeu2048[ligne][colonne] == Jeu.OBJECTIF) {
                    reponse = true;
                }
            }
        }
        return reponse;
    }

    public static boolean grilleChange (int[][] jeu2048avant, int[][] jeu2048apres) {
        boolean reponse = false;

        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
                if (jeu2048avant[ligne][colonne] != jeu2048apres[ligne][colonne]) {
                    reponse = true;
                }
            }
        }
        return reponse;
    }

    public static boolean yaUnZeroOuPas (int[][]jeu2048) {
        boolean reponse = false;

        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
                if (jeu2048[ligne][colonne] == 0) {
                    reponse = true;
                }
            }
        }
        return reponse;
    }

    public static boolean peutEncoreJouer (int[][] jeu2048) {
        boolean reponseZero = false;
        boolean reponseVoisinHorizontale = false;
        boolean reponseVoisinVerticale = false;
        boolean reponse = false;

        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
                if (jeu2048[ligne][colonne] == 0) {
                    reponseZero = true;
                }
            }
        }

        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE - 1; colonne++) {
                int valeur = jeu2048[ligne][colonne];
                if (valeur == jeu2048[ligne][colonne + 1] && valeur != 0) {
                    reponseVoisinHorizontale = true;
                }
            }
        }

        for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
            for (int ligne = 0; ligne < Jeu.TAILLE - 1; ligne++) {
                int valeur = jeu2048[ligne][colonne];
                if (valeur == jeu2048[ligne + 1][colonne] && valeur != 0) {
                    reponseVoisinVerticale = true;
                }
            }
        }

        if (reponseZero || reponseVoisinHorizontale || reponseVoisinVerticale) {
            reponse = true;
        }

        return reponse;

    }

}
