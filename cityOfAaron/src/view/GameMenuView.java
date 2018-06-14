/*********************************************
 * Class: GameMenuView
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.*;

/**
 *
 * @author
 */
public class GameMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String gameMenu;
    private int max;
    //Not sure about this line of code below: 
    Game theGame = new Game(); 
    
    /**
     * Constructor
     * Purpose: Initialize menu data
     * Parameters: none
     * Returns: none
     */
    public GameMenuView() {
        
        gameMenu = "\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : GAME MENU   *\n" +
                "*********************************\n" +
                " 1 - Map\n" +
                " 2 - List\n" +
                " 3 - Move to New Location\n" + 
                " 4 - Manage Crops\n" + 
                " 5 - Quit\n"; 
        max = 5;
    }
    
    /**
     * Method: displayGameMenuView
     * Purpose: displays the menu, gets user input, does the thing
     * Parameters: none
     * Returns: none
     */
    public void displayMenuView() {
        int menuOption;
        do {
            // Display the Menu
            System.out.println(gameMenu);
            
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
            // If option 1, call viewMap()
            case 1:
                viewMap();
                break;
            // if option 2, call viewList()
            case 2:
                viewList();
                break;
            // if option 3, call displayHelpMenu()
            case 3:
                moveToNewLocation();
                break;
            // if option 4, call displaySaveGame()
            case 4:
                manageCrops();
                break;
            // if option 5, display goodbye message
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
    
    /**
     * Method: viewMap
     * Purpose: view the goals of the game
     * Parameters: none
     * Returns: none
     */
    public void viewMap() {
        System.out.println("View Map Option Selected");
    }
    
    /**
     * Method: viewMapHelp
     * Purpose: get help with the map
     * Parameters: none
     * Returns: none
     */
    public void viewList() {
        System.out.println("View List Option Selected");
    }
    
    /**
     * Method: viewMoveHelp
     * Purpose: get help moving
     * Parameters: none
     * Returns: none
     */
    public void moveToNewLocation() {
        System.out.println("Move to New Location Option Selected");
    }
    
    /**
     * Method: viewListHelp
     * Purpose: view the list help options
     * Parameters: none
     * Returns: none
     */
    public void manageCrops() {
        System.out.println("Manage Crops Option Selected");
    }
}
