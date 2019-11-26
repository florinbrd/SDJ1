
public class PreferredCustomer extends Customer {
	
	private double purchaseAmount; 
	private double discountLevel; 
	
	public PreferredCustomer(String name, String address, int telNo, int customerID, double purchaseAmount, double discountLevel) {
		super(name, address, telNo, customerID);
		this.purchaseAmount = purchaseAmount; 
		this.discountLevel = discountLevel; 
	}
	
	public PreferredCustomer(String name, String address, int telNo, int customerID, double purchaseAmount) {
		super(name, address, telNo, customerID);
		this.purchaseAmount = purchaseAmount; 
		this.discountLevel = 0; 
	}
	
	public double getPurchaseLevel() {
		return purchaseAmount; 
	}
	
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
		
		if(purchaseAmount > 500) {
			setDiscount(0.05);
			applyDiscount();
		} else if (purchaseAmount > 1000) {
			setDiscount(0.06);
			applyDiscount();
		}else if (purchaseAmount > 1500) {
			setDiscount(0.07);
			applyDiscount();
		} else if (purchaseAmount > 2000) {
			setDiscount(0.10);
			applyDiscount();
		}
	}
	
	public double getDiscount() {
		return discountLevel; 
	}
	
	public void setDiscount(double percentage) {
		this.discountLevel = percentage;
	}
	
	public void applyDiscount() {
		purchaseAmount = purchaseAmount * discountLevel;
	}
	
	public String toString() {
		return super.toString() + " " + purchaseAmount + " " + discountLevel; 
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof PreferredCustomer)) {
			return false; 
		}
		
		PreferredCustomer other = (PreferredCustomer) obj;
		
		return super.equals(other) && purchaseAmount == other.purchaseAmount && discountLevel == other.discountLevel;
	}
	

}
