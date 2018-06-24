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
                " 1 - Option 1\n" +
                " 2 - Option 2\n" +
                " 3 - Option 3\n" + 
                " 4 - Option 4\n" + 
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
            // If option 1, call viewGoals()
            case 1:
                optionOne();
                break;
            // if option 2, call viewMapHelp()
            case 2:
                optionTwo();
                break;
            // if option 3, call viewMoveHelp()
            case 3:
                optionThree();
                break;
            // if option 4, call viewListHelp()
            case 4:
                optionFour();
                break;
            // if option 5, display goodbye message
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }
    
    public void optionOne() {
        System.out.println("Option 1 Selected");
    }
    
    public void optionTwo() {
        System.out.println("Option 2 Selected");
    }
    
    public void optionThree() {
        System.out.println("Option 3 Selected");
    }
    
    public void optionFour() {
        System.out.println("Option 4 Selected");
    }
}
