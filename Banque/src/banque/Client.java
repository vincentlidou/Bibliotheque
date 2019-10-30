/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Client extends Personne {
    protected String matricule;
    
    public Client(String nom,String prenom, String matricule) {
        super(nom,prenom);
        this.setMatricule(matricule);
    }
    
    /**
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public final void setMatricule(String matricule) {
        Scanner sc = new Scanner(System.in);
        while (!(matricule.matches("f[ro]\\d{9}"))) {
            /*ce regex permet de tester la forme f, puis r ou o, puis un chiffre 9 fois*/
            System.out.println("Vous avez tenté d'enregistrer : " + matricule);
            System.out.println("Le matricule doit commencer par 'fr' ou 'fo' "
                    + "suivi de 9 chiffres."
                    + "\nEssayez d'entrer un matricule valide : ");
            matricule = sc.next();
        }
        System.out.println("Matricule valide.");
        this.matricule = matricule;
    }
    public static void main(String[] args) {
        Client client = new Client("Serres", "Damien", "fr123456789");
        
        System.out.println(client.getMatricule().lastIndexOf("fr"));
        
    }
}
