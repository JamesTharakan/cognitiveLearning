package apps.mini.sales;

public class sales {

	public static void main(String[] args) {
		
		product p[] = {
						new product(1,"book",12.49,false,false),
						new product(1,"Music CD",14.99,true,false) ,////16.49
						new product(1,"chocolate bar",0.85,false,false)
					};
		generateBill(p);
	}
	

	private static void generateBill(product p[]) {
		double totalTax=0.00;
		double total=0.00;
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			totalTax+=p[i].ComputedTax;
			total+=p[i].cost+p[i].ComputedTax;
		}
		
		System.out.println("Sales Taxes: "+String.format("%.2f", totalTax));
		System.out.println("Total: "+String.format("%.2f", total));
		
	}

}

 class product{
	 
	 int qunatity=0;
	 String productName ;
	 double cost ;
	 double ComputedTax;
	 boolean basicTax;
	 boolean importTax;
	 
	 public product(int qunatity, String productName, double cost, boolean basicTax, boolean importTax) {
		super();
		this.qunatity = qunatity;
		this.productName = productName;
		this.cost = cost;
		this.basicTax = basicTax;
		this.importTax = importTax;
		computeTax();
		
	}

	 private void computeTax() {
		 if(this.basicTax)
			 ComputedTax=  cost*0.10;
		 
		 if(this.importTax)
			 ComputedTax = ComputedTax+(cost*0.05);
		 
		 
	}

	public String toString(){
		 return qunatity+" "+productName+" at "+String.format("%.2f", (cost+ComputedTax));
	 }
 }
