/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Compte {

    protected String numeroDeCompte;
    protected String matriculeTitulaire;
    protected double solde = 0;
    protected ArrayList<String> listeOperations = new ArrayList();

    public Compte(String numeroDeCompte, String matriculeTitulaire) {
        this.setNumeroDeCompte(numeroDeCompte);
        this.setMatriculeTitulaire(matriculeTitulaire);
    }

    /**
     * @return the numeroDeCompte
     */
    public String getNumeroDeCompte() {
        return numeroDeCompte;
    }

    /**
     * @param numeroDeCompte the numeroDeCompte to set
     */
    public final void setNumeroDeCompte(String numeroDeCompte) {
        Scanner sc = new Scanner(System.in);
        while (!(numeroDeCompte.matches("\\d{13}"))) {
            /*ce regex permet de tester la forme un chiffre 13 fois*/
            System.out.println("Vous avez tenté d'enregistrer : " + numeroDeCompte);
            System.out.println("Le numéro de compte doit comporter 13 chiffres "
                    + "\nEssayez d'entrer un numéro valide : ");
            numeroDeCompte = sc.next();
        }
        System.out.println("Numéro de compte valide.");
        this.numeroDeCompte = numeroDeCompte;
    }

    /**
     * @return the matriculeTitulaire
     */
    public String getMatriculeTitulaire() {
        return matriculeTitulaire;
    }

    /**
     * @param matriculeTitulaire the matriculeTitulaire to set
     */
    public final void setMatriculeTitulaire(String matriculeTitulaire) {
        Scanner sc = new Scanner(System.in);
        while (!(matriculeTitulaire.matches("f[ro]\\d{9}"))) {
            /*ce regex permet de tester la forme f, puis r ou o, puis un chiffre 9 fois*/
            System.out.println("Vous avez tenté d'enregistrer : " + matriculeTitulaire);
            System.out.println("Le matricule doit commencer par 'fr' ou 'fo' "
                    + "suivi de 9 chiffres."
                    + "\nEssayez d'entrer un matricule valide : ");
            matriculeTitulaire = sc.next();
        }
        System.out.println("Matricule valide.");
        this.matriculeTitulaire = matriculeTitulaire;
    }

    /**
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @return the listeOperations
     */
    public ArrayList<String> getListeOperations() {
        return listeOperations;
    }

    public void crediter(double credit) {
        if (credit >= 0) {
            solde += credit;
            listeOperations.add("+ " + credit);
        } else {
            System.out.println("Vous ne pouvez créditer qu'une somme positive.");
        }
        afficherSolde();
    }

    public void debiter(double debit) {
        if (debit < 0) {
            System.out.println("Le débit demandé est inférieur ou égal à zéro");
        } else {
            if (debit > solde) {
                System.out.println("Solde insuffisant");
            } else {
                solde -= debit;
                listeOperations.add("- " + debit);
            }
        }
        afficherSolde();
    }

    public void afficherSolde() {
        System.out.println("--\nSolde actuel : " + solde + "\n--");
    }

   public void afficherOperations(int nbOpe) {
        if (nbOpe > this.listeOperations.size()) {
            for (String Ope : this.listeOperations) {
                System.out.println(Ope);
            }
        } else {
            //for (int i = this.listeOperations.size() - 1; i >= this.listeOperations.size() - nbOpe; i--) {
            for (int i = this.listeOperations.size() - nbOpe; i < this.listeOperations.size(); i++) {
                System.out.println(this.listeOperations.get(i));
            }
        }
    }
    



public static void main(String[] args) {
        Compte compte = new Compte("1111111111111", "fr123456789");
        Scanner sc = new Scanner(System.in);
        boolean test = true;
        while (test) {
            System.out.println("Test de créditer :");
            /*Valeurs de crédit testées : */
            compte.crediter(sc.nextDouble());

            System.out.println("Test de débiter :");
            /*Valeurs de débit testées*/
            compte.debiter(sc.nextDouble());

            System.out.println("Continuer les tests ?");
            System.out.println("1. Oui");
            System.out.println("2. AfficherListeOperations");
            System.out.println("Autre chose. Non");
            switch (sc.nextInt()) {
                case 1:
                    break;
                case 2:
                    System.out.println("Combien d'opérations à afficher ?");
                    compte.afficherOperations(sc.nextInt());
                    break;
                default:
                    test = false;
            }
        }
    }
}
