/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 33642
 */
public class Lecture {
    public String lectureFichier(byte f) throws IOException{
        byte entree = f;
        File sortie = new File("temp.txt");
        bufferedReader br = new BufferedReader(new FileReader(entree));
        bufferedWriter bw = new BuffereWriter(new FileWriter(sortie));
        String ligne="";
        int id=0;int idconj=0;int idsoc=0;
        while ((ligne = br.readln()) != null){
         if(ligne.contains(PERSONNE)){
             bw.write(id+++";PERSONNE;"+prenom+";"+nom+";"+idconj+++";"+idsoc+++";"+fonction+"\n");
             bw.flush();
         }else{
             bw.write(ligne+"\n");
             bw.flush();
         }
        }
        bw.close();
        br.close();

        sortie.renameTo(new File("annu.txt"));
        entree.delete();
}

}
