/*********************************************
 * Class: CropControl
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package control;

import model.CropData;
import model.Game;

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
        
        // generate random number between 17 and 27 for landPrice
        
        // Ask user how many acres they want to buy
        
        // User input
        
        // if acresToBuy < 0, ERROR, ask again
        
        // if wheatInStore < totalPrice, ERROR, ask again
        
        // if population <= (oldAcres + newAcres) / 10, ERROR, ask again
        
        // else, add number of acres purchased to acres owned & subtract
        // price of land from wheatInStore
        
        // return new acresOwned Value
        return cropData.getAcresOwned();
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
        
        // if acresToSell < 0, return -1
        
        // if acresToSell > acresOwned, return -1
        
        // acresToSell - acresOwned
        
        // save the new acresOwned amount
        
        // acresToSell * landPrice
        
        // add result of previous step to wheatInStore
        
        // save result to wheatInStore
        
        // return acresOwned
        return cropData.getAcresOwned();
    }
    
    public static int setOffering(int percent, CropData cropData) {
        
        // if percent > 0, multiply by harvest amount, divide by 100.
        
        
        // set offeringAmount equal to offering in CropData object.
        
        int offeringAmount = (percent * cropData.getHarvest()) / 100;
        cropData.setOffering(offeringAmount);
        
        return offeringAmount;
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
