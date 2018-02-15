/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class MapTest {

    @Test
    public void mapKeySetOK() {

        HashMap<String, String> paysCapitales = new HashMap<>();

        paysCapitales.put("France", "Paris");
        paysCapitales.put("Espagne", "Madrid");
        paysCapitales.put("Indonésie", "Jakarta");
        
        Set<String> cles = paysCapitales.keySet();
        for( String pays : cles ){
            String capitale = paysCapitales.get(pays);
            
            System.out.println( pays + " " + capitale );
        }
        
    }

//    @Test
    public void mapPutGetOK() {

        HashMap<String, String> paysCapitales = new HashMap<>();

        paysCapitales.put("France", "Paris");
        paysCapitales.put("Espagne", "Madrid");
        paysCapitales.put("Indonésie", "Jakarta");

        String res = paysCapitales.get("Indonésie");
        System.out.println(res);
    }
}
