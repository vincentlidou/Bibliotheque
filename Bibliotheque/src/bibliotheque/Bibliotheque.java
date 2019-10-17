package bibliotheque;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Bibliotheque {

    public ArrayList<Livre> listeLivres = new ArrayList<Livre>();

    public void runBibliotheque() {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        int choix = 0;
        while (continuer) {
            System.out.println("\nChoisissez une option : \n");
            System.out.println("1. Rechercher un livre");
            System.out.println("2. Enregistrer un livre");
            System.out.println("3. Afficher tous les livres");
            System.out.println("4. Arrêt du programme");
            System.out.println("\nTapez votre choix");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("En attente de prog \n");
                    break;
                case 2:
                    this.enregistrerLivre();
                    break;
                case 3:
                    this.afficherConsoleListeLivre();
                    break;
                case 4:
                    continuer = false;
                    System.out.println("Arrêt du programme imminent !");
                    break;
                default:
                    continuer = false;
                    System.out.println("Veuillez choisir une option du menu");
                    break;

            }
        }
    }

    public void enregistrerLivre() {
        this.listeLivres.add(this.creationLivre());
    }
    
    public ArrayList<Livre> rechercher(String recherche){
        ArrayList<Livre> resultatDeRecherche = new ArrayList<Livre>();
        return resultatDeRecherche;
    }
    
//    public void methodeRecherche() {
//        Scanner sc = new Scanner(system.in);
//        String recherche = sc.nextLine();
//        String(recherche).CASE_INSENSITIVE_ORDER.contains();
//    }

    public void afficherConsoleListeLivre() {
        for (int i = 0; i < listeLivres.size(); i++) {
            System.out.println((i + 1) + ". --------");
            listeLivres.get(i).afficherLivre();
            System.out.println("-----------");
        }

    }

    public void afficherForEachConsoleListeLivre() {
        int i = 1;
        for (Livre livre : listeLivres) {
            System.out.println(i + ". --------");
            livre.afficherLivre();
            System.out.println("-----------");
            i++;
        }
    }

    public Livre creationLivre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le titre du livre ?");
        String titre = sc.nextLine();
        System.out.println("Quel est le nom de l'auteur ?");
        String auteur = sc.nextLine();
        System.out.println("Quelle est sa référence ?");
        String ref = sc.nextLine();
        System.out.println("Combien a-t-il de page ?");
        String nbrePages = sc.nextLine();
        System.out.println("De quelle édition ?");
        String edition = sc.nextLine();
        System.out.println("Quel est son genre ?");
        String genre = sc.nextLine();
        System.out.println("En quelle année a-t-il été édité ?");
        String anneeEdition = sc.nextLine();
        System.out.println("En quelle langue est-il écrit ?");
        String langue = sc.nextLine();
        System.out.println("Quel est son format ?");
        String format = sc.nextLine();

        Livre livre = new Livre(titre, auteur, ref, nbrePages, edition, genre, anneeEdition, langue, format);

        return livre;
    }

    public static void main(String[] args) {
        Bibliotheque biblio = new Bibliotheque();

        biblio.runBibliotheque();
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//        String titre = "titre";
//        String auteur = "auteur";
//        String re4f = "ref";
//        String nbrePages = "nbrePage";
//        String edition = "edition";
//        String genre = "genre";
//        String anneeEdition = "anneeEdition";
//        String langue = "langue";
//        String format = "format";
//
//        Bibliotheque biblioTest = new Bibliotheque();
//
//        for (int i = 1; i <= 5; i++) {
//            Livre livre = new Livre(titre + i, auteur + i, ref + i, nbrePages + i, edition + i, genre + i, anneeEdition + i, langue + i, format + i);
//            biblioTest.listeLivres.add(livre);
//        }
//        //biblioTest.afficherConsoleListeLivre();
//        biblioTest.afficherForEachConsoleListeLivre();
//
//    }

}
