import org.junit.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.Assert.assertEquals;

public class OrderTest {
  @Test
  public void shouldHaveSixDollarReceiptForCheesePizza() {
    Order order = new Order();

    order.withCheesePizza(1, "", "", "", ""
            , "", "", "", "", "Regular");
    order.total();

    assertEquals("6.00", order.total());
  }

  @Test
  public void shouldHave2CheesePizzasAndReturnCostOfBoth() {
      Order order = new Order();

      order.withCheesePizza(2, "", "", "",
            "", "", "", "", "", "Regular");

      order.total();

      assertEquals("12.00", order.total());
  }

  @Test
  public void shouldHaveOnePepperoniPizza(){
    Order order = new Order();

    order.withPepperoniPizza(1, "", "", "", ""
            , "", "", "", "", "Regular");
    order.total();

    assertEquals("7.00", order.total());
  }

  @Test
  public void shouldHaveOnePepperoniPizzaAndOneCheeseThenReturnCostOfBoth(){
    Order order = new Order();

    order.withPepperoniPizza(1, "", "", "", ""
            , "", "", "", "", "Regular");
    order.withCheesePizza(1, "", "", "", ""
            , "", "", "", "", "Regular");

    assertEquals("13.00", order.total());
  }

  @Test
  public void printReceiptIncludesIndividualPizzas() {
      Order order = new Order();

      order.withPepperoniPizza(1, "", "", "", ""
              , "", "", "", "", "Regular");
      assertEquals("Pepperoni Pizza $7.00\nTotal cost is: $7.00", order.printReceipt());

  }



}