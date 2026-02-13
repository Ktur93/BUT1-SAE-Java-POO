public class Affichage {


    public static void afficherTabTaille4 (int[][] jeu2048, int score) {

        int premLigne = 0,deuxLigne = 0,troisLigne = 0,quatreLigne = 0;
        int premLigneNb = 0,deuxLigneNb = 0,troisLigneNb = 0,quatreLigneNb = 0;


        for (int ligne = 0; ligne < 4; ligne++) {
            if (jeu2048[ligne][0] > premLigne)
                premLigne = jeu2048[ligne][0];
            if (jeu2048[ligne][1] > deuxLigne)
                deuxLigne = jeu2048[ligne][1];
            if (jeu2048[ligne][2] > troisLigne)
                troisLigne = jeu2048[ligne][2];
            if (jeu2048[ligne][3] > quatreLigne)
                quatreLigne = jeu2048[ligne][3];
        }

        for (int nbEspace = 0; nbEspace < premLigne; nbEspace++) {
            premLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < deuxLigne; nbEspace++) {
            deuxLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < troisLigne; nbEspace++) {
            troisLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < quatreLigne; nbEspace++) {
            quatreLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }


        System.out.println("Votre score : " + score);


        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {

                System.out.print("[");

                if (jeu2048[ligne][colonne] == 0){
                    if (colonne == 0) {
                        for (int espace = 0; espace < premLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 1) {
                        for (int espace = 0; espace < deuxLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 2) {
                        for (int espace = 0; espace < troisLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 3) {
                        for (int espace = 0; espace < quatreLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    }
                }

                if (jeu2048[ligne][colonne] !=0) {
                    System.out.print(jeu2048[ligne][colonne]);
                    if (colonne == 0) {
                        for (int espace = 0; espace < premLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != premLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 1) {
                        for (int espace = 0; espace < deuxLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != deuxLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 2) {
                        for (int espace = 0; espace < troisLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != troisLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 3) {
                        for (int espace = 0; espace < quatreLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != quatreLigne)
                                System.out.print(" ");
                        }
                    }

                }

                System.out.print("]");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void afficherTabTaille5 (int[][] jeu2048, int score) {

        int premLigne = 0,deuxLigne = 0,troisLigne = 0,quatreLigne = 0,cinqLigne = 0,sixLigne = 0;
        int premLigneNb = 0,deuxLigneNb = 0,troisLigneNb = 0,quatreLigneNb = 0,cinqLigneNb = 0,sixLigneNb = 0;


        for (int ligne = 0; ligne < 4; ligne++) {
            if (jeu2048[ligne][0] > premLigne)
                premLigne = jeu2048[ligne][0];
            if (jeu2048[ligne][1] > deuxLigne)
                deuxLigne = jeu2048[ligne][1];
            if (jeu2048[ligne][2] > troisLigne)
                troisLigne = jeu2048[ligne][2];
            if (jeu2048[ligne][3] > quatreLigne)
                quatreLigne = jeu2048[ligne][3];
            if (jeu2048[ligne][4] > cinqLigne)
                cinqLigne = jeu2048[ligne][4];
        }

        for (int nbEspace = 0; nbEspace < premLigne; nbEspace++) {
            premLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < deuxLigne; nbEspace++) {
            deuxLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < troisLigne; nbEspace++) {
            troisLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < quatreLigne; nbEspace++) {
            quatreLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }
        for (int nbEspace = 0; nbEspace < cinqLigne; nbEspace++) {
            cinqLigneNb++;
            nbEspace++;
            nbEspace *= 10;
        }



        System.out.println("Votre score : " + score);


        for (int ligne = 0; ligne < Jeu.TAILLE; ligne++) {
            for (int colonne = 0; colonne < Jeu.TAILLE; colonne++) {

                System.out.print("[");

                if (jeu2048[ligne][colonne] == 0){
                    if (colonne == 0) {
                        for (int espace = 0; espace < premLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 1) {
                        for (int espace = 0; espace < deuxLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 2) {
                        for (int espace = 0; espace < troisLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 3) {
                        for (int espace = 0; espace < quatreLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 4) {
                        for (int espace = 0; espace < cinqLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    } else if (colonne == 5) {
                        for (int espace = 0; espace < sixLigneNb; espace++) {
                            System.out.print(" ");
                        }
                    }
                }

                if (jeu2048[ligne][colonne] !=0) {
                    System.out.print(jeu2048[ligne][colonne]);
                    if (colonne == 0) {
                        for (int espace = 0; espace < premLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != premLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 1) {
                        for (int espace = 0; espace < deuxLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != deuxLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 2) {
                        for (int espace = 0; espace < troisLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != troisLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 3) {
                        for (int espace = 0; espace < quatreLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != quatreLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 4) {
                        for (int espace = 0; espace < cinqLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != cinqLigne)
                                System.out.print(" ");
                        }
                    } else if (colonne == 5) {
                        for (int espace = 0; espace < sixLigneNb - 1; espace++) {
                            if (jeu2048[ligne][colonne] != sixLigne)
                                System.out.print(" ");
                        }
                    }

                }

                System.out.print("]");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void cinqSautDeLigne () {
        System.out.print("\n\n\n\n\n");
    }

    public static void troisSautDeLigne () {
        System.out.print("\n\n\n");
    }




}
