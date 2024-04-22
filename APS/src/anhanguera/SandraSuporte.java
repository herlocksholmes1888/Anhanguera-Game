package anhanguera;

public class SandraSuporte extends Personagem {
	public SandraSuporte(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void gameOver() {
	    System.out.println("GAME OVER, PERSONAGEM " + this.name + " ALCANÇOU NÍVEL MÍNIMO DE INSATISFAÇÃO\n"
	            + "Ah… É verdade…\n"
	            + "(suspiro) EU tenho que guardar esses papéis…\n"
	            + "...\n"
	            + "O máximo que eu posso fazer é tentar me redimir com ela nesses últimos dias de\n"
	            + "governo. Depois, quando me tirarem da minha posição, penso melhor qual será o\n"
	            + "próximo passo.");
	}
}
