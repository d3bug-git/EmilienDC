/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Emilien
 */
public class Tache extends Entity{
    private String   nom;
    
     public Tache(int id,String nom) {
         this.id = id;
         this.nom = nom;
     }

    public Tache() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }  
}
   