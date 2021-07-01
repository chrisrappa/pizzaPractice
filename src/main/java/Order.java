

public class Order {

  int i;
  double cost = 0;
  String pizzas = "";


  public void withCheesePizza(int numPizzas, String extraIngredient) {


    CheesePizza cheesePizza = new CheesePizza();
    String additions = cheesePizza.addIngredient(extraIngredient, 1.00);
    cost += numPizzas * cheesePizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "Cheese Pizza " + additions  + "$" + String.format("%.2f", cheesePizza.addPrice()) + "\n";
    }

  }

  public void withPepperoniPizza(int numPizzas, String extraIngredient) {

    PepperoniPizza pepperoniPizza = new PepperoniPizza();
    pepperoniPizza.addIngredient(extraIngredient, 1.00);
    cost += numPizzas * pepperoniPizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "Pepperoni Pizza " + "$" + String.format("%.2f", pepperoniPizza.addPrice()) + "\n";
    }

  }

  public String total() {

    String totalCost = String.format("%.2f", cost);
    return (totalCost);

  }

  public String printReceipt() {

    String totalOrder = pizzas + "Total cost is: $" + total();
    return (totalOrder);
  }

}
