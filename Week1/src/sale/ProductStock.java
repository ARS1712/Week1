package sale;

public class ProductStock {
	private Product product;
	private int stock;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public ProductStock(Product product, int stock) {
		super();
		this.product = product;
		this.stock = stock;
	}
}
