package anhanguera;

import javax.net.ssl.ExtendedSSLSession;

public class Dialogo {
	static Player player;

    //   Notas sobre os personagens:

    public static String NotasPlayer1() {
        return player.getNome() +
                "é um político brasileiro na casa dos 30 anos. Ele foi eleito devido a\n" +
                "suas promessas em relação tanto ao cuidado em relação ao meio ambiente\n" +
                "quanto ao crescimento econômico de Anhanguera—sua cidade. Com essa\n" +
                "pressão, tanto os Ambientalistas quanto os Industriais o pressionam em\n" +
                "direções opostas. " +
                player.getNome() +
                " não tem muitas características que o distinguem dos\n" +
                "outros, visto que seu propósito é ser um Everyman.";
    }

    public static String NotasSandra() {
        return "Sandra Suporte: Secretária do " +
                player.getNome() +
                " (40 anos). Costuma ser a pessoa que\n" +
                "apresenta elementos da história para ele, além de comentar sobre sua\n" +
                "popularidade. É uma personagem com uma personalidade entre Rosa Diaz\n" +
                "(Brooklyn 9-9), odeia seu trabalho e trata seu chefe com cinismo pelo simples\n" +
                "fato que o " +
                player.getNome() +
                " é dependente demais dela para poder demiti-la. Passa a\n" +
                "maior parte do trampo checando suas redes sociais. O que sente pelo " +
                player.getNome() +
                "pode ser afetado por suas decisões, porque se ele tomar muitas decisões\n" +
                "que alinhem com suas crenças, seu comportamento piora até que decide\n" +
                "enviar sua carta de demissão; se ele tomar muitas decisões que julga boas,\n" +
                "ela começa a tratá-lo com mais respeito e a dedicar-se mais ao seu trabalho,\n" +
                "a fim de ajudá-lo.\n\n";
    }

    public static String NotasBonsucesso() {
        return "Ricardo Bonsucesso: Representante dos Industriais de Anhanguera (55\n" +
                "anos). Costuma ou ser mencionado por Sandra Suporte, ou aparecer no\n" +
                "escritório do " +
                player.getNome() +
                " sem ser convidado. É dono de várias companhias, como\n" +
                "uma padaria, vários apartamentos alugados nas praias mais próximas, duas\n" +
                "fazendas, uma revendedora de computadores e celulares… Resumindo,\n" +
                "TODO negócio de sucesso em Anhanguera é administrado por ele. Fala\n" +
                "fluentemente apenas o português, mas gosta de parecer mais inteligente do\n" +
                "que as pessoas ao seu redor, então exagera sua fala com palavras em\n" +
                "inglês, latim e francês — todas gramaticalmente incorretas ou amplamente\n" +
                "conhecidas. É carismático, e às vezes usa de artifícios como piadas com\n" +
                "innuendo para fazer ameaças àqueles que ficam no seu caminho. Sua falta\n" +
                "de satisfação coloca o" +
                player.getNome() +
                " em risco de impeachment. As formas de\n" +
                "satisfazê-lo geralmente envolvem relaxação de leis ambientalistas e\n" +
                "benefícios tributários.\n\n";
    }

    public static String NotasFlora() {
        return "Flora da Silva: Presidente dos Ambientalistas (19 anos). Costuma ou ser\n" +
                "mencionada por Sandra Suporte, ou enviar cartas abertas ao " +
                player.getNome() +
                " em\n" +
                "nome de sua associação; o único momento em que aparece em seu\n" +
                "escritório é quando perde a paciência. É quieta e gentil, mas também\n" +
                "assertiva e teimosa. Vive numa periferia propensa a alagamentos. Sua falta\n" +
                "de satisfação coloca Anhanguera em risco de colapso ambiental. As formas\n" +
                "de satisfazê-la geralmente envolvem maior rigidez das leis ambientalistas e\n" +
                "incentivo à ajuda comunitária.\n\n";
    }

    //  Script:

    public static String PreScript() {
        return  Jogador() + " 52% x OPOSIÇÃO 48%. Foi uma vitória acirrada. Praticamente\n" +
                "meio-a-meio.\n" +
                Espaco() +
                Jogador() + "Vai ser difícil ficar no poder quando 50% da cidade me quer fora.\n" +
                Espaco() +
                Jogador() + "Mas… Tudo bem. Eu não tô sozinho. Eu tenho ajuda.\n" +
                Espaco() +
                "S. SUPORTE: Droga…\n" +
                Espaco() +
                "S. SUPORTE: Tô perdendo a reprise de Roque Santeiro pra ficar\n" +
                "organizando papel.\n" +
                Espaco() +
                Jogador() + "… Eu ACHO que eu tenho ajuda.\n" +
                Espaco() +
                "S. SUPORTE: E eu pensei que o diploma em engenharia ia valer alguma\n" +
                "coisa. 40 anos e ainda cuidando da papelada dos outros. Grande pátria educadora.\n" +
                Espaco() +
                Jogador() + "… É, eu tô sozinho.\n" +
                "——";
    }

    /*
            LEVEL 1: CONTRA A CORRENTE
    */

    public static String LevelUmUm() {
        return "S. SUPORTE: Seu Prefeito, chegou uma carta pra você! Parece que é de\n" +
                "uma das vítimas da enchente. Uma tal de Flora.\n" +
                Espaco() +
                "S. SUPORTE: O cara que me deu a carta disse que ela veio pessoalmente.\n" +
                "Parecia irritada. Ainda bem que não é comigo.\n" +
                Espaco() +
                Jogador() + "Por que agora? Por que comigo?\n" +
                Espaco() +
                Jogador() + ": …Obrigado, Sandra…";
    }

    public static String LevelUmDois() {
                // [2]
        return Jogador() +": … mas estou muito ocupado agora. Você não pode resumir o conteúdo\n" +
                "da carta, por favor?\n" +
                Espaco() +
                "S. SUPORTE: …\n" +
                Espaco() +
                "S. SUPORTE: A gente vota imaginando que o candidato sabe ler.\n" +
                Espaco() +
                "S. SUPORTE: Tá bom, um resumo da carta… A tal da Flora tá reclamando da\n" +
                "última enchente. Disse que não é a primeira vez que tem que ir pra faculdade de\n" +
                "barco.\n" +
                Espaco() +
                "S. SUPORTE: Ela disse que falar que é por causa do temporal não tá tão certo\n" +
                "quanto falar que é por causa do sistema de drenagem daqui.\n" +
                Espaco() +
                Jogador() +": Drenagem?\n" +
                Espaco() +
                "S. SUPORTE: É, a drenagem daqui é uma merda, é o que eu tô querendo dizer.\n" +
                Espaco() +
                "S. SUPORTE: O cara que tava no teu lugar ano passado era meio palerma que nem\n" +
                "você. Tirou umas plantas pra construir “mais casa”, construiu “as casa” onde era\n" +
                "terreno baldio…\n" +
                Espaco() +
                "S. SUPORTE: E eram “umas casa barata”, também. Do tipo chama-pobre, mesmo.\n" +
                "A Flora mora numa delas; aí deu no que deu\n\n." +
                // [1]
                Jogador() +": … me dá a carta.\n" +
                Espaco() +
                "S. SUPORTE: Tó.\n" +
                Espaco() +
                "Olá, Senhor Prefeito,\n" +
                Espaco() +
                "Venho por meio desta desviar sua atenção a um problema que acredito que apenas\n" +
                "o senhor é capaz de resolver.\n" +
                Espaco() +
                "Como sabe, há dois dias, houve uma chuva torrencial que atingiu particularmente a\n" +
                "periferia onde moro. Todo mundo que conheço perdeu alguma coisa ou alguém – eu\n" +
                "mesma quase perdi minha gata, Filomena, pras correntes.\n" +
                Espaco() +
                "Tenho uma exigência a fazer: gostaria que aumentasse o investimento na drenagem\n" +
                "de nossa cidade. Se não for possível, ajude a coletar o lixo que “intope” os bueiros e\n" +
                "piora a drenagem.\n" +
                Espaco() +
                "Sei que não costuma ser uma prioridade, mas estava entre suas promessas ouvir os\n" +
                "Ambientalistas. Promessas são apenas palavras. Até mentirosos sabem falar.\n" +
                Espaco() +
                "Att. Flora da Silva\n" +
                Espaco() +
                "…\n" +
                Espaco() +
                "…………\n" +
                Espaco() +
                "S. SUPORTE: Por que tu tá no Facebook, Seu Prefeito?\n" +
                Espaco() +
                Jogador() +": N-nada, só deletando as postagens com localização.\n" +
                "S. SUPORTE: Então, o que cê vai fazer?\n" +
                Espaco() +
                "[PLAYER]: Não tá na cara? Que mal ajudar a menina vai causar?\n" +
                Espaco() +
                "S. SUPORTE: Você é mais palerma do que eu pensei.\n" +
                Espaco() +
                Jogador() +": Ei! Respeito é bom e eu gosto.\n" +
                Espaco() +
                "S. SUPORTE: Você já esqueceu? Se você der tudo que os Ambientalistas\n" +
                "querem, os Industriais vão ficar com raiva. Confia em mim, a última coisa que tu\n" +
                "quer é uma entrevista com o Seu Bonsucesso. Aquele cara é uma víbora.\n" +
                Espaco() +
                Jogador() +": Como é que ajudar a menina ia irritar o Sr. Bonsucesso?\n" +
                Espaco() +
                "S. SUPORTE: Ah é, né?\n" +
                Espaco() +
                "S. SUPORTE: Brisei. Mas fica de aviso pra próxima vez… quando importar.\n\n";
    }

    public static String LevelUmTres() {
                // [1]
        return  Jogador()+": … creio que o melhor a fazer seja ouvir a moça. Sandra, você pode\n" +
                "marcar algumas reuniões para mim?\n" +
                Espaco() +
                "S. SUPORTE: Reuniões? Para quê?\n" +
                Espaco() +
                Jogador() +": Melhorar esse lance da drenagem. A gente deixou de lado por tempo\n" +
                "suficiente.\n" +
                Espaco() +
                "S. SUPORTE: Você assumiu ontem.\n" +
                Espaco() +
                Jogador() +": “A gente” no sentido da prefeitura como um todo, Sandra.\n" +
                Espaco() +
                "S. SUPORTE: Ah. Vou marcar as reuniões, então.\n" +
                Espaco() +
                "S. SUPORTE: A gente vota no candidato achando que ele sabe falar por telefone…\n\n" +
                // [2]
                Jogador() +": … creio que o melhor a fazer seja ouvir a moça. Sandra, você pode\n" +
                "marcar algumas reuniões para mim?\n" +
                Espaco() +
                "S. SUPORTE: Reuniões? Para quê?\n" +
                Espaco() +
                Jogador() +": A gente tem que pensar no q uê fazer com o lixo dessa cidade.\n" +
                Espaco() +
                Jogador() +": Digo, o lixo que VEM dessa cidade. Não que a cidade em si seja um lixo.\n" +
                "Não é isso que eu quero dizer. A cidade é boazinha, até. Melhor do que a minha\n" +
                "terra natal. Eu quis dizer o lixo que os cidadãos produzem. Que eu produzo,\n" +
                "também, e–\n" +
                Espaco() +
                "S. SUPORTE: A gente vota no candidato achando que ele sabe discursar, não\n" +
                "tagarelar.\n" +
                Espaco() +
                Jogador() +": Desculpa.\n\n" +
                // [3]
                Jogador() +": …\n" +
                Espaco() +
                "S. SUPORTE: …\n" +
                Espaco() +
                "S. SUPORTE: Que foi?\n" +
                Espaco() +
                Jogador() +": Como que eu faço pra melhorar a drenagem ou a coleta de lixo mesmo?\n" +
                Espaco() +
                "S. SUPORTE: Eu vou fingir que não ouvi isso.\n" +
                Espaco() +
                Jogador() +": E se eu… e seu direcionasse uma parte do orçamento pras vítimas?\n" +
                "Sabe, pra deslocar temporariamente e reconstruir aquela parte da cidade?\n" +
                Espaco() +
                "S. SUPORTE: Tu não ouviu a moça? Não é a primeira vez que inunda e vai inundar\n" +
                "de novo em algum ponto. Acho que a sua solução ainda tá meio crua\n" +
                Espaco() +
                Jogador() +": M-mas ainda é uma solução, né?\n" +
                Espaco() +
                "S. SUPORTE: Sei lá, acho que sim. Vai querer que eu ligue pra alguma ONG?\n" +
                Espaco() +
                Jogador() +": N-não, eu cuido disso. Se a ajuda vier de uma ONG, vai parecer que eu\n" +
                "não faço nada.\n" +
                Espaco() +
                "S. SUPORTE: Não ia ser muito distante da realidade.\n\n" +
                // [4]
                Jogador() +": …\n" +
                Espaco() +
                "S. SUPORTE: …\n" +
                Espaco() +
                "S. SUPORTE: Que foi?\n" +
                Espaco() +
                Jogador() +": E se o Sr. Bonsucesso não gostar da minha interferência?\n" +
                Espaco() +
                "S. SUPORTE: Qual é, não leva o que eu disse tão a sério. Ele só se mete em\n" +
                "alguns casos, e esse não vai ser um deles.\n" +
                Espaco() +
                Jogador() +": Tá, mas e se? Que bem eu poderia fazer se eu não for mais o prefeito\n" +
                "por causa disso?\n" +
                Espaco() +
                "S. SUPORTE: Talvez alguma coisa útil com a sua vida, pra dar uma variada.\n\n";

    }

    /*
           LEVEL 2: MALSUCESSO
     */

    public static String LevelDoisUm() {
        return Jogador() +": Dia novo, vida nova.\n" +
                Espaco() +
                "S. SUPORTE: Tem um cara estranho querendo falar contigo, ele parece ter\n" +
                "algum problema mental grave. É aquele Bonsucesso que eu falei pra você não\n" +
                "mexer…\n" +
                Espaco() +
                "Ou não.\n" +
                Espaco() +
                Jogador() +": Errei, fui moleque.\n\n";
    }

    public static String LevelDoisDois() {
                //[1]
        return Jogador() +": Boa tarde senhor Bonsucesso, como pos–\n" +
                Espaco() +
                "R. BONSUCESSO: Gud murning amigo, como estais?!\n" +
                Espaco() +
                Jogador() +": Estou b–\n" +
                Espaco() +
                "R. BONSUCESSO: Que beleza, meu friendo, então temos alguns próblémés a\n" +
                "tratar!\n" +
                Espaco() +
                "Hoje vai ser um dia daqueles…\n" +
                Espaco() +
                Jogador() +": Tudo bem, o que temos em pauta?\n\n" +
                // [2]
                Jogador() +": O que que eu fiz pra irritar o Sr. Bonsucesso?\n" +
                Espaco() +
                "S. SUPORTE: Ele viu que você ajudou a Srta. Silva e agora quer pedir sua ajuda\n" +
                "sobre os impostos das fábricas e outros nhemnhemnhem. Industrialistas, sabe.\n" +
                "Você realmente deveria se atualizar.\n" +
                Espaco() +
                Jogador() +": Por que eu precisaria assistir as notícias, se as suas descrições\n" +
                "são tão maravilhosamente explicadas e tão ricas em detalhes?\n" +
                Espaco() +
                "S. SUPORTE: Vai tomar no s…\n" +
                Espaco() +
                "BONSUCESSO: Rélou, mes amis! Vi a door aberta e entrei!\n" +
                Espaco() +
                "S. SUPORTE: Goodbye.\n" +
                Espaco() +
                "BONSUCESSO: Que biutiful empregada vous tenez! E bilíngue também!\n" +
                Espaco() +
                Jogador() +": Sim, um amor de pessoa….\n" +
                Espaco() +
                "BONSUCESSO: Ah, mas não temos tempo para falar das mulhérés. Temos\n" +
                "alguns próblémés a tratar, monsiê le Prefeité!\n" +
                Espaco() +
                "Eu podia jurar que a palavra correta era “femmes”…\n" +
                Espaco() +
                Jogador() +": Tudo bem, o que temos em pauta?\n" +
                "R. BONSUCESSO: Queria tratar de búsiniss, uma parte da prodúcciom das\n" +
                "interpraises está sempre sendo usada for uma tal de “ressaikle”.\n" +
                Espaco() +
                "Acho que esse é o final boss da Fisk.\n" +
                Espaco() +
                "Espera… ressaikle? Ele quer dizer recicling??\n" +
                Espaco() +
                "Esse cara quer que eu deixe ele poluir e ferrar mais a cidade por nada? Ele\n" +
                "tá de brinqueixom uíti me?\n" +
                Espaco() +
                Jogador() +": Vou ver o que eu posso fazer.\n" +
                Espaco() +
                "R. BONSUCESSO: Mesmo? Seria uma pena se você fizesse uma promise\n" +
                "pra um búsinessmên como me sem cumprir.\n" +
                Espaco() +
                "R. BONSUCESSO: Muitas pipou já tentaram, iú nou? Bocú de pipou.\n" +
                Espaco() +
                Jogador() +": Não entendo como isso possa ser relevante, mas também levarei\n" +
                "isso em consideração, Sr. Bonsucesso.\n" +
                Espaco() +
                "R. BONSUCESSO: Bom. Sabe como chamam humanés como vouscê na\n" +
                "França? Maravilhosés amigués!\n" +
                Espaco() +
                "Ele foi embora. Se eu tivesse que ouvir mais uma frase em franglés\n" +
                "brasileiro, eu juro que eu não sobreviveria. Talvez exista um Deus afinal!\n" +
                Espaco() +
                "S. SUPORTE: Então, o que aquele porco de terno queria?\n" +
                Espaco() +
                "E eu sigo sendo agnóstico…\n" +
                Espaco() +
                Jogador() +": Quer estragar mais a cidade, quer tirar uma parte da verba\n" +
                "destinada à reciclagem e “reciclar” no bolso dele.\n" +
                Espaco() +
                "S. SUPORTE: O assistente dele deve ganhar muito bem…\n" +
                Espaco() +
                Jogador() +": O que você tá insinuando?\n" +
                Espaco() +
                "S. SUPORTE: O que vai fazer?\n" +
                Espaco() +
                Jogador() +": Ela me ignorou…\n\n";
    }

    public static String LevelDoisTres() {
                // [1]
        return Jogador() +": Bom, não tem o que fazer senão tirar a obrigatoriedade de reciclagem.\n" +
                Espaco() +
                "S. SUPORTE: ...\n" +
                Espaco() +
                Jogador() +": O quê?\n" +
                Espaco() +
                "S. SUPORTE: Nada, só mais do mesmo.\n" +
                Espaco() +
                "… Eu sinto que pisei na ball, só não sei dizer como…\n\n" +
                // [2]
                Jogador() +": Acho que posso tentar fazer um agradinho.\n" +
                Espaco() +
                "S. SUPORTE: O que tem em mente? Além de vento.\n" +
                Espaco() +
                Jogador() +": Vou reduzir em 50% a verba de reciclagem. Não vai fazer tanto mal, vai?\n" +
                Espaco() +
                "S. SUPORTE: Acho que estamos sendo governados por algum tipo de símio.\n\n" +
                // [3]
                Jogador() +": Esse cara quer por fogo nessa cidade e eu não vou deixar.\n" +
                Espaco() +
                Jogador() +": Ao invés de reduzir a verba de reciclagem em 100%, vou reduzir em\n" +
                "25%. O que pode dar errado?\n" +
                Espaco() +
                "S. SUPORTE: Uma outra enchente na periferia, talvez…\n" +
                Espaco() +
                Jogador() +": O quê?\n" +
                Espaco() +
                "S. SANDRA: Nada.\n\n" +
                // [4]
                "S. SUPORTE: Vai ficar me olhando até quando?\n" +
                Espaco() +
                Jogador() +": Eu não estava te olhando. Eu estava pensando.\n" +
                Espaco() +
                "S. SUPORTE: Ah, faz sentido. A tela congelou com tanta informação numa CPU tão\n" +
                "antiga.\n" +
                Espaco() +
                Jogador() +": … Eu tenho 31 anos–\n" +
                Espaco() +
                "S. SUPORTE: E qual é a solução que o jovem idoso pensou?\n" +
                Espaco() +
                Jogador() +": Nada.\n" +
                Espaco() +
                "S. SUPORTE: Como assim “nada”?\n" +
                Espaco() +
                Jogador() +": Eu não posso arriscar diminuir a verba de reciclagem quando ela já está\n" +
                "tão pequena. Imagina quanto saco de lixo a mais você ia ver por aí!\n" +
                Espaco() +
                Jogador() +": Ele quer que as pessoas tenham que pular sacolas de lixo para ir a\n" +
                "algum lugar? Mas nem que o Santos volte pra série A.\n" +
                Espaco() +
                "S. SUPORTE: Então essa é sua decisão?\n" +
                Espaco() +
                "… Ela tá me olhando estranho…\n" +
                Espaco() +
                Jogador() +": Algo contra?\n" +
                Espaco() +
                "S. SUPORTE: Você é idealista demais pra merecer um voto sério.\n" +
                Espaco() +
                Jogador() +": ELA CONSEGUE SORRIR?\n\n";
    }

    /*
            LEVEL 3: O LIXO DE UM HOMEM É O DINHEIRO DE OUTRO
     */

    public static String LevelTresUm() {
        return "Eu tive um pesadelo essa noite.\n" +
                Espaco() +
                "Eu estava dirigindo um carro elétrico até um apartamento que havia\n" +
                "alugado em Ubatuba para passar as férias com a minha família. Tive uma\n" +
                "discussão com a minha ex, nada muito acalorado. Decidimos que seria\n" +
                "melhor se a nossa filha fosse com ela.\n" +
                Espaco() +
                "Por mais impossível que pareça, em algum ponto da serra, o volante\n" +
                "ficou eletrizado. Impossível em termos de Física, eu podia jurar que um carro\n" +
                "fazia uma gaiola de Faraday, mas sonhos não seguem regras.\n" +
                Espaco() +
                "Não sei quantos joules de corrente elétrica passaram por mim, só sei\n" +
                "que ficou tudo escuro de repente.\n" +
                Espaco() +
                "Mas eu ainda estava sonhando. Ouvi vozes, uma delas era do Sr.\n" +
                "Ricardo Bonsucesso parabenizando uma pessoa pelo “trabalho bem feito”.\n" +
                "Foi nesse momento que me lembrei que a discussão com a minha ex havia\n" +
                "sido sobre como eu não estava seguro e ela estava preocupada comigo.\n" +
                Espaco() +
                "E quer saber o pior? Eu ainda tive que pegar um ônibus. A ideia de\n" +
                "entrar no meu carro me fazia tremer demais pra conseguir dirigir. E a troco de\n" +
                "quê escolhi o ônibus, se passei a viagem inteira achando que ia ser\n" +
                "esfaqueado?\n" +
                Espaco() +
                "S. SUPORTE: Você tá com uma cara horrível.\n" +
                Espaco() +
                "[PLAYER]: Obrigado, nasci com ela.\n" +
                Espaco() +
                "S. SUPORTE: Tem certeza de que você não quer ir num médico, não?\n" +
                "Não é muito recomendável pensar nas pautas de hoje com essa cara de\n" +
                "cachorro pidão.\n" +
                Espaco() +
                "[PLAYER]: E o que RAIOS aconteceu enquanto eu dormia pra virar a\n" +
                "primeira pauta do dia?\n" +
                Espaco() +
                "Eu ouço alguém bater à porta. Antes que eu possa dizer qualquer\n" +
                "coisa, ela tomba por terra.\n" +
                Espaco() +
                "R. BONSUCESSO: Bonjour!\n" +
                Espaco() +
                "[PLAYER]: O senhor arrombou a porta da prefeitura…?\n" +
                Espaco() +
                "R. BONSUCESSO: Arrombar? Non, non, non, eu apenas fiz uma force\n" +
                "com meus shoulders quando percebi que ela não queria abrir.\n" +
                Espaco() +
                "Não foi um pesadelo. Foi tudo verdade, eu estou morto, e este é o meu\n" +
                "Inferno.\n" +
                Espaco() +
                "F. SILVA: Com licença…? Eu espero que não seja rude, eu vi a porta\n" +
                "aberta e–\n" +
                Espaco() +
                "R. BONSUCESSO: Ah, é você, little girl. Mas que coincidência mais\n" +
                "éstrangé.\n" +
                Espaco() +
                "S. SUPORTE: Eu não gosto das vibes de hoje. Eu acho que eu vou\n" +
                "ind—\n" +
                Espaco() +
                "[PLAYER]: NÃO, você FICA. Se pra mais nada, você fica por suporte\n" +
                "moral. Eu quero entender por que, exatamente, esses dois entraram aqui sem\n" +
                "mais e nem menos.\n" +
                Espaco() +
                "S. SUPORTE: Bem… É uma briga meio antiga deles, sabe?\n" +
                Espaco() +
                "R. BONSUCESSO: Não desperdice o seu oxygéné com explicações,\n" +
                "minha flower de esplendor. Eu cuido das explications. Sabe, monsiê le\n" +
                "Préféité, sou eu quem faz essa cidade ir pra frente. Franquias de roupas,\n" +
                "joias, mineração… de escái is de limite!\n" +
                Espaco() +
                "R. BONSUCESSO: E, veja bem, eu estava pensando… Todas essas\n" +
                "interpraises e eu ainda não me aventurei no FUTURO: téquinolojí! Imagine: a\n" +
                "nossa mineradora já vai providenciar tudo o que é necessário no processo —\n" +
                "cobre, ouro, lítio, e todas essas coisas mequetrefes — e nós vamos\n" +
                "transformar Anhanguera no pólo tecnológico do Brasil! Adeus, terceiro\n" +
                "mundo!\n" +
                Espaco() +
                "R. BONSUCESSO: Não precisaríamos nem olhar muito longe! Temos\n" +
                "uma big quantity desses minerais bem aqui em áreas que nunca foram\n" +
                "exploradas antes! Estou falando de cavernas, estou falando de mares, tudo\n" +
                "isso puramente anhanguerês!\n" +
                Espaco() +
                "R. BONSUCESSO: Mas existe um problema, sabe… Esta lady ao meu\n" +
                "lado…\n" +
                Espaco() +
                "R. BONSUCESSO: Ela é contra o progresso.\n" +
                Espaco() +
                "F. SILVA: Eu sou contra essa mineração sem limites que a Bonsucesso\n" +
                "Ltda. patrocina. Se ainda fosse por uma boa causa…\n" +
                Espaco() +
                "R. BONSUCESSO: É uma boa causa, lirou fren! O progresso colocará\n" +
                "Anhanguera como uma titã de inovações tecnológicas, e esse creizi progrés\n" +
                "necessita de minérios!\n" +
                Espaco() +
                "F. SILVA: Se o senhor pensa que computadores que só podem durar\n" +
                "dois anos é progresso, então sim, a Bonsucesso Ltda. tratá progresso… O\n" +
                "problema é que vem com ele.\n" +
                Espaco() +
                "R. BONSUCESSO: O que é que você tem contra money?\n" +
                Espaco() +
                "[PLAYER]: (tosse)\n" +
                Espaco() +
                "Todo mundo olhou pra mim. Bom.\n" +
                Espaco() +
                "[PLAYER]: O que, exatamente, vocês querem de mim?\n" +
                Espaco() +
                "R. BONSUCESSO: Uma relaxação nas leis de exploração de minérios,\n" +
                "é claro!\n" +
                Espaco() +
                "F. SILVA: E eu, o total oposto. O senhor já imaginou quanto lixo digital\n" +
                "esse troca-troca vai gerar?\n" +
                Espaco() +
                "[PLAYER]: Troca-troca?\n" +
                Espaco() +
                "R. BONSUCESSO: Bem, os compiuters que nós da Bonsucesso Ltda.\n" +
                "criaremos não são EXATAMENTE soluções a longo-prazo… Mas as\n" +
                "mudanças de um modelo para o outro valem muito a pena! Ou o senhor\n" +
                "nunca trocou um celular velho?\n" +
                Espaco() +
                "[PLAYER]: Eu… eu ainda uso um tijolão, na verdade.\n" +
                Espaco() +
                "S. SUPORTE: Não tem nem o jogo da cobrinha.\n" +
                Espaco() +
                "[PLAYER]: Como você sabe disso?\n" +
                Espaco() +
                "S. SUPORTE: Confidencial.\n" +
                Espaco() +
                "R. BONSUCESSO: UM TIJOLÃO? EM TCHU TAUZEND TUENTI\n" +
                "FOR?\n" +
                Espaco() +
                "F. SILVA: É, isso… isso é um pouco exagerado, senhor.\n" +
                Espaco() +
                "Ninguém entende a beleza de clicar várias vezes no teclado hoje em\n" +
                "dia…\n" +
                Espaco() +
                "Tudo bem, eu preciso decidir alguma coisa. Só queria que fechar os\n" +
                "olhos me tornasse invisível por cinco segundos.";
    }

    public static  String LevelTresDois() {
        // [1]
        return  Jogador() +": É, talvez eu precise mudar o meu celular para um mais novo, no\n" +
                "fim das contas… E não vejo por que não poderia ser com um modelo da\n" +
                "Bonsucesso Ltda.\n" +
                Espaco() +
                "R. BONSUCESSO: O senhor fez uma excelente escolha, monsiê le Préféité!\n" +
                "E pode garantir que vai ter um grande desconto quando for lá na techstore!\n" +
                Espaco() +
                Jogador() +": Puxa, obriga–\n" +
                Espaco() +
                "R. BONSUCESSO: Um descontasso de 5%!\n" +
                Espaco() +
                Jogador() +": É, Ícaro também sonhou alto e acabou queimado…\n" +
                Espaco() +
                "F. SILVA: …\n" +
                Espaco() +
                Jogador() +": Eu sinto muito, menina. Infelizmente, o desenvolvimento industrial\n" +
                "desta cidade também é uma prioridade aqui na prefeitura.\n" +
                Espaco() +
                "F. SILVA: Eu espero que isso não tenha consequências de que o senhor se\n" +
                "arrependa. Espero mesmo.\n\n" +
                // [2]
                Jogador() +": Pessoalmente, gosto bastante do meu Nokia e não vejo por que\n" +
                "trocar. Assim como não vejo por que uma loja de computadores e celulares\n" +
                "anhanguerense valha mudar a lei.\n" +
                Espaco() +
                "R. BONSUCESSO: O senhor tem certeza? Pode estar cometendo um erro.\n" +
                Espaco() +
                 Jogador() +": É, tenho certeza. Sabe, anda ficando difícil de respirar nesses\n" +
                "últimos e eu não vejo como um bando de explosões aqui perto vai melhorar o\n" +
                "cenário atual.\n" +
                Espaco() +
                Jogador() +": É claro, o senhor ainda pode minerar nas regiões em que a\n" +
                "extração de matéria é legalizada.\n" +
                Espaco() +
                "R. BONSUCESSO: Claro…\n" +
                Espaco() +
                "R. BONSUCESSO: Sabe, a última vez em que alguém se opôs a uma ideia\n" +
                "minha…\n" +
                Espaco() +
                "R. BONSUCESSO: Ele percebeu um pouco tarde demais que minhas ideias\n" +
                "eram boas.\n" +
                Espaco() +
                Jogador() +": Quem é “ele”?\n" +
                Espaco() +
                "R. BONSUCESSO: Ora, o vosso predecessor, é claro!\n" +
                Espaco() +
                "R. BONSUCESSO: Um pobre coitado… Que Deus o tenha.\n" +
                Espaco() +
                "Talvez, o sonho tenha sido um presságio…\n\n" +
                // [3]
                Jogador() + ": Vocês dois têm excelentes pontos. Por que não me descrevem os\n" +
                "prós e os contras de cada um, e então eu vejo o que posso fazer daqui a\n" +
                "alguns dias?\n" +
                Espaco() +
                "S. SUPORTE: É sério?\n" +
                Espaco() +
                "Ei, eu caía nisso enquanto procurava meu primeiro trampo!\n" +
                Espaco() +
                "R. BONSUCESSO: Sei…\n" +
                Espaco() +
                "F. SILVA: Tá…\n" +
                Espaco() +
                "Esse não é o “primeiro emprego” deles, é?\n" +
                Espaco() +
                "F. SILVA: O senhor promete que vai revisar nossos pontos?\n" +
                Espaco() +
                Jogador() + ": É claro!\n" +
                Espaco() +
                "F. SILVA: Jura com a vida?\n" +
                Espaco() +
                "Eu não me importo tanto com isso quanto você parece imaginar…\n\n";
    }

    private static String Jogador() {
        return "[" + player.getNome() + "]";
    }

    private static String Espaco(){
        return "——>\n";
    }
}
