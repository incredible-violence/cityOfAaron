/*
 * TeamMember enum file for cityOfAaron
 * CIT_260
 * Spring 2018
 * Team: James Kennedy,
 */
package model;

/**
 *
 * @author waabb
 */
public enum TeamMember {

    // private variables
    private String name;
    private String title;
    
    TeamMember(String name, String title) {
    this.name = name;
    this.title = title;
}

}
