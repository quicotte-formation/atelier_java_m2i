/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AtelierJava extends Object{

    public static void main(String[] args) {
        
        ArrayList<String> liste = new ArrayList<>();
        
        liste.add("Rouge");
        liste.add("Vert");
        liste.add("Jaune");
        
        // Afficher avec une boucle chaque element de la liste
        for( int i=0 ; i<liste.size() ; i++){
            
            System.out.println( liste.get(i) );
        }
        
        // For version moderne
        for (String couleur : liste) {
            
            System.out.println(couleur);
        }
    }
    
    public static void mainFerme(String[] args) {
        
        Fermier f1 = new Fermier();
        f1.setNom("LOU");
        f1.setPrenom("FERIGNO");
        f1.setSpecialite("VIGNERON");
        System.out.println( f1 );
    }
    
    public static void mainVarStatiques(String[] args) {

        Personne pers1 = new Personne();
        pers1.setNom("Obama");
        pers1.setAge(56);

        Personne pers2 = new Personne();
        pers2.setNom("Churchill");
        pers2.setAge(0);

        Personne pers3 = new Personne();
        pers2.setNom("Churchill");
        pers2.setAge(1);

        System.out.println("Age mini:" + Personne.getAgeMini()
                + ", Age maxi:" + Personne.getAgeMaxi());
    }

//    Animal cochon;
    /**
     * Ceci est le main qui testes l'ajouts de 2 animaux.
     *
     * @param args the command line arguments
     */
    public static void mainCochon(String[] args) {

        // 1. Crée cochon 12kg / girafe 15
        Animal a1 = new Animal();
        Animal a2 = a1.instancier();

        a1.poidsEnKg = 12;
        a1.espece = "Cochon";
        a1.genre = "Sus";

        a2.poidsEnKg = 15;
        a2.espece = "Girafe";
        a2.genre = "Giraffa";

        // 2. Affiche caract 2 bestioles
        System.out.println(a1);
        System.out.println(a2);

//        System.out.println( cochon );
        System.out.println("Total: " + Animal.nbAnimaux);
    }
}
