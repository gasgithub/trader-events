package com.ibm.hybrid.cloud.sample.stocktrader.portfolio.event;

public class BaseEvent {
	public static final String TYPE_PURCHASE = "TYPE_PURCHASE";
	public static final String TYPE_LOYALTY_CHANGED = "TYPE_LOYALTY_CHANGED";
	public static final String TYPE_LOYALTY_NOT_CHANGED = "TYPE_LOYALTY_NOT_CHANGED";
	public static final String TYPE_LOYALTY_CHANGE_NOTIFIED = "TYPE_LOYALTY_CHANGE_NOTIFIED";
	public static final String TYPE_LOYALTY_CHANGED_FAILED = "TYPE_LOYALTY_CHANGED_FAILED";
	public static final String TYPE_LOYALTY_CHECK_FAILED = "TYPE_LOYALTY_CHECK_FAILED";
	
	
	protected String id;
	protected String type;
	protected String message = "";
	protected long timestamp = System.currentTimeMillis(); 
	protected String owner;
	
	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "BaseEvent [id=" + id + ", type=" + type + ", message=" + message + ", timestamp=" + timestamp
				+ ", owner=" + owner + "]";
	}
	

}
