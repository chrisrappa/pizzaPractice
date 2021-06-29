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
    ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
    receiptPrinter.print();

    verify(printStream).println("$6.00");
  }

  @Test
  void receiptShouldListMoreThanOnePizzaOrderedWithPricePerPizza() {
      Order order = new Order();
      PrintStream printStream = mock(PrintStream.class);
      ReceiptPrinter receiptPrinter = new ReceiptPrinter(printStream, order);
      receiptPrinter.print();

      verify(printStream).println();
  }
}
