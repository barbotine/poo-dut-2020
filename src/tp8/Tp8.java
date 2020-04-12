/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import static java.lang.System.out;

/**
 *
 * @author florie
 */
public class Tp8 {

    /**
     * @param args the command line arguments
     * @throws tp8.EtatIncorrectException
     */
    public static void main(String[] args) throws EtatIncorrectException, ViolationContrainteException {
        
        try{
        Voiture voiture1 = new Voiture("Mclaren", "765LT","265FLO", 5, 200.0); 
        Personne pers1 = new Personne("Barbot", "Flo", 170, 55.0); // conducteur
        Personne pers2 = new Personne("Barbot", "Rosy", 100, 5.0); //Passager1 
        Personne pers3 = new Personne("Regnault", "Raph", 185, 70.0); //Passager2 
        Personne pers4 = new Personne("Mouches","Oscarito", 170, 60.0); //Passager3
        Personne pers5 = new Personne("Bareau", "Alex", 180, 200.0); //Passager4
        
        
        //---TEST--//
        //voiture1.arreter(); 
        //voiture1.demarrer();
        //voiture1.accelerer();
        //System.out.println(voiture1.getVitesseActuelle());
        //voiture1.accelerer();
        //System.out.println(voiture1.getVitesseActuelle());
        //voiture1.freiner();
        //System.out.println(voiture1.getVitesseActuelle());
        /*for(int leI = 0; leI < 9; leI ++)
        {
          voiture1.accelerer(); 
        }*/
        //System.out.println(voiture1.getVitesseActuelle());
        //voiture1.rouler(3);
        //System.out.println(voiture1.getNombreKm());
        voiture1.monterConducteur(pers1);
        voiture1.demarrer();
        voiture1.arreter();
        voiture1.monterConducteur(pers1);
        //voiture1.monter(pers1); et 
        voiture1.monter(pers2);
        voiture1.monter(pers3);
        voiture1.monter(pers4);
        //voiture1.monter(pers5);
        //voiture1.monter(pers4);
        voiture1.descendre(pers2);
        //voiture1.descendre(pers2);
        voiture1.descendre(pers3);
        voiture1.descendre(pers4);
        //voiture1.descendre(pers5);
        voiture1.arreter(); 
        }
        
        catch(EtatIncorrectException | ViolationContrainteException e)
        {
            System.err.println(e.getMessage());
        }
        
        finally{
            if(out != null)
            {
                System.out.println("Fermer Printwriter"); 
                out.close(); 
            }
            else
            {
                System.out.println("PrintWriter pas ouvert");
            }
        }

    }
    
    
}
