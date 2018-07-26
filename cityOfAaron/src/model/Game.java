/*********************************************
 * Class: Game
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.ArrayList;

/**
 *
 * @author jamesK
 */

public class Game implements Serializable {
    
    /***********************
     * Variables
     **********************/
    
    // private variables
    private Map theMap;
    private Player thePlayer;
    private CropData cropdata;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;
    private Boolean done;
    
    private CropData cropData = null;
    
    //Attempt at implementing the ListItem-Game relationship -Mallory 
    //private ArrayList<ListItem> name = new ArrayList<ListItem>(); 
    //private ArrayList<ListItem> number = new ArrayList<ListItem>();
    
    /*******************
     * Constructors
     ******************/
    
    // default constructor 
    public Game() {
        this.provisions = new ArrayList<>();
        this.tools = new ArrayList<>();
        this.animals = new ArrayList<>();
    }
    
    // argument constructor
    public Game(Player thePlayer) {    
        this.provisions = new ArrayList<>();
        this.tools = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.thePlayer = thePlayer;
    }
    
    // variable constructor
    public Game(Map theMap, Player thePlayer, CropData cropdata, Boolean done) {
        this.provisions = new ArrayList<>();
        this.tools = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.theMap = theMap;
        this.thePlayer = thePlayer;
        this.cropdata = cropdata;
        this.done = done;
    }

    /***********************
     * Getters and Setters
     **********************/
    public Player getThePlayer() {
        return thePlayer;
    }
    
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public CropData getCropdata() {
        return cropdata;
    }

    public void setCropdata(CropData cropdata) {
        this.cropdata = cropdata;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
    
    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }
        
    // hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;
    }    
}
