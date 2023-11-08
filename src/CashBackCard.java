import java.util.ArrayList;

public class CashBackCard extends CreditCard{
	public enum CashBackType {
		STRAIGHT_CASH, MATCHED_CASH_BACK, PERCENTAGE
	}
	private ArrayList<Double> rewardsRate;
	private CashBackType rewardType;
	
	private CashBackType introOfferType;
	private int introOffer;
	
	//TODO: write constructor(s)
	
	public ArrayList<Double> getRewardsRate() {
		return rewardsRate;
	}
	
	public void setRewardsRate(ArrayList<Double> rewardsRate) {
		this.rewardsRate = rewardsRate;
	}
	
	public CashBackType getRewardType() {
		return rewardType;
	}
	
	public void setRewardType(CashBackType rewardType) {
		this.rewardType = rewardType;
	}
	
	public CashBackType getIntroOfferType() {
		return introOfferType;
	}
	
	public void setIntroOfferType(CashBackType introOfferType) {
		this.introOfferType = introOfferType;
	}
	
	public int getIntroOffer() {
		return introOffer;
	}
	
	public void setIntroOffer(int introOffer) {
		this.introOffer = introOffer;
	}
	
	@Override
	public String toString() {
		return "CASHBACK-" + super.getBrand() + "-" + super.getName() + "-" + super.getRating();
	}
	
	//TODO: override rating()
}
