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
public class JogoTest {
    
    public JogoTest() {
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
     * Test of opcaoMenu method, of class Jogo.
     */
    @Test
    public void testOpcaoMenu() {
        System.out.println("opcaoMenu");
        Jogo instance = new Jogo();
        instance.opcaoMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of instrucoes method, of class Jogo.
     */
    @Test
    public void testInstrucoes() {
        System.out.println("instrucoes");
        Jogo.instrucoes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class Jogo.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        Jogo.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Jogo.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Jogo instance = new Jogo();
        Deck expResult = null;
        Deck result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jogar method, of class Jogo.
     */
    @Test
    public void testJogar() {
        System.out.println("jogar");
        Jogo instance = new Jogo();
        instance.jogar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
