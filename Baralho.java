import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Baralho extends LinkedList<Carta> {
	private String tema;

	public Baralho(String tema) {
		
		this.setTema(tema);
		
	}
	
	public void carregar() {
		switch(tema) {
		case "Naruto":
			this.add(new Carta("Uchiha Madara", "A1"));
			this.add(new Carta("Namikaze Minato", "A2"));
			this.add(new Carta("Uchiha Itachi", "A3"));
			this.add(new Carta("Naruto Uzumaki", "A4"));
			this.add(new Carta("Jiraya", "B1"));
			this.add(new Carta("Kakashi Hatake", "B2"));
			this.add(new Carta("Obito", "B3"));
			this.add(new Carta("Pain", "B4"));
		break;
		case "Carros":
			this.add(new Carta("Porsche 911", "A1"));
			this.add(new Carta("Pagani Zonda", "A2)"));
			this.add(new Carta("Lexus LS 430", "A3)"));
			this.add(new Carta("Ferrari 550 Maranello", "A4)"));
			this.add(new Carta("BMW 745i", "B1)"));
			this.add(new Carta("FIAT Mobi", "B2)"));
			this.add(new Carta("Uno", "B4"));
		break;
			
		}
	}
	public void embaralhar() {
		Collections.shuffle(this);
	}
	public void distribuir(Jogador[] jogadores) {
		int jogador = 0;
		Iterator<Carta> iterator = this.iterator();
		
		while(iterator.hasNext()) {
			if (jogadores[jogador].getMonte() == null) {
				jogadores[jogador].setMonte(new Baralho(this.tema));
			}
		
			jogadores[jogador].getMonte().add(iterator.next());
			iterator.remove();
			
			jogador=(jogador+1)%jogadores.length; // Ideia de looping sem incremento.
		
		}
	}
	public void listarCartas() {
		System.out.println(this);
	}
	public Carta pegarDoTopo() {
		if(this.peekLast()!=null) {
			return this.pollLast();
		}
			
		System.out.println("Não há cartas o suficiente");
		return null;
		}
		

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
}
