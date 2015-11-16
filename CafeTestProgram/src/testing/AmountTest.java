package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmountTest {

	@Test
	public void test() {
		Order order = new Order();
		
		order.add(new Product("coffee", 1.15, 3));
		order.add(new Product("bread", 2.0, 4));
		order.add(new Product("cupcake", 2.3, 5));
		
		int output = order.getTotalAmount();
		assertEquals(9, output);
	}

}
