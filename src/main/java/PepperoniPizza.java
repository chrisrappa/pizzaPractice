import Interfaces.Pizza;

public class PepperoniPizza implements Pizza {

  double ingPrice = 0;

  @Override
  public double addPrice() {
    return 7.00;
  }

  @Override
  public String addIngredient(String ingredient, double price) {
    ingPrice += price;
    addIngPrice(ingPrice);
    String pricePerAddition = String.format("%.2f", price);
    return ("+ " + ingredient + "( $" + pricePerAddition + " ) ");
  }


  public double addIngPrice(double ingPrice){
    return(ingPrice);
  }
}
