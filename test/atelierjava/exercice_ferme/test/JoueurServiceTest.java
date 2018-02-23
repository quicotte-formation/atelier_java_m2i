/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test(expected = RuntimeException.class)
    public void connexionKO(){
        JoueurService service = new JoueurService();
        service.connexion("thomas", "A1zaieuo");
    }
    
    @Test
    public void connexionOK(){
        
        // 1. Inscrire util
        JoueurService service = new JoueurService();
        service.inscription("thomas", "A1zaieuo");
        
        // 2. Connexion avec son login et son mdp
        service.connexion("thomas", "A1zaieuo");
    }
    
    @Test
    public void inscriptionOK(){
        
        JoueurService service = new JoueurService();
        service.inscription("abcd", "A2azertt");
    }
    
    @Test(expected = RuntimeException.class)
    public void inscriptionKO(){
        
        JoueurService service = new JoueurService();
        service.inscription("abcd", "aaaa123");
    }
    
}
