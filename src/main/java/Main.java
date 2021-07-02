import java.util.Arrays;
import java.util.List;

public class Main {


  public static void main(String[] args) {
    Order order = new Order();
    order.withCheesePizza(1, "Pepperoni", "Onions",
            "Mushrooms", "Green Pepper",
            "Sausage", "Ham",
            "Olives", "Beef", "Large");

    order.withPepperoniPizza(1, "Onions", "", "",
            "", "", "", "",  "", "Regular");

    new ReceiptPrinter(System.out, order).print();


    }





}


