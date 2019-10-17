/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

/**
 *
 * @author admin
 */
public class Livre {

    private String titre;
    private String auteur;
    private String ref;
    private String nbrePages;
    private String edition;
    private String genre;
    private String anneeEdition;
    private String langue;
    private String format;
    
    public void afficherLivre(){
        System.out.println("Titre : "+this.titre);
        System.out.println("Auteur : "+this.auteur);
        System.out.println("Année d'édition : "+this.anneeEdition);
    }

    public Livre(String titre, String auteur, String ref, String nbrePages, String edition, String genre, String anneeEdition, String langue, String format) {
        this.titre = titre;
        this.auteur = auteur;
        this.ref = ref;
        this.nbrePages = nbrePages;
        this.edition = edition;
        this.genre = genre;
        this.anneeEdition = anneeEdition;
        this.langue = langue;
        this.format = format;
    }

    
    public Livre(){
        
    }
    
    public Livre(String titreChoisi) {
        this.titre = titreChoisi;
        //setTitre(titreChoisi);
    }
    
    public Livre(String titreChoisi, String nomAuteur){
        this.titre = titreChoisi;
        this.auteur = nomAuteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * @param ref the ref to set
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * @return the nbrePages
     */
    public String getNbrePages() {
        return nbrePages;
    }

    /**
     * @param nbrePages the nbrePages to set
     */
    public void setNbrePages(String nbrePages) {
        this.nbrePages = nbrePages;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the anneeEdition
     */
    public String getAnneeEdition() {
        return anneeEdition;
    }

    /**
     * @param anneeEdition the anneeEdition to set
     */
    public void setAnneeEdition(String anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    /**
     * @return the langue
     */
    public String getLangue() {
        return langue;
    }

    /**
     * @param langue the langue to set
     */
    public void setLangue(String langue) {
        this.langue = langue;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    public static void main(String[] args) {
        String titre = "ztitre";
        String auteur = "zauteur";
        String ref = "zref";
        String nbrePages="nbrePages";
        String edition = "edition";
        String genre = "genre";
        String anneeEdition="zanneeEdition";
        String langue="langue";
        String format="format";
                
                
        Livre livreTest = new Livre(titre, auteur, ref, nbrePages, edition, genre, anneeEdition, langue, format);
                
        livreTest.afficherLivre();
    }
}

    