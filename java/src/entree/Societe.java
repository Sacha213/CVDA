/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entree;

/**
 *
 * @author 33642
 */
public class Societe implements entree{
    private String societe;

    public Societe(String s){
        societe=s;
    }
    
    @Override
    public String toString(Presentation p, Sens s) {
        return societe;
    }

    @Override
    public Boolean recherche(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
