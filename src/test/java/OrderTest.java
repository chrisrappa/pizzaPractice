import org.junit.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.Assert.assertEquals;

public class OrderTest {
  @Test
  public void shouldHaveSixDollarReceiptForCheesePizza() {
    Order order = new Order();

    order.withCheesePizza(1);
    order.total();

    assertEquals("6.0", order.total());
  }

  @Test
  public void shouldHave2CheesePizzasAndReturnCostOfBoth() {
      Order order = new Order();

      order.withCheesePizza(2);
      order.total();

      assertEquals("12.0", order.total());
  }

  @Test
  public void shouldHaveOnePepperoniPizza(){
    Order order = new Order();

    order.withPepperoniPizza(1);
    order.total();

    assertEquals("7.0", order.total());
  }

  @Test
  public void shouldHaveOnePepperoniPizzaAndOneCheeseThenReturnCostOfBoth(){
    Order order = new Order();

    order.withPepperoniPizza(1);
    order.withCheesePizza(1);

    assertEquals("13.0", order.total());
  }

  @Test
  public void printReceiptIncludesIndividualPizzas() {
      Order order = new Order();

      order.withPepperoniPizza(1);
      assertEquals("7.0\n\n Pepperoni Pizza 7.0", order.printReceipt());

  }

}