/**
 * 
 */

/**
 * @author User
 *
 */
public class Registers {
	
	private boolean hasCart;
	private final int PAY_TIME=60;
	private final int PROCESS_TIME=9;
	private int avalibleTime=0;
	private int totalWaitTime=0;
	private int totalCus=0;
	private Line myLine;
	private CustomerHistory loyalProgram;
	
	
	public void setLine(Line currentLine) {
		myLine = currentLine;
	}
	
	public void setDataBase(CustomerHistory dataBase) {
		loyalProgram = dataBase;
	}
	
	public boolean hasCart(){
		return hasCart;
	}
	
	public int readyTime() {
		return avalibleTime;
	}
	
	public int getAvgWaitTime() {
		
		if(totalCus>0) {
			return totalWaitTime/totalCus;
		}
		
		return 0;
	}

	public boolean getNextCus(int currentTime) {
		
		Cart thisCart = myLine.nextCart();
				
		if(thisCart == null){
			hasCart = false;
		}
		
		else {
			avalibleTime= currentTime + thisCart.getItem() * PROCESS_TIME + PAY_TIME;
			thisCart.process(avalibleTime);
			totalWaitTime += currentTime-thisCart.getArivalTime();
			totalCus += 1;
			loyalProgram.addHisotry(thisCart);
			hasCart = true;
		}

		return hasCart;
	}
}
