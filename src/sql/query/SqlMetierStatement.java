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
public class SqlMetierStatement {
    
    public static final String FIND_USER_BY_ID = "SELECT * FROM utilisateurs WHERE utilisateur_id = ?";
    public static final String FIND_USER_BY_PSEUDO = "SELECT * FROM utilisateurs WHERE pseudo = ?";
}
