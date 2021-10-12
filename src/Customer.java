
/*Course: COMP 1020(A03)
 * Name: Saif Mahmud
 * ID: 7808507
 * Assignment 1
 */
public class Customer {

	private String fName ;
	private String lName ;
	private static final int MAX_SIZE = 15;
	private CoffeeShop[] coffeeShopArray = new CoffeeShop[MAX_SIZE];
	private int arrSize = 0; 
	
	public Customer(String firstName, String lastName) {       //this is constructor
		this.fName = firstName;
		this.lName = lastName;
	}
	public String toString() {
		return (lName + ", " + fName);
	}
	public boolean equals(Customer other) {
		return (this.fName.equals(other.fName) && this.lName.equals(other.lName));
	}
	public void addStore(CoffeeShop newStore) {
		boolean alreadyNotThere = true;
		for(int i = 0; i < arrSize; i++) {
			if(alreadyNotThere) {
				if((coffeeShopArray[i].getName()).equals(newStore.getName())) {
					alreadyNotThere = false;
				}
			}
		}
		if(alreadyNotThere) {
			coffeeShopArray[arrSize] = newStore;
			arrSize++;
		}
	}
	public void displayStoresVisited() {
		for(int i = 0; i < arrSize; i++) {
			System.out.println(coffeeShopArray[i].getName());
		}
	}
	public CoffeeShop getShortestWait() {
		CoffeeShop tempSmall = coffeeShopArray[0];
		for(int i = 0; i < arrSize; i++) {
				if(coffeeShopArray[i].getNumOrdersPending() < tempSmall.getNumOrdersPending()) {
					tempSmall = coffeeShopArray[i];
				}
			}
		return tempSmall;
	}
}
