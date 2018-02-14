/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

/**
 *
 * @author Formation
 */
public class Personne {
    
    private String nom;
    private int age;

    static private int ageMini=-1;
    static private int ageMaxi=0;

    
    
    public static int getAgeMini() {
        return ageMini;
    }

    public static int getAgeMaxi() {
        return ageMaxi;
    }
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        
        // Met à jour ageMaxi si age > ageMaxi
        if( age>Personne.ageMaxi ){
            Personne.ageMaxi = age;
        }
        
        // Maj ageMini SI ageMini==-1 ( cad pas encore initalisé )
        // ou age<ageMini
        if( Personne.ageMini==-1 ){
            Personne.ageMini=age;
        }
        if( age<Personne.ageMini )
            Personne.ageMini=age;
    }
    
    
}
