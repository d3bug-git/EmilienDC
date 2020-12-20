/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author hognoul
 */
public class Employe extends Personne {
    
    private final Set<Tache> listTache;
    
    public Employe(UUID id,String pseudo,String password, String nom, String prenom) {
        super(id,pseudo,password, nom, prenom);
        listTache = new HashSet<>();
    }
    
    public Employe(String pseudo,String nom, String prenom) {
        super(pseudo,nom, prenom);
        listTache = new HashSet<>();
    }
    
    
    
    public void addTache(Tache tache){
        if(!this.listTache.contains(tache))
            this.listTache.add(tache);
    }
    
    public void removeTache(Tache tache){
        this.listTache.remove(tache);
    }
}
