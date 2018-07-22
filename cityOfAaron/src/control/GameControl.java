/*********************************************
 * Class: GameControl
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package control;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
import cityofaaron.CityOfAaron;
import model.*; 

/**
 *
 * @author jamesK mallory di bartolo
 */

public class GameControl {
    Scanner keyboard = new Scanner(System.in);
    
    //size of the Locations array
    private static final int MAX_ROW = 5; 
    private static final int MAX_COL = 5; 
    
    //reference to a Game object
    private static Game theGame; 

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        GameControl.theGame = theGame;
    }
    
    public static void createNewGame(String name) {
        //create the game object. Save it in the main driver file
        
        theGame = new Game();
        
        //create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setName(name);
        theGame.setThePlayer(thePlayer);
        
        // create the Map
        Map newMap = createMap();
        theGame.setTheMap(newMap);
        
        // FOR TESTING PURPOSES - create a default AnimalsList
        createAnimalList();
        
        // FOR TESTING PURPOSES - create a default CropData set
        createCropDataObject();
        
        CityOfAaron.setTheGame(theGame); 
             
    }
    
    /**
         * the getSavedGame method
         * Purpose: load a saved game from disk
         * Parameters: the file path
         * Returns: none
         * Side Effect: the game reference in the driver is updated
         */
        public static void getSavedGame(String filePath) {
            Game theGame = null;
            
            try (FileInputStream fips = new FileInputStream(filePath)) {
                ObjectInputStream input = new ObjectInputStream(fips);
                theGame = (Game) input.readObject();
                CityOfAaron.setTheGame(theGame);
            }
            catch (Exception e) {
                System.out.println("There was an error reading the saved game file \n");
            }
        }
        
        /**
         * the saveGame method
         * Purpose: save a game to the disk
         * Parameters: theGame, 
         * Returns: none
         *  
         */
        public static void saveGame(Game theGame, String filePath) {
                       
            try (FileOutputStream fops = new FileOutputStream(filePath)) {
                ObjectOutputStream output = new ObjectOutputStream(fops); 
                output.writeObject(theGame);
                CityOfAaron.setTheGame(theGame);
                output.close();
            }
            catch(Exception e) {
                System.out.println("There was an error saving the game.");
            }
        }
    
        //create the CropData object
        
        public static void createCropDataObject() {
            CropData theCrops = new CropData();
           
            
            theCrops.setYear(0);
            theCrops.setPopulation(100);
            theCrops.setNewPeople(5);
            theCrops.setCropYield(3);
            theCrops.setNumberWhoDied(0);
            theCrops.setOffering(10);
            theCrops.setWheatInStore(2700);
            theCrops.setAcresOwned(1000);
            theCrops.setAcresPlanted(1000);
            theCrops.setHarvest(3000);
            theCrops.setOfferingBushels(300);
            theCrops.setAcresPlanted(1000);
            
            //save the cropData in the Game object
            theGame.setCropData(theCrops); 
        }
        
        //create the list of animals
        public static void createAnimalList() {
            ArrayList<ListItem> animals = new ArrayList<>();
            
            animals.add(new ListItem("cows", 12));
            animals.add(new ListItem("horses", 3));
            animals.add(new ListItem("pigs", 7));
            animals.add(new ListItem("goats", 4)); 
            
            //save the animals in the game
            theGame.setAnimals(animals);
        }
        
        // method to display animals list
        public static void showAnimalsList() {
            System.out.println("showAnimalsList Method Called");
            ArrayList<ListItem> animals = theGame.getAnimals();
            
            for (ListItem item : animals) {
                System.out.println("Loop");
                System.out.println(item.getName() + ": " + item.getNumber());
            }
            
        }
        
        //create the list of tools
        public static void createToolsList() {
            ArrayList<ListItem> tools = new ArrayList<>(); 
            
            tools.add(new ListItem("plow", 15));
            tools.add(new ListItem("shovel", 20));
            tools.add(new ListItem("scythe", 17));
           
            theGame.setTools(tools);
           
        }

        // method to display tools list
        public static void showToolsList() {
            System.out.println("showToolsList Method Called");
            ArrayList<ListItem> tools = theGame.getTools();
            for (ListItem item : tools) {
                System.out.println(item.getName() + ": " + item.getNumber());
            }
        }
        
        //create the list of provisions
        public static void createProvisionsList() {
            ArrayList<ListItem> provisions = new ArrayList<>();
            
            provisions.add(new ListItem("provision1", 25)); 
            provisions.add(new ListItem("provision2", 34));
            provisions.add(new ListItem("provision3", 34));
            provisions.add(new ListItem("provision4", 34));
            provisions.add(new ListItem("provision5", 34));
            
            theGame.setProvisions(provisions);
        }
        
        // method to display provisions list
   
        public static void showProvisionsList() {
            System.out.println("Provisions"); 
            ArrayList<ListItem> provisions = theGame.getProvisions();
            for(ListItem item : provisions) {
                System.out.println(item.getName() + ": " + item.getNumber()); 
            }
        }
        
        // display Provisions List
         public void displayProvisions() {
            ArrayList<ListItem> provisionsList = theGame.getProvisions();
            System.out.println("Provisions"); 
            
            for(ListItem item : provisionsList) {
                System.out.println(item.getName() + ": " + item.getNumber()); 
            }
        }
         
        //method to save the animals list to disk 
        public static void saveAnimalList() {
            Scanner keyboard = new Scanner(System.in);
            //receive a string of the file name, passed into the printing routine.
            String listPath;
            System.out.println("Please enter a file path for the animals list: ");
            listPath = keyboard.next();
            
            
            //declare a reference to a PrintWriter object
            try (PrintWriter out = new PrintWriter(listPath);) {
                //create the PrintWriter object
                
                //get a reference to the ArrayList
                ArrayList<ListItem> animals = theGame.getAnimals();
                
                //output a heading for the report
                out.println("\n\n Animals List      "); 
                //use a for loop to get the data from the ArrayList
                for (ListItem item : animals) {
                out.printf("%n%-20s%7d", item.getName()
                                             , item.getNumber());
            
                }
                
                //output it
            }
            catch(Exception e) {
                //output error message
                System.out.println("Error saving list to file.");
            }
            
        } 
         
        //create the Locations and the Map object 
        
        /**
         * The createMap method
         * Purpose: creates the location objects and the map
         * Parameters: none
         * @return theMap
         */
        public static Map createMap() {
            //create the Map object
            //refer to the Map constructor
            Map theMap = new Map(MAX_ROW, MAX_COL); 
            
            //create a string that will go in the Location objects
            //that contain the river
            String river = "You are on the River. The river is the source\n" +
                           "of life for our city. The river marks the eastern\n" +
                           "boundary of the city - it is wilderness to the East.\n";
            
            Location loc = new Location(); 
            
            //use setters in the Location class to set the description and symbol
            loc.setDescription(river);
            loc.setSymbol("~~~");
            
            //set this location object in each cell of the array in column 4
            for(int i = 0; i < MAX_ROW; i++) {
                theMap.setLocation(i, 4, loc); 
            }
    
            // FARMLAND
            
            //define the string for a farm land location
            String farmland = "You are on the fertile banks of the River.\n" +
                              "In the spring, this low farmland floods and is covered with rich\n" +
                              "new soil. Wheat is planted as far as you can see.";
            
            //set a farmland location with a hint
            Location loc2 = new Location();
            loc2.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
            loc2.setSymbol("///");
            theMap.setLocation(0, 2, loc2);
            
            // MOUNTAIN
       
            //define the string for a mountain range
            String mountain = "You are in a mountain range. \n"; 
            // define new Location
            Location loc3 = new Location();
            loc3.setDescription(mountain);
            loc3.setSymbol("^^^");
            
            // for loop sets 3rd row of map as mountain
            for (int i = 0; i < 4; i++) {
            theMap.setLocation(1, i, loc3);
            }
            
            // PLAINS 
            //define the string for the plains
            String plains = "You are in the plains. \n"; 
            // define the plains location
            Location loc4 = new Location();
            loc4.setDescription(plains);
            loc4.setSymbol("'''");
            
            // for loop sets 
            for (int i = 2; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    theMap.setLocation(i, j, loc4);                    
                }
            }
          
            // TRADING POST
            
            //define the string for a trading post
            String tradingPost = "Welcome to the trading post. \n";
            Location loc5 = new Location();
            loc5.setDescription(tradingPost);
            loc5.setSymbol("$$$"); 
            theMap.setLocation(4, 4, loc5);
        
            // return 
            return theMap;
        }
   
        public void displayMap() {
            Game _game = CityOfAaron.getTheGame();
            Map theMap = _game.getTheMap(); 
            // DEBUG System.out.println("Hi, I am the Map");
            
            // for loop to display the 2D array Map
            for (int i = 0; i < MAX_ROW; ++i) {
                for (int j = 0; j < MAX_COL; ++j) {
                    // for debugging
                    // System.out.print(i);
                    // System.out.print(j);
                    
                    if (theMap.getLocation(i, j) == null) {
                        System.out.print("...");
                    }
                    else {
                        System.out.print(theMap.getLocation(i, j).getSymbol());
                    } 
                }
                System.out.println("");
            }
        }
        
        public void cataclysm() {
            Game _game = CityOfAaron.getTheGame();
            CropData crops = _game.getCropdata();
            
            if (crops.getOffering() == 0) {
                majorCataclysm(crops);
                System.out.println("You should have made an offering");
            }
            
            if (crops.getOffering() < crops.getHarvest() / 10) {
                minorCataclysm(crops);
                System.out.println("You should have offered more");
            }
            
        }
        
        private void minorCataclysm(CropData crops) {
            Random coinFlip = new Random();
            int rand = coinFlip.nextInt(1);
            
            // Plague of Locusts that destroys harvest
            if (rand == 0) {
                crops.setHarvest(0);
                crops.setHarvestAfterOffering(0);
                System.out.println("A plague of Locust has eaten your harvest");
            }
            // Minor Plague
            else if (rand == 1) {
                Random died = new Random();
                int dead = died.nextInt(25);
                crops.setNumberWhoDied(dead);
                int newPop = crops.getPopulation() - dead;
                crops.setPopulation(newPop);
            }
            
            else {
                System.out.println("ERROR - Minor Cataclysm");
            }
        }
        
        private void majorCataclysm(CropData crops) {
            Random coinFlip = new Random();
            int rand = coinFlip.nextInt(1);
            
            // Raiders steal random amount of land and kill random amount of people
            if (rand == 0) {
                System.out.println("Raiders have taken some of your land & killed some of your people");
                Random r = new Random();
                // take land
                int landLost = r.nextInt(crops.getAcresOwned());
                crops.setAcresOwned(landLost);
                // kill people
                int killed = r.nextInt(crops.getPopulation());
                crops.setPopulation(crops.getPopulation() - killed);
                
            }
            // Major plague
            else if (rand == 1) {
                System.out.println("A major plague of locust has swarmed your land, "
                        + "eating your harvest, some of your stores, and some of your people.");
                Random r = new Random();
                
                // eat harvest
                crops.setHarvest(0);
                crops.setHarvestAfterOffering(0);
                // eat stores
                int storesLost = r.nextInt(crops.getWheatInStore());
                crops.setWheatInStore(storesLost);
                // eat people
                int peopleEaten = r.nextInt(crops.getPopulation());
                crops.setPopulation(crops.getPopulation() - peopleEaten);
            }
            
            else {
                System.out.println("ERROR - Major Cataclysm");
            }
        }
}
