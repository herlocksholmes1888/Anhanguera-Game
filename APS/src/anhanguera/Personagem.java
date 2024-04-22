package anhanguera;

public class Personagem {
	
	public String name; 
	public int satisfacaoPersonagem;
	
	public Personagem(String name) {
	    this.name = name;
	    this.satisfacaoPersonagem = 3;
	}

	public void aumentaSatisfacao(int maisSatisfacao) {
	    this.satisfacaoPersonagem += maisSatisfacao;
	}

	public void reduzSatifacao(int menosSatisfacao) {
	    this.satisfacaoPersonagem -= menosSatisfacao;
	    if (this.satisfacaoPersonagem <= 0) {
	        this.gameOver();
	    }
	}

	public void gameOver() {
	    System.out.println("GAME OVER, PERSONAGEM " + this.name + " ALCANÇOU NÍVEL MÍNIMO DE INSATISFAÇÃO");
	}
}
