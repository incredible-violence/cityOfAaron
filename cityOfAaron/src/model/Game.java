/*
 * Game class file for cityOfAaron
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory Di Bartolo
 */
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
    private Player thePlayer; 
    
    //Attempt at implementing the ListItem-Game relationship -Mallory 
    //private ArrayList<ListItem> name = new ArrayList<ListItem>(); 
    //private ArrayList<ListItem> number = new ArrayList<ListItem>();
    
    /*******************
     * Constructors
     ******************/
    
    // default constructor 
    public Game() {
    }
    
    // argument constructor
    public Game(Player thePlayer) {    
        this.thePlayer = thePlayer;
    }
    
    /***********************
     * Getters and Setters
     **********************/
    
    // getter for thePlayer
    public Player getThePlayer() {
        return thePlayer;
    }
    
    // setter for thePlayer
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
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
