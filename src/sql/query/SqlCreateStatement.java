/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql.query;

/**
 *
 * @author hognoul
 */
public class SqlCreateStatement {

    public static final String CREATE_TABLE_USERS_IF_NOT_EXITS = "CREATE TABLE IF NOT EXISTS utilisateurs(    utilisateur_id VARCHAR(255) PRIMARY KEY NOT NULL,    pseudo VARCHAR(100) NOT NULL UNIQUE, mot_de_passe varchar(255) NOT NULL,   nom VARCHAR(100) NOT NULL,    prenom VARCHAR(100) NOT NULL,type VARCHAR(255) NOT NULL)";
    public static final String CREATE_TABLE_TASKS_IF_NOT_EXITS = "CREATE TABLE IF NOT EXISTS taches(    tache_id VARCHAR(255) NOT NULL,    nom VARCHAR(100) NOT NULL,    utilisateur_id VARCHAR(255) NOT NULL,    PRIMARY KEY (tache_id ),    FOREIGN KEY (utilisateur_id ) REFERENCES utilisateurs(utilisateur_id ))";
    public static final String CREATE_FAKE_DATA_USERS = "INSERT INTO utilisateurs(utilisateur_id,pseudo,mot_de_passe,nom, prenom, type) VALUES ('1dcebf46-4936-44c4-a0a0-e87dcf078d5e','boss', 'azerty', 'Ponchaut', 'Emilien','PATRON'), ('6a7035cc-c107-4a40-ad0f-ad1c9f2cc670','chef', 'azerty', 'Ponchaut', 'Charline','CHEF_DE_PROJET'),('0fad93de-2a80-4cd2-b2b2-26282b8b6f9d','employe', 'azerty', 'Fremal', 'Sébastien','EMPLOYE')";
}
