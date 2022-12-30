
/*
 * Name: Saif Mahmud
 */
public class Drink {
	
	private String myDrinkName = null;
	private static final int MAX_ARRAY_VALUE = 15;
	private Ingredient[] ingredientsArray= new Ingredient[MAX_ARRAY_VALUE];
	private int arrSize = 0;
	
	public Drink(String drinkName) {       //this is constructor
		this.myDrinkName = drinkName;
	}
	public void addIngredient(Ingredient ingredientName) {
		this.ingredientsArray[arrSize] = ingredientName;
		arrSize++;
	}
	public double calculateCost() {
		double totalCost = 0.00;
		for (int i = 0; i < arrSize; i++) {
			totalCost = totalCost + ingredientsArray[i].getCost();
		}
		return totalCost;
	}
	public String toString() {
		String out = myDrinkName + ", Ingredients:";
		for (int i = 0; i < arrSize; i++) {
			out = out + ("\n"+ingredientsArray[i]);
		}
		out = out  + "\n";
		return out;
	}
	
}
