import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


//Initialize new Order
//Call printStream arg (creates sout and adds mock class to print)
//Call receipt printer and pass in printStream mock info & order
//print
//verify value of print statement is "$6.00


public class ReceiptPrinterTest{
  @Test
  public void shouldPrintReceiptForSixDollarsWhenOrderHasTotalPriceOfSixDollars() {
    Order order = new Order();
    PrintStream printStream = mock(PrintStream.class);
    order.withCheesePizza(1);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println("Total cost is 6.0\n\n Cheese Pizza 6.0");
  }
//
//  @Test
//  public void receiptShouldListMoreThanOnePizzaOrderedWithPricePerPizza() {
//      Order order = new Order();
//      PrintStream printStream = mock(PrintStream.class);
//      ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
//      receiptPrinter.print();
//
//      verify(printStream).println();
//  }

  @Test
  public void receiptShouldPrintEachItemOrderedWithDollarSignsAndTotalAtTheBottom(){
    Order order = new Order();
    order.withCheesePizza(1);
    order.withPepperoniPizza(1);

    PrintStream printStream = mock(PrintStream.class);
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println( "\nCheese Pizza $6.00" +
    "\nPepperoni Pizza $7.00" +
    "\nTotal cost is: $13.00");

//    Program does what I want it to but this test fails and I'm not sure why, says "different Argument(s)"

  }

}
