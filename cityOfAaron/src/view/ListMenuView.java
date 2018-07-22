/*********************************************
 * Class: ListMenuView
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import java.util.Scanner;
import control.GameControl;

/**
 *
 * @author jamesk mallory di bartolo
 */
public class ListMenuView extends MenuView {
    
    Scanner keyboard = new Scanner(System.in);
    GameControl theGameControl = new GameControl();
    
    /**
     * Constructor
     */
    public ListMenuView() {
        super("\n" +  
                "*********************************\n" + 
                "*   CITY OF AARON : LIST MENU   *\n" +
                "*********************************\n" +
                " 1 - View the development team\n"    +
                " 2 - View a list of animals\n"       +
                " 3 - View a list of tools\n"         + 
                " 4 - View a list of provisions\n"    + 
                " 5 - Save a list of animals to local disk." +
                " 6 - Return to the game menu\n",
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
            // if option 5, call saveAnimals()
            case 5: 
                saveAnimals(); 
                break;
            // if option 5, display goodbye message
            case 6:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
    
    public void viewTeam() {
        System.out.println("View Team Selected");
    }
    
    public void viewAnimals() {
        System.out.println("View Animals Selected");
        GameControl.showAnimalsList();
    }
    
    public void viewTools() {
        System.out.println("View Tools Selected");
        GameControl.showToolsList();
        
    }
    
    public void viewProvisions() {
        System.out.println("Show Provisions Selected");
        GameControl.showProvisionsList(); 
    }
    
    public void saveAnimals() {
        System.out.println("Save Animal List Selected");
        GameControl.saveAnimalList(); 
        
    }
}
