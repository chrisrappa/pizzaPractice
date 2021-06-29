

public class Order {

  int i;
  double cost = 0;
  String pizzas = "";


  public void withCheesePizza(int numPizzas) {


    CheesePizza cheesePizza = new CheesePizza();
    cost += numPizzas * cheesePizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "\n" + " Cheese Pizza " + cheesePizza.addPrice();
    }

  }

  public void withPepperoniPizza(int numPizzas) {

    PepperoniPizza pepperoniPizza = new PepperoniPizza();
    cost += numPizzas * pepperoniPizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "\n" + " Pepperoni Pizza " + pepperoniPizza.addPrice();
    }

  }


  public String total() {

    String totalCost = Double.toString(cost);
    return (totalCost);

  }

  public String printReceipt() {

    String totalOrder = total() + "\n" + pizzas;
    return (totalOrder);
  }

}
