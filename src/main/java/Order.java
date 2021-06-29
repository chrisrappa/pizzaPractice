

public class Order {

  double cost;

  public void printReceipt() {


  }

  public void withCheesePizza(int numPizzas) {

    CheesePizza cheesePizza = new CheesePizza();
    cost += numPizzas * cheesePizza.addPrice();

  }

  public void withPepperoniPizza(int numPizzas) {

    PepperoniPizza pepperoniPizza = new PepperoniPizza();
    cost += numPizzas * pepperoniPizza.addPrice();


  }


  public String total() {
    // calculated the total for the order by multiplying numOfCheesePizzas and the cost of one pizza
    // turn that value into the correct string ($ and . and 00)
    // return

    String totalCost = Double.toString(cost);
    return (totalCost);
  }

}
