/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carnet;

import entree.Entree;
import entree.Presentation;
import entree.Sens;

/**
 *
 * @author Sacha
 */
public class Carnet {
    private Entree[] entrees;
    private Entree[] selectionnees;
    
    public Carnet(Entree[] ent, Entree[] selec){
        entrees=ent;
        selectionnees=selec;
    }
    
    public void ajoutEnntre(){
        //J'ai pas compris ce qui était demandé
    }
    
    public void affichage(Ordre o, Presentation p, Sens s){
        
        for(Entree e : entrees){
            System.out.println(e);
        }
        
        for(Entree es : selectionnees){
            System.out.println(s);
        }
        
    }
    
}
