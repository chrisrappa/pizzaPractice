

public class Order {

  int i;
  double cost = 0;
  String pizzas = "";


  public void withCheesePizza(int numPizzas) {


    CheesePizza cheesePizza = new CheesePizza();
    cost += numPizzas * cheesePizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "\n" + " Cheese Pizza " + "$" + String.format("%.2f", cheesePizza.addPrice());
    }

  }

  public void withPepperoniPizza(int numPizzas) {

    PepperoniPizza pepperoniPizza = new PepperoniPizza();
    cost += numPizzas * pepperoniPizza.addPrice();
    for(i = 0; i < numPizzas; i++){
      pizzas += "\n" + " Pepperoni Pizza " + "$" + String.format("%.2f", pepperoniPizza.addPrice());
    }

  }

  public String total() {

    String totalCost = String.format("%.2f", cost);
//    System.out.println(totalCost);
    return (totalCost);

  }

  public String printReceipt() {

    String totalOrder = pizzas + " \n Total cost is: $" + total();
    return (totalOrder);
  }

}
