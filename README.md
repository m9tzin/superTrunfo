# superTrunfo
Breve início sobre o famoso jogo de cartas Super Trunfo.
Neste exercício foi o início da implementação de
algumas classes para o projeto final do curso de Programação Orientada a Objetos.
Na classe Carta, temos uma primeira versão, O método
toString deve mostrar o código seguido do
nome, concatenados por "| ". Na classe
Jogador, o monte deverá ser inicializado na
distribuição.

Regras para os métodos da classe Baralho:
● Baralho(tema: String) - construtor que serve para configurar o tema do baralho;
● embaralhar () - embaralhar as Cartas usando o Collections .shuffle();
● listarCartas () - Um simples atalho para System.out .println(this);
● pegarDoTopo (): Carta - método que verifica se ainda há cartas em um Baralho e, se
houver, retira a carta do topo.
● carregar() - responsável por adicionar (this.add) os objetos Cartas, que devem ser
construídos dentro dele, de acordo com o tema configurado no construtor. Crie pelo menos
2 temas para poder demonstrar o uso deste método e ao menos 8 cartas de exemplo;
● distribuir (jogadores: Jogador[]) - este é o método mais complexo, que deve
inicializar os montes de cada jogador. Os montes começarão vazios, mas devem ser
preenchidos removendo-se as cartas do Baralho atual. A distribuição deve ser feita
alternando-se uma carta para cada monte, como se estivesse sendo feita em uma mesa de
cartas. Ao final da rotina, o Baralho estará vazio;

A classe principal foi pré-definida:
public class Principal {
public static void main(String[] args) {
String tema = "Naruto" ; // Insira aqui um tema de sua preferência.
Jogador jogador1 = new Jogador("Aaaa");
Jogador jogador2 = new Jogador("Bbbb");
Baralho superTrunfo = new Baralho(tema);
System.out .println("Baralho carregado com o tema " + tema + ":");
superTrunfo. carregar ();
superTrunfo. listarCartas ();
System.out .println("\nBaralho embaralhado:" );
superTrunfo. embaralhar ();
superTrunfo. listarCartas ();
superTrunfo. distribuir ( new Jogador[]{ jogador1, jogador2 });
System.out .println("\nMonte do primeiro jogador:" );
jogador1. getMonte ().listarCartas ();
System.out .println("\nRetirando a carta do topo do monte do primeiro
jogador:" );
System.out .println(jogador1. getMonte ().pegarDoTopo ());
}
} 6
