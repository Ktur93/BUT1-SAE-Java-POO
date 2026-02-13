public class Jeu {
    // Pour 2048 = 4. Pour 4096 = 5
    public static final int TAILLE = 4;
    // Pour 2048 = 2048. Pour 4096 = 4096
    public static final int OBJECTIF = 2048;

    public static void partie () {
        // Texte debut de partie
        System.out.println("Bon debut de partie ! ");
        Affichage.cinqSautDeLigne();
        // Creation du tableau / variables
        boolean aAtteintMax = false,peutJouerOuPas,grilleChangeouPas,presenceZero;
        int[][] jeu2048avant;
        jeu2048avant = new int[TAILLE][TAILLE];
        int[][] jeu2048;
        jeu2048 = new int[TAILLE][TAILLE];
        char toucheUtilisateur;
        int scoreTotal = 0;

        // affecter la premiere et le deuxieme deux
        AffectationCases.affecterDeuxPremiers2(jeu2048);

        // affichage de la partie
        if (OBJECTIF == 2048) {
            Affichage.afficherTabTaille4(jeu2048, scoreTotal);
        } else if (OBJECTIF == 4096) {
            Affichage.afficherTabTaille5(jeu2048,scoreTotal);
        }

        do {

            // demander a l'utilisateur de choisir une touche
            toucheUtilisateur = Controles.zqsd();

            // si il a decider de quitter "m" on break car si on le met a la condition a la fin dans le while il va parcourir toute la boucle
            if (toucheUtilisateur == 'm') {
                System.out.println("Vous avez décidé de quitter par vous meme. ");
                break;
            }

            // trois saut de ligne
            Affichage.troisSautDeLigne();

            // On copie le tableau avant le changement
            for (int ligne = 0; ligne < TAILLE; ligne++) {
                for (int colonne = 0; colonne < TAILLE; colonne++) {
                    jeu2048avant[ligne][colonne] = jeu2048[ligne][colonne];
                }
            }

            // changer le tableau suivant ce qu'a marquer l'utilisateur avec un switch, en ajoutant cela au score
            scoreTotal += Controles.switchDeplace(jeu2048, toucheUtilisateur);

            // On verifie si le tableau a change ou pas
            grilleChangeouPas = Jouabilite.grilleChange(jeu2048avant,jeu2048);

            // On verifie si il y a un 0 dans le tableau ou pas
            presenceZero = Jouabilite.yaUnZeroOuPas(jeu2048);

            // Si le tableau a changé et que il y a un zero dans le tableau
            if (grilleChangeouPas && presenceZero) {
                // on ajoute une tuile aleatoire
                if (OBJECTIF == 2048) {
                    AffectationCases.ajouterTuileAleatoireTaille4(jeu2048);
                } else {
                    AffectationCases.ajouterTuileAleatoireTaille5(jeu2048);
                }
            }

            // afficher le tableau apres avoir attribué une touche
            if (OBJECTIF == 2048) {
                Affichage.afficherTabTaille4(jeu2048, scoreTotal);
            } else if (OBJECTIF == 4096) {
                Affichage.afficherTabTaille5(jeu2048,scoreTotal);
            }

            // on verifie les conditions qui font qu'il puisse continuer la partie ou pas
            aAtteintMax = Jouabilite.atteintMax(jeu2048);
            peutJouerOuPas = Jouabilite.peutEncoreJouer(jeu2048);


        } while (!aAtteintMax && peutJouerOuPas);

        if (aAtteintMax) {
            System.out.println("Félicitations, Votre score : " + scoreTotal);
        } else {
            System.out.println("Game Over ! Votre score : " + scoreTotal);
        }






    }
}
