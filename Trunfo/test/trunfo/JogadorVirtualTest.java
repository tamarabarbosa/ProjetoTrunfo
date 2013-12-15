/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trunfo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ina Tayane
 */
public class JogadorVirtualTest {
    JogadorVirtual umJogador = new JogadorVirtual();
    
    public JogadorVirtualTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setNomeDoJogador method, of class JogadorVirtual.
     */
    @Test
    public void testSetNomeDoJogador_0args() {
        umJogador.setNomeDoJogador();
        for (int i = 0; i < JogadorVirtual.nomes.length; i++) {
            if(umJogador.getNomeDoJogador() == JogadorVirtual.nomes[i])
                assertEquals(JogadorVirtual.nomes[i],umJogador.getNomeDoJogador());
        }
    }
    /**
     * Test of getFraseDeApresentacao method, of class JogadorVirtual.
     */
    @Test
    public void testGetFraseDeApresentacao() {
        String frase = umJogador.getFraseDeApresentacao();
        for (int i = 0; i < JogadorVirtual.fraseDeApresentacao.length; i++) {
            if (frase == JogadorVirtual.fraseDeApresentacao[i])
                assertEquals(JogadorVirtual.fraseDeApresentacao[i],frase);        
        }
    }  
}
