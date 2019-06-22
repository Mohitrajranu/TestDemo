package enums;

public enum MessagePartEnum {
	Header("HDR"), Body("BOD"),FreshOutgoing("N06"), General("GEN");
	
	private String statusCode;
	
	private int statusId;
	private MessagePartEnum(String s) {
		statusCode = s;
	}
	private MessagePartEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
