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
    
    public JogadorUsuario() { 
        super(); 
    }

    public JogadorUsuario(String nome) {
        super(nome);
    }
    
    @Override
    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }
    
    public JogadorUsuario(String nome, int idade, int[] deck){ 
        super(nome, deck); 
    }  
}
