/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
