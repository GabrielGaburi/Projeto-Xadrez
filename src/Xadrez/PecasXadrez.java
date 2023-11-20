package Xadrez;

import TabuleiroGame.Pecas;
import TabuleiroGame.Tabuleiro;

public class PecasXadrez extends Pecas {
	
	private Color color;

	public PecasXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}


	

}
