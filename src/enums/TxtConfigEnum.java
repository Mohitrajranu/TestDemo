package enums;

public enum TxtConfigEnum {
//	NEFT("NEFT"), ELEMENTTAG("MSG"), RTGS("RTGS"),
//	Header1("A:XXXF01I298N02RBIP0NEFTSC");
	REFNUM("2020"),
	AMT("4110"),
	DATE("3380"),
	SENDERIFSC("5756"),
    CUSTACTTYPE("6305"),
	CUSTACTNUM("6021"),
	CUSTACTNAME("6091"),
//	CUSTMOBNUM("FSending_Customer_Mobile_No_Email"),
	REMITORIGIN("7002"),
	BENEFIFSC("5569"),
	BENEFACTTYPE("6310"),
	BENEFACTNUM("6061"),
	BENEFACTNAME("6081"),
	BENEFADDR("5565"),
	SENDERTORECEIVERINFO("7495");
//	Header2("A:XXXF01I298N02RBIP0NEFTSC"),
	
	private String statusCode;
	
	private int statusId;
	private TxtConfigEnum(String s) {
		statusCode = s;
	}
	private TxtConfigEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
