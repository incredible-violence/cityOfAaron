/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import java.io.*;
import model.*;
import control.*;

/**
 *
 * @author waabb
 */
public class SaveGameView extends MenuView {
    Scanner keyboard = new Scanner(System.in);
    
    /**
     * Constructor
     * Purpose: Initialize menu data
     * Parameters: none
     * Returns: none
     */
    public SaveGameView() {
       
        super("\n" + 
                "*********************************\n" + 
                "*   CITY OF AARON : SAVE MENU   *\n" +
                "*********************************\n" +
                " 1 - Save Game\n" +
                " 2 - Quit\n", 
                2);
    }
    /**
     * Method: doAction
     * Purpose: performs selected option
     * Parameters:
     * @param option
     * Returns: none
     */
    @Override public void doAction(int option) {
        // governing switch statement
        switch (option) {
            // If option 1, call saveGame()
            case 1:
                saveGame();
                break;
            // if option 2, quit
            case 2:
                System.out.println("Game Saved\n");
                break;
        }
    }
    
    public void saveGame() {
        System.out.println("File Name: ");
        String fileName = keyboard.next();
        GameControl gc = new GameControl();
        gc.saveGame(gc.getTheGame(), fileName);
    }
}
