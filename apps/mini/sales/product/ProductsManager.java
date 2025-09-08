package apps.mini.sales.product;

public class ProductsManager {
	
	int invalid =-1;
	int valid=1;
	int validating =2;
	
	
	private static int productCounter=0;


	public static int getProductCounter() {
		return productCounter++;
	}

	
			
	
	public int validateProducts(Product product[]) {
		return 1;
	}

}
