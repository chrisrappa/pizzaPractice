
import java.io.PrintStream;

public class ReceiptPrinter {
  public ReceiptPrinter(PrintStream printStream, Order order) {

    String total = order.total();
    printStream.println(total);

  }

  public static void print() {

  }
}
