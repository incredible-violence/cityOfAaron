/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import model.Game;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author mallorydibartolo
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 0;
        int acresToBuy = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        
        // --- Test case 1 --- 
        System.out.println("\tTest case 1");
        
        //define the input variables
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        int landPrice = 20;
        int acresToSell = 10;
        int expResult = 2790;
        
        //call the method
        int result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 2 --- 
        System.out.println("\tTest case 2");
        
        //define the input variables
       
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        landPrice = 20;
        acresToSell = -5;
        expResult = -1;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 3 --- 
        System.out.println("\tTest case 3");
        
        //define the input variables
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2800);
        landPrice = 20;
        acresToSell = 3000;
        expResult = -1;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 4 --- 
        System.out.println("\tTest case 4");
        
        //define the input variables
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2000);
        landPrice = 10;
        acresToSell = 2000;
        expResult = 0;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 5 --- 
        System.out.println("\tTest case 5");
        
        //define the input variables
        cropData.setWheatInStore(1000);
        cropData.setAcresOwned(2000);
        landPrice = 10;
        acresToSell = 0;
        expResult = 2000;
        
        //call the method
        result = CropControl.sellLand(landPrice, acresToSell, cropData);
        
        //test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        int percent = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.setOffering(percent, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getACRES_PER_BUSHEL method, of class CropControl.
     */
    @Test
    public void testGetACRES_PER_BUSHEL() {
        System.out.println("getACRES_PER_BUSHEL");
        int expResult = 0;
        int result = CropControl.getACRES_PER_BUSHEL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setACRES_PER_BUSHEL method, of class CropControl.
     */
    @Test
    public void testSetACRES_PER_BUSHEL() {
        System.out.println("setACRES_PER_BUSHEL");
        int ACRES_PER_BUSHEL = 0;
        CropControl.setACRES_PER_BUSHEL(ACRES_PER_BUSHEL);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPEOPLE_PER_ACRE method, of class CropControl.
     */
    @Test
    public void testGetPEOPLE_PER_ACRE() {
        System.out.println("getPEOPLE_PER_ACRE");
        int expResult = 0;
        int result = CropControl.getPEOPLE_PER_ACRE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setPEOPLE_PER_ACRE method, of class CropControl.
     */
    @Test
    public void testSetPEOPLE_PER_ACRE() {
        System.out.println("setPEOPLE_PER_ACRE");
        int PEOPLE_PER_ACRE = 0;
        CropControl.setPEOPLE_PER_ACRE(PEOPLE_PER_ACRE);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getYIELD_BASE method, of class CropControl.
     */
    @Test
    public void testGetYIELD_BASE() {
        System.out.println("getYIELD_BASE");
        int expResult = 0;
        int result = CropControl.getYIELD_BASE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setYIELD_BASE method, of class CropControl.
     */
    @Test
    public void testSetYIELD_BASE() {
        System.out.println("setYIELD_BASE");
        int YIELD_BASE = 0;
        CropControl.setYIELD_BASE(YIELD_BASE);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getYIELD_RANGE method, of class CropControl.
     */
    @Test
    public void testGetYIELD_RANGE() {
        System.out.println("getYIELD_RANGE");
        int expResult = 0;
        int result = CropControl.getYIELD_RANGE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setYIELD_RANGE method, of class CropControl.
     */
    @Test
    public void testSetYIELD_RANGE() {
        System.out.println("setYIELD_RANGE");
        int YIELD_RANGE = 0;
        CropControl.setYIELD_RANGE(YIELD_RANGE);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTheGame method, of class CropControl.
     */
    @Test
    public void testGetTheGame() {
        System.out.println("getTheGame");
        Game expResult = null;
        Game result = CropControl.getTheGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setTheGame method, of class CropControl.
     */
    @Test
    public void testSetTheGame() {
        System.out.println("setTheGame");
        Game theGame = null;
        CropControl.setTheGame(theGame);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCropData method, of class CropControl.
     */
    @Test
    public void testGetCropData() {
        System.out.println("getCropData");
        CropData expResult = null;
        CropData result = CropControl.getCropData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCropData method, of class CropControl.
     */
    @Test
    public void testSetCropData() {
        System.out.println("setCropData");
        CropData cropData = null;
        CropControl.setCropData(cropData);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class CropControl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CropControl instance = new CropControl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calcLandPrice method, of class CropControl.
     */
    @Test
    public void testCalcLandPrice() {
        System.out.println("calcLandPrice");
        int expResult = 0;
        int result = CropControl.calcLandPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
