import Interfaces.Pizza;

import java.util.ArrayList;

public class CheesePizza implements Pizza {

  double ingPrice = 0;

  @Override
  public double addPrice(String size) {
    switch(size){
      case "Large":
        return 9.00;
      default:
        return 6.00;
    }
  }

  @Override
  public String addIngredient(String ingredient, double price) {

    if(ingredient == ""){
      return "";
    }

    ingPrice += price;
    addIngPrice(ingPrice);

    String pricePerAddition = String.format("%.2f", price);
    return ("+ " + ingredient + "( $" + pricePerAddition + " ) ");
  }

  public double addIngPrice(double ingPrice){
    return(ingPrice);
  }

}

