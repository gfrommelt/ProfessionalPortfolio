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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Players;

/**
 *
 * @author Greg
 */
public class SearchQuery {
    
   private Connection conn;
   private ResultSet results;
   
   public SearchQuery()throws SQLException {
     
     Properties props = new Properties();
     InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     String driver = props.getProperty("driver.name");
     String url = props.getProperty("server.name");
     String username = props.getProperty("user.name");
     String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
     conn = DriverManager.getConnection(url, username, passwd);
     
     
 }
    
   public void doSearch(String playerName){
       
       try {
           String query = "SELECT * FROM players WHERE UPPER(playerName) LIKE ? ORDER BY playerNumber ASC";
           
           PreparedStatement ps = conn.prepareStatement(query);
           ps.setString(1, "%" + playerName.toUpperCase() + "%");
           this.results = ps.executeQuery();
       } catch (SQLException ex) {
           Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       
   }


    public String getHTMLTable() {
        
    String table = "";
    table += "<table>";
   
    table+="<tr>";
         table+="<th>Player Name</th>";
         table+="<th>Number Name</th>";
         table+="<th>Position</th>";
         table+="<th>College</th>";
         table+="<th>Delete?</th>";
    table+="</tr>";
        try {
            while(this.results.next()){
                
                Players player =new Players();
                player.setPlayerID(this.results.getInt("playerID"));
                player.setPlayerName(this.results.getString("playerName"));
                player.setPlayerNumber(this.results.getInt("playerNumber"));
                player.setPlayerPosition(this.results.getString("playerPosition"));
                player.setPlayercollege(this.results.getString("playerCollege"));
                
               
              
                table +="<tr>";
                table +="<td>";
                table += player.getPlayerName();
                table +="</td>";
                table +="<td>";
                table += player.getPlayerNumber();
                table +="</td>";
                table +="<td>";
                table += player.getPlayerPosition();
                table +="</td>";
                table +="<td>";
                table += player.getPlayercollege();
                table +="</td>";
                 table +="<td>";
                table += "<a href=update?playerID=" + player.getPlayerID() + ">Update</a>"+"<a href=delete?playerID=" + player.getPlayerID() + ">Delete</a>";
                table +="</td>";
                
                
                table +="</tr>";
            }     } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    table += "</table>";
            
            return table;
       
    }



}
