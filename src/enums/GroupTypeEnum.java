package enums;

public enum GroupTypeEnum {
	TEXTTEXT("TT"), 
	TEXTXML("TX"), 
	XMLTEXT("XT"), 
	XMLXML("XX"), 
	WEBSERVICETEXT("WT"), 
	WEBSERVICEXML("WX"), 
	WEBSERVICEWEBSERVICE("WW"), 
	TEXTWEBSERVICE("TW"),
	XMLWEBSERVICE("XW"),
	OUTPUTINITIATOR("X"),
	INPUT(1),
	OUTPUT(2);
		
	
	private String statusCode;
	
	private int statusId;
	private GroupTypeEnum(String s) {
		statusCode = s;
	}
	private GroupTypeEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
