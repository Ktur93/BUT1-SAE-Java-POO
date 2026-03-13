public class DeplacementEtFusion {
    public static int deplEtFusGauche (int[][] jeu2048) {
        Controles.deplacerGauche(jeu2048);
        int score = Fusion.fusionGauche(jeu2048);
        Controles.deplacerGauche(jeu2048);
        return score;
    }

    public static int deplEtFusDroit (int[][] jeu2048) {
        Controles.deplacerDroit(jeu2048);
        int score = Fusion.fusionDroit(jeu2048);
        Controles.deplacerDroit(jeu2048);
        return score;
    }

    public static int deplEtFusHaut (int[][] jeu2048) {
        Controles.deplacerHaut(jeu2048);
        int score = Fusion.fusionHaut(jeu2048);
        Controles.deplacerHaut(jeu2048);
        return score;
    }

    public static int deplEtFusBas (int[][] jeu2048) {
        Controles.deplacerBas(jeu2048);
        int score = Fusion.fusionBas(jeu2048);
        Controles.deplacerBas(jeu2048);
        return score;
    }

}
