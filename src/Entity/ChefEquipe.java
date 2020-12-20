/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.UUID;

/**
 *
 * @author hognoul
 */
public class ChefEquipe extends Personne{
    
    public ChefEquipe(UUID id,String pseudo,String password, String nom, String prenom) {
        super(id,pseudo,password, nom, prenom);
    }
    
}
