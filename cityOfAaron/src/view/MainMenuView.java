/*********************************************
 * Class: MainMenuView
 * Layer: View
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Player;
import model.*;

/**
 *
 * @author jamesK mallorydibartolo
 */
public class MainMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
    /**
     * Constructor
     * Purpose: Initialize menu data
     * Parameters: none
     * Returns: none
     */
    public MainMenuView() {
        
        theMenu = "\n" + 
                "*********************************\n" + 
                "* CITY OF AARON: MAIN GAME MENU *\n" +
                "*********************************\n" +
                " 1 - Start New Game\n" +
                " 2 - Get and Start a Saved Game\n" +
                " 3 - Get Help on Playing the Game\n" + 
                " 4 - Save Game\n" + 
                " 5 - Quit\n";
        max = 5;
    }
    
    /**
     * Method: displayMenuView
     * Purpose: displays the menu, gets user input, does the thing
     * Parameters: none
     * Returns: none
     */
    public void displayMenuView() {
        int menuOption;
        do {
            // Display the Menu
            System.out.println(theMenu);
            
            // Prompt the User and get the user's input
            menuOption = getMenuOption();
             
            // Perform Desired action
            doAction(menuOption);
            
            // Determine and display the next view            
        } 
        while (menuOption != max); 
    }

    /**
     * Method: getMenuOption()
     * Purpose: get the user's input
     * Parameters: none
     * Returns: integer - the option selected.
     * @return userInput
     */
    public int getMenuOption() {
        // declare a variable to hold user input
        int userInput;
        
        // begin loop
        do {
            // get user input from keyboard
            userInput = keyboard.nextInt();
            // if not valid, output error
            if (userInput < 1 || userInput > max) {
                System.out.println("Option must be between 1 and " + max);
            }
        // loop back to top if input not valid
        } while(userInput < 1 || userInput > max);
        // return value input by the user
        return userInput;
    }
    
    /**
     * Method: doAction
     * Purpose: performs selected option
     * Parameters:
     * @param option
     * Returns: none
     */
    public void doAction(int option) {
        // governing switch statement
        switch (option) {
            // If option 1, call startNewGame()
            case 1:
                startNewGame();
                break;
            // if option 2, call startExistingGame()
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
        
        //Create the new Game object
        Game theGame = new Game();
        
        //Save a reference to it in the GameProject class
        CityOfAaron.setTheGame(theGame);
        
        //Display the Banner page
        System.out.println("Welcome to the city of Aaron."); 
        
        //Create a new Player object
        Player thePlayer = new Player(); 
                
        //Prompt for and get the user's name
        String name;
        System.out.println("Please type in your first name: ");
        name = keyboard.next();
        
        //Save the user's name in the Player object
        thePlayer.setName(name);
        
        //Save a reference to the player object in the Game object
        theGame.setThePlayer(thePlayer);
        
        //Display a welcome message
        System.out.println("Welcome " + name + ". Have fun."); 
        
        //Display the Game menu
        
        // Create a CropData object
        CropData cropData = new CropData();
        }
    
    
    /**
     * Method: startSavedGame
     * Purpose: creates game object, starts game
     * Parameters: none
     * Returns: none
     */
    public void startSavedGame() {
        System.out.println("Start Saved Game option Selected");
    }
    
    /**
     * Method: displayHelpMenuView
     * Purpose: creates game object, starts game
     * Parameters: none
     * Returns: none
     */
    public void displayHelpMenuView() {
        System.out.println("Display Help Menu View option Selected");
    }
    
    /**
     * Method: displaySaveGameView
     * Purpose: creates game object, starts game
     * Parameters: none
     * Returns: none
     */
    public void displaySaveGameView() {
        System.out.println("Display Save Game View option Selected");
    }
}
