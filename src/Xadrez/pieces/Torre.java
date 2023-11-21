package Xadrez.pieces;

import TabuleiroGame.Tabuleiro;
import Xadrez.Color;
import Xadrez.PecasXadrez;

public class Torre  extends PecasXadrez{

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}
	
	@Override
	
	public String toString() {
		
		return "T";
		
	}
	

}
