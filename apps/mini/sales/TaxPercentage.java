package apps.mini.sales;

public enum TaxPercentage {
	
	BASIC(2),
	IMPORT(5);
	
	double percentage;

	TaxPercentage(double percent){
		this.percentage = percent;
	}

	
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
