/**
 * 
 */

/**
 * @author User
 *
 */
public class CustomerHistory {
		
	final private int SIZE;
	private Customer[] dataBase;
	
	CustomerHistory(){
		SIZE = 10000;
		dataBase = new Customer[SIZE];
	}
	
	CustomerHistory(int size) {
		if(size >0) {
			SIZE = size;
		}
		else SIZE = 10000;
		dataBase = new Customer[SIZE];
	}
	
	public void addHisotry(Cart thisCart){

		int id = thisCart.getID();
		
		if(id > 9999 || id < 0){
			return;
		}
		
		if(dataBase[id] == null)
		{
			dataBase[id] = new Customer();
		}
		
		dataBase[id].totalItem += thisCart.getItem();
		dataBase[id].totalTime += thisCart.getTotalTime();
		dataBase[id].totalVist += 1;
		
		return;

	}

}
