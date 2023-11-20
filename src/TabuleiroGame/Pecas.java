package TabuleiroGame;

public class Pecas {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	

	public Pecas (Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		tabuleiro = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	

}
