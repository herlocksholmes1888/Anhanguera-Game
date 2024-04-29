package anhanguera;

public class Player {
    private String Nome;

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    private int satisfacao = 0;

    public Player(String nome, int satisfacao) {
        this.Nome = nome;
        this.satisfacao = satisfacao;
    }

    public void gameOver() {
        System.out.println("Fim de jogo  " + Nome + ". Sua satisfação chegou a " + satisfacao);
    }
}
