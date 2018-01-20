import java.util.*;

/**
 * 
 */

/**
 * @author User
 *
 */
public class PiorityLine extends Line{

	/**
	 * 
	 */
	public PiorityLine() {
		
		super();
		line = new PriorityQueue<Cart>(1,new cartComparator());
	}
	
	public class cartComparator implements Comparator<Cart>{
		public int compare(Cart a, Cart b) {
			
			if(a.getItem()<b.getItem()) {
				return -1;
			}
			
			if(a.getItem()==b.getItem()) {
				
				if(a.isLoyal() == b.isLoyal()) {
					
					if(a.getArivalTime()<b.getArivalTime()) {
						return -1;
					}
					
					if(a.getArivalTime()==b.getArivalTime()) {
						return 0;
					}
					
					return 1;
				}
				
				if(a.isLoyal()) {
					return -1;
				}
			}
			
			return 1;
		}
	}

}
