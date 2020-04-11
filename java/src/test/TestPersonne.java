/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entree.Genre;
import entree.Personne;
import entree.Presentation;
import entree.Sens;

/**
 *
 * @author 33642
 */
public class TestPersonne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] prenom = {"Sacha","Milo"};
        Personne Sacha = new Personne("Montel",prenom,Genre.HOMME);
        
        //Sacha.recherche("nom");
        System.out.println(Sacha.toString(Presentation.COMPLET, Sens.NOM_PRENOMS));
    }
    
}
