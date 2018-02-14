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
    
    public int factorielle(int n){
        
        int res=n;
        
        for(int i=n-1; i>1; i--){
            
            res = res * i;// ou i * res
        }
        
        return res;
    }
    
    @Test
    public void factorielleOK(){
        
        int r = factorielle(4);
        
        System.out.println( r );
    }
    
    @Test
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
    
    @Test
    public void addAvecIndiceOK(){
        
        ArrayList<Integer> nombresPremiers = new ArrayList();
        
        nombresPremiers.add(2);
        nombresPremiers.add(5);
        nombresPremiers.add(1, 3);
        
    }
    
    @Test
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
