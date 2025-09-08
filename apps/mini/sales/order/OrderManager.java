package apps.mini.sales.order;

import apps.mini.sales.product.Product;
import apps.mini.sales.product.ProductsManager;

public class OrderManager {
	
	ProductsManager pm = new ProductsManager();
	
	static int orderId=0;
	
	OrderStatus status= OrderStatus.INITIED;
	
	
	
	public int createOrder(Product product[]) {
		if(1 == pm.validateProducts(product)) {
			//save order in DS or DB
			return orderId++;
		}
		
		return -1;
	}

}
