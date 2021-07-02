import Interfaces.Pizza;

import java.util.ArrayList;

public class CheesePizza implements Pizza {

  double ingPrice = 0;

  @Override
  public double addPrice() {
    return 6.00;
  }

  @Override
  public String addIngredient(String ingredient, double price) {

    if(ingredient == ""){
      return "";
    }

    ArrayList<String> addedIngredients = new ArrayList<>();
    addedIngredients.add(0, ingredient);
    for(int i = 0; i < addedIngredients.size() ; i++){
      ingPrice += price;
    }

    addIngPrice(ingPrice);
    String pricePerAddition = String.format("%.2f", price);
    return ("+ " + ingredient + "( $" + pricePerAddition + " ) ");

  }

  public double addIngPrice(double ingPrice){
    return(ingPrice);
  }

}

