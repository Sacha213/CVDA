/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.entree;

/**
 *
 * @author 33642
 */
public interface entree {
    public enum sens{
        NOM_PRENOMS,
        PRENOMS_NOM;
    }
    public enum genre{
        HOMME,
        FEMME;
    }
    public enum presentation{
        ABREGE,
        SIMPLE,
        COMPLET;
    }
}
