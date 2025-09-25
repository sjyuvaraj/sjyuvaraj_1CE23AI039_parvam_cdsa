import java.util.ArrayList;


public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();


        // Adding the new elements
        fruits.add("Apple");      
        fruits.add("Banana");      
        fruits.add("Mango");      
        fruits.add("Pappaya");      


        // Display all elements
        System.out.println("Fruits Basket Contains: " + fruits);


        // Display Individual Fruit
        System.out.println("First Fruit in the Basket: " + fruits.get(0));
        System.out.println("Second Fruit in the Basket: " + fruits.get(1));


        // Remove the Fruit
        fruits.remove("Banana");
        System.out.println("Fruit Basket contains: " + fruits);


  // Traversal of Fruits
        System.out.println("Individual Fruits:");
        for(String fruit : fruits) {
            System.out.print(fruit + "\n");
        }
    }
}
