public class Main {


  public static void main(String[] args) {
    Order order = new Order();
    order.withCheesePizza(2);
    order.withPepperoniPizza(3);

    new ReceiptPrinter(System.out, order).print();


    }





}


