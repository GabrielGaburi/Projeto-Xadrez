package TabuleiroGame;

import Xadrez.pieces.Torre;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Pecas[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcepTabuleiro("Erro ao criar o tabuleiro, deve haver pelo menos uma linha e uma coluna");
		}

		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Pecas[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Pecas pecas(int linhas, int colunas) {
		if (!posicaoExistente(linhas, colunas)) {
			throw new ExcepTabuleiro("Posição não esta no tabuleiro");
		}

		return pecas[linhas][colunas];

	}

	public Pecas pecas(Posicao posicao) {

		if (!posicaoExistente(posicao)) {
			throw new ExcepTabuleiro("Posição não esta no tabuleiro");
		}

		return pecas[posicao.getLinha()][posicao.getColuna()];

	}

	public void lugarPeca(Pecas peca, Posicao posicao) {

		if (existeUmaPeca(posicao)) {

			throw new ExcepTabuleiro("Já existe uma peça nesta posição " + posicao);

		}

		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;

	}

	private boolean posicaoExistente(int linha, int coluna) {

		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;

	}

	public boolean posicaoExistente(Posicao posicao) {

		return posicaoExistente(posicao.getLinha(), posicao.getColuna());

	}

	public boolean existeUmaPeca(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcepTabuleiro("Posição não esta no tabuleiro");
		}

		return pecas(posicao) != null;

	}

	public Pecas removerPecas(Posicao posicao) {

		if (!posicaoExistente(posicao)) {
			throw new ExcepTabuleiro("Posição não esta no tabuleiro");
		}


	    Pecas aux = pecas(posicao);

	    if (aux == null) {
	        return null;
	    }

	    aux.posicao = null;
	    pecas[posicao.getLinha()][posicao.getColuna()] = null;
	    return aux;

	}

}
