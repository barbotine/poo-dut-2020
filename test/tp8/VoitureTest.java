/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author florie
 */
public class VoitureTest {
    Voiture car; 
    Personne driver; 
    
    public VoitureTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        car = new Voiture("Citroën", "DS5", "AX4532QW", 5, 200.0); 
        driver = new Personne("Dupont", "Michel", 180, 80.0); 
        car.setConducteur(driver); 
    }
    
    @AfterEach
    public void tearDown() {
        car = null; 
        driver = null;  
    }

    /**
     * Test of getConducteur method, of class Voiture.
     */
    @Test
    public void testGetConducteur() {
        System.out.println("getConducteur");
        Personne expResult = driver;
        Personne result = car.getConducteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setConducteur method, of class Voiture.
     */
    @Test
    public void testSetConducteur() {
        System.out.println("setConducteur");
        Personne conducteur = driver;
        car.setConducteur(conducteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarque method, of class Voiture.
     */
    @Test
    public void testGetMarque() {
        System.out.println("getMarque");
        Voiture instance = null;
        String expResult = "";
        String result = instance.getMarque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModele method, of class Voiture.
     */
    @Test
    public void testGetModele() {
        System.out.println("getModele");
        Voiture instance = null;
        String expResult = "";
        String result = instance.getModele();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImmatriculation method, of class Voiture.
     */
    @Test
    public void testGetImmatriculation() {
        System.out.println("getImmatriculation");
        Voiture instance = null;
        String expResult = "";
        String result = instance.getImmatriculation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVitesseActuelle method, of class Voiture.
     */
    @Test
    public void testGetVitesseActuelle() {
        System.out.println("getVitesseActuelle");
        Voiture instance = null;
        int expResult = 0;
        int result = instance.getVitesseActuelle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreKm method, of class Voiture.
     */
    @Test
    public void testGetNombreKm() {
        System.out.println("getNombreKm");
        Voiture instance = null;
        int expResult = 0;
        int result = instance.getNombreKm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVitesseMax method, of class Voiture.
     */
    @Test
    public void testGetVitesseMax() {
        System.out.println("getVitesseMax");
        Voiture instance = null;
        int expResult = 0;
        int result = instance.getVitesseMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of demarrer method, of class Voiture.
     */
    @Test
    public void testDemarrer() throws Exception {
        System.out.println("demarrer");
        Voiture instance = null;
        instance.demarrer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of arreter method, of class Voiture.
     */
    @Test
    public void testArreter() throws Exception {
        System.out.println("arreter");
        Voiture instance = null;
        instance.arreter();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of accelerer method, of class Voiture.
     */
    @Test
    public void testAccelerer() throws EtatIncorrectException, ViolationContrainteException {
        System.out.println("accelerer");
        car.monterConducteur(driver); 
        car.demarrer(); 
        car.accelerer();
        assertEquals(10, car.getVitesseActuelle()); 
        // TODO review the generated test code and remove the default call to fail.   
    }

    /**
     * Test of freiner method, of class Voiture.
     */
    @Test
    public void testFreiner() throws ViolationContrainteException,
                                    EtatIncorrectException {
        System.out.println("freiner");
        
        car.monterConducteur(driver);
        car.demarrer();
        car.freiner();
        assertEquals()
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rouler method, of class Voiture.
     */
    @Test
    public void testRouler() throws Exception {
        System.out.println("rouler");
        
        int nombreHeure = 2;
        car.rouler(nombreHeure);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of monterConducteur method, of class Voiture.
     */
    @Test
    public void testMonterConducteur() throws Exception {
        System.out.println("monterConducteur");
        Personne conducteur = null;
        Voiture instance = null;
        instance.monterConducteur(conducteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of monter method, of class Voiture.
     */
    @Test
    public void testMonter() throws Exception {
        System.out.println("monter");
        Personne passager = null;
        Voiture instance = null;
        instance.monter(passager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descendre method, of class Voiture.
     */
    @Test
    public void testDescendre() throws Exception {
        System.out.println("descendre");
        Personne passager = null;
        Voiture instance = null;
        instance.descendre(passager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
