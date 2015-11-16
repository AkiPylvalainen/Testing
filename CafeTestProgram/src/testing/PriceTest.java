package testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PriceTest {

	@Test
	public void test() {
		Order order = new Order();
		
		order.add(new Product("coffee", 1.15, 1));
		order.add(new Product("bread", 2.0, 1));
		order.add(new Product("cupcake", 2.3, 1));
		
		double output = order.getTotalPrice();
		Assert.assertEquals(4.00, output, 1);
	}

}
