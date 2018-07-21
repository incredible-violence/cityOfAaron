/*********************************************
 * Class: MainMenuView
 * Layer: View
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import java.util.Scanner;
import control.*; 

/**
 *
 * @author jamesK mallorydibartolo
 */
public class MainMenuView extends MenuView {
    
    Scanner keyboard = new Scanner(System.in);
    
    /**
     * Constructor
     * Purpose: Initialize menu data
     * Parameters: none
     * Returns: none
     */
    public MainMenuView() {
        
        super("\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : MAIN MENU   *\n" +
                "*********************************\n" +
                " 1 - Start New Game\n" +
                " 2 - Get and Start a Saved Game\n" +
                " 3 - Get Help on Playing the Game\n" + 
                " 4 - Save Game\n" + 
                " 5 - Quit\n", 
                5);
    }
    
    /**
     * Method: doAction
     * Purpose: performs selected option
     * Parameters:
     * @param option
     * Returns: none
     */
    @Override public void doAction(int option) {
        // governing switch statement
        switch (option) {
            // If option 1, call startNewGame()
            case 1:
                startNewGame();
                break;
            // if option 2, call startSavedGame()
            case 2:
                startSavedGame();
                break;
            // if option 3, call displayHelpMenu()
            case 3:
                displayHelpMenuView();
                break;
            // if option 4, call displaySaveGame()
            case 4:
                displaySaveGameView();
                break;
            // if option 5, display goodbye message
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
    
    /**
     * Method: startNewGame
     * Purpose: creates game object, starts game
     * Parameters: none
     * Returns: none
     */
    public void startNewGame() {
        
        //Show banner page
        System.out.println(
        "***********************************************************\n" +
        "* Welcome to the City of Aaron. You have been summoned *\n"    +
        "* by the High Priest to assume your role as ruler of *\n"      +
        "* the city. Your responsibility is to buy land, sell *\n"      +
        "* land, determine how much wheat to plant each year, *\n"      +
        "* and how much to set aside to feed the people. You *\n"       +
        "* will also be required to pay an annual tithe on the *\n"     +
        "* wheat that is harvested. If you fail to provide *\n"         +
        "* enough wheat for the people to eat, people will die *\n"     +
        "* and your workforce will be diminished. Plan very *\n"        +
        "* carefully or you may find yourself in trouble with *\n"      +
        "* the people. And oh, watch out for plagues and rats! *\n"     +
        "***********************************************************/n");
        
        // Prompt for and get the user's name
        String name;
        System.out.println("Please type in your first name: ");
        name = keyboard.next();
        
         // Display a welcome message
        System.out.println("Welcome " + name + ". Have fun playing."); 
        
        //call the createNewGame() method. Pass the name as a parameter
        GameControl.createNewGame(name); 
        
        //show the game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu(); 
        
        //******** CODE SNIPPET ONE HERE */
        
        }
    
    /**
     * Method: startSavedGame
     * Purpose: creates game object, starts game
     * Parameters: none
     * Returns: none
     */
    public void startSavedGame() {
        System.out.println("Start Saved Game option Selected");
        
        Scanner input = new Scanner(System.in);    

        // get rid of \n character left in the stream
        input.nextLine();
        // prompt user to get a file path
        System.out.println("File path of the game wanted: ");
        String fileName;
        fileName = input.nextLine();
        // call the getSavedGame() method in the GameControl class
        GameControl gc = new GameControl();
        gc.getSavedGame(fileName);

        // display the game menu for the loaded game
        GameMenuView gm = new GameMenuView();
        gm.displayMenu();
    }
    
    /**
     * Method: displayHelpMenuView
     * Purpose: moves user to the Help Menu
     * Parameters: none
     * Returns: none
     */
    public void displayHelpMenuView() {
        System.out.println("Display Help Menu View option Selected");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }
    
    /**
     * Method: displaySaveGameView
     * Purpose: creates game object, starts game
     * Parameters: none
     * Returns: none
     */
    public void displaySaveGameView() {
        System.out.println("Display Save Game View option Selected");
        SaveGameView sg = new SaveGameView();
        sg.displayMenu();
    }
}

/* CODE SNIPPET ONE */
// Create the new Game object
        //Game theGame = new Game();
        
        // Save a reference to it in the GameProject class
        //CityOfAaron.setTheGame(theGame);
        
        // Display the Banner page
        //System.out.println("Welcome to the city of Aaron."); 
        
        // Create a new Player object
        //Player thePlayer = new Player(); 
                
       
        
        // Save the user's name in the Player object
        //thePlayer.setName(name);
        
        // Save a reference to the player object in the Game object
        //theGame.setThePlayer(thePlayer);
        
       
        
        // Display the Game menu
        
        // Create a CropData object
        //CropData cropData = new CropData();
        
        // initialize it
        //cropData.setYear(0);
        //cropData.setPopulation(100);
        //cropData.setNewPeople(5);
        //cropData.setCropYield(3);
        //cropData.setNumberWhoDied(0);
        //cropData.setOffering(10);
        //cropData.setWheatInStore(2700);
        //cropData.setAcresOwned(1000);
        //cropData.setAcresPlanted(1000);
        //cropData.setHarvest(3000);
        //cropData.setOfferingBushels(300);
        
        // save
        //theGame.setCropData(cropData);