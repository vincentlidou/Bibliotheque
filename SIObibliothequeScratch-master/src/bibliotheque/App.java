/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import IHM.JFrameBibliotheque;
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

}
