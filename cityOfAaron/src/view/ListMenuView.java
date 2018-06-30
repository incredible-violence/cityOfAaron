/*********************************************
 * Class: ListMenuView
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
 * @authorjamesk
 */
public class ListMenuView extends MenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String listMenu;
    private int max;
    
    /**
     * Constructor
     */
    public ListMenuView() {
        super("\n" +  
                "*********************************\n" + 
                "*   CITY OF AARON : LIST MENU   *\n" +
                "*********************************\n" +
                " 1 - View the development team\n" +
                " 2 - View a list of animals\n" +
                " 3 - View a list of tools\n" + 
                " 4 - View a list of provisions\n" + 
                " 5 - Return to the game menu\n",
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
            // If option 1, call viewGoals()
            case 1:
                viewTeam();
                break;
            // if option 2, call viewMapHelp()
            case 2:
                viewAnimals();
                break;
            // if option 3, call viewMoveHelp()
            case 3:
                viewTools();
                break;
            // if option 4, call viewListHelp()
            case 4:
                viewProvisions();
                break;
            // if option 5, display goodbye message
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
    
    public void viewTeam() {
        System.out.println("Option 1 Selected");
    }
    
    public void viewAnimals() {
        System.out.println("Option 2 Selected");
    }
    
    public void viewTools() {
        System.out.println("Option 3 Selected");
    }
    
    public void viewProvisions() {
        System.out.println("Option 4 Selected");
    }
}
