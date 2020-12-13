/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hognoul
 */
public class Employe extends User {
    
    public Employe(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }
    
    private Set<Tache> listTache = new HashSet<Tache>();
    
    public void addTache(Tache tache){
        if(!this.listTache.contains(tache))
            this.listTache.add(tache);
    }
    
    public void removeTache(Tache tache){
        this.listTache.remove(tache);
    }
}
