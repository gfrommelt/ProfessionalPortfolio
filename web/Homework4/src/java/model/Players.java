
package model;


public class Players {
    private int playerID;
    private String playerName;
    private int playerNumber;
    private String playerPosition;
    private String playercollege;
 
    public Players() {
        this.playerID = 0;
        this.playerName = "";
        this.playerNumber = 0;
        this.playerPosition = "";
        this.playercollege = "";
    }
    public Players(int playerID, String playerName, int playerNumber, String playerPosition, String playercollege) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.playerPosition = playerPosition;
        this.playercollege = playercollege;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getPlayercollege() {
        return playercollege;
    }

    public void setPlayercollege(String playercollege) {
        this.playercollege = playercollege;
    }

    @Override
    public String toString() {
        return "Players{" + "playerID=" + playerID + ", playerName=" + playerName + ", playerNumber=" + playerNumber + ", playerPosition=" + playerPosition + ", playercollege=" + playercollege + '}';
    }
    
    
    
    
    
}
