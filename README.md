# SuperTrunfo
Breve início sobre o famoso jogo de cartas Super Trunfo.

Neste exercício foi o início da implementação de algumas classes para o projeto final do curso de Programação Orientada a Objetos. 

Na classe Carta, temos uma primeira versão, O método toString() deve mostrar o código seguido do nome, concatenados por "| ". Na classe Jogador, o monte deverá ser inicializado na distribuição.

## Regras para os métodos da classe Baralho:

● Baralho(tema: String) - construtor que serve para configurar o tema do baralho;

● embaralhar () - embaralhar as Cartas usando o Collections .shuffle();

● listarCartas () - Um simples atalho para System.out .println(this);

● pegarDoTopo (): Carta - método que verifica se ainda há cartas em um Baralho e, se houver, retira a carta do topo.

● carregar() - responsável por adicionar (this.add) os objetos Cartas, que devem ser

construídos dentro dele, de acordo com o tema configurado no construtor. Crie pelo menos
2 temas para poder demonstrar o uso deste método e ao menos 8 cartas de exemplo;

● distribuir (jogadores: Jogador[]) - este é o método mais complexo, que deve
inicializar os montes de cada jogador. 

Os montes começarão vazios, mas devem ser preenchidos removendo-se as cartas do Baralho atual. A distribuição deve ser feita
alternando-se uma carta para cada monte, como se estivesse sendo feita em uma mesa de cartas. Ao final da rotina, o Baralho estará vazio;



