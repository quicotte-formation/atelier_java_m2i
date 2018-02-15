/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {
    
    @Test
    public void removeAll(){
        
        ArrayList<String> listeCoul1 = new ArrayList<>();
        
        listeCoul1.add("rouge");
        listeCoul1.add("vert");
        listeCoul1.add("jaune");
        listeCoul1.add("rouge");
        
        ArrayList<String> listeCoul2 = new ArrayList<>();
        
        listeCoul2.add("rouge");
        listeCoul2.add("jaune");
        listeCoul2.add("violet");
        
        listeCoul1.removeAll(listeCoul2);
        
        for (String coul : listeCoul1) {
            
            System.out.println( coul );
        }
        
        System.out.println( listeCoul1 );
    }
    
//    @Test
    public void removeOK(){
        ArrayList<String> prenoms = new ArrayList<>();
        
        prenoms.add("Laura");
        prenoms.add("David");
        prenoms.add("Goliath");
        prenoms.add("David");
        
        prenoms.remove("David");
        
        for (String prenom : prenoms) {
            
            System.out.println( prenom );
        }
    }
    
    public int factorielle(int n){
        
        int res=n;
        
        for(int i=n-1; i>1; i--){
            
            res = res * i;// ou i * res
        }
        
        return res;
    }
    
//    @Test
    public void factorielleOK(){
        
        int r = factorielle(4);
        
        System.out.println( r );
    }
    
//    @Test
    public void nbresPremiers(){
        
        ArrayList<Integer> nbPremiers = new ArrayList<>();
        
        // Evaluer le nbre i de 2->100, pr checker si premier
        for(int i=2;i<=100;i++){
            
            boolean premier = true;
            for(int j=2;j<i;j++){
                
                if( i % j == 0 ){
                    
                    premier=false;
                }
            }
            
            if( premier==true ){
                nbPremiers.add(i);
            }
        }
        
        System.out.println( nbPremiers );
    }
    
//    @Test
    public void addAvecIndiceOK(){
        
        ArrayList<Integer> nombresPremiers = new ArrayList();
        
        nombresPremiers.add(2);
        nombresPremiers.add(5);
        nombresPremiers.add(1, 3);
        
    }
    
//    @Test
    public void addOK(){
       
        ArrayList<String> capitales = new ArrayList<>();
        
        capitales.add("Paris");
        capitales.add("Madrid");
        capitales.add("Rome");
        
        for(String cap : capitales){
            System.out.println( cap );
        }
    }
}
