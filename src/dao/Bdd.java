/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import sql.query.SqlCreateStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author Emillien
 */
public class Bdd {
  //URL de connexion
  private String url = "jdbc:sqlite:AppEmilienDC.db";
  
  private static final String FAKE_ID = "1dcebf46-4936-44c4-a0a0-e87dcf078d5e";

  //Objet Connection
  private static Connection connection;

  //Constructeur privé
  private Bdd(){
      
       
      try {
          Class.forName("org.sqlite.JDBC");
          connection = DriverManager.getConnection(url);
          this.setup();
      } catch (ClassNotFoundException | SQLException ex) {
          Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
      }

  }

  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
   public static Connection getInstance(){
    if(connection == null){
       new Bdd();
    }
    return connection;   
  } 
   
   private void setup() throws SQLException{      
        Statement stmt = connection.createStatement();
        
        stmt.execute(SqlCreateStatement.CREATE_TABLE_USERS_IF_NOT_EXITS);
        stmt.execute(SqlCreateStatement.CREATE_TABLE_TASKS_IF_NOT_EXITS);
        
        if(null == DAOFactory.getUserDAO().find(UUID.fromString(FAKE_ID))){
            stmt.executeUpdate(SqlCreateStatement.CREATE_FAKE_DATA_USERS);
        }
        

   }
   
}
