/*********************************************
 * Class: Location
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author mallorydibartolo
 */

public class Location implements Serializable {
    
    //class instance variables
    private String description; 
    private String symbol; 

    // Constructor
    public Location() {
    }

    // getter: description
    public String getDescription() {
        return description;
    }
    
    // setter: description
    public void setDescription(String description) {
        this.description = description;
    }
    
    // getter: symbol
    public String getSymbol() {
        return symbol;
    }

    // setter: symbol
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + Objects.hashCode(this.symbol);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "description=" + description + ", symbol=" + symbol + '}';
    }
    
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        return true;
    }
    
    
    
}
