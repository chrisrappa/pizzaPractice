import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class ReceiptPrinterTest{
  @Test
  public void shouldPrintReceiptForSixDollarsWhenOrderHasTotalPriceOfSixDollars() {
    Order order = new Order();
    PrintStream printStream = mock(PrintStream.class);
    order.withCheesePizza(1, "");
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println("Cheese Pizza $6.00\nTotal cost is: $6.00");
  }

  @Test
  public void AddOneIngredientToCheesePizzaForOneDollarExtraAndUpdatePriceWithIngredietName(){
    Order order = new Order();
    order.withCheesePizza(1, "Pepperoni");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Cheese Pizza + Pepperoni( $1.00 ) $7.00\n" + "Total cost is: $7.00");

  }

  @Test
  public void AddOneIngredientToEachPizzaAndPrintPricePerIngAsWellAsAffectingTotalCostOfEachPizzaAsWellAsTotalOrder(){
    Order order = new Order();

    order.withCheesePizza(1, "Pepperoni");
    order.withPepperoniPizza(1, "Onions");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Cheese Pizza + Pepperoni( $1.00 ) $7.00\n"
            + "Pepperoni Pizza + Onions( $1.00 ) $8.00\n" +
            "Total cost is: $15.00");

  }

//  @Test
//  public void AddMultipleIngredientsAndHaveThemPrintOutEachWithPricePerAndAffectingTotalPrice(){
//    Order order = new Order();
//
//    order.withCheesePizza(1, "Pepperoni", "Onions", "Mushrooms", "Green Pepper", "Sausage", "Ham", "Olives", "Beef");
//
//    PrintStream printStream = mock(PrintStream.class);
//    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
//    receiptPrinter.print();
//
//    verify(printStream).println( "Cheese Pizza + Pepperoni( $1.00 ) + onions( $1.00 ) + mushrooms( $1.00 ) + green pepper( $1.00 ) + sausage( $1.00 ) + ham( $1.00 ) + olives( $1.00 ) + beef( $1.00 ) $14.00\n"
//            + "Total cost is: $15.00");
//  }


}
