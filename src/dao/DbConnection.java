/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Emillien
 */
public class DbConnection {
    //URL de connexion
  private String url = "jdbc:postgresql://localhost:5432/emilienDC";
  //Nom du user
  private String user = "postgres";
  //Mot de passe de l'utilisateur
  private String passwd = "postgres";
  //Objet Connection
  private static Connection connect;

  //Constructeur privé
  private DbConnection(){
    try {
      connect = DriverManager.getConnection(url, user, passwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
   public static Connection getInstance(){
    if(connect == null){
      new DbConnection();
    }
    return connect;   
  } 
}
