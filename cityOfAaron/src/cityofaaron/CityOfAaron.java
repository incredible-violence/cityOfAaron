
/*
 * Main class file for cityOfAaron
 * CIT_260
 * Spring 2018
 * Team: James Kennedy,
 */

package cityofaaron;

import model.CropData;
import model.Player;
import model.Game;
import model.TeamMember;
import model.Location; 
import model.ListItem; 
import model.Map;

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
        
        // TESTING Game CLASS [WORK IN PROGRESS]
        /*
        System.out.println("TESTING GAME CLASS");
        Game gameOne = new Game();
        gameOne.setThePlayer(playerOne);
        System.out.println("Player of Game One: " + gameOne.getThePlayer());
        */
        
        // TESTING LOCATION CLASS
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
        
        // TESTING ListItem CLASS
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
        
        // TESTING CropData Class via constructor
        System.out.println("TESTING CROPDATA CLASS");
        CropData cropdata = new CropData(2018, 1000, 1500, 200, 400, 1, 2, 
                400, 250, 50, 20, 1000, 259, 56, 2, 50);
        System.out.println("Year: " + cropdata.getYear());
        System.out.println("Population: " + cropdata.getPopulation());
        System.out.println("Acres Owned: " + cropdata.getAcresOwned());
        System.out.println("Crop Yield: " + cropdata.getCropYield());
        System.out.println("Wheat In Store: " + cropdata.getWheatInStore());
        /* I'll add the rest later */
        
        // TESTING Map Class
        System.out.println("TESTING MAP CLASS");
        Map map = new Map(25, 25);
        System.out.println("Row Count: " + map.getColCount());
        System.out.println("Column Count: " + map.getRowCount());
        
    }
    
        
        
     
}

