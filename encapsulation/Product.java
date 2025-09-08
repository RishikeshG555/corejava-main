package encapsulation;

public class Product {
	private int productId;
	private String productName;
	private Categories categories;
	
	public void setProductId(int productId) {
		this.productId=productId;
	}
	
	public int getProductId() {
		return this.productId;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setCategories(Categories categories) {
		this.categories=categories;
	}
	
	public Categories getCategories() {
		return this.categories;
	}
}