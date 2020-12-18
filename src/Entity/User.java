/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.UUID;

/**
 *
 * @author Emillien
 */
public class User extends Entity {
    
    protected String pseudo;
    protected String nom;
    protected String prenom;
    protected String password;
    protected String type;

    public User(UUID id,String pseudo,String password,String nom, String prenom) {
        this.id = id;
        this.pseudo = pseudo;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public User() {
        
    }
    
    public User(String pseudo, String nom, String prenom) {
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
 
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "pseudo=" + pseudo + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", type=" + type + '}';
    }
    
    
   
}
