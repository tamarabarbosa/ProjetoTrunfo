/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trunfo;

import trunfo.Carta;
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
public class CartaTest {
    private Deck umDeck;
    Carta umaCarta = new Carta(umDeck,"Nome da Carta",3,3,3,3,3);
    
    private final int intel = 0;
    
    public CartaTest() {
        
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
     * Test of setInteligencia method, of class Carta.
     */
   // @Test
    public void testSetInteligencia() {
        umaCarta.setInteligencia(9);
        assertEquals(1,umaCarta.getInteligencia());
    }
    /**
     * Test of criaCarta method, of class Carta.
     */
    @Test
    public void testCriaCarta() {
        Carta outraCarta = umaCarta;
        if ((umaCarta instanceof Carta)&& (outraCarta instanceof Carta)) {
            assertEquals(umaCarta,outraCarta);
        } 
        
        else {
            fail();
        }
    }
    /**
     * Test of getAtributo method, of class Carta.
     */
    @Test
    public void testGetAtributo() {
        assertEquals(3,umaCarta.getAtributo(1));
        assertEquals(3,umaCarta.getAtributo(15));
    }
    
}
