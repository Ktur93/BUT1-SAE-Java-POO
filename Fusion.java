public class Fusion {

    public static int fusionGauche(int[][] jeu2048) {
        int scoreAjoute = 0;
        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE - 1; colonne++) {

                int valeur = jeu2048[ligne][colonne];

                if (valeur != 0 && valeur == jeu2048[ligne][colonne + 1]) {
                    int nouvelleValeur = valeur * 2;
                    jeu2048[ligne][colonne] = valeur * 2;
                    jeu2048[ligne][colonne + 1] = 0;
                    colonne++;
                    scoreAjoute += nouvelleValeur;
                }
            }
        }
        return scoreAjoute;
    }


    public static int fusionDroit (int[][] jeu2048) {

        int scoreAjoute = 0;

        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = Jeu.TAILLE - 1; colonne > 0; colonne--) {

                int valeur = jeu2048[ligne][colonne];

                if (valeur != 0 && valeur == jeu2048[ligne][colonne - 1]) {
                    int nouvelleValeur = valeur * 2;

                    jeu2048[ligne][colonne] = valeur * 2;
                    jeu2048[ligne][colonne - 1] = 0;
                    colonne--;
                    scoreAjoute += nouvelleValeur;
                }
            }
        }
        return scoreAjoute;
    }

    public static int fusionHaut (int[][] jeu2048) {

        int scoreAjoute = 0;

        for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
            for (int ligne = 0; ligne < Jeu.TAILLE - 1; ligne++) {

                int valeur = jeu2048[ligne][colonne];

                if (valeur != 0 && jeu2048[ligne][colonne] == jeu2048[ligne + 1][colonne]) {
                    int nouvelleValeur = valeur * 2;
                    jeu2048[ligne][colonne] *= 2;
                    jeu2048[ligne + 1][colonne] = 0;
                    ligne++;
                    scoreAjoute += nouvelleValeur;
                }
            }
        }
        return scoreAjoute;
    }

    public static int fusionBas (int[][] jeu2048) {
        int scoreAjoute = 0;
        for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
            for (int ligne = Jeu.TAILLE - 1; ligne > 0; ligne--) {

                int valeur = jeu2048[ligne][colonne];

                if (valeur != 0 && jeu2048[ligne][colonne] == jeu2048[ligne - 1][colonne]) {
                    int nouvelleValeur = valeur * 2;
                    jeu2048[ligne][colonne] *= 2;
                    jeu2048[ligne - 1][colonne] = 0;
                    ligne--;
                    scoreAjoute += nouvelleValeur;
                }
            }
        }
        return scoreAjoute;
    }

}
