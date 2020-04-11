/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entree;

/**
 *
 * @author Sacha
 */
public class Personne implements entree{
    private String nom;
	private String[] prenom;
	private Genre genre;
        private Societe societe;
	private Personne conjoint;
	private String fonction;

	public Boolean recherche(String nom){
            
        }
       
        
    public String toString(Presentation p, Sens s) {
        
        String info="";
        
        if (s.equals(Sens.NOM_PRENOMS)){
            if (p.equals(Presentation.ABREGE)){
               info=nom+" ";
               for(String pre : prenom){
                   info+=pre.substring(0, 1)+"."+" ";
               }
            }
            else if (p.equals(Presentation.SIMPLE)){
                if (genre.equals(Genre.HOMME)){
                    info="M. ";
                }
                else{
                    info="Mme ";
                }
                
                info+=nom+" ";
                
                for(String pre : prenom){
                   info+=pre.substring(0, 1)+"."+" ";
               }
                info+="("+societe+")";
                
            }
            
            else if (p.equals(Presentation.COMPLET)){
                if (genre.equals(Genre.HOMME)){
                    info="M. ";
                }
                else{
                    info="Mme ";
                }
                
                info+=nom+" ";
                
                for(String pre : prenom){
                   info+=pre+"."+" ";
                }
                
                info+="\n - Société : "+societe+"\n - Fonction : "+fonction;   
            }
        }
        
        else if (s.equals(Sens.PRENOMS_NOM)){
            
            if (p.equals(Presentation.ABREGE)){
               info="";
               for(String pre : prenom){
                   info+=pre.substring(0, 1)+"."+" ";
               }
               
               info+=nom;
            }
            else if (p.equals(Presentation.SIMPLE)){
                if (genre.equals(Genre.HOMME)){
                    info="M. ";
                }
                else{
                    info="Mme ";
                }
               
                
                for(String pre : prenom){
                   info+=pre.substring(0, 1)+"."+" ";
               }
                
                info+=nom+" ";
                
                info+="("+societe+")";
                
            }
            
            else if (p.equals(Presentation.COMPLET)){
                if (genre.equals(Genre.HOMME)){
                    info="M. ";
                }
                else{
                    info="Mme ";
                }
                
            
                
                for(String pre : prenom){
                   info+=pre+"."+" ";
                }
                
                info+=nom+" ";
                info+="\n - Société : "+societe+"\n - Fonction : "+fonction;   
            }
        }
    
        return info;
    }

}
