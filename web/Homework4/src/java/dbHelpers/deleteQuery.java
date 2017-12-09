/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Greg
 */
public class deleteQuery {
    
    private Connection conn;
    
    public deleteQuery()throws SQLException {
     
     Properties props = new Properties();
     InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(deleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(deleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     String driver = props.getProperty("driver.name");
     String url = props.getProperty("server.name");
     String username = props.getProperty("user.name");
     String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(deleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
     conn = DriverManager.getConnection(url, username, passwd);
     
     
 }
    
    public void doDelete(int playerID){
        try {
            String query = "DELETE FROM players WHERE playerID =?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, playerID);
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(deleteQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 
}

    
    

