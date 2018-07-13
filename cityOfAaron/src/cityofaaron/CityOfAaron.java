
/*********************************************
 * Class: Main / CityOfAaron
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package cityofaaron;

import control.*;
import model.*;
import view.*;

/**
 *
 * @author jamesK
 */

public class CityOfAaron {
    // variable for keeping a reference to Game object
    private static Game theGame = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        // TESTING MAINMENUVIEW CLASS
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
         
    }

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }
    
    
}

/****************************************
 * COMPLETED CLASS TESTING METHODS
 ***************************************/
    /*
        // TESTING PLAYER CLASS
        System.out.println("TESTING PLAYER CLASS");
        Player playerOne = new Player();
        playerOne.setName("Bob Saget");
        String playerOneName = playerOne.getName();
        // TESTING SET METHOD
        System.out.println("Name = " + playerOneName);
        // TESTING GET METHOD
        System.out.println(playerOne.getName());
    */
    /*   
        // TESTING ENUM
        System.out.println("TESTING TEAMMEMBER ENUM");
        String teamMemberName = TeamMember.Admin.getName();
        String teamMemberTitle = TeamMember.Admin.getTitle();
        System.out.println("Team Member Name: " + teamMemberName); 
        System.out.println("Team Member Title: " + teamMemberTitle);
    */
    /*
        // TESTING Game CLASS [WORK IN PROGRESS]
        System.out.println("TESTING GAME CLASS");
        Game gameOne = new Game();
        gameOne.setThePlayer(playerOne);
        System.out.println("Player of Game One: " + gameOne.getThePlayer());
    */
    /*
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
    */
    /*
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
    */
    /*
        // TESTING CropData Class via constructor
        System.out.println("TESTING CROPDATA CLASS w/ CONSTRUCTOR");
        CropData cropdata = new CropData(2018, 1000, 1500, 200, 400, 1, 2, 
                400, 250, 50, 20, 1000, 259, 56, 2, 50);
        System.out.println("Year: " + cropdata.getYear());
        System.out.println("Population: " + cropdata.getPopulation());
        System.out.println("Acres Owned: " + cropdata.getAcresOwned());
        System.out.println("Crop Yield: " + cropdata.getCropYield());
        System.out.println("Wheat In Store: " + cropdata.getWheatInStore());
        System.out.println("Number Who Died: " + cropdata.getNumberWhoDied());
        System.out.println("New People: " + cropdata.getNewPeople());
        System.out.println("Harvest: " + cropdata.getHarvest());
        System.out.println("Harvest After Offering: " + cropdata.getHarvestAfterOffering());
        System.out.println("Offering: " + cropdata.getOffering());
        System.out.println("Offering in Bushels: " + cropdata.getOfferingBushels());
        System.out.println("People Fed: " + cropdata.getPeopleFed());
        System.out.println("Acres Planted: " + cropdata.getAcresPlanted());
        System.out.println("Number Starved: " + cropdata.getNumStarved());
        System.out.println("Eaten By Rats: " + cropdata.getEatenByRats());
        System.out.println("Wheat for People: " + cropdata.getWheatForPeople());
    */
    /*
        // TESTING Map Class
        System.out.println("TESTING MAP CLASS w/ CONSTRUCTOR");
        Map map = new Map(25, 25);
        System.out.println("Row Count: " + map.getColCount());
        System.out.println("Column Count: " + map.getRowCount());
    */