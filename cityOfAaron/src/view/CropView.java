/*********************************************
 * Class: CropView
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author jamesK
 */
public class CropView {
    
    // variables
    
    // Scanner Object
    private static Scanner keyboard = new Scanner(System.in);
    // References to Game and CropData
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();
    
    // methods
    
    /**
     * Method: runCropsView
     * Purpose: runs the game
     * Parameters: none
     * Returns: none
     */
    public static void runCropsView() {
        
        // call buyLandView
        buyLandView();
        
        // other cropView methods as they become relevant
    }
    
    /**
     * Method: buyLandView
     * Purpose: interface with user input for buying land
     * Parameters: none
     * Returns: none
     */
    public static void buyLandView() {
        
        // get the cost of land for this round 
        int price = CropControl.calcLandPrice();
        // prompt user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("How many acres of land do you wish to buy?");
        // get the user's input and save it
        int toBuy;
        toBuy = keyboard.nextInt();
        // call buyLand() in contol layer to actually buy the land
        CropControl.buyLand(price, toBuy, cropData);
    }
    
    /**
     * Method: sellLandView
     * Purpose: interface for selling land
     * Parameters: none
     * Returns: none
     */
    public static void sellLandView() {
        
        // get cost of land this round
        int price = CropControl.calcLandPrice();
        // prompt user to enter number of of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("How many acres of land do you wish to sell?");
        // get input
        int toSell;
        toSell = keyboard.nextInt();
        // actually sell the land
        CropControl.sellLand(price, toSell, cropData);
    }
}
