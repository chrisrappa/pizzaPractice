

public class Order {

  int i;
  double totalCost = 0;
  String pizzas = "";


  public void withCheesePizza(int numPizzas, String extraIngredient) {


    CheesePizza cheesePizza = new CheesePizza();
    String additions = cheesePizza.addIngredient(extraIngredient, 1.00);
    String pricePerPizza = String.format("%.2f", cheesePizza.addPrice() + cheesePizza.ingPrice);
    totalCost += (numPizzas * cheesePizza.addPrice()) + cheesePizza.ingPrice;
    for(i = 0; i < numPizzas; i++){
      pizzas += "Cheese Pizza " + additions + "$" + pricePerPizza + "\n";
    }

  }

  public void withPepperoniPizza(int numPizzas, String extraIngredient) {

    PepperoniPizza pepperoniPizza = new PepperoniPizza();
    pepperoniPizza.addIngredient(extraIngredient, 1.00);
    totalCost += numPizzas * pepperoniPizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "Pepperoni Pizza " + "$" + String.format("%.2f", pepperoniPizza.addPrice()) + "\n";
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
