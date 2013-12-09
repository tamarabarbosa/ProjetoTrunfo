/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trunfo;

/**
 *
 * @author tamara
 */
public final class JogadorUsuario extends Jogador {

    private int idade; 
    public JogadorUsuario() { 
        super(); 
        this.setIdade(0); 
    }

    public JogadorUsuario(String nome) {
        super(nome);
    }
    
    public JogadorUsuario(String nome, int idade) { 
        super(nome); 
        this.setIdade(idade); 
    } 
    public JogadorUsuario(String nome, int idade, int[] deck){ 
        super(nome, deck); 
        this.setIdade(idade); 
    } 
      
    /*public void setNomeDoJogador(String nomeDoJogador) { 
        this.setNomeDoJogador(nomeDoJogador) ; 
    }*/
      
    public int getIdade() { 
        return idade; 
    } 
  
    public void setIdade(int idade) { 
        this.idade = idade; 
    } 
}
