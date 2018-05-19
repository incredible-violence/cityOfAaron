
/*
 * Main class file for cityOfAaron
 * CIT_260
 * Spring 2018
 * Team: James Kennedy,
 */
package cityofaaron;

import model.Player;
import model.Game;
import model.TeamMember;
import model.Location; 

/**
 *
 * @author jamesK
 */

public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TESTING PLAYER CLASS
        Player playerOne = new Player();
        playerOne.setName("Bob Saget");
        String playerOneName = playerOne.getName();
        // TESTING SET METHOD
        System.out.println("Name = " + playerOneName);
        // TESTING GET METHOD
        System.out.println(playerOne.getName());
        
        
        // TESTING ENUM
        String teamMemberName = TeamMember.Admin.getName();
        String teamMemberTitle = TeamMember.Admin.getTitle();
        System.out.println("Team Member Name: " + teamMemberName); 
        System.out.println("Team Member Title: " + teamMemberTitle);
        
        // TESTING GAME CLASS [WORK IN PROGRESS]
        /*
        Game gameOne = new Game();
        gameOne.setThePlayer(playerOne);
        System.out.println("Player of Game One: " + gameOne.getThePlayer());
        */
        
        //TESTING LOCATION CLASS
        Location locationDescription = new Location();
        locationDescription.setDescription("Mountain"); 
        String locationDescriptionOne = locationDescription.getDescription();
        //TESTING SET METHOD
        System.out.println("Description = " + locationDescriptionOne); 
        //TESTING GET METHOD
        System.out.println(locationDescription.getDescription());
        
    }
}

