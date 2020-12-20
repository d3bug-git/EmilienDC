/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author Emilien
 */
public class DAOFactory {
    protected static final Connection conn = Bdd.getInstance();   

  /**
  * Retourne un objet Classe interagissant avec la BDD
  * @return DAO
  */
  public static TacheDAO getTacheDAO(){
    return new TacheDAO(conn);
  }
  
  /**
  * Retourne un objet Classe interagissant avec la BDD
  * @return DAO
  */
  public static UserDAO getUserDAO(){
    return new UserDAO(conn);
  }
}
