package Application;

import java.util.Scanner;

import Xadrez.PartidaXadrez;
import Xadrez.PecasXadrez;
import Xadrez.PosicaoXadrez;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		while (true) {
			UI.telaTabuleiro(partidaXadrez.getPecas());
			System.out.println();
			System.out.print("Procurar: ");
			PosicaoXadrez  procurar = UI.leiaPosicaoXadrez(leia);
			System.out.println();
			
			System.out.print("Origem: ");
			PosicaoXadrez destino = UI.leiaPosicaoXadrez(leia);
			
			PecasXadrez capturPecasXadrez = partidaXadrez.movimentacaoXadrez(procurar, destino);
			
		}
		
	
	
	

	}

}
