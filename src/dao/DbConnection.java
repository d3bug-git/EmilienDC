/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Emillien
 */
public class DbConnection {
  //URL de connexion
  private String url = "jdbc:sqlite:AppEmilienDC.db";

  //Objet Connection
  private static Connection connection;

  //Constructeur privé
  private DbConnection(){
      
       
      try {
          Class.forName("org.sqlite.JDBC");
          connection = DriverManager.getConnection(url);
      } catch (ClassNotFoundException | SQLException ex) {
          Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
      }

  }

  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
   public static Connection getInstance(){
    if(connection == null){
       new DbConnection();
    }
    return connection;   
  } 
}
