
public class Principal {

	public static void main(String[] args) {
		String tema = "Naruto";
		Jogador jogador1 = new Jogador("Indra");
		Jogador jogador2 = new Jogador("Ashura");
		Baralho superTrunfo = new Baralho(tema);
		
		System.out.println("Baralho carregado com o tema " + tema + ":");
		superTrunfo.carregar();
		superTrunfo.listarCartas();
		
		System.out.println("\nBaralho embaralhado:");
		superTrunfo.embaralhar();
		superTrunfo.listarCartas();
		
		superTrunfo.distribuir(new Jogador[]{jogador1, jogador2});
		System.out.println("\nMonte do primeiro jogador:");
		jogador1.getMonte().listarCartas();
		
		System.out.println("\nRetirando a carta do topo do monte do primeiro jogador:");
		System.out.println(jogador1.getMonte().pegarDoTopo());
		
		
		
		
	}

}
