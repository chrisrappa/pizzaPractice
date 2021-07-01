import Interfaces.Pizza;

public class PepperoniPizza implements Pizza {


  @Override
  public double addPrice() {
    return 7.00;
  }

  @Override
  public String addIngredient(String ingredient, double price) {
    String pricePerAddition = Double.toString(price);
    return (ingredient + "(" + pricePerAddition + ") ");
  }
}
