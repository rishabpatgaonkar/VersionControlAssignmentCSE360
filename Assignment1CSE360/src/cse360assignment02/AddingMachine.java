package cse360assignment02;
/**CSE360
 * Assignment 1 Version Control 
 * @author Rishab Patgaonkar
 * Program for adding and subtracting numbers and storing in history
 */
public class AddingMachine {
	private int total;
	String history;
	  
	/**Constructor method for AddingMachine**/
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  
	  /**Accessor method for returning total**/
	  public int getTotal () {
	    return total;
	  }
	  
	  /** @param value the number to be added to total **/
	  public void add (int value) {
		  total = total + value;
		  history += " + " + value;
	  }

	  /** @param value the number to be subtracted from total **/
	  public void subtract (int value) {
		  history += " - " +  value;
	  }
	  
	  /** toString method to return string representation **/
	  public String toString () {
		  history.toString();
		  return history;
	  }

	  /**clear history and total **/
	  public void clear() {
		  history = "0";
		  total = 0;
	  }
	
}
