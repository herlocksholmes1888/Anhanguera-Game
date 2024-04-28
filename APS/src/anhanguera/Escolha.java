// KAIQUE

package anhanguera;

public class Escolha {
	
	public static int[] calcularMudancaSatisfacaoParte1(int escolha) { 
		int mudancaFlora = 0; 
		int mudancaBonsucesso = 0; 
		int mudancaSuporte = 0;
	
    switch (escolha) {
    	case 1:
    		// Se o jogador ler a carta, a satisfação do Suporte não é alterada
    		break;	
    	case 2:
    		// Se o jogador pedir para resumir, a satisfação do Suporte diminui em 1 ponto
    		mudancaSuporte = -1;
    		break;
    	default:
    		// Caso de escolha inválida
    		System.out.println("Escolha inválida!");
    		break;
    }

    int[] mudancaSatisfacaoArray = {mudancaFlora, mudancaBonsucesso, mudancaSuporte};
    return mudancaSatisfacaoArray;
}

	public static int[] calcularMudancaSatisfacaoParte2(int escolha) {
		int mudancaFlora = 0;
		int mudancaBonsucesso = 0;
		int mudancaSuporte = 0;

		switch (escolha) {
			case 1:
				// Aumentar o orçamento para a drenagem de Anhanguera
				mudancaFlora = 3;
				break;
			case 2:
				// Aumentar o orçamento para coleta de lixo de Anhanguera
				mudancaFlora = 2;
				break;
			case 3:
				// Enviar ajuda comunitária aos moradores da periferia
				mudancaFlora = 1;
				break;
			case 4:
				// Não fazer nada
				mudancaFlora = -2;
				break;
			default:
				// Caso de escolha inválida
				System.out.println("Escolha inválida!");
				break;
		}

		int[] mudancaSatisfacaoArray = {mudancaFlora, mudancaBonsucesso, mudancaSuporte};
		return mudancaSatisfacaoArray;
}

	public static int[] calcularMudancaSatisfacaoParte3(int escolha) {
		int mudancaFlora = 0;
		int mudancaBonsucesso = 0;
		int mudancaSuporte = 0;

		switch (escolha) {
			case 1:
				// Pedir pra entrar
				mudancaSuporte = 0;
				break;
			case 2:
				// Explicar a situação
				mudancaSuporte = -1;
				break;
			default:
				// Caso de escolha inválida
				System.out.println("Escolha inválida!");
				break;
		}

		int[] mudancaSatisfacaoArray = {mudancaFlora, mudancaBonsucesso, mudancaSuporte};
		return mudancaSatisfacaoArray;
}

	public static int[] calcularMudancaSatisfacaoParte4(int escolha) {
		int mudancaFlora = 0;
		int mudancaBonsucesso = 0;
		int mudancaSuporte = 0;

		switch (escolha) {
			case 1:
				// Retirar a verba voltada à reciclagem
				mudancaBonsucesso = 3;
				mudancaSuporte = -2;
				mudancaFlora = -2;
				break;
			case 2:
				// Reduzir a verba obrigatória para 50%
				mudancaBonsucesso = 2;
				mudancaSuporte = -1;
				mudancaFlora = -2;
				break;
			case 3:
				// Reduzir a verba obrigatória para 25%
				mudancaBonsucesso = 1;
				mudancaFlora = -1;
				break;
			case 4:
				// Nada
				mudancaBonsucesso = -2;
				mudancaSuporte = 1;
				mudancaFlora = 3;
				break;
			default:
				// Caso de escolha inválida
				System.out.println("Escolha inválida!");
				break;
		}

		int[] mudancaSatisfacaoArray = {mudancaFlora, mudancaBonsucesso, mudancaSuporte};
		return mudancaSatisfacaoArray;
}

	public static int[] calcularMudancaSatisfacaoParte5(int escolha) {
		int[] mudancaSatisfacao = new int[3];

		switch (escolha) {
    		case 1:
    			// Concordar com Ricardo Bonsucesso
    			mudancaSatisfacao[0] = -2; // Flora
    			mudancaSatisfacao[1] = 3; // Bonsucesso
    			mudancaSatisfacao[2] = -2; // Suporte
    			break;
    		case 2:
    			// Concordar com Flora da Silva
    			mudancaSatisfacao[0] = 3; // Flora
    			mudancaSatisfacao[1] = -2; // Bonsucesso
    			mudancaSatisfacao[2] = 0; // Suporte
    			break;
    		case 3:
    			// Dizer 'vou pensar nisso' e nunca pensar nisso
    			mudancaSatisfacao[0] = -1; // Flora
    			mudancaSatisfacao[1] = -1; // Bonsucesso
    			mudancaSatisfacao[2] = -1; // Suporte
    			break;
    		default:
    			System.out.println("Escolha inválida!");
    			break;
		}

	return mudancaSatisfacao;
  }
}
