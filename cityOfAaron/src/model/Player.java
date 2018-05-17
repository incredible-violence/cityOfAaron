/*
 * Player class file for cityOfAaron
 * CIT_260
 * Spring 2018
 * Team: James Kennedy,
 */
package model;

/**
 *
 * @author waabb
 */
public class Player {
    // Private Variable: 'name'
    private String name;
    
    // default constructor
    public Player() {
        setName("No Name");
    }
    // constructor with one argument, when called it will assign 'name'
    public Player(String nome) {
        setName(nome);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String nam) {
        this.name = nam;
    }
}
