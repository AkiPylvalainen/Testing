package testing;

public class Product {

	private String _name;
	private double _price;
	private int _amount;
	
	public Product(String name, double price, int amount) {
		_name = name;
		_price = price;
		_amount = amount;
	}
	
	public void print() {
		System.out.println("Product: " + _name + ", price: " + _price + ", amount: " + _amount);
	}
	
	public double getTotalPrice() {
		return _price * _amount;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public double getPrice() {
		return _price;
	}
	
	public void setPrice(double price) {
		_price = price;
	}
	
	public int getAmount() {
		return _amount;
	}
	
	public void setAmount(int amount) {
		_amount = amount;
	}
}
