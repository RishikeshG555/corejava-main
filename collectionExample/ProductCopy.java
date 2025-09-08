package collectionExample;

public class ProductCopy implements Comparable<ProductCopy> {
	private int id;
	private String name;
	private int price;
	public ProductCopy(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public ProductCopy() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return this.id+" "+this.name+" "+this.price;
	}
	@Override
	public int compareTo(ProductCopy o) {
		return this.name.compareTo(o.name);
	}
}
