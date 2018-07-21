/*********************************************
 * Class: GameMenuView
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import java.util.Scanner;
import model.*;
import control.*; 

/**
 *
 * @author jamesk mallory di bartolo
 */
public class GameMenuView extends MenuView {
    
    Scanner keyboard = new Scanner(System.in);
    //Not sure about this line of code below: 
    Game theGame = new Game(); 
    
    /**
     * Constructor
     * Purpose: Initialize menu data
     * Parameters: none
     * Returns: none
     */
    public GameMenuView() {
       
        super("\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : GAME MENU   *\n" +
                "*********************************\n" +
                " 1 - Map\n" +
                " 2 - List\n" +
                " 3 - Move to New Location\n" + 
                " 4 - Manage Crops\n" + 
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
        GameControl theGameControl = new GameControl();
        theGameControl.displayMap(); 
    }
    
    /**
     * Method: viewList
     * Purpose: Creates a ViewList object and calls its displayMenuView() method
     * Parameters: none
     * Returns: none
     */
    public void viewList() {
        System.out.println("View List Option Selected");
        ListMenuView lv = new ListMenuView();
        lv.displayMenu(); 
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
        CropView manageCrops = new CropView(); 
        manageCrops.runCropsView(); 
        
    }
}
