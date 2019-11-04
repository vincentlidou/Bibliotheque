/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import IHM.JFrameBibliotheque;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class App {

    public Bibliotheque biblio;
    public JFrameBibliotheque jFrameBiblio;

    public void runBibliothequeIHM() {
        biblio = new Bibliotheque();
        jFrameBiblio = new JFrameBibliotheque();
        jFrameBiblio.app = this;
        this.setRowCountjTableBiblio(0);
        jFrameBiblio.setVisible(true);
    }

    public void setRowCountjTableBiblio(int rowCount) {
        DefaultTableModel model = (DefaultTableModel) jFrameBiblio.getjTableBibliotheque().getModel();
        model.setRowCount(rowCount);
        jFrameBiblio.getjTableBibliotheque().setModel(model);
    }

    public void ajouterLivreIHM() {
//        this.jFrameBiblio.getjTableSelection().setValueAt(this.jFrameBiblio.getjTableSelection().getValueAt(0, 0), 0, 1);
        String titre = this.jFrameBiblio.getjTableSelection().getValueAt(0, 0).toString();
        String auteur = this.jFrameBiblio.getjTableSelection().getValueAt(0, 1).toString();
        String ref = this.jFrameBiblio.getjTableSelection().getValueAt(0, 2).toString();
        String nbrePages = this.jFrameBiblio.getjTableSelection().getValueAt(0, 3).toString();
        String edition = this.jFrameBiblio.getjTableSelection().getValueAt(0, 4).toString();
        String genre = this.jFrameBiblio.getjTableSelection().getValueAt(0, 5).toString();
        String anneeEdition = this.jFrameBiblio.getjTableSelection().getValueAt(0, 6).toString();
        String langue = this.jFrameBiblio.getjTableSelection().getValueAt(0, 7).toString();
        String format = this.jFrameBiblio.getjTableSelection().getValueAt(0, 8).toString();
        Livre livre = this.biblio.creationLivre(titre, auteur, ref, nbrePages, edition, genre, anneeEdition, langue, format);
        this.biblio.enregistrerLivre(livre);

    }

    public void afficherListeIHM() {
        this.setRowCountjTableBiblio(biblio.listeLivres.size());
        for (int i = 0; i < biblio.listeLivres.size(); i++) {
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getTitre(), i, 0);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getAuteur(), i, 1);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getRef(), i, 2);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getNbrePages(), i, 3);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getEdition(), i, 4);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getGenre(), i, 5);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getAnneeEdition(), i, 6);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getLangue(), i, 7);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(this.biblio.listeLivres.get(i).getFormat(), i, 8);
        }
    }

    public void afficherListeIHM(ArrayList<Livre> list) {
        this.setRowCountjTableBiblio(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getTitre(), i, 0);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getAuteur(), i, 1);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getRef(), i, 2);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getNbrePages(), i, 3);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getEdition(), i, 4);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getGenre(), i, 5);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getAnneeEdition(), i, 6);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getLangue(), i, 7);
            this.jFrameBiblio.getjTableBibliotheque().setValueAt(list.get(i).getFormat(), i, 8);
        }
    }

//    private ArrayList<Livre> uniSearch(String recherche, int critere) {
//        //Préparation de la liste de résultats
//        ArrayList<Livre> resultatDeRecherche = new ArrayList();
//        //Préparation du critère de choix
//        critere = jFrameBiblio.getjComboBoxRechercher().getSelectedIndex();
//        //Boucle sur la liste de livres complète
//        for (Livre livre : biblio.listeLivres) {
//            //Creation (et initialisation éventuelle) du boolean gérant l'ajout
//            boolean ajout/* = false*/;
//            //Liste de vérifications
//            if (this.biblio.verifContainStr(livre.getTitre(), recherche) && critere == 0) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getTitre(), recherche) && critere == 1) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getAuteur(), recherche) && critere == 2) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getRef(), recherche) && critere == 3) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getNbrePages(), recherche) && critere == 4) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getEdition(), recherche) && critere == 5) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getGenre(), recherche) && critere == 6) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getAnneeEdition(), recherche) && critere == 7) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getLangue(), recherche) && critere == 8) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getFormat(), recherche) && critere == 9) {
//                ajout = true;
//            } else {
//                /*
//                Pour être "sûr" on refixe le booleen déterminant l'ajout à 
//                false dans le cas ou rien ne convient. Si le boolean est initialisé
//                à false, cette partie est redondante.
//                 */
//                ajout = false;
//            }
//            //ajout à la liste de résultats conditionnel à chaque itération
//            if (ajout) {
//                resultatDeRecherche.add(livre);
//            }
//        }//Sortie de la boucle for
//        return resultatDeRecherche;
//    }

    public void searchIHM(String text, int selectedIndex) {
        if (selectedIndex == 0) {
            this.afficherListeIHM(this.biblio.globaSearch(text));
        } else {
            this.afficherListeIHM(this.biblio.uniSearch(text, selectedIndex));
        }
    }

//    public ArrayList<Livre> globaSearch(String recherche) {
//        //Préparation de la liste de résultats
//        ArrayList<Livre> resultatDeRecherche = new ArrayList();
//        //Boucle sur la liste de livres complète
//        for (Livre livre : biblio.listeLivres) {
//            //Creation (et initialisation éventuelle) du boolean gérant l'ajout
//            boolean ajout/* = false*/;
//            //Liste de vérifications
//            if (this.biblio.verifContainStr(livre.getTitre(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getAuteur(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getRef(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getNbrePages(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getEdition(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getGenre(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getAnneeEdition(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getLangue(), recherche)) {
//                ajout = true;
//            } else if (this.biblio.verifContainStr(livre.getFormat(), recherche)) {
//                ajout = true;
//            } else {
//                /*
//                Pour être "sûr" on refixe le booleen déterminant l'ajout à 
//                false dans le cas ou rien ne convient. Si le boolean est initialisé
//                à false, cette partie est redondante.
//                 */
//                ajout = false;
//            }
//            //ajout à la liste de résultats conditionnel à chaque itération
//            if (ajout) {
//                resultatDeRecherche.add(livre);
//            }
//        }//Sortie de la boucle for
//        return resultatDeRecherche;
//    }

}
