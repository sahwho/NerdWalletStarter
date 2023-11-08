import java.util.ArrayList;

public class TravelRewardsCard extends CreditCard{
	public enum TravelRewardType {
		POINTS, MILES, MATCHED_CASH_BACK
	}
	
	private ArrayList<Double> rewardsRate;
	private TravelRewardType rewardType;
	
	private TravelRewardType introOfferType;
	private int introOffer;
	
	private int travelCredit;
	private boolean loungeAccess;
	private boolean tsaPreCheckCredit;
	private boolean globalEntryCredit;
	private boolean checkedBagCredit;
	
	//TODO: write constructor(s)
	
	public ArrayList<Double> getRewardsRate() {
		return rewardsRate;
	}
	
	public void setRewardsRate(ArrayList<Double> rewardsRate) {
		this.rewardsRate = rewardsRate;
	}
	
	public TravelRewardType getRewardType() {
		return rewardType;
	}
	
	public void setRewardType(TravelRewardType rewardType) {
		this.rewardType = rewardType;
	}
	
	public boolean isLoungeAccess() {
		return loungeAccess;
	}
	
	public void setLoungeAccess(boolean loungeAccess) {
		this.loungeAccess = loungeAccess;
	}
	
	public int getTravelCredit() {
		return travelCredit;
	}
	
	public void setTravelCredit(int travelCredit) {
		this.travelCredit = travelCredit;
	}
	
	public int getIntroOffer() {
		return introOffer;
	}
	
	public void setIntroOffer(int introOffer) {
		this.introOffer = introOffer;
	}
	
	public TravelRewardType getIntroOfferType() {
		return introOfferType;
	}
	
	public void setIntroOfferType(TravelRewardType introOfferType) {
		this.introOfferType = introOfferType;
	}
	
	public boolean getTsaPreCheckCredit() {
		return tsaPreCheckCredit;
	}
	
	public void setTsaPreCheckCredit(boolean tsaPreCheckCredit) {
		this.tsaPreCheckCredit = tsaPreCheckCredit;
	}
	
	public boolean getGlobalEntryCredit() {
		return globalEntryCredit;
	}
	
	public void setGlobalEntryCredit(boolean globalEntryCredit) {
		this.globalEntryCredit = globalEntryCredit;
	}
	
	public boolean getCheckedBagCredit() {
		return checkedBagCredit;
	}
	
	public void setCheckedBagCredit(boolean checkedBagCredit) {
		this.checkedBagCredit = checkedBagCredit;
	}
	
	@Override
	public String toString() {
		return "TRAVEL-" + super.getBrand() + "-" + super.getName() + "-" + super.getRating();
	}
	
	//TODO: override rating()
}
