
public enum CoffeeSize {

	BIG(8),HUGE(10),OVERHELMING(20);
	
	private int ounces;
	
	CoffeeSize(int ounces) {
		this.ounces = ounces;
	}

	public int getOunces() {
		return ounces;
	}

	public void setOunces(int ounces) {
		this.ounces = ounces;
	}
}
