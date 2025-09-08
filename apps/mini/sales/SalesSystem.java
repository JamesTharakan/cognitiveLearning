package apps.mini.sales;

import apps.mini.sales.order.OrderManager;
import apps.mini.sales.product.Product;
import apps.mini.sales.product.ProductType;
import apps.mini.sales.product.ProductsManager;

public class SalesSystem {
	
	static OrderManager  om = new OrderManager();
	
	static ProductsManager pm = new ProductsManager();
	
	

	public static void main(String[] args) {
		
		
		Product products[] = {
								new Product(pm.getProductCounter(),ProductType.BOOK,"HeadFirstC", 100,TaxPercentage.IMPORT),
								new Product(pm.getProductCounter(),ProductType.BOOK,"HeadFirstJava", 150,TaxPercentage.BASIC)
					
							};
		
		om.createOrder(products);
		
		// GEnerarte bill
		
		pm.generateBill();
		
		
		//payment
		
		//shipping.
		

	}

}
