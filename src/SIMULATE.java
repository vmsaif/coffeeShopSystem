
public class SIMULATE {
  
  public static void main(String[] args) {
    
     //set up some customers
    Customer bruno = new Customer("Bruno", "Mars");
    Customer taylor = new Customer("Taylor", "Swift");
    Customer ada = new Customer("Lovelace", "Ada");

    //set up some ingredients
    Ingredient milk = new Ingredient("Milk", 500, 2.55);
    Ingredient espresso = new Ingredient("Espresso", 100, 4.05);
    Ingredient syrup = new Ingredient("Hazelnut Syrup", 30, 13.5);
    Ingredient soyMilk = new Ingredient("Soy Milk", 500, 4.75);
 

    //set up some drinks
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

    
    //Set up some stores
    CoffeeShop starbucks = new CoffeeShop("Starbucks", 3.5);
    CoffeeShop secondCup = new CoffeeShop("Second Cup", 2.1);
    CoffeeShop goodEarth = new CoffeeShop("Good Earth Coffee", 2.5);
    
    starbucks.newOrder(bruno, latte);
    starbucks.displayOrdersPending();
    System.out.println(starbucks.getName() + " profit: " + starbucks.getProfit());
    System.out.println();

    starbucks.newOrder(taylor, soyLatte);
    starbucks.displayOrdersPending();
    System.out.println(starbucks.getName() + " profit: " + starbucks.getProfit());
    System.out.println();
    
    System.out.println("Filled order at Starbucks: " + taylor);
    starbucks.orderFilled(taylor);
    starbucks.displayOrdersPending();
    
    secondCup.newOrder(ada, latte);
    secondCup.newOrder(taylor, soyLatte);
    secondCup.displayOrdersPending();
    System.out.println(secondCup.getName() + " profit: " + secondCup.getProfit());
    System.out.println();
    
    secondCup.newOrder(bruno, hazeLatte);
    secondCup.displayOrdersPending();
    System.out.println(secondCup.getName() + " profit: " + secondCup.getProfit());
    System.out.println();
    
    System.out.println("Trying to fill an order not at Starbucks: " + ada);
    starbucks.orderFilled(ada);
    starbucks.displayOrdersPending();
    
    System.out.println("Filled order at Starbucks: " + bruno);
    starbucks.orderFilled(bruno);
    starbucks.displayOrdersPending();
    
    starbucks.newOrder(taylor, hazeLatte);
    starbucks.displayOrdersPending();
    System.out.println(starbucks.getName() + " profit: " + starbucks.getProfit());
    System.out.println();

    
    System.out.println("Total coffee orders: " + CoffeeShop.getTotalOrders());
    System.out.println();

    System.out.println(taylor + " has visited: ");
    taylor.displayStoresVisited();
    System.out.println();
    
    System.out.println(bruno + " has visited: ");
    bruno.displayStoresVisited();
    System.out.println();
    
    System.out.println(ada + " has visited: ");
    ada.displayStoresVisited();
    System.out.println();
      
    System.out.println("shortest wait for: " + taylor + " is: " + taylor.getShortestWait().getName());
    System.out.println("shortest wait for: " + ada + " is: " + ada.getShortestWait().getName());
  }
}
