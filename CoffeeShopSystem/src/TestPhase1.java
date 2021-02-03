
public class TestPhase1 {
  
  
 
  public static void main(String[] args) {
    
    // Create three customer objects
    Customer c1 = new Customer("Bruno", "Mars");
    Customer c2 = new Customer("Taylor", "Swift");
    Customer c3 = new Customer("Taylor", "Swift");
    
    // display the objects (through their toString methods)
    System.out.println("Customer1: " + c1);
    System.out.println("Customer2: " + c2);
    System.out.println("Customer3: " + c3);
    
    // test out the .equals method
    System.out.println("C1 equals C2? " + (c1.equals(c2)));
    System.out.println("C2 equals C3? " + (c2.equals(c3)));
    
    System.out.println();
    
    // create three ingredient objects
    Ingredient i1 = new Ingredient("Milk", 500, 2.55);
    Ingredient i2 = new Ingredient("Espresso", 100, 4.05);
    Ingredient i3 = new Ingredient("Hazelnut Syrup", 30, 13.5);
    
    // output each ingredient and that ingredient's total cost:
    
    System.out.println("Ingredient1: " + i1);
    System.out.println("Ingredient1 cost: $" + i1.getCost());
    System.out.println();
    
    System.out.println("Ingredient2: " + i2);
    System.out.println("Ingredient2 cost: $" + i2.getCost());
    System.out.println();
    
    System.out.println("Ingredient3: " + i3);
    System.out.println("Ingredient3: $" + i3.getCost());

    
  }
}