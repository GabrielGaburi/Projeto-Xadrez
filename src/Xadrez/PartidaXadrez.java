package Xadrez;


import TabuleiroGame.Posicao;
import TabuleiroGame.Tabuleiro;
import Xadrez.pieces.Rei;
import Xadrez.pieces.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configInicial();
	}

	public PecasXadrez[][] getPecas() {
		PecasXadrez[][] mat = new PecasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecasXadrez) tabuleiro.pecas(i, j);
			}
		}
		return mat;
	}

	private void configInicial() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Color.WHITE), new Posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Color.WHITE), new Posicao(7,4));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Color.BLACK), new Posicao(0,4));
	}
}
