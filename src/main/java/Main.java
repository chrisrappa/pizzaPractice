public class Main {


  public static void main(String[] args) {
    Order order = new Order();
    order.withCheesePizza(0);
    order.withPepperoniPizza(0);

    new ReceiptPrinter(System.out, order).print();


    }





}


