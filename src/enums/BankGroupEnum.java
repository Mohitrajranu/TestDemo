package enums;

public enum BankGroupEnum {
	TextToText("TT"),
	Texttoxml("TX"),
	Xmltotext("XT"),
	Xmltoxml("XX"),
	Noneedofconvertion("NA"),
	Texttowebservice("TW"),
	Webservicetotext("WT"),
	Webservicetowebservice("WW"),
	Absent("0"),
	OurToTheir("01"),
	TheirToOur("10"),
	IndianCurrency("INR");
	
	private String statusCode;
	
	private int statusId;
	private BankGroupEnum(String s) {
		statusCode = s;
	}
	private BankGroupEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
