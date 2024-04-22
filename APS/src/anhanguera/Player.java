package anhanguera;

public class Player {
    private String nome;
    private int satisfacao;

    public Player(String nome, int satisfacao) {
        this.nome = nome;
        this.satisfacao = satisfacao;
    }

    public void gameOver() {
        System.out.println("Fim de jogo  " + nome + ". Sua satisfação chegou a " + satisfacao);
    }
}
