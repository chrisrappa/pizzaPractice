import java.util.Arrays;
import java.util.List;

public class Order {

  int i;
  double totalCost = 0;
  String pizzas = "";



  public void withCheesePizza(int numPizzas,
                              String ingredientOne,
                              String ingredientTwo,
                              String ingredientThree,
                              String ingredientFour,
                              String ingredientFive,
                              String ingredientSix,
                              String ingredientSeven,
                              String ingredientEight, String size) {

    CheesePizza cheesePizza = new CheesePizza();
    String additions = "";
    List<String> ingredients = Arrays.asList(ingredientOne,
            ingredientTwo, ingredientThree, ingredientFour, ingredientFive,
            ingredientSix, ingredientSeven, ingredientEight);

    for(String ingredient : ingredients){
      additions += cheesePizza.addIngredient(ingredient, 1.00);
    }

    String pricePerPizza = String.format("%.2f", cheesePizza.addPrice(size) + cheesePizza.ingPrice);
    totalCost += (numPizzas * cheesePizza.addPrice(size)) + cheesePizza.ingPrice;

    for(i = 0; i < numPizzas; i++){
      pizzas += size + " Cheese Pizza " + additions + "$" + pricePerPizza + "\n";
    }

  }

  public void withPepperoniPizza(int numPizzas,
                                 String ingredientOne,
                                 String ingredientTwo,
                                 String ingredientThree,
                                 String ingredientFour,
                                 String ingredientFive,
                                 String ingredientSix,
                                 String ingredientSeven,
                                 String ingredientEight, String size) {

    PepperoniPizza pepperoniPizza = new PepperoniPizza();
    String additions = "";
    List<String> ingredients = Arrays.asList(ingredientOne,
            ingredientTwo, ingredientThree, ingredientFour, ingredientFive,
            ingredientSix, ingredientSeven, ingredientEight);

    for(String ingredient : ingredients){
      additions += pepperoniPizza.addIngredient(ingredient, 1.00);
    }

    String pricePerPizza = String.format("%.2f", pepperoniPizza.addPrice(size) + pepperoniPizza.ingPrice);
    totalCost += (numPizzas * pepperoniPizza.addPrice(size)) + pepperoniPizza.ingPrice;

    for(i = 0; i < numPizzas; i++){
      pizzas += size + " Pepperoni Pizza " + additions + "$" + pricePerPizza + "\n";
    }

  }

  public String total() {
    return (String.format("%.2f", totalCost));
  }

  public String printReceipt() {

    String totalOrder = pizzas + "Total cost is: $" + total();
    return (totalOrder);
  }

}
