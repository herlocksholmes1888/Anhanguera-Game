// DANIEL

package anhanguera;

public class Bonsucesso extends Personagem {
	public Bonsucesso(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void gameOver() {
	    System.out.println("GAME OVER, PERSONAGEM " + this.name + " ALCANÇOU NÍVEL MÍNIMO DE INSATISFAÇÃO\n"
	            + "Eu entendo agora o que Sandra quis dizer quando me chamou de idealista.\n"
	            + "Somente um louco como eu não poderia ter previsto essas consequências. Eu só\n"
	            + "nunca vou entender por que aquelas palavras não foram ditas com mais desdém.\n"
	            + "...\n"
	            + "Se esse calor não me matar antes, eu vou falar com ela. Pode ser útil ter um\n"
	            + "ex-prefeito entre os Ambientalistas. E se eu não ficar, ela vai estar sozinha nessa\n"
	            + "Chernobyl.");
	}
}
