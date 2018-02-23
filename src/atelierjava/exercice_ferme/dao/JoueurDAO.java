/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class JoueurDAO {

    public void ajouter(Joueur j) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
    }

    public Joueur recherche(String pseudo) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT j FROM Joueur j WHERE j.pseudo=:pseudoRecherche");
        query.setParameter("pseudoRecherche", pseudo);
        
        Joueur j = (Joueur) query.getSingleResult();
        
        return j;
    }

    public boolean existe(String pseudo, String mdp) {

       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       
       Query query = em.createQuery(""
               + "SELECT    COUNT(j) "
               + "FROM      Joueur j "
               + "WHERE     j.pseudo=:pseudoExistant "
               + "          AND j.motDePasse=:mdp");
       query.setParameter("pseudoExistant", pseudo);
       query.setParameter("mdp", mdp);
       
       Long nbRes = (Long) query.getSingleResult();
       
       if( nbRes==0 )
           return false;
       
       return true;
    }
    
    public boolean existe(String pseudo) {

        // 1. Récupère EntityManager
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        // 2. Vérifie 
        Query query = em.createQuery("SELECT COUNT(j) FROM Joueur j WHERE j.pseudo=:pseudoExistant");
        query.setParameter("pseudoExistant", pseudo);
        
        long nbJoueurs = (long) query.getSingleResult();
        
        if( nbJoueurs>0 )
            return true;
        
        return false;
    }
}
