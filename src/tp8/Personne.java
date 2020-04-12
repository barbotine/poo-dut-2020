/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import java.util.Objects;

/**
 *
 * @author florie
 */
public class Personne {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nom);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.poids) ^ (Double.doubleToLongBits(this.poids) >>> 32));
        hash = 67 * hash + this.taille;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (Double.doubleToLongBits(this.poids) != Double.doubleToLongBits(other.poids)) {
            return false;
        }
        if (this.taille != other.taille) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    
    public String nom; 
    public String prenom; 
    public double poids;
    public int taille;
    
    
    /**
     *
     * @param nom
     * @param prenom
     * @param taille
     * @param poids
     */
    public Personne(String nom, String prenom, int taille, double poids) {
        this.nom = nom;
        this.prenom = prenom; 
        this.taille = taille;
        this.poids = poids; 
    }
     
}
