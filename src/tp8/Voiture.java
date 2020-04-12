/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import static java.lang.reflect.Array.set;
import java.util.HashSet;
import static tp8.EtatVoiture.ARRETEE;
import static tp8.EtatVoiture.DEMARREE;

/**
 *
 * @author florie
 */
public class Voiture {

    /**
     * methode qui permet d'accéder à l'attribut conducteur 
     * @return
     */
    public Personne getConducteur() {
        return conducteur;
    }

    /**
     * méthode qui permet de modifier l'attribut conducteur
     * @param conducteur
     */
    public void setConducteur(Personne conducteur) {
        this.conducteur = conducteur;
    }

   private final String marque; 
   private final String modele; 
   private final String immatriculation; 
   private int vitesseActuelle = 0;  
   private int nombreKm = 0;  
   private final static int VITESSE_MAX = 180; 
   private final static int VITESSE_MIN = 0; 
   private EtatVoiture etat = ARRETEE;  
   private Personne conducteur = null; 
   private final int NBRPASSAGERMAX; 
   private final double PTAC;  
   private int poidsActuel = 0; 
   HashSet<Personne> Passagers = new HashSet<Personne>();
   Personne passager; 
   
    /**
     * Le constructeur de la classe Voiture
     * @param marque
     * @param modele
     * @param immatriculation
     * @param nbrPassagerMax
     * @param PTAC
     */
    public Voiture(String marque, String modele, String immatriculation, int nbrPassagerMax, double PTAC) {
        this.marque = marque;
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.NBRPASSAGERMAX = nbrPassagerMax; 
        this.PTAC = PTAC; 
         
    }

 
    /**
     * Méthode qui permet d'accéder à l'attribut Marque
     * @return
     */
    public String getMarque() {
        return marque;
    }

    /**
     *  Méthode qui permet d'accéder à l'attribut Modele
     * @return
     */
    public String getModele() {
        return modele;
    }

    /**
     * Méthode qui permet d'accéder à l'attribut Immatriculation
     * @return
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     *  Méthode qui permet d'accéder à l'attribut VitesseActuelle
     * @return
     */
    public int getVitesseActuelle() {
        return vitesseActuelle;
    }

    /**
     *
     * @return
     */
    public int getNombreKm() {
        return nombreKm;
    }

    /**
     *
     * @return
     */
    public int getVitesseMax() {
        return VITESSE_MAX;
    }
    
    /**
     *
     * @throws tp8.EtatIncorrectException
     * @throws tp8.ViolationContrainteException
     */
    public void demarrer()throws EtatIncorrectException, ViolationContrainteException {
        if(this.etat == EtatVoiture.ARRETEE)
        {
            this.etat = DEMARREE; 
            System.out.println("La voiture démarre"); 
        }
        else
        {
            throw new EtatIncorrectException("La voiture est déjà démarrée"); 
        }
        if(this.conducteur == null)
        {
            throw new ViolationContrainteException("Impossible de démarrer sans conducteur");
        } 
       
            
    }
    
    /**
     *
     * @throws EtatIncorrectException
     */
    public void arreter() throws EtatIncorrectException {
        if (this.etat == EtatVoiture.DEMARREE)
        {
            this.etat = ARRETEE; 
            System.out.println("La voiture s'arrête");
            this.vitesseActuelle = 0; 
            this.conducteur = null; 
            this.poidsActuel = 0; 
        }
        else
        {
            throw new EtatIncorrectException("La voiture est déjà arrêtée"); 
            
        }
    }
    
    /**
     *
     * @throws ViolationContrainteException
     * @throws EtatIncorrectException
     */
    public void accelerer() throws ViolationContrainteException,
                                    EtatIncorrectException {
        if (this.etat != EtatVoiture.DEMARREE)
            throw new EtatIncorrectException("Voiture n'est pas démarrée");
        if (this.vitesseActuelle + 10 > Voiture.VITESSE_MAX){
            this.vitesseActuelle = Voiture.VITESSE_MAX;
            throw new ViolationContrainteException("Vitesse max est atteinte");
        }
        this.vitesseActuelle += 10;
    }
    
    /**
     *
     * @throws ViolationContrainteException
     * @throws EtatIncorrectException
     */
    public void freiner() throws ViolationContrainteException,
                                    EtatIncorrectException {
        if (this.etat != EtatVoiture.DEMARREE)
        {
           throw new EtatIncorrectException("Voiture n'est pas démarrée"); 
        }
        if (this.vitesseActuelle - 10 < Voiture.VITESSE_MIN)
        {
            this.vitesseActuelle = Voiture.VITESSE_MIN; 
            throw new ViolationContrainteException("Vitesse min  est atteinte");
            
        }
        this.vitesseActuelle -= 10; 
    }
    
    /**
     *
     * @param nombreHeure
     * @throws EtatIncorrectException
     */
    public void rouler(int nombreHeure) throws EtatIncorrectException
    {
        this.nombreKm = this.vitesseActuelle * nombreHeure; 
        if (this.etat != EtatVoiture.DEMARREE)
        {
           throw new EtatIncorrectException("Voiture arretée !"); 
        }
    }
    
    /**
     *
     * @param conducteur
     */
    public void monterConducteur(Personne conducteur) throws EtatIncorrectException
    {
        if(this.etat == EtatVoiture.ARRETEE)
        {
           this.conducteur = conducteur; 
           this.poidsActuel += conducteur.poids;  
        }
        else
        {
            throw new EtatIncorrectException("Impossible de monter le monter le conducteur lorsque la voiture n'est pas arrêtée!"); 
        }
        
    }
    
    private boolean estPassager(Personne passager)
    {
        return this.Passagers.contains(passager); 
    }
    
    private boolean estConducteur(Personne conducteur)
    {
        return conducteur == this.conducteur; 
    }
    
    /**
     *
     * @param passager
     * @throws ViolationContrainteException
     * @throws tp8.EtatIncorrectException
     */
    public void monter(Personne passager) throws ViolationContrainteException, EtatIncorrectException
    {
        
        if (this.etat != EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture n'est pas arrêtée");
        }
        if ( Passagers.size() == this.NBRPASSAGERMAX)
        {
            throw new ViolationContrainteException("Plus de places");
        }
          
        if(passager.poids + poidsActuel > this.PTAC)
        {
            throw new ViolationContrainteException("Passager trop lourd");
        }
        if (this.estPassager(passager))
        {
            throw new ViolationContrainteException("Personne déjà passager");
        }
            
        if (this.estConducteur(passager))
        {
            throw new ViolationContrainteException("Personne déjà conducteur");
        }
        else
        {
            Passagers.add(passager); 
            this.poidsActuel += passager.poids;  
        }    
    }

    /**
     *
     * @param passager
     * @throws ViolationContrainteException
     * @throws EtatIncorrectException
     */
    public void descendre(Personne passager) throws ViolationContrainteException, EtatIncorrectException
    {
        
        if (this.etat != EtatVoiture.ARRETEE)
        {
            throw new EtatIncorrectException("La voiture n'est pas arrêtée");
        }
        if(!(Passagers.isEmpty()))
        {
            if (this.estPassager(passager))
            {
                Passagers.remove(passager); 
                this.poidsActuel -= passager.poids; 
            }
            else
            {
                throw new ViolationContrainteException("Passager n'existe pas");
            }    
        }
        else
        {
            throw new ViolationContrainteException("Il n'y a plus de passager ");
        }
        
        
    }
}
