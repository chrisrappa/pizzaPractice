import Interfaces.Pizza;

public class CheesePizza implements Pizza {


  @Override
  public double addPrice() {
    return 6.00;
  }

  @Override
  public String addIngredient(String ingredient, double price) {
    String pricePerAddition = String.format("%.2f", price);
    return ("+ " + ingredient + "( $" + pricePerAddition + " ) ");
  }

}

