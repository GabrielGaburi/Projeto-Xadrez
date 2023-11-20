package Application;

import Xadrez.PecasXadrez;

public class UI {

    public static void telaTabuleiro(PecasXadrez[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pecas[i].length; j++) {
                telaPecas(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void telaPecas(PecasXadrez peca) {
        if (peca == null) {
            System.out.print("- ");
        } else {
            System.out.print(peca + " ");
        }
    }
}
