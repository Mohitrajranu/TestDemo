package enums;

public enum MessageTypeEnum {
	//INC NEFT
	FreshIncoming("N02"),
	AcknowledgementOfOutwardTransaction("F27"), 
	NEFTCONFIRMATION("N09"), 
	IncomingPositiveAck("N10"),
	NeftReturnTx("N02R"), 
	ExceptionFromTheirBank("NEFTEX"),
	
	//OUT NEFT
	FreshOutgoing("N06"), 
	IncomingReverse("N07"), 
	OutgoingPositiveAck("N10"), 
	ExceptionFromOurBank("NEFTEX"),
	 
	//INC RTGS
	RTGS_OUTWARD("R41"),
	RTGS_RETURN_TRANSACTION("R42"),
	RTGS_RETURN_R42("RR42"),
	RTGS_SFMS_CONF("R90"),
	RTGS_RBI_CONF("R09"),
	RTGS_POSITIVE_SFMS_CONF("PR90"),
	RTGS_NEGATIVE_SFMS_CONF("NR90"),
	RTGS_POSITIVE_RBI_CONF("PR09"),
	RTGS_NEGATIVE_RBI_CONF("NR09"),
	RtgsExceptionFromTheirBank("RTGSEX"),
	
	//OUT RTGS
	
	RtgsExceptionFromOurBank("RTGSEX"),
	RTGS_InwardR41("R41"),
	RTGS_INWARDR42("R42"),
	

	RTGS("RTGS"),NEFT("NEFT"),
	FTP_FTP(0),FTP_SFTP(1), SFTP_FTP(10),SFTP_SFTP(11);
	
	private String statusCode;
	
	private int statusId;
	private MessageTypeEnum(String s) {
		statusCode = s;
	}
	private MessageTypeEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
