package anhanguera;

public class FloraDaSilva extends Personagem {
	public FloraDaSilva(String name) {
		super(name);
	}
	
	public void gameOver() {
	    System.out.println("GAME OVER, PERSONAGEM " + this.name + " ALCANÇOU NÍVEL MÍNIMO DE INSATISFAÇÃO\n"
	            + "Faz muito tempo desde a última vez em que vi uma árvore nessa área. Faz muito\n" +
				"tempo desde a última vez em que vi uma árvore nessa região metropolitana inteira.\n" +
				"——>\n" +
				"O Ministério da Saúde normalizou a utilização de máscaras, mas elas ajudam pouco\n" +
				"na tarefa de bloquear a fumaça química dos Industriais. Eu pensei que nunca mais\n" +
				"fosse ver essas máscaras depois de 2021.\n" +
				"——>\n" +
				"As pessoas estão falando em migrarem para outra cidade, onde as indústrias não\n" +
				"bloqueiam a vista e a respiração não sai quente.\n" +
				"——>\n" +
				"Faz muito calor, as pessoas saem de carro e liberam mais fumaça que deixa a\n" +
				"temperatura ainda mais quente. É uma cobra que come o próprio rabo.\n" +
				"——>\n" +
				"E o pior de tudo, é que a culpa foi minha. Eu prometi que nunca chegaria nesse\n" +
				"ponto, e eu permiti que chegasse.\n" +
				"——>\n" +
				"…\n" +
				"——>\n" +
				"Eu nunca pensei que fosse virar o prefeito de uma cidade-fantasma…");
	}
}
