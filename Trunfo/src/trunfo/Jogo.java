/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trunfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author tamara
 */
public final class Jogo {
	private static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	private Deck deck;
	private JogadorUsuario player;
	private JogadorVirtual computador=new JogadorVirtual();
	

	public Jogo() {
            this.deck = new Deck();
            this.player = new JogadorUsuario(Jogo.Nome());
            this.opcaoMenu();
		
            final int cartasJU[] = player.getDeck();
            for(int i = 0; i<cartasJU.length; i++){
                System.out.print(cartasJU[i]+"  ");
            }
		System.out.println();
		final int cartasJV[]=computador.getDeck();
		for(int i = 0; i<cartasJV.length; i++){
			System.out.print(cartasJV[i]+"  ");
		}
		System.exit(0);
	}
	
	private static String Nome(){
		String nome="";
		while(true){
			try{
				System.out.println("Digite seu nome:");
				nome= Jogo.bufferRead.readLine();
				
			}catch(NullPointerException nullPointerException){
			
				System.exit(0);
			}catch(IOException iOException){
				iOException.printStackTrace();
			}finally{
				
			}
			if(nome==null){
				System.exit(0);
			}else if(nome.length()==0){
				continue;
			}else{
				break;
			}
		}
		return nome;
	}
        
	public void opcaoMenu(){
		
		boolean validarMenu = true;
		int opcaoSair = 0;
		while(validarMenu){
			String opcao=null;
			Jogo.menu();
			try{
				System.out.println("Digite a opção desejada:");
				opcao=Jogo.bufferRead.readLine();
				fakeClear();
			}catch(IOException iOException){
				iOException.printStackTrace();
			}catch(NullPointerException nullPointerException){
				opcao="a";
			}if(opcao==null)continue;
			
			switch(opcao){
				case "1":
					this.jogar();
					/*Funcionamento do jogo:
					 * 1)Embaralhar e distribuir as cartas.
					 * 2)Somente a primeira carta pode ser vista.
					 * 3)Um jogador escolhe o atributo até perder.
					 * 4)Quando ganha, sede a carta ao adversário.
					 * */
					break;
				case "2":
					instrucoes();
					continue;
				case "3":
					try{
						System.out.println("Selecione a dificuldade:\n1)Fácil\n2)Difícil");
						opcao=Jogo.bufferRead.readLine();
						if(opcao.equals("1") || opcao.equals("2")){
							if(opcao.equals("2")){
								JogadorVirtual.setDificuldade("Difícil");
							}
						}else continue;
						fakeClear();
					}catch(IOException iOException){
						iOException.printStackTrace();
					}catch(java.lang.NullPointerException nullPointerException){
						opcao="a";
					}
					validarMenu=true;
					break;
				case "0":
					try{
						System.out.println("Deseja mesmo sair do jogo ?(0 para sair)");
						opcaoSair=Integer.parseInt(Jogo.bufferRead.readLine());
					}catch(IOException iOException){
						iOException.printStackTrace();
						continue;
					}catch(NumberFormatException numberFormatException){
						continue;
					}if(opcaoSair==0){
						System.exit(0);
					}
					else{
						continue;
					}
					break;
				default:
					System.out.println("Opção inválida! Digite novamente.");
					continue;
			}
		}	
	}
	public static void instrucoes(){
                System.out.println("Trunfo:");
		System.out.println("Instruções:");
		System.out.println("A cada rodada, o jogador que ganhou a ultima rodada escolhe o atributo da carta que será utilizado na disputa.");
		
		
	}
	public static void menu(){
		System.out.println("1) Jogar");
		System.out.println("2) Instruções");
		System.out.println("3) Dificuldade("+JogadorVirtual.getDificuldade()+")");
		System.out.println("0) Sair");
	}
        
	public Deck getDeck() {
		return deck;
	}
	private void fakeClear(){
		for(int i=0; i<30; i++){
			System.out.println();
		}
	}
	public void jogar(){
		this.player.setDeckCartas(this.deck.getDeck(player));
		this.computador = new JogadorVirtual(deck.getDeck(this.computador));
		System.out.println("Meu nome é "+this.computador.getNomeDoJogador()+"!\n"+computador.getFraseDeApresentacao());
		int numVit=0;//numero de Vitórias
		int numPer=0;//numero de Derrotas
		int opcaoAtributo;
		boolean escolha=true;
		
		while(numVit==0){
			for(int i = 0;i<computador.getDeck().length;i++){
				deck.mostrarCarta(deck.getDeck(player)[i]);
				if(escolha){
					do{
						System.out.println("Digite o atributo que deseja comparar\n1) Forca 2) Velocidade 3) Habilidade 4) Equipamento 5) Inteligencia: ");
						try{
							opcaoAtributo=Integer.parseInt(Jogo.bufferRead.readLine());
							break;
						}catch(IOException e){
							e.printStackTrace();
							continue;
						}catch(NumberFormatException numberFormatException){
							continue;
						}
					}while(true);
				}else{
					opcaoAtributo=computador.escolheAtributo(deck,deck.getDeck(computador)[i]);
				}
				deck.mostrarCarta(deck.getDeck(computador)[i]);
				System.out.println("Atributo(Carta de "+computador.getNomeDoJogador()+")"+": "+deck.getAtributo(deck.getDeck(computador)[i], opcaoAtributo));
				System.out.println("Atributo(Sua carta): "+deck.getAtributo(deck.getDeck(player)[i], opcaoAtributo)+"\n\n");
				if(this.deck.getAtributo(deck.getDeck(player)[i], opcaoAtributo)>deck.getAtributo(deck.getDeck(computador)[i], opcaoAtributo)){
					System.out.println("Voce ganhou!");
					numVit++;
					escolha=true;
				}else if(this.deck.getAtributo(deck.getDeck(player)[i], opcaoAtributo)<deck.getAtributo(deck.getDeck(computador)[i], opcaoAtributo)){
					System.out.println("Voce perdeu!");
					numPer++;
					escolha=false;
				}else{
					System.out.println("Foi um empate.");
				}
				System.out.println("Vitórias: ("+numVit+"/"+(i+1)+")");
				System.out.println("Próxima rodada!");
				try{
					Jogo.bufferRead.readLine();
				}catch(IOException iOException){
					continue;
				}
			}
			if(numVit-numPer>0){
				System.out.println("Voce ganhou o jogo!");
			}else if(numVit-numPer<0){
				System.out.println("Voce perdeu o jogo!");
			}else{
				System.out.println("Partida terminou empatada! \nDeseja jogar novamente? 1)Sim 2)Não");
				do{
					try{
						switch(Jogo.bufferRead.readLine()){
						case "1":
							numVit=0;
							break;
						case "2":
							break;
						default:
							System.out.println("Digite um valor válido.");
							continue;
						}
					}catch(IOException e){
						e.printStackTrace();
						continue;
					}
				}while(true);
			}
		}
	}
    
}
