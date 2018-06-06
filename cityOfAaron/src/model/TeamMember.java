/*********************************************
 * Class: TeamMember
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package model;

/**
 *
 * @author jamesK
 */

public enum TeamMember {
    
    Admin("James", "Administrator");
    
    /***********************
     * Variables
     **********************/

    // private variables
    private String name;
    private String title;
    
    /*******************
     * Constructors
     ******************/
    
    // constructor 1: 2 arguements
    TeamMember(String name, String title) {
        this.name = name;
        this.title = title;
    }
    
    /***********************
     * Getters and Setters
     **********************/
    
    // getter: name
    public String getName() {
        return name;
    }
    
    // setter: name
    public void setName(String name) {
        this.name = name;
    }
    
    // getter: title
    public String getTitle() {
        return title;
    }
    
    // setter: title
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TeamMember{" + "name=" + name + ", title=" + title + '}';
    }
}
