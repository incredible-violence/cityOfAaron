/*********************************************
 * Interface class: ViewInterface
 * CIT_260
 * Spring 2018
 * Team: James Kennedy, Mallory DiBartolo
 ********************************************/

package view;

/**
 *
 * @author mallorydibartolo
 */
public interface ViewInterface {
    
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option); 
    
}
