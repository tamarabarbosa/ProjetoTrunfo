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
        System.out.println("setNomeDoJogador");
        JogadorVirtual instance = new JogadorVirtual();
        instance.setNomeDoJogador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeDoJogador method, of class JogadorVirtual.
     */
    @Test
    public void testSetNomeDoJogador_String() {
        System.out.println("setNomeDoJogador");
        String nomeDoJogador = "";
        JogadorVirtual instance = new JogadorVirtual();
        instance.setNomeDoJogador(nomeDoJogador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFraseDeApresentacao method, of class JogadorVirtual.
     */
    @Test
    public void testGetFraseDeApresentacao() {
        System.out.println("getFraseDeApresentacao");
        JogadorVirtual instance = new JogadorVirtual();
        String expResult = "";
        String result = instance.getFraseDeApresentacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escolheAtributo method, of class JogadorVirtual.
     */
    @Test
    public void testEscolheAtributo() {
        System.out.println("escolheAtributo");
        Deck deck = null;
        int posicao = 0;
        JogadorVirtual instance = new JogadorVirtual();
        int expResult = 0;
        int result = instance.escolheAtributo(deck, posicao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDificuldade method, of class JogadorVirtual.
     */
    @Test
    public void testSetDificuldade() {
        System.out.println("setDificuldade");
        String dif = "";
        JogadorVirtual.setDificuldade(dif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDificuldade method, of class JogadorVirtual.
     */
    @Test
    public void testGetDificuldade() {
        System.out.println("getDificuldade");
        String expResult = "";
        String result = JogadorVirtual.getDificuldade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
