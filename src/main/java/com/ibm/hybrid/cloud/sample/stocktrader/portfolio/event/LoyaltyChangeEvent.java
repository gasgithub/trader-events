package com.ibm.hybrid.cloud.sample.stocktrader.portfolio.event;

public class LoyaltyChangeEvent extends BaseEvent {
	protected String oldLoyalty = "UNKNOWN";
	protected String newLoyalty = "UNKNOWN";
	
	public LoyaltyChangeEvent() {}
	
	public LoyaltyChangeEvent(BaseEvent event) {
		id = event.id;
		owner = event.owner;
		timestamp = System.currentTimeMillis();
	}
	public String getOldLoyalty() {
		return oldLoyalty;
	}
	public void setOldLoyalty(String oldLoalty) {
		this.oldLoyalty = oldLoalty;
	}
	public String getNewLoyalty() {
		return newLoyalty;
	}
	public void setNewLoyalty(String newLoalty) {
		this.newLoyalty = newLoalty;
	}
	
	
}
