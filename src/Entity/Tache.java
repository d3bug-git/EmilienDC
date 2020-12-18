/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.UUID;

/**
 *
 * @author Emilien
 */
public class Tache extends Entity{
    private String   nom;
    
     public Tache(UUID id,String nom) {
         this.id = id;
         this.nom = nom;
     }

    public Tache() {
        
    }
     
     public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }  
}
   