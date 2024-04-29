package utils;

public class LeitorDialogo {

    // Trasforma uma string em char
    // Desmebra uma frase ou palavra e as coloca como letras independentes
    public static void leitorDialogo(String mensagem) throws InterruptedException {
        for (char c : mensagem.toCharArray()) {
            System.out.print(c);
            simulateDelay();
        }
    }

    // Controla o tempo do slowPrint
    private static void simulateDelay() throws InterruptedException {
        Thread.sleep(43);
    }

}
