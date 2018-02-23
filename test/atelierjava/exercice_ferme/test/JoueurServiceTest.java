/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test
    public void rejoindrePartieOK(){
        JoueurService service = new JoueurService();
        
        service.inscription("ccc", "A1zaieuo");
        Joueur joueur = service.connexion("ccc", "A1zaieuo");
        service.rejoindrePartie( joueur.getId() );
    }
    
    @Test(expected = RuntimeException.class)
    public void connexionKO(){
        JoueurService service = new JoueurService();
        service.connexion("bbb", "A1zaieuo");
    }
    
    @Test
    public void connexionOK(){
        
        // 1. Inscrire util
        JoueurService service = new JoueurService();
        service.inscription("aaa", "A1zaieuo");
        
        // 2. Connexion avec son login et son mdp
        service.connexion("aaa", "A1zaieuo");
    }
    
    @Test
    public void inscriptionOK(){
        
        JoueurService service = new JoueurService();
        service.inscription("abcd", "A2azertt");
    }
    
    @Test(expected = RuntimeException.class)
    public void inscriptionKO(){
        
        JoueurService service = new JoueurService();
        service.inscription("abcde", "aaaa123");
    }
    
}
