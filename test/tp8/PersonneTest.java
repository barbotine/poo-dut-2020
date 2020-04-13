/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;


import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author florie
 */

public class PersonneTest {
    
    Personne conducteur;
    
    // Personne conducteur; 
    public PersonneTest() {
    }
    
    @Before
    public void setUp() {
        
        System.out.println("setUp");
        conducteur = new Personne("Dupont", "Michel", 180, 80.0); 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hashCode method, of class Personne.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Personne instance = conducteur;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Personne.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Personne instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
