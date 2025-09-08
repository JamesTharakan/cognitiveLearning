package apps.mini.sales.product;

import apps.mini.sales.TaxPercentage;

public class Product{
	 
	 String name ;
	 int id;
	 
	 double cost ; 
	 
	 ProductType pt;
	 TaxPercentage taxCateogery;
	 
	 public Product(int id ,ProductType pt,String productName, double cost, TaxPercentage taxCat) {
		super();
		this.id = id;
		this.name = productName;
		this.cost = cost;
		this.pt = pt;
		TaxPercentage taxCateogery = taxCat;
	}


	 public String getName() {
			return name;
		}


		 public void setName(String name) {
			 this.name = name;
		 }


		 public int getId() {
			 return id;
		 }


//		 public void setId(int id) {
//			 this.id = id;
//		 }
//		 
		public String toString(){
		 return name+" at "+cost;
		}
}	
