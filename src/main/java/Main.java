public class Main {


  public static void main(String[] args) {
    Order order = new Order();
    order.withCheesePizza(1, "Pepperoni");
    order.withPepperoniPizza(1, "");

    new ReceiptPrinter(System.out, order).print();


    }





}


