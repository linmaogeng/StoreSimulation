/**
 * 
 */

/**
 * @author User
 *
 */

import java.util.*;

public class Line {
	
	protected Queue<Cart> line = new LinkedList<Cart>();
	
	public boolean isEmpty() {
		return line.isEmpty();
	}
	
	public int size() {
		return line.size();
	}
	
	public Cart nextCart() {
		return line.poll();
	}
	
	public boolean addCart(Cart newCart) {

		try {
			line.add(newCart);
			return true;
		}
		
		catch(Exception e){
			return false;
		}
	}
	
	public boolean qualificationCheck(Cart newCart) {
		
		if(newCart!=null)
			return true;
		else 
			return false;
	}

}
