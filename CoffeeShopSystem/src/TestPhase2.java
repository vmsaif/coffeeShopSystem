
/*Course: COMP 1020(A03)
 * Name: Saif Mahmud
 * Assignment 1
 */
public class TestPhase2 {
  
	public static void main(String[] args) {
    Customer bruno = new Customer("Bruno", "Mars");
    Customer taylor = new Customer("Taylor", "Swift");
    Customer ada = new Customer("Lovelace", "Ada");
    System.out.println("Customer1: " + bruno);
    System.out.println("Customer2: " + taylor);
    System.out.println("Customer3: " + ada);
    
    System.out.println();
    
    Ingredient milk = new Ingredient("Milk", 500, 2.55);
    Ingredient espresso = new Ingredient("Espresso", 100, 4.05);
    Ingredient syrup = new Ingredient("Hazelnut Syrup", 30, 13.5);
    Ingredient soyMilk = new Ingredient("Soy Milk", 500, 4.75);
 

    Drink latte = new Drink("Latte");
    latte.addIngredient(milk);
    latte.addIngredient(espresso);
    
    Drink soyLatte = new Drink("Soy Latte");
    soyLatte.addIngredient(soyMilk);
    soyLatte.addIngredient(espresso);
    
    Drink hazeLatte = new Drink("Hazelnut Latte");
    hazeLatte.addIngredient(milk);
    hazeLatte.addIngredient(espresso);
    hazeLatte.addIngredient(syrup);
    
    System.out.println("Drink1: " + latte);
    System.out.println("Drink1 cost $" + latte.calculateCost());
    System.out.println();
    
    System.out.println("Drink2: " + soyLatte);
    System.out.println("Drink2 cost $" + soyLatte.calculateCost());
    System.out.println();
    
    System.out.println("Drink3: " + hazeLatte);
    System.out.println("Drink3 $" + hazeLatte.calculateCost());
    System.out.println();

    DrinkOrder o1 = new DrinkOrder(bruno, latte, 4.50);
    DrinkOrder o2 = new DrinkOrder(bruno, hazeLatte, 5.00);
    DrinkOrder o3 = new DrinkOrder(taylor, soyLatte, 6.00);
    DrinkOrder o4 = new DrinkOrder(ada, latte, 4.75);
    
    System.out.println(o1);
    System.out.println("Profit: $" + o1.getProfit());
    System.out.println("Belongs to Taylor? " + o1.belongsTo(taylor));
    System.out.println();
    
    System.out.println(o2);
    System.out.println("Profit: $" + o2.getProfit());
    System.out.println("Belongs to Bruno? " + o2.belongsTo(bruno));
    System.out.println();
    
    System.out.println(o3);
    System.out.println("Profit: $" + o3.getProfit());
    System.out.println("Belongs to Taylor? " + o3.belongsTo(taylor));
    System.out.println();
    
    System.out.println(o4);
    System.out.println("Profit: $" + o4.getProfit());
    System.out.println("Belongs to Ada? " + o4.belongsTo(ada));
    
    
  }
}
