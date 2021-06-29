
import java.io.PrintStream;

public class ReceiptPrinter {
  PrintStream printStream;
  Order order;

  public ReceiptPrinter(PrintStream printStream, Order order) {
    this.printStream = printStream;
    this.order = order;
  }

  public void print() {
    String total = order.printReceipt();
    printStream.println(total);
  }
}
