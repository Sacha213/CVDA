/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entree.Presentation;
import entree.Sens;
import entree.Societe;

/**
 *
 * @author 33642
 */
public class TestSociete {
    
     public static void main(String[] args) {
        Societe riot = new Societe("riot games");
        //société riot nom
        System.out.println(riot.toString(Presentation.SIMPLE, Sens.NOM_PRENOMS));
     }

}
