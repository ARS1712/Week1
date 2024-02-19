package sale;

public class ProductPurchase {
	private Product product;
	private int count;
	private long price;
	private String supplier;

	public Product getProduct() {
		return product;
	}

	public int getCount() {
		return count;
	}

	public long getPrice() {
		return price;
	}

	public String getSupplier() {
		return supplier;
	}

	public ProductPurchase(Product product, int count, long price, String supplier) {
		this.product = product;
		this.count = count;
		this.price = price;
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return String.format("Product: %s, Count: %d, Supplier: %s, Total: %d", product.getName());
	}

}
