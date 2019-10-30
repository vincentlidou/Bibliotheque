/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author admin
 */
public class Personne {
    protected String nom;
    protected String prenom;
/**
 * 
 * @param nom
 * @param prenom 
 */
    public Personne(String nom,String prenom){
        this.setNom(nom);
        this.setPrenom(prenom);
    }
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public final void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public final void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void afficher(){
        System.out.println("nom: " + this.nom + "\nprénom : " + this.prenom);
    }
    
    public static void main(String[] args) {
        
    }
}