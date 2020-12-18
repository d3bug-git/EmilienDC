/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import sql.query.SqlMetierStatement;

/**
 *
 * @author hognoul
 */
public class UserDAO extends DAO<User> {

    public UserDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User find(UUID id) {
        User user = new User();

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(SqlMetierStatement.FIND_USER_BY_ID);
            preparedStatement.setString(1, id.toString());
            ResultSet result = preparedStatement.executeQuery();
            if (result.next()) {
                user.setId(UUID.fromString(result.getString("utilisateur_id")));
                user.setPseudo(result.getString("pseudo"));
                user.setPassword(result.getString("mot_de_passe"));
                user.setNom(result.getString("nom"));
                user.setPrenom(result.getString("prenom"));
                user.setType(result.getString("type"));
                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User findByPseudo(String pseudo) {

        User user = new User();
        
        try {
            PreparedStatement preparedStatement = connect.prepareStatement(SqlMetierStatement.FIND_USER_BY_PSEUDO);
            preparedStatement.setString(1, pseudo);
            
            ResultSet result = preparedStatement.executeQuery();
            
            if (result.next()) {
                user.setId(UUID.fromString(result.getString("utilisateur_id")));
                user.setPseudo(result.getString("pseudo"));
                user.setPassword(result.getString("mot_de_passe"));
                user.setNom(result.getString("nom"));
                user.setPrenom(result.getString("prenom"));
                user.setType(result.getString("type"));

                return user;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }

}
