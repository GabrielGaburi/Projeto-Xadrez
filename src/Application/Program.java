package Application;

import TabuleiroGame.Tabuleiro;
import Xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		
	
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.telaTabuleiro(partidaXadrez.getPecas());
	
	
	

	}

}
