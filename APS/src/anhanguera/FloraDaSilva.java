// DANIEL

package anhanguera;

public class FloraDaSilva extends Personagem {
	public FloraDaSilva(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void gameOver() {
	    System.out.println("GAME OVER, PERSONAGEM " + this.name + " ALCANÇOU NÍVEL MÍNIMO DE INSATISFAÇÃO\n"
	            + "Faz muito tempo desde a última vez em que vi uma árvore nessa área. Faz muito\n"
	            + "tempo desde a última vez em que vi uma árvore nessa região metropolitana inteira.\n"
	            + "O Ministério da Saúde normalizou a utilização de máscaras, mas elas ajudam pouco\n"
	            + "na tarefa de bloquear a fumaça química dos Industriais.\n"
	            + "...\n"
	            + "Eu nunca pensei que fosse virar o prefeito de uma cidade-fantasma…");
	}
}
