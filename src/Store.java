/**
 * 
 */

/**
 * @author User
 *
 */
public class Store {
	private CustomerHistory dataBase = new CustomerHistory();
	private Registers[] register = new Registers[8];
	private Line[] line = new Line[8];
	
	
	public void run() {
		
		line[7]= new PiorityLine();
		
	}
}
