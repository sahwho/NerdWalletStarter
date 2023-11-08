import java.util.ArrayList;

public class CreditCard {
	public enum Brand {
		AMEX, BANK_OF_AMERICA, CAPITAL_ONE, CHASE, CITI, DISCOVER, US_BANK, WELLS_FARGO
	}
	
	private Brand brand;
	private String name;
	private ArrayList<Double> APR;
	private ArrayList<Integer> annualFee;
	private double rating;
	
	//TODO: write constructor(s)

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getAPR() {
		return APR;
	}

	public void setAPR(ArrayList<Double> aPR) {
		APR = aPR;
	}
	
	public ArrayList<Integer> getAnnualFee() {
		return annualFee;
	}
	
	public void setAnnualFee(ArrayList<Integer> annualFee) {
		this.annualFee = annualFee;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "CREDIT-" + brand + "-" + name + "-" + rating;
	}
	
	public double rating() {
		return (int)(Math.random() * 6);
	}
}
