package week_1;

import java.util.Scanner;

import sale.Product;
import sale.ProductPurchase;

public class Hello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product pen = new Product(1, 1000, "Pen", "Blue");
		int count;
		long total;
		String supplier;

		supplier = scanParameter(scan);

		count = extracted(scan);

		System.out.println("Total Price: ");
		total = scan.nextLong();

		ProductPurchase purchase = new ProductPurchase(pen, count, count, supplier);

	}

	private static int extracted(Scanner scan) {
		int count;
		System.out.print("Count: ");
		count = scan.nextInt();
		return count;
	}

	private static String scanParameter(Scanner scan) {
		String supplier;
		System.out.println("Input pen purchase: ");
		System.out.println("Supplier: ");
		supplier = scan.nextLine();
		return supplier;
	}

}
