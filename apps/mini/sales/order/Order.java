package apps.mini.sales.order;

import apps.mini.sales.product.*;

public class Order {
	
	int orderId;
	
	Product products[]=null;
	
	Order(int orderId, Product products[]){
		this.orderId =orderId;
		this.products=products;
	}


//
//	public int getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
//
//	public Product[] getProducts() {
//		return products;
//	}
//
//	public void setProducts(Product[] products) {
//		this.products = products;
//	}

}
