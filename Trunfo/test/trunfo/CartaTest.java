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
public class CartaTest {
    
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
     * Test of getNomeCarta method, of class Carta.
     */
    @Test
    public void testGetNomeCarta() {
        System.out.println("getNomeCarta");
        Carta instance = null;
        String expResult = "";
        String result = instance.getNomeCarta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeCarta method, of class Carta.
     */
    @Test
    public void testSetNomeCarta() {
        System.out.println("setNomeCarta");
        String nomeCarta = "";
        Carta instance = null;
        instance.setNomeCarta(nomeCarta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForca method, of class Carta.
     */
    @Test
    public void testGetForca() {
        System.out.println("getForca");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getForca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForca method, of class Carta.
     */
    @Test
    public void testSetForca() {
        System.out.println("setForca");
        int forca = 0;
        Carta instance = null;
        instance.setForca(forca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVelocidade method, of class Carta.
     */
    @Test
    public void testGetVelocidade() {
        System.out.println("getVelocidade");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getVelocidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVelocidade method, of class Carta.
     */
    @Test
    public void testSetVelocidade() {
        System.out.println("setVelocidade");
        int velocidade = 0;
        Carta instance = null;
        instance.setVelocidade(velocidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHabilidade method, of class Carta.
     */
    @Test
    public void testGetHabilidade() {
        System.out.println("getHabilidade");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getHabilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHabilidade method, of class Carta.
     */
    @Test
    public void testSetHabilidade() {
        System.out.println("setHabilidade");
        int habilidade = 0;
        Carta instance = null;
        instance.setHabilidade(habilidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipamento method, of class Carta.
     */
    @Test
    public void testGetEquipamento() {
        System.out.println("getEquipamento");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getEquipamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipamento method, of class Carta.
     */
    @Test
    public void testSetEquipamento() {
        System.out.println("setEquipamento");
        int equipamento = 0;
        Carta instance = null;
        instance.setEquipamento(equipamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInteligencia method, of class Carta.
     */
    @Test
    public void testGetInteligencia() {
        System.out.println("getInteligencia");
        Carta instance = null;
        int expResult = 0;
        int result = instance.getInteligencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInteligencia method, of class Carta.
     */
    @Test
    public void testSetInteligencia() {
        System.out.println("setInteligencia");
        int inteligencia = 0;
        Carta instance = null;
        instance.setInteligencia(inteligencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Carta.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Deck expResult = null;
        Deck result = Carta.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criaCarta method, of class Carta.
     */
    @Test
    public void testCriaCarta() {
        System.out.println("criaCarta");
        Deck deck = null;
        String nomeCarta = "";
        int forca = 0;
        int velocidade = 0;
        int habilidade = 0;
        int equipamento = 0;
        int inteligencia = 0;
        Carta instance = null;
        instance.criaCarta(deck, nomeCarta, forca, velocidade, habilidade, equipamento, inteligencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtributo method, of class Carta.
     */
    @Test
    public void testGetAtributo() {
        System.out.println("getAtributo");
        int atributo = 0;
        Carta instance = null;
        int expResult = 0;
        int result = instance.getAtributo(atributo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
