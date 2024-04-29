// GUSTAVO 

package anhanguera;

public class Player {
    private String Nome;
    private int satisfacao;
    
    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public Player(String nome, int satisfacao) {
        Nome = nome;
        this.satisfacao = satisfacao;
    }

    public void gameOver() {
        System.out.println("Fim de jogo  " + Nome + ". Sua satisfação chegou a " + satisfacao);
    }
}
