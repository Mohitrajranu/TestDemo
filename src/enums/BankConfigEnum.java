package enums;

public enum BankConfigEnum {
	APPID("AppID");
	private String statusCode;
	private int statusId; // added for sftp and ftp

	private BankConfigEnum(int i) { // added for sftp and ftp
		statusId = i;
	}

	private BankConfigEnum(String s) {
		statusCode = s;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public int getStatusId() {
		return statusId;
	}

}
