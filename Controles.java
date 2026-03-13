import java.util.Scanner;

public class Controles {

    public static char zqsd () {
        char toucheUtilisateur;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Saisissez une touche pour vous deplacer (zqsd), m pour sortir : ");
        toucheUtilisateur = sc.next().charAt(0);
        while (toucheUtilisateur != 'z' && toucheUtilisateur != 'q' && toucheUtilisateur != 's' && toucheUtilisateur != 'd' && toucheUtilisateur != 'm') {
            System.out.println("Pas la bonne touche. faut mettre soit z,q,s,d ou m pour sortir : ");
            toucheUtilisateur = sc.next().charAt(0);
        }

        return toucheUtilisateur;
    }

    public static void deplacerGauche(int[][] jeu2048) {

        // on parcourt chaque ligne du jeu
        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {

            // nouvelle ligne temporaire qui fait la meme taille que une ligne du 2048 (4)
            int[] nouvelleLigne = new int[Jeu.TAILLE];

            // variable qui va permettre d'ecrire dans l'odre les chiffres qui sont pas 0
            int positionEcriture = 0;

            // on parcourt les colonnes de gauche à droite
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {

                if (jeu2048[ligne][colonne] != 0) {
                    nouvelleLigne[positionEcriture] = jeu2048[ligne][colonne];
                    positionEcriture++;
                }
            }

            // on remet la nouvelle ligne dans le jeu
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {
                jeu2048[ligne][colonne] = nouvelleLigne[colonne];
            }
        }
    }


    public static void deplacerDroit (int[][] jeu2048) {
        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            int[] nouvelleLigne;
            nouvelleLigne = new int[Jeu.TAILLE];

            // commence a trois car on va lire le tableau de droite a gauche (indmax = 3)
            int positionEcriture = Jeu.TAILLE - 1;

            // donc comme prevu le for qui commence a trois
            for (int colonne = Jeu.TAILLE - 1; colonne >=0 ; colonne--) {

                if (jeu2048[ligne][colonne] != 0) {
                    nouvelleLigne[positionEcriture] = jeu2048[ligne][colonne];
                    positionEcriture--;
                }
            }

            // ecriture de la nv ligne du tableau
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++)
                jeu2048[ligne][colonne] = nouvelleLigne[colonne];
        }
    }

    public static void deplacerHaut (int[][] jeu2048) {
        for (int col = 0; col < Jeu.TAILLE; col++) {
            int[] nouvelleColonne = new int[Jeu.TAILLE];

            int positionEcriture = 0;

            for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {

                if (jeu2048[ligne][col] != 0) {
                    nouvelleColonne[positionEcriture] = jeu2048[ligne][col];
                    positionEcriture++;
                }
            }

            for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
                jeu2048[ligne][col] = nouvelleColonne[ligne];
            }
        }
    }

    public static void deplacerBas (int[][] jeu2048) {
        for (int col = 0; col < Jeu.TAILLE; col++) {
            int[] nouvelleColonne = new int[Jeu.TAILLE];

            int positionEcriture = Jeu.TAILLE - 1;

            for (int ligne = Jeu.TAILLE - 1; ligne >= 0; ligne--) {

                if (jeu2048[ligne][col] != 0) {
                    nouvelleColonne[positionEcriture] = jeu2048[ligne][col];
                    positionEcriture--;
                }
            }

            for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
                jeu2048[ligne][col] = nouvelleColonne[ligne];
            }
        }
    }

    public static int switchDeplace (int[][] jeu2048, char toucheUtilisateur) {
        int score = 0;
        switch (toucheUtilisateur) {
            case 'z' :
                score = DeplacementEtFusion.deplEtFusHaut(jeu2048);
                break;
            case 'q' :
                score = DeplacementEtFusion.deplEtFusGauche(jeu2048);
                break;
            case 's' :
                score = DeplacementEtFusion.deplEtFusBas(jeu2048);
                break;
            case 'd' :
                score = DeplacementEtFusion.deplEtFusDroit(jeu2048);
                break;
        }
        return score;
    }

}
