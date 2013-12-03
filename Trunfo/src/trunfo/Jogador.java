/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trunfo;

/**
 *
 * @author tamara
 */
public class Jogador {
    private final static int TAM=30;
	public String nomeDoJogador;
	private int deckCartas[]= new int[TAM];
	protected static String dificuldade = "fácil";
	
	public Jogador() {
		this.nomeDoJogador="Sem nome";
		for(int i=0; i<TAM;i++)this.deckCartas[i]=0;
	}
	public Jogador(String nome) {
		this.nomeDoJogador=nome;
		for(int i=0; i<TAM;i++)this.deckCartas[i]=0;
	}
	public Jogador(String nome, int[] deck) {
		this.nomeDoJogador=nome;
		this.deckCartas=deck;
	}
	public final String getNomeDoJogador() {
		return nomeDoJogador;
	}
	public void setNomeDoJogador(String nomeDoJogador) {
		this.nomeDoJogador = nomeDoJogador;
	}
	public int[] getDeck() {
		return deckCartas;
	}
	public void setDeckCartas(int[] deckCartas) {
		this.deckCartas = deckCartas;
	}
	public static void setDificuldade(String dif){
		if(dif.equalsIgnoreCase("dificil") || dif.equalsIgnoreCase("difícil")){
			Jogador.dificuldade="Difícil";
		}else Jogador.dificuldade="Fácil";
	}
	public static String getDificuldade(){
		return Jogador.dificuldade;
	}
}
