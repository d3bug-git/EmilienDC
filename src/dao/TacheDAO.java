/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Tache;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

/**
 *
 * @author Emilien
 */
public class TacheDAO extends DAO<Tache>{

    public TacheDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Tache obj) {
        return false;
    }

    @Override
    public boolean delete(Tache obj) {
   return false;
    }

    @Override
    public boolean update(Tache obj) {
    return false;
    }

    public Tache find(UUID id) {
        Tache tache = new Tache();
       try {
      ResultSet result = this.connect.createStatement(
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM taches WHERE tache_id = " + id.toString());
      if(result.first())
        tache = new Tache(
          id,
          result.getString("nom")
       );         
    } catch (SQLException e) {
        e.printStackTrace();
    }
   return tache;
    }
    
}
