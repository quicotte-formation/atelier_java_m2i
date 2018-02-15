/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashSet;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class IteratorTest {
    
    @Test
    public void iteratorOK(){
        
        HashSet<String> set = new HashSet<>();
        
        set.add("rouge");
        set.add("jaune");
        set.add("vert");
        
        Iterator<String> iterateur = set.iterator();
        while( iterateur.hasNext()==true ){
            
            String coul = iterateur.next();
            
            System.out.println( coul );
        }
    }
}
