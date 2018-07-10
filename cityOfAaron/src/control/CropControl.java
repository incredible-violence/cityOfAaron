/*********************************************
 * Class: CropControl
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package control;

import model.CropData;
import model.Game;
import exceptions.*;
import java.util.Random;

/**
 *
 * @author jamesK
 */

public class CropControl {
    
    // Variables
    
    private static int ACRES_PER_BUSHEL;
    private static int PEOPLE_PER_ACRE;
    private static int YIELD_BASE;
    private static int YIELD_RANGE;
    private static Game theGame;
    private static CropData cropData;
      
    // Constructors

    public CropControl() {
    }
        
    // Methods
    
    
    /**
     * Method: calcLandPrice [using parameters]
     * Purpose: return a random number with number range of parameters
     * @param min
     * @param max
     * @return landPrice
     */
    public static int calcLandPrice(int min, int max) {
        
        // Random number generator
        Random random = new Random();
        // Generate random number using parameters
        int landPrice = random.nextInt(max) + min;
        // Return result
        return landPrice;
    }
    
    /**
     * Method: calcLandPrice
     * Purpose: Generates a random number for the price of land
     * @return landPrice
     */
    public static int calcLandPrice() {
  
        Random random = new Random(); 
         //constants
        int LAND_BASE = 17; 
        int LAND_RANGE = 11; 
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        
        return landPrice;
    }
    
    /**
    * Method: buyLand
    * Purpose: to Buy Land
    * @param landPrice
    * @param acresToBuy
    * @param cropData
    * @return cropData.getAcresOwned()
    * Pre-Conditions: 
    * - acres to buy must be positive
    * - wheatInStore > price of new land
    * - population * 10 >= currentTotalLand + wantsToBuy
    */
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        try {
            int totalPrice = acresToBuy * landPrice;
                
            // if acresToBuy < 0, ERROR
            if (acresToBuy < 0) { 
                throw new CropException("A negative value was input.");  
               }
        
            // if wheatInStore < totalPrice, ERROR
            if (cropData.getWheatInStore() < totalPrice) { 
                throw new CropException("There is insufficient wheat to buy this much land."); 
            }
        
            // if population <= (oldAcres + newAcres) / 10, ERROR
            if ((cropData.getPopulation() * 10) < (cropData.getAcresOwned() + acresToBuy)) { 
                throw new CropException("The population isn't large enough to buy this much land.");  
            }
        
            if (acresToBuy == 0) { return cropData.getAcresOwned(); }
        
            else {
                // else, add number of acres purchased to acres owned
                cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
        
                // subtract price from WheatInStore
                cropData.setWheatInStore(cropData.getWheatInStore() - totalPrice);
        
                // return new acresOwned Value
                return cropData.getAcresOwned();
                //return cropData.getAcresOwned();
            }
        }
        // There needs to be a catch here
        catch (CropException e) {
            System.out.println("I cannot do that Dave");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    /**
     * Method: sellLand
     * Purpose: to Sell Land
     * @param landPrice
     * @param acresToSell
     * @param cropData
     * @return cropData.getAcresOwned()
     * Pre-Conditions: 
     * - acres to sell must be positive
     * - acres to sell must be greater or equal to acres owned
     */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) {
       try {
        // acresOwned Variable
        int acresOwned = cropData.getAcresOwned();
        
        // if acresToSell < 0, return -1
        if (acresToSell < 0)
            throw new CropException("A negative value was input.");   
        
        // if acresToSell > acresOwned, return -1
        if (acresToSell > acresOwned)
            throw new CropException("You don't own enough land to sell that amount.");  
        
        // if pre-conditions are met, this code block is executed
        else {
        // acresOwned - acresToSell
        acresOwned -= acresToSell;
        
        // save the new acresOwned amount            
        cropData.setAcresOwned(acresOwned);
        
        // wheatInStore = wheatInStore + (acresToSell * landPrice)
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
       
        // save result to wheatInStore
        cropData.setWheatInStore(wheatInStore);
        }
        // return acresOwned
        return cropData.getAcresOwned(); 
    }
       catch (CropException e) {
            System.out.println("I cannot do that Dave");
            System.out.println(e.getMessage());
        }
       return cropData.getAcresOwned(); 
    }
    public static int setOffering(int percent, CropData cropData) {
       
        if (percent > 0) {
            int offering = (percent * cropData.getWheatInStore()) / 100;
            cropData.setOffering(offering);
            return offering;
        }
        
        if (percent == 0) {
            return 0;            
        }
        
        else {
            return -1;
        }
    }
    
    /**
    * Method: feedPeople
    * Purpose: feed the people
    * @param wheatForPeople
    * @param cropData
    * @return CropData.wheatInStore
    * Pre-Conditions:
    *  -wheatForPeople must be a positive number
    *  -wheatInStore > wheatForPeople
    */
    public static int feedPeople(int wheatForPeople, CropData cropData){
        try {
        int wheatInStore = cropData.getWheatInStore(); 
        
        if (wheatForPeople < 0) {
            throw new CropException("A negative value was input.");
        }
        
        
        if (wheatInStore < wheatForPeople) {
            throw new CropException("Sorry, you don't have enough wheat.");
        }
        
         if (wheatForPeople < wheatInStore) {
            wheatInStore -= wheatForPeople; 
            cropData.setWheatInStore(wheatInStore);
            cropData.setWheatForPeople(wheatForPeople);
            return cropData.getWheatInStore();
        }
        
        }
        catch (CropException e) {
            System.out.println("I cannot do that Dave");
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    /**
    * Method: plantCrops
    * Purpose: plant crops
    * @param landToPlant
    * @param cropData.wheatInStore
    * @return cropData.getWheatInStore()
    * Pre-Conditions:
    * -landToPlant >= 0
    * -landToPlant <= CropData.acresOwned
    * -landToPlant <= CropData.wheatInStore / 2
    */
    public static int plantCrops(int landToPlant, CropData cropData) {
        
        int acresOwned = cropData.getAcresOwned(); 
        int wheatInStore = cropData.getWheatInStore();
       
    
        if (landToPlant < 0) { 
            return -1; 
        }
        
        if (landToPlant == 0) { 
            return wheatInStore; 
        }
        
        if (landToPlant > acresOwned) { 
            return -1; 
        } 
        
        if ((landToPlant / 2) < wheatInStore) {
            int wheatRequired = landToPlant / 2; 
            wheatInStore -= wheatRequired;
            cropData.setWheatInStore(wheatInStore);
            return cropData.getWheatInStore();
        }
        
        if ((landToPlant / 2) == wheatInStore) { 
            return 0; 
        }
        
        return -1;
    }

    // getters and setters

    public static int getACRES_PER_BUSHEL() {
        return ACRES_PER_BUSHEL;
    }

    public static void setACRES_PER_BUSHEL(int ACRES_PER_BUSHEL) {
        CropControl.ACRES_PER_BUSHEL = ACRES_PER_BUSHEL;
    }

    public static int getPEOPLE_PER_ACRE() {
        return PEOPLE_PER_ACRE;
    }

    public static void setPEOPLE_PER_ACRE(int PEOPLE_PER_ACRE) {
        CropControl.PEOPLE_PER_ACRE = PEOPLE_PER_ACRE;
    }

    public static int getYIELD_BASE() {
        return YIELD_BASE;
    }

    public static void setYIELD_BASE(int YIELD_BASE) {
        CropControl.YIELD_BASE = YIELD_BASE;
    }

    public static int getYIELD_RANGE() {
        return YIELD_RANGE;
    }

    public static void setYIELD_RANGE(int YIELD_RANGE) {
        CropControl.YIELD_RANGE = YIELD_RANGE;
    }

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CropControl.theGame = theGame;
    }

    public static CropData getCropData() {
        return cropData;
    }

    public static void setCropData(CropData cropData) {
        CropControl.cropData = cropData;
    }
    
    // other

    @Override
    public String toString() {
        return "CropControl{" + '}';
    }
    
    
}
