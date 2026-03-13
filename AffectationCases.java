import java.lang.Math;

public class AffectationCases {


    public static void affecterDeuxPremiers2 (int[][] jeu2048) {

        // Creation des variables
        int premierecaselongueur, premierecaselargeur;
        int deuxiemecaselongueur, deuxiemecaselargeur;
        premierecaselongueur = (int)(Math.random()* Jeu.TAILLE);
        premierecaselargeur = (int)(Math.random()* Jeu.TAILLE);
        jeu2048[premierecaselongueur][premierecaselargeur] = 2;

        // affectation deuxieme case avec le fait que ce soit pas la meme que la premiere

        do {
            deuxiemecaselongueur = (int)(Math.random()* Jeu.TAILLE);
            deuxiemecaselargeur = (int)(Math.random()* Jeu.TAILLE);
        } while (deuxiemecaselongueur == premierecaselongueur && deuxiemecaselargeur == premierecaselargeur);
        jeu2048[deuxiemecaselongueur][deuxiemecaselargeur] = 2;
    }

    public static void ajouterTuileAleatoireTaille4 (int[][] jeu2048) {
        int caselongueur, caselargeur,deuxOuQuatre;
        boolean verification = false;
        do {
            caselongueur = (int)(Math.random() * Jeu.TAILLE);
            caselargeur = (int)(Math.random() * Jeu.TAILLE);
            deuxOuQuatre = (int)(Math.random() * 100);
            if (jeu2048[caselongueur][caselargeur] == 0) {
                if (deuxOuQuatre < 90) {
                    jeu2048[caselongueur][caselargeur] = 2;
                } else {
                    jeu2048[caselongueur][caselargeur] = 4;
                }
                verification = true;
            }
        } while (verification == false);
    }

    public static void ajouterTuileAleatoireTaille5 (int[][] jeu2048) {
        int caselongueur, caselargeur,deuxOuQuatre;
        boolean verification = false;
        do {
            caselongueur = (int)(Math.random() * Jeu.TAILLE);
            caselargeur = (int)(Math.random() * Jeu.TAILLE);
            deuxOuQuatre = (int)(Math.random() * 100);
            if (jeu2048[caselongueur][caselargeur] == 0) {
                if (deuxOuQuatre < 90) {
                    jeu2048[caselongueur][caselargeur] = 2;
                } else {
                    jeu2048[caselongueur][caselargeur] = 4;
                }
                verification = true;
            }
        } while (verification == false);

        verification = false;
        do {
            caselongueur = (int)(Math.random() * Jeu.TAILLE);
            caselargeur = (int)(Math.random() * Jeu.TAILLE);
            deuxOuQuatre = (int)(Math.random() * 100);
            if (jeu2048[caselongueur][caselargeur] == 0) {
                if (deuxOuQuatre < 90) {
                    jeu2048[caselongueur][caselargeur] = 2;
                } else {
                    jeu2048[caselongueur][caselargeur] = 4;
                }
                verification = true;
            }
        } while (verification == false);

    }


}
