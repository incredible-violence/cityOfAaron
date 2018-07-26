/*********************************************
 * Class: Map
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jamesK
 */

public class Map implements Serializable {
// variables
    private int rowCount;
    private int colCount;
    private Location[][] locations; 
    

// constructors
    
    
    /**
    * default constructor
    * Purpose: Set data members to default values
    * Parameters: none
    * Returns: none
    */
    
    public Map() {
    }
    
    /**
     * parameterized Map constructor
     * Purpose: sets row and column values
     *   and creates an array of Location objects
     * @param _rows
     * @param _cols 
     * Returns: none
     */
    public Map(int _rows, int _cols) {
        this.rowCount = _rows;
        this.colCount = _cols;
        
        // create the array of location objects
        this.locations = new Location[_rows][_cols]; 
    }
    
    
        
    // getters & setters

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }
    /**
     * The getLocation method
     * Purpose: returns the location object at the given
     *   row and column 
     * Parameters: a row and a column
     * Returns: a Location object
     * @param row
     * @param col
     * @return 
     */
    public Location getLocation(int row, int col) {
        return this.locations[row][col];
    }

    /**
     * The setLocation method
     * Purpose: stores a location object at the row and column
     * Parameters: a row and column, and a reference to a location object
     * Returns: void
     */
    
    public void setLocation(int row, int col, Location _location) {
        this.locations[row][col] = _location;
    }
    
    // equals, hashCode, toString

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.colCount;
        hash = 79 * hash + Objects.hashCode(this.locations);
        return hash;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.colCount != other.colCount) {
            return false;
        }
        if (!Objects.equals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + ", locations=" + locations + '}';
    }
    
}
