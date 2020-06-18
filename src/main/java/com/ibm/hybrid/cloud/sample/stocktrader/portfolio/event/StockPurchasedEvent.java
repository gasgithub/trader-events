package com.ibm.hybrid.cloud.sample.stocktrader.portfolio.event;

public class StockPurchasedEvent extends BaseEvent {
	protected String symbol;
	protected int shares;
	protected double price;
	protected double overallTotal;
	protected String loyalty;
	
	public String getLoyalty() {
		return loyalty;
	}
	public void setLoyalty(String loyalty) {
		this.loyalty = loyalty;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symblol) {
		this.symbol = symblol;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int shares) {
		this.shares = shares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getOverallTotal() {
		return overallTotal;
	}
	public void setOverallTotal(double overallTotal) {
		this.overallTotal = overallTotal;
	}
	@Override
	public String toString() {
		return "StockPurchasedEvent [id=" + id + ", type=" + type + ", message=" + message + ", timestamp=" + timestamp
				+ ", owner=" + owner + "symbol=" + symbol + ", shares=" + shares + ", price=" + price + ", overallTotal=" + overallTotal + " ]";
	}
	
	
}
