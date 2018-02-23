/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.entite.Joueur;

/**
 *
 * @author Formation
 */
public class JoueurService {

    public void connexion(String pseudo, String mdp){
        
        JoueurDAO dao = new JoueurDAO();
        if( ! dao.existe(pseudo, mdp) )
            throw new RuntimeException("Echec de connexion");
    }
    
    /**
     * Pseudo: - mini 3 lettres, maxi 8 - unique Mdp: - mini 5 lettres, maxi 10
     * - au moins une Maj et un chiffre
     *
     * @param pseudo
     * @param mdp
     */
    public void inscription(String pseudo, String mdp) {

        // Validation
        
        // Erreur si pseudo < 3 ou > 8 car
        if ( ! pseudo.matches(".{3,8}") ) {
            throw new RuntimeException("Le pseudo doit être compris entre 3 et 8 caractères");
        }

        // Err si mdp < 5 ou > 10 car
        if (! mdp.matches(".{5,10}")) {
            throw new RuntimeException("Le mdp doit être compris entre 5 et 10 caractères");
        }
        
        if( ! mdp.matches(".*[A-Z].*") ){
            throw new RuntimeException("Le mdp requiert au moins une majuscule");
        }
        
        if( ! mdp.matches(".*[0-9].*") ){
            throw new RuntimeException("Le mdp requiert au mois un chiffre");
        }
        
        // Vérifier que le pseudo est encore dispo
        JoueurDAO dao = new JoueurDAO();
        if( dao.existe( pseudo ) ){
             throw new RuntimeException("Ce pseudo existe déjà");
        }
        
        // Ajoute le joueur en BD
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotDePasse(mdp);
        dao.ajouter(ferme);
    }
}
