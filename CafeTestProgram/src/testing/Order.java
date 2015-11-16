package testing;

import java.util.ArrayList;

public class Order {

	private ArrayList<Product> _products;
	
	public Order() {
		_products = new ArrayList<>();
	}
	
	public void add(Product p) {
		_products.add(p);
	}
	
	public void remove(Product p) {
		_products.remove(p);
	}
	
	public void clear() {
		_products.clear();
	}
	
	public double getTotalPrice() {
		double total = 0;
		for(Product p : _products) {
			total += p.getTotalPrice();
		}
		return total;
	}
	
	public int getTotalAmount() {
		int total = 0;
		for(Product p : _products) {
			total += p.getAmount();
		}
		return total;
	}
}
