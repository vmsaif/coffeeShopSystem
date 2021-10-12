
/*Course: COMP 1020(A03)
 * Name: Saif Mahmud
 * ID: 7808507
 * Assignment 1
 */
public class CoffeeShop {
	private String myShopName ;
	private static final int MAX_SIZE = 15;
	private DrinkOrder[] queDrinkOrders = new DrinkOrder[MAX_SIZE];
	private int arrSize = 0;
	private double markupFactor = 0.00;
	private double shopsTotalProfit = 0.00;
	private static int DrinkOrder = 0;
	
	public CoffeeShop(String shopName, double markup) {       //this is constructor
		this.myShopName = shopName;
		this.markupFactor = markup;
	}
	public String getName() {
		return myShopName;
	}
	public void newOrder(Customer name, Drink drinkName) {
		double drinkSellingCost = drinkName.calculateCost()*markupFactor;
		DrinkOrder que = new DrinkOrder(name, drinkName, drinkSellingCost);
		queDrinkOrders[arrSize] = que; 
		arrSize++;
		shopsTotalProfit = shopsTotalProfit + drinkSellingCost-drinkName.calculateCost();
		DrinkOrder++;
		name.addStore(this);
	}
	public void orderFilled(Customer name) {
		boolean found = false;
		for(int i = 0; i < arrSize; i++) {
			if(!found) {
				if((queDrinkOrders[i]).belongsTo(name)){
					found = true;
					}
				}
			else{
				queDrinkOrders[i-1] = queDrinkOrders[i];
				}
			}
		if(found) {
			arrSize--;
		}
	}
	public int getNumOrdersPending() {
		return arrSize;
	}
	public void displayOrdersPending() {
		
		if(arrSize>=1) {
			for(int i = 0; i < arrSize; i++) {
				System.out.println("Orders pending at " + myShopName + ":");
					System.out.print((i+1) + ": " + queDrinkOrders[i]);
			}	
		}
		else {
			System.out.println("Orders pending at " + myShopName + " :" + "\nNONE");
		}
	}
	public double getProfit() {
		return shopsTotalProfit;
	}
	public static int getTotalOrders() {
		return DrinkOrder;
	}
}
	
