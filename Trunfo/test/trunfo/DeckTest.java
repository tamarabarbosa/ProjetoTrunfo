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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of deckAleatorio method, of class Deck.
     */
    @Test
    public void testDeckAleatorio() {
        System.out.println("deckAleatorio");
        Deck instance = new Deck();
        instance.deckAleatorio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTodasCartas method, of class Deck.
     */
    @Test
    public void testGetTodasCartas() {
        System.out.println("getTodasCartas");
        Deck instance = new Deck();
        Carta[] expResult = null;
        Carta[] result = instance.getTodasCartas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtributo method, of class Deck.
     */
    @Test
    public void testGetAtributo() {
        System.out.println("getAtributo");
        int posicao = 0;
        int atributo = 0;
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getAtributo(posicao, atributo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Jogador jogador = null;
        Deck instance = new Deck();
        int[] expResult = null;
        int[] result = instance.getDeck(jogador);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeck method, of class Deck.
     */
    @Test
    public void testSetDeck() {
        System.out.println("setDeck");
        int[] cartas = null;
        Jogador jogador = null;
        Deck instance = new Deck();
        instance.setDeck(cartas, jogador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTam method, of class Deck.
     */
    @Test
    public void testGetTam() {
        System.out.println("getTam");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.getTam();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCartas method, of class Deck.
     */
    @Test
    public void testMostrarCartas() {
        System.out.println("mostrarCartas");
        int[] cartas = null;
        Deck instance = new Deck();
        instance.mostrarCartas(cartas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCarta method, of class Deck.
     */
    @Test
    public void testMostrarCarta() {
        System.out.println("mostrarCarta");
        int posicao = 0;
        Deck instance = new Deck();
        instance.mostrarCarta(posicao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
