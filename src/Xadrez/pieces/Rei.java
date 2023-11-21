package Xadrez.pieces;

import TabuleiroGame.Tabuleiro;
import Xadrez.Color;
import Xadrez.PecasXadrez;

public class Rei extends PecasXadrez {

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}
	
	@Override
	
	public String toString() {
		return "K";
	}

}
