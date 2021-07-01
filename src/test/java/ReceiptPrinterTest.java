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

    verify(printStream).println("Total cost is 6.0\n\n Cheese Pizza 6.0");
  }


  @Test
  public void receiptShouldPrintEachItemOrderedWithDollarSignsAndTotalAtTheBottom(){
    Order order = new Order();
    order.withCheesePizza(1, "");
    order.withPepperoniPizza(1, "");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Cheese Pizza $6.00\n" + "Pepperoni Pizza $7.00\n" + "Total cost is: $13.00");

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

//    Need to be able to add in multiple ingredients as arguments
    order.withCheesePizza(1, "Pepperoni");
    order.withPepperoniPizza(1, "Onions");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Cheese Pizza + Pepperoni( $1.00 ) $7.00\n"
            + "Pepperoni Pizza + Onions( $1.00 ) $8.00\n" +
            "Total cost is: $15.00");

  }


}
