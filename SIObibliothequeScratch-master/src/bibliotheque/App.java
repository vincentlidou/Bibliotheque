/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import IHM.JFrameBibliotheque;

/**
 *
 * @author admin
 */
public class App {
    public Bibliotheque biblio;
    public JFrameBibliotheque jFrameBiblio;
    
    public void runBibliothequeIHM(){
        biblio = new Bibliotheque();
        jFrameBiblio = new JFrameBibliotheque();
        jFrameBiblio.setVisible(true);
    
    }
}
