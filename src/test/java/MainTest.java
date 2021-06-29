import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void cheeseAndSeven() {

    }
}

// if "Cheese Interfaces.Pizza" => setTopping: "cheese" && price: $6 => return Method
// return Method("You ordered" + {prefabType} + " for" + {price})
// if "Pepperoni Interfaces.Pizza" = setTopping: "pepperoni" && price = $7 => return Method
// add [pepperoni, onions, mushrooms, green pepper, sausage, ham, olives, beef] @ $1 ea to cheese pizza => return Method ({cheese} + {[ing]) + {price = $6 + (ing.length + 1)}
// order lg pizza ($9) with any ing (max - $2)
// order Deluxe pizza [pepperoni, onions, mushroom, green pepper, and sausage] , sz Med = $9, sz Lg = $15
// add xtra ing @ 2x price for med, 2x(price) + 1 for large
// order Super Deluxe [pepperoni, onions, mushrooms, green pepper, sausage, ham, olives, beef], sz Med = $12, sz Lg = $20
// remove ingredients from pizza, no charge effect

//Clarify half pizza test
// Don't write presumptive code