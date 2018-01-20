/**
 * 
 */

/**
 * @author User
 *
 */
public class Cart {
	
	//final private Customer customer;
	final private int ID;
	final private int ITEM_NUM;
	final private int ARIVAL_TIME;
	private int finishTime = Integer.MAX_VALUE;
	
	Cart(int id, int num, int time){
		//customer = new Customer(id);
		ID = id;
		ITEM_NUM = num;
		
		if(time>=0) {
			ARIVAL_TIME = time;
		}
		
		else {
			ARIVAL_TIME = 0;
		}
		
		finishTime = 0;
	}
	
	public boolean process(int finishTime) {
		this.finishTime = finishTime;
		return true;
	}
	
	
	public int getTotalTime() {
		return finishTime-ARIVAL_TIME;
	}
	
	public int getArivalTime() {
		return ARIVAL_TIME;
	}
		
	public int getID() {
		return ID;
	}
	
	public int getItem() {
		return ITEM_NUM;
	}
	
	public boolean isLoyal() {
		if (ID<0 || ID>9999) {
			return false;
		}
		
		return false;
	}
}
