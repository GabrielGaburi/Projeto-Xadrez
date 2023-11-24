package Xadrez;


import TabuleiroGame.Pecas;
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
	
	public PecasXadrez movimentacaoXadrez(PosicaoXadrez procurarPosicao, PosicaoXadrez posicaoDestino) {
		Posicao procurar = procurarPosicao.toPosicao();
		Posicao destino = posicaoDestino.toPosicao();
		validarProcuraPosicao(procurar);
		Pecas capturarPecas = fazerMovimento(procurar, destino);
		return (PecasXadrez)capturarPecas;
		
	}
	
	private Pecas fazerMovimento(Posicao procurar, Posicao destino) {
		
		Pecas p = tabuleiro.removerPecas(procurar);
		Pecas capturarPecas  = tabuleiro.removerPecas(destino);
		tabuleiro.lugarPeca(p, destino);
		return capturarPecas;
		
		
	}
	
	private void validarProcuraPosicao(Posicao posicao) {
		
		if (!tabuleiro.existeUmaPeca(posicao)) {
			throw new ExcepXadrez("Não existe peça na posição de origem");			
		}
		
	}
	
	private void coloqueNovaPeca(char coluna, int linha, PecasXadrez pecas) {
		
		tabuleiro.lugarPeca(pecas, new PosicaoXadrez(coluna, linha).toPosicao());
		
		
		
	}

	private void configInicial() {
		coloqueNovaPeca('c', 1, new Torre(tabuleiro, Color.WHITE));
		coloqueNovaPeca('c', 2, new Torre(tabuleiro, Color.WHITE));
		coloqueNovaPeca('d', 2, new Torre(tabuleiro, Color.WHITE));
		coloqueNovaPeca('e', 2, new Torre(tabuleiro, Color.WHITE));
		coloqueNovaPeca('e', 1, new Torre(tabuleiro, Color.WHITE));
		coloqueNovaPeca('d', 1, new Rei(tabuleiro, Color.WHITE));

		coloqueNovaPeca('c', 7, new Torre(tabuleiro, Color.BLACK));
		coloqueNovaPeca('c', 8, new Torre(tabuleiro, Color.BLACK));
		coloqueNovaPeca('d', 7, new Torre(tabuleiro, Color.BLACK));
		coloqueNovaPeca('e', 7, new Torre(tabuleiro, Color.BLACK));
		coloqueNovaPeca('e', 8, new Torre(tabuleiro, Color.BLACK));
		coloqueNovaPeca('d', 8, new Rei(tabuleiro, Color.BLACK));
		
	
	}
}
