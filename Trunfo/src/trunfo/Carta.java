/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trunfo;

/**
 *
 * @author tamara
 */
public class Carta {
    private String nomeCarta;
    private int forca;
    private int velocidade;
    private int habilidade;
    private int equipamento;
    private int inteligencia;
    private static Deck deck=null;

    public String getNomeCarta() {
        return nomeCarta;
    }

    public void setNomeCarta(String nomeCarta) {
        this.nomeCarta = nomeCarta;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca<=1 || forca>6 )
            this.forca = 1;
        else
            this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade<=1 || velocidade>6 )
            this.velocidade = 1;
        else
            this.velocidade = velocidade;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        if (habilidade<=1 || habilidade>6 )
            this.habilidade = 1;
        else
            this.habilidade = habilidade;
    }

    public int getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(int equipamento) {
        if (equipamento<=1 || equipamento>6 )
            this.equipamento = 1;
        else
            this.equipamento = equipamento;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if (inteligencia<=1 || inteligencia>6 )
            this.inteligencia = 1;
        else
            this.inteligencia = inteligencia;
    }

    public static Deck getDeck() {
        return deck;
    }
    
    
    
}
