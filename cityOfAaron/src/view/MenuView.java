/*********************************************
 * Class: MenuView- base abstract class for all menu views
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import java.util.Scanner; 

/**
 *
 * @author mallorydibartolo
 */
public abstract class MenuView implements ViewInterface {
    
    //the data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in); 
    protected String menu; //this string holds the menu string
    protected int max; //this int holds the max input value
    
    /**
     * Menu View Constructor
     * Purpose: Initialize the view object with the menu string
     * Parameters: the menu string and the max value
     * Returns: none
     */
    
    public MenuView(String _menu, int _max) {
        this.menu = _menu; 
        this.max = _max; 
    }
    
    /**
    * The displayMenu method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    
    @Override public void displayMenu(){
        //execute this loop as long as the selected option is not max
        int menuOption = 0;
        do {
            // Display the Menu
            System.out.println(menu);
            
            // Prompt the User and get the user's input
            menuOption = getMenuOption();
             
            // Perform Desired action
            doAction(menuOption);
            
            // Determine and display the next view            
        } 
        while (menuOption != max); 
    }

    /**
     * The getUserInput method
     * Purpose: gets user input, makes sure it is within range
     * Parameters: none
     * Returns: the user input, between 1 and maxValue
     */
     
     @Override public int getMenuOption() {
     
     int inputValue = 0; 
     do {
        System.out.format("Please enter an option(1 - %d):", max);
        inputValue = keyboard.nextInt();
        if(inputValue < 1 || inputValue > max) {
            System.out.format("Error: input value must be between 1 and %d", max);
        }
       }
        while (inputValue < 1 || inputValue > max);
        
        return inputValue; 
    }
    }

