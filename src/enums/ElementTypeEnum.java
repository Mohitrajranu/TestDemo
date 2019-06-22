package enums;

public enum ElementTypeEnum {
	Calculated("C"), 
	String("S"), 
	EnterNormal("E"), 
	EnterKaret("K");
		
	
	private String statusCode;
	
	private int statusId;
	private ElementTypeEnum(String s) {
		statusCode = s;
	}
	private ElementTypeEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
