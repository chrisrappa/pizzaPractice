import java.util.Arrays;
import java.util.List;

public class Main {


  public static void main(String[] args) {
    Order order = new Order();
    List<String> ingredientAdditions = Arrays.asList("");
    order.withCheesePizza(1, "Pepperoni", "Onions",
            "Mushrooms", "Green Pepper",
            "Sausage", "Ham",
            "Olives", "Beef");

    order.withPepperoniPizza(1, "Onions");

    new ReceiptPrinter(System.out, order).print();


    }





}


