/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trunfo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tamara
 */
public class Deck {
    
   /* private ArrayList<Carta> todasCartas = new ArrayList<Carta>();
    Carta A1 = new Carta(this,"Homem de Ferro", 5, 6,2,5,6);
    Carta A2 = new Carta(this,"Capitão América",3,2,6,2,3);
    Carta A3 = new Carta(this,"Thor",6,5,3,3,2);
    Carta A4 = new Carta(this,"Hulk",6,5,4,1,1);
    Carta A5 = new Carta(this,"Nick Fury",1,2,4,6,3);
    Carta A6 = new Carta(this,"Viúva Negra",1,2,6,4,3);
    Carta B1 = new Carta(this,"Gavião Arqueiro",1,1,6,5,2);
    Carta B2 = new Carta(this,"Agente Hili",1,1,4,5,3);
    Carta B3 = new Carta(this,"Agente Coulson",1,1,3,5,2);
    Carta B4 = new Carta(this,"Tony Stark",1,1,1,5,6);
    Carta B5 = new Carta(this,"Bruce Banner",1,1,1,3,6);
    Carta B6 = new Carta(this,"Loki",5,4,4,5,5);
    Carta C1 = new Carta(this,"Chitauri",2,1,2,3,1);
    Carta C2 = new Carta(this,"Leviathan",5,5,1,5,1);
    Carta C3 = new Carta(this,"Caveira Vermelha",3,2,4,4,3);
    Carta C4 = new Carta(this,"Soldados Hidra",2,1,2,4,2);
    Carta C5 = new Carta(this,"Cicote Negro",2,2,3,4,6);
    Carta C6 = new Carta(this,"Monge de Ferro",5,4,2,5,4);
    Carta D1 = new Carta(this,"Gigante de Gelo",4,3,3,2,2);
    Carta D2 = new Carta(this,"Abominavel",6,3,3,1,3);
    Carta D3 = new Carta(this,"Heimdall",4,3,3,3,2);
    Carta D4 = new Carta(this,"Emil Blonsk",2,3,5,2,3);
    Carta D5 = new Carta(this,"Howard Stark",1,1,2,4,6);
    Carta D6 = new Carta(this,"War Machine",5,5,2,5,3);
    Carta E1 = new Carta(this,"Homem de Ferro - Mark V",5,4,2,4,6);
    Carta E2 = new Carta(this,"Odin",5,2,1,6,6);
    Carta E3 = new Carta(this,"Sif",4,2,4,3,3);
    Carta E4 = new Carta(this,"Dum Dum Dugan",1,2,3,2,2);
    Carta E5 = new Carta(this,"Bucky Barnes",1,2,3,3,3);
    Carta E6 = new Carta(this,"Destruidor",6,4,3,3,1);
    
    todasCartas.add(A1);
    todasCartas.add(A2);
    todasCartas.add(A3);
    todasCartas.add(A5);
    todasCartas.add(A6);
    todasCartas.add(B1);
    todasCartas.add(B2);
    todasCartas.add(B3);
    todasCartas.add(B4);
    todasCartas.add(B5);
    todasCartas.add(B6);
    todasCartas.add(C1);
    todasCartas.add(C2);
    todasCartas.add(C3);
    todasCartas.add(C4);
    todasCartas.add(C5);
    todasCartas.add(C6);
    todasCartas.add(D1);
    todasCartas.add(D2);
    todasCartas.add(D3);
    todasCartas.add(D4);
    todasCartas.add(D5);
    todasCartas.add(D6);
    todasCartas.add(E1);
    todasCartas.add(E2);
    todasCartas.add(E3);
    todasCartas.add(E4);
    todasCartas.add(E5);
    todasCartas.add(E6); */
    
    private final Carta[] todasCartas = {
    new Carta(this,"Homem de Ferro", 5, 6,2,5,6),
    new Carta(this,"Capitão América",3,2,6,2,3),
    new Carta(this,"Thor",6,5,3,3,2),
    new Carta(this,"Hulk",6,5,4,1,1),
    new Carta(this,"Nick Fury",1,2,4,6,3),
    new Carta(this,"Viúva Negra",1,2,6,4,3),
    new Carta(this,"Gavião Arqueiro",1,1,6,5,2),
    new Carta(this,"Agente Hili",1,1,4,5,3),
    new Carta(this,"Agente Coulson",1,1,3,5,2),
    new Carta(this,"Tony Stark",1,1,1,5,6),
    new Carta(this,"Bruce Banner",1,1,1,3,6),
    new Carta(this,"Loki",5,4,4,5,5),
    new Carta(this,"Chitauri",2,1,2,3,1),
    new Carta(this,"Leviathan",5,5,1,5,1),
    new Carta(this,"Caveira Vermelha",3,2,4,4,3),
    new Carta(this,"Soldados Hidra",2,1,2,4,2),
    new Carta(this,"Cicote Negro",2,2,3,4,6),
    new Carta(this,"Monge de Ferro",5,4,2,5,4),
    new Carta(this,"Gigante de Gelo",4,3,3,2,2),
    new Carta(this,"Abominavel",6,3,3,1,3),
    new Carta(this,"Heimdall",4,3,3,3,2),
    new Carta(this,"Emil Blonsk",2,3,5,2,3),
    new Carta(this,"Howard Stark",1,1,2,4,6),
    new Carta(this,"War Machine",5,5,2,5,3),
    new Carta(this,"Homem de Ferro - Mark V",5,4,2,4,6),
    new Carta(this,"Odin",5,2,1,6,6),
    new Carta(this,"Sif",4,2,4,3,3),
    new Carta(this,"Dum Dum Dugan",1,2,3,2,2),
    new Carta(this,"Bucky Barnes",1,2,3,3,3),
    new Carta(this,"Destruidor",6,4,3,3,1),
    };
    
    private final int DIM = todasCartas.length;
	private final int TAM = todasCartas.length/2;
	private int[] deckJ = new int[TAM];
	private int[] deckJV = new int[TAM];
	
	public Deck(){
		this.deckAleatorio();
	}

	public void deckAleatorio(){
		/* Gera [deckJ.length] posições aleatórias de cartas do vetor 
		 * todasCartas (DIM).
		 * Armazena essas posições no vetor deckJ */
		for(int i = 0 ; i < this.deckJ.length ; i++){
			this.deckJ[i] = (( int ) ( Math.random() * DIM));
			for(int y = 0 ; y < i ; y++){
				
				if(deckJ[i] == deckJ[y]){
					this.deckJ[i] = (( int ) ( Math.random() * DIM));
					y = -1;
				}else{
					continue;
				}
			}
		}
		//this.deckJ=this.embaralharDeck(deckJ);
		this.deckAleatorio(deckJ);
	}
	
	private void deckAleatorio(final int[] cartas){
		boolean cartaExiste=false;
		for(int i = 0, j=0 ; (i < todasCartas.length) || (j>=TAM) ; i++){
			for(int y=0; y < deckJ.length; y++){
					if(cartaExiste=(cartas[y]==i)){
						/* Se a carta ja existir em algum deck, a varredura
						 *  do vetor de cartas(o deck)é interrompida e 
						 *  cartaExiste passa a ser verdade. 
						 *  Se (deckJV[y] == i) for falso para todos os [y]
						 *  casos, o valor (i) será atribuido a posição [j]
						 *  do vetor deckJV. A variavel de controle de 
						 *  posição (j), é incrementada em seguida.
						 */
						break;
					}else{
						continue;
					}
			}
			if(cartaExiste==false){
				deckJV[j] = i;
				if(j<TAM-1){
					/* Se [j+1] for um valor valido de posição para o vetor
					 * deckJV (j<deckJV.length), j é incrementado.
					 * */
					j++;
				}
			}
		}
		this.deckJV=embaralharDeck(this.deckJV);
	}
	private int[] embaralharDeck(final int[] deck){
		int decke[]=new int[deck.length];
		for(int i = 0 ; i <deck.length ; i++){
			decke[i] = deck[(( int ) ( Math.random() * deck.length))];
			for(int y = 0 ; y < i ; y++){
				if(decke[i] == decke[y]){
					decke[i] = deck[(( int ) ( Math.random() * deck.length))];
					y = -1;
				}else{
					continue;
				}
			}
		}
		return decke;
	}
	
	public final Carta[] getTodasCartas() {
		//Poderemos optar por passar todos os atributos de todasCartas;
		//ou passar apenas o nome das cartas.
		return todasCartas;
	}
	
	public int getAtributo(final int posicao, final int atributo){
		if(posicao>=0 && posicao<this.todasCartas.length){
			return todasCartas[posicao].getAtributo(atributo);
		}else{
			System.out.println("Não existe!");
			return 0;
		}
	}
	
	public int[] getDeck(final Jogador jogador) {
		if(jogador instanceof JogadorVirtual){
			return deckJV;
		}else{
			return deckJ;
		}
	}
	
	public void setDeck(final int[] cartas, final Jogador jogador) {
            if(jogador instanceof JogadorVirtual){
                return;
            }
            else{
                for(int i = 0 ; i < TAM ; i++){
                    this.deckJ[i] = cartas[i];
		}
		this.deckAleatorio(deckJ);
            }
        }
	
	public int getTam() {
		return TAM;
	}

	public void mostrarCartas(final int[] cartas){
		for(int i =0; i<cartas.length;i++){
			
			System.out.println("\n\nNome: "+todasCartas[cartas[i]].getNomeCarta()+"\nForça: "
					+todasCartas[cartas[i]].getForca()+"\nVelocidade: "+todasCartas[cartas[i]].getVelocidade()
					+"\nHabilidade: "+todasCartas[cartas[i]].getHabilidade()+"\nEquipamento: "
					+todasCartas[cartas[i]].getEquipamento()+ "\nInteligencia: "+todasCartas[cartas[i]].getInteligencia()
					+"\n");
			
		}
	}
	public void mostrarCarta(int posicao){
		System.out.println("\n\nNome: "+todasCartas[posicao].getNomeCarta()+"\nForça: "
                                    +todasCartas[posicao].getForca()+"\nVelocidade: "+todasCartas[posicao].getVelocidade()
                                    +"\nHabilidade: "+todasCartas[posicao].getHabilidade()+"\nEquipamento: "
                                    +todasCartas[posicao].getEquipamento()+ "\nInteligencia: "+todasCartas[posicao].getInteligencia()
                                    +"\n");
	}
}    

   /* public ArrayList<Carta> getTodasCartas() {
        return todasCartas;
    }
   
    
    public ArrayList<Integer> gerarOrdem(){
        ArrayList<Integer> ordem = new ArrayList<Integer>();
        Random aleatorio = new Random();
        int numero=Math.abs(aleatorio.nextInt()%30);
        while (ordem.size()!=30){
            numero = Math.abs(aleatorio.nextInt()%30);
            if (!ordem.contains(numero)){
                ordem.add(numero);
            }
        }
        return ordem;
    }
    */
    

