/*********************************************
 * Class: CropView
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/
package view;

import model.*;
import control.*;
import exceptions.*;
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
        cropReportView(cropData); 
        // call buyLandView
        buyLandView();
        
        // other cropView methods as they become relevant
        
        sellLandView(); 
        feedPeopleView(cropData); 
        plantCropsView(cropData); 
         
       
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
       
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        
        // get the user's input and save it
        int toBuy = 0;
        boolean paramsNotOkay; 
        do {
            try {
                System.out.print("How many acres of land do you wish to buy?");
                toBuy = keyboard.nextInt();            
                CropControl.buyLand(price, toBuy, cropData);
                if (toBuy == 1492) {
                    throw new CropException("Columbus Sailed the Ocean Blue");
                }
                
                paramsNotOkay = false;
            }
            catch (CropException e) {
                System.out.println("I am sorry master, I cannot do this."); 
                System.out.println(e.getMessage());
                paramsNotOkay = true; 
            }
       
        } while(paramsNotOkay); 
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
        int toSell = 0;
        // prompt user to enter number of of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        
        boolean ok = true;
        do {
            try {
                System.out.print("How many acres of land do you wish to sell?");
                toSell = keyboard.nextInt();
                
                if (toSell < 0) {
                    throw new CropException("Cannot Sell Negative Amount of Land");
                }                
                // actually sell the land
                CropControl.sellLand(price, toSell, cropData);
                ok =  false;
            }
            catch (CropException e) {
                System.out.println(e.getMessage());
                ok = true;
            }
        } while (ok);      
        
        // actually sell the land
       
    }
    
    public static void feedPeopleView(CropData cropData) {
        //get amount of wheat in store
        int wheat = cropData.getWheatInStore();
        //display wheat in store to user
        System.out.format("There are %d bushels of wheat in store.%n", wheat);
        
        boolean ok = true;
        do {
            try {
                //ask user how much wheat to feed the people
                System.out.print("How much wheat would you like to give to the people?");
                //get input
                int wheatForPeople = keyboard.nextInt(); 
                
                if (wheatForPeople < 0) {
                    throw new CropException("Cannot Feed People Negative Amount of Wheat");
                }
                
                if (wheatForPeople > wheat) {
                    throw new CropException("Cannot Feed People More Wheat than Possessed");
                }
                
                //give to the people
                CropControl.feedPeople(wheatForPeople, cropData);
                ok = false;
            }
            catch (CropException e) {
                System.out.println(e.getMessage());
                ok = true;
            }
        } while (ok);
        
         
        
    }
    
    public static void plantCropsView(CropData cropData) {
        //get acres owned by the player and wheat in store
        int acres = cropData.getAcresOwned(); 
        int wheat = cropData.getWheatInStore();
        //display
        System.out.format("You own %d acres of land.%n", acres); 
        System.out.format("There are %d bushels of wheat in store.%n", wheat);
        
        boolean ok = true;
        
        do {
            try {
                //ask user how many bushels of wheat they would like to plant
                System.out.print("How many acres would you like to plant?");
                //get input
                int landToPlant = keyboard.nextInt();
                
                if (landToPlant > acres) {
                    throw new CropException("Cannot Plant on more land than Possessed");
                }
                
                if (wheat < 0) {
                    throw new CropException("Cannot Plant without any wheat");
                }
                //plant the crops
                CropControl.plantCrops(landToPlant, cropData); 
             }
            catch (CropException e) {
                System.out.println(e.getMessage());
                ok = true;
            }
        } while (ok);
    }
    
    public static void cropReportView(CropData cropData) {
        System.out.println("Crop Report View"); 
       
        int year = cropData.getYear(); 
        int acresOwned = cropData.getAcresOwned(); 
        int wheatInStore = cropData.getWheatInStore();
        int population = cropData.getPopulation(); 
        
        //System.out.print(year);
        System.out.format("The year is %d. %n", year); 
        System.out.format("You own %d acres of land.%n", acresOwned); 
        System.out.format("There are %d bushels of wheat in store.%n", wheatInStore); 
        System.out.format("The population is %d people.%n", population); 
        
    }
}
