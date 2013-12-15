/*---
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trunfo;

/**
 *
 * @author tamara
 */
public class JogadorVirtual extends Jogador{
    
	private final static String[] nomes = {
		"André", "Áquilla","Alex","Alexandre","Allan","Anderson","Bruno",
		"Lucas","Eliseu", "Rodrigo","Matheus","Gabriel","Rafael","Igor", 
		"Felipe","Paulo","Antônio","Jefferson", "João", "Marcos",
		"Simião","Denis", "Cássio", "Rogério", "Carlos", "Élio", "Giovanni",
		"George", "Luciano", "Renan", "Luís",  "Edson","Marcus", "Vinicius",
		"Berto","Cristiano","Henrique", "Evaristo", "Iuri", "Joabe", 
		"Otavio", "Patrick","Ruan", "Ramon", "Thales", "Thiago", "Daniel",
		"Fausto", "Érico", "Leonn", "Calvin", "Junior", "Charlie", "David",
		"William", "Justin", "Steven","Sebastião", "Jorge", "Jonnes", "Juca",
		"Rubens", "Ozi", "Ivan", "Psy", "Newton", "Harry", "Galileu",
		"Elias", "Aristoteles", "Sóstenes", "Vitor", "Victor", "Hugo", 
		"Sanchez", "Roberto", "Ricardo", "Augusto", "Eduardo", "Athos",
		"Adson", "Elcio", "Jesus", "Golias", "Moizes", "Matias", "Rivaldo",
		"Leandro", "Leonardo", "Cleiton", "Gustavo", "Mendes", "Inácio",
		"Bosco", "Raifran", "Frederico", "Fred", "Francisco", "Joaquim",
		"Moacir", "Jason", "José", "Josué", "Luann", "Joca", "Romenigue",
		"Jack", "Bruce", "Samuel", "Murilo", "Mauro", "Maurilio", "Pedro",
		"Diogo", "Ésdras", "Cauã", "Caique", "Caio", "Manoel", "Manuel",
		"Severino", "Antenor", "Guilherme", "Cezar", "Diego", "Júlio",
		"Juliano", "Marcelo", "Lucio", "Ronaldo", "Milton", "Jean", 
		"Janio", "Oscar", "Fábio", "Fabrício", "Mario", "Sergio", "Eloir",
		"Henrico", "Edivaldo", "Cristovão", "Emanuel", "Lauro", "Italo",
		"Gomes","Nivaldo", "Mauricio", "Yan", "Miguel", "Emerson",
		"Ana", "Alana", "Beatriz", "Bruna", "Aline", "Alice", "Analice",
		"Amanda", "Maria", "Cristina","Cristiane", "Madalena", "Helena", 
		"Jane", "Sophia", "Clara", "Jennifer", "Evelyn", "Edilaine", "Laís",
		"Lilian", "Naiara", "Nayanne", "Thainara", "Thais", "Tifany", 
		"Lorrane", "Stephanie", "Raissa", "Lorena", "Cristal", "Linda",
		"Walkiria", "Luiza", "Larissa", "Luciana", "Iara", "Morgana", 
		"Flavia", "Livia", "Gláucia", "Roberta", "Andréia", "Carol",
		"Carolina", "Caroline", "Luma", "Pamela", "Kelly", "Lúcia", "Luanny",
		"Letícia", "Natalia", "Tainá", "Luciene", "Ludmille", "Ludmila",
		"Camila", "Polyanna", "Ingrid", "Thayza", "Jessica", "Regina", 
		"Hellen", "Marcela", "Miryan", "Raquel", "Deusiane", "Francisca",
		"Eduarda", "Simone", "Thamires", "Giula", "Gilda", "Samantha",
		"Wanessa", "Bianca", "Gabriela", "Marina", "Jaqueline", "Melliana",
		"Ianara", "Julianna", "Fabiana", "Jayana", "Lidiane", "Debora",
		"Aléxia", "Paula", "Daniela", "Sumarli", "Carla", "Bianca", "Rita",
		"Ayla", "Danyara", "Ketlen", "Natalia", "Myllka", "Caroline", 
		"Juliana", "Nathália", "Jakeline", "Andrea", "Wendy", "Elaine", 
		"Gabriela", "Tainá", "Késia", "Bárbara", "Viviane", "Elora",
		"Vanessa", "Lara", "Sabrina", "Isabela", "Adriana", "Claudia",
		"Márcia", "Sarah", "Flavia", "Tereza", "Isabel", "Sinara", "Willa",
		"Dadine", "Suzana", "Dáfne", "Patricia", "Yasmin", "Tayssa",
		"Maíra", "Myrella", "Renata", "Luana", "Mariana", "Leila", 
		"Iria", "Thalita", "Samara", "Priscila","Ivaldino","Kaísa", "Thabata"};
        
        private final String[] fraseDeApresentacao={
		"Eu serei seu oponente!","Você não tem a minima chance de vencer!", "Bom jogo",
		"Espero uma partida amistosa!", "Onde está meu oponente?", "Boa sorte",
		"Chamem alguem do meu nível!", "Vamos brincar?", "Estou vendo que vou me divertir hoje!",
		"É melhor você desistir!", "Essa partida vai ser fácil!", "Deixe isso para os proficionais!",
		"Vou te mostrar como é que se joga!"
	};
	
	public JogadorVirtual() {
		this.setNomeDoJogador();
	}
	
	public JogadorVirtual(int[] cartasDeJogador){
		this.setDeckCartas(cartasDeJogador);
		this.setNomeDoJogador();
	}
	
	@Override
	public void setNomeDoJogador(){
            this.setNomeDoJogador(nomes[((int)( Math.random() * nomes.length))]); 
	}
        
        @Override
        public void setNomeDoJogador(String nomeDoJogador) {
            this.nomeDoJogador = nomeDoJogador;
        }
        
        public String getFraseDeApresentacao(){
		return this.fraseDeApresentacao[((int)( Math.random() * fraseDeApresentacao.length))]; 
	}
        
    public int escolheAtributo(Deck deck, int posicao){
	int atributo=0;
	int escolhido=0;
	if(Jogador.dificuldade.equalsIgnoreCase("Difícil")){
            for(int i=0; i<6;i++){
		if(deck.getAtributo(posicao, i)>atributo){
                    atributo=deck.getAtributo(posicao, i);
                    escolhido=i;
		}
            }
	}
        else{
            escolhido=(int)(Math.random() *4)+1;
	}
	return escolhido;
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