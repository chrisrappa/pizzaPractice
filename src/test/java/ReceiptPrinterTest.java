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
    order.withCheesePizza(1, "", "", "", "",
            "", "", "", "", "Regular");

    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println("Regular Cheese Pizza $6.00\nTotal cost is: $6.00");
  }

  @Test
  public void AddOneIngredientToCheesePizzaForOneDollarExtraAndUpdatePriceWithIngredietName(){
    Order order = new Order();
    order.withCheesePizza(1, "Pepperoni", "", "", "",
            "", "", "", "", "Regular");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Regular Cheese Pizza + Pepperoni( $1.00 ) $7.00\n" + "Total cost is: $7.00");

  }

  @Test
  public void AddOneIngredientToEachPizzaAndPrintPricePerIngAsWellAsAffectingTotalCostOfEachPizzaAsWellAsTotalOrder(){
    Order order = new Order();

    order.withCheesePizza(1, "Pepperoni", "", "", "",
            "", "", "", "", "Regular");

    order.withPepperoniPizza(1, "Onions", "", "", ""
            , "", "", "", "", "Regular");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Regular Cheese Pizza + Pepperoni( $1.00 ) $7.00\n"
            + "Regular Pepperoni Pizza + Onions( $1.00 ) $8.00\n" +
            "Total cost is: $15.00");

  }

  @Test
  public void AddMultipleIngredientsAndHaveThemPrintOutEachWithPricePerAndAffectingTotalPrice(){
    Order order = new Order();

    order.withCheesePizza(1, "Pepperoni", "Onions", "Mushrooms", "Green Pepper", "Sausage", "Ham", "Olives", "Beef", "Regular");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Regular Cheese Pizza + Pepperoni( $1.00 ) + Onions( $1.00 ) + Mushrooms( $1.00 ) + Green Pepper( $1.00 ) + Sausage( $1.00 ) + Ham( $1.00 ) + Olives( $1.00 ) + Beef( $1.00 ) $14.00\n"
            + "Total cost is: $14.00");
  }

  @Test
  public void IfCustomerSelectsLargePizzaWithTwoIngredientsTheTotalShouldBeElevenDollars(){
    Order order = new Order();

    order.withCheesePizza(1, "Pepperoni", "Onions", "", "", "", "", "", "", "Large");

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "Large Cheese Pizza + Pepperoni( $1.00 ) + Onions( $1.00 ) $11.00\n"
            + "Total cost is: $11.00");
  }


}
