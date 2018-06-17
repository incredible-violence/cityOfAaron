/*********************************************
 * Class: HelpMenuView
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
 * @author jamesK
 */
public class HelpMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String helpMenu;
    private int max;
    
    /**
     * Constructor
     * Purpose: Initialize Help Menu Data
     * Parameters: None
     * Returns: None
     */
    public HelpMenuView() {
        
        helpMenu = "\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : HELP MENU   *\n" +
                "*********************************\n" +
                " 1 - View Goals\n" +
                " 2 - Map\n" +
                " 3 - Movement\n" + 
                " 4 - List\n" + 
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
            System.out.println(helpMenu);
            
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
            // If option 1, call viewGoals()
            case 1:
                viewGoals();
                break;
            // if option 2, call viewMapHelp()
            case 2:
                viewMapHelp();
                break;
            // if option 3, call viewMoveHelp()
            case 3:
                viewMoveHelp();
                break;
            // if option 4, call viewListHelp()
            case 4:
                viewListHelp();
                break;
            // if option 5, display goodbye message
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
    
    /**
     * Method: viewGoals
     * Purpose: view the goals of the game
     * Parameters: none
     * Returns: none
     */
    public void viewGoals() {
        System.out.println("View Goals Option Selected");
    }
    
    /**
     * Method: viewMapHelp
     * Purpose: get help with the map
     * Parameters: none
     * Returns: none
     */
    public void viewMapHelp() {
        System.out.println("View Map Help Option Selected");
    }
    
    /**
     * Method: viewMoveHelp
     * Purpose: get help moving
     * Parameters: none
     * Returns: none
     */
    public void viewMoveHelp() {
        System.out.println("View Move Help Option Selected");
    }
    
    /**
     * Method: viewListHelp
     * Purpose: view the list help options
     * Parameters: none
     * Returns: none
     */
    public void viewListHelp() {
        System.out.println("View List Help Option Selected");
    }
    
}
