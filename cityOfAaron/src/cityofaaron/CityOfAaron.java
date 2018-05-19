
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
import model.ListItem; 

/**
 *
 * @author jamesK
 */

public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /****************************************
         * CLASS TESTING METHODS
         ***************************************/
     
        // TESTING PLAYER CLASS
        System.out.println("TESTING PLAYER CLASS");
        Player playerOne = new Player();
        playerOne.setName("Bob Saget");
        String playerOneName = playerOne.getName();
        // TESTING SET METHOD
        System.out.println("Name = " + playerOneName);
        // TESTING GET METHOD
        System.out.println(playerOne.getName());
        
        
        // TESTING ENUM
        System.out.println("TESTING TEAMMEMBER ENUM");
        String teamMemberName = TeamMember.Admin.getName();
        String teamMemberTitle = TeamMember.Admin.getTitle();
        System.out.println("Team Member Name: " + teamMemberName); 
        System.out.println("Team Member Title: " + teamMemberTitle);
        
        // TESTING GAME CLASS [WORK IN PROGRESS]
        /*
        System.out.println("TESTING GAME CLASS");
        Game gameOne = new Game();
        gameOne.setThePlayer(playerOne);
        System.out.println("Player of Game One: " + gameOne.getThePlayer());
        */
        
        //TESTING LOCATION CLASS
        System.out.println("TESTING LOCATION CLASS");
        Location location= new Location();
        location.setDescription("Mountain"); 
        String locationDescriptionOne = location.getDescription();
        location.setSymbol("Mountain Symbol");
        String locationSymbolOne = location.getSymbol(); 
        //TESTING SET METHOD
        System.out.println("Description = " + locationDescriptionOne); 
        System.out.println("Symbol = " + locationSymbolOne);
        //TESTING GET METHOD
        System.out.println(location.getDescription());
        System.out.println(location.getSymbol());
        
        //TESTING ListItem CLASS
        System.out.println("TESTING ListItem CLASS"); 
        ListItem itemOne = new ListItem();
        itemOne.setName("Item One"); 
        String itemOneName = itemOne.getName(); 
        itemOne.setNumber(1);
        int itemOneNumber = itemOne.getNumber(); 
        //TESTING SET METHOD
        System.out.println("List Items: ");
        System.out.println(itemOneNumber+ ". " + itemOneName); 
        //TESTING GET METHOD
        System.out.println(itemOne.getNumber());
        System.out.println(itemOne.getName());
        
        
    }
    
        
        
     
}

