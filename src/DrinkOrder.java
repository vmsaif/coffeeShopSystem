
/*
 * Name: Saif Mahmud
 */
public class DrinkOrder {
	private Customer myCustomerName = null;
	private Drink myDrinkName = null;
	private double theAmountCharged = 0.00;
	
	public DrinkOrder(Customer customerName, Drink drinkName, double amountCharged){       //this is constructor
		this.myCustomerName = customerName;
		this.myDrinkName = drinkName;
		this.theAmountCharged = amountCharged;
	}
	public boolean belongsTo(Customer name){
		boolean matched = false;
		if(this.myCustomerName.equals(name)){
			matched = true;
		}
		return matched;
	}
	public double getProfit() {
		return (theAmountCharged-myDrinkName.calculateCost());
	}
	public String toString() {
	String out = null;
	out = myCustomerName + " "+ theAmountCharged + " "+ myDrinkName + "\n" ;
	return out;
	}
}
