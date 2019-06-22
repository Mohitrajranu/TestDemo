package enums;

public enum XmlConfigEnum {
	NEFT("NEFT"), ELEMENTTAG("MSG"), RTGS("RTGS"),
	
	UTR_key("utr"),
	R41_UTR_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/PmtId/EndToEndId"),
	R42_UTR_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/PmtId/EndToEndId"),
	RR42_UTR_value("/RequestPayload/Document/PmtRtr/TxInf/RtrId"),
	PR09_UTR_value("/RequestPayload/Document/BkToCstmrDbtCdtNtfctn/Ntfctn/Ntry/NtryDtls/TxDtls/Refs/EndToEndId"),
	NR09_UTR_value("/RequestPayload/Document/FIToFIPmtStsRpt/OrgnlGrpInfAndSts/OrgnlMsgId"),
	ReturnUTR_key("return_utr"),
	ReturnUTR_value("/RequestPayload/Document/PmtRtr/TxInf/OrgnlEndToEndId"),
	SENDERIFSC_key("sender_ifsc"),
	R41_SENDERIFSC_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/DbtrAgt/FinInstnId/ClrSysMmbId/MmbId"),
	R42_SENDERIFSC_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/Dbtr/FinInstnId/ClrSysMmbId/MmbId"),
	RR42_SENDERIFSC_value("/RequestPayload/Document/PmtRtr/TxInf/InstgAgt/FinInstnId/ClrSysMmbId/MmbId"),
	BENEFIFSC_key("benef_ifsc"),
	R41_BENEFIFSC_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/CdtrAgt/FinInstnId/ClrSysMmbId/MmbId"),
	R42_BENEFIFSC_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/Cdtr/FinInstnId/ClrSysMmbId/MmbId"),
	RR42_BENEFIFSC_value("/RequestPayload/Document/PmtRtr/TxInf/InstdAgt/FinInstnId/ClrSysMmbId/MmbId"),
	AMOUNT_key("amount"),
	R41_AMOUNT_value("/RequestPayload/Document/FIToFICstmrCdtTrf/GrpHdr/TtlIntrBkSttlmAmt[@Ccy='INR']"),
	R42_AMOUNT_value("/RequestPayload/Document/FinInstnCdtTrf/GrpHdr/TtlIntrBkSttlmAmt[@Ccy='INR']"),
	RR42_AMOUNT_value("/RequestPayload/Document/PmtRtr/GrpHdr/TtlRtrdIntrBkSttlmAmt[@Ccy='INR']"),
	CREDT_key("Cre_dt"),
	R41_CREDT_value("/RequestPayload/AppHdr/CreDt"),
	R42_CREDT_value("/RequestPayload/AppHdr/CreDt"),
	RR42_CREDT_value("/RequestPayload/Document/PmtRtr/GrpHdr/CreDtTm"),
	NR90_CREDT_value("/RequestPayload/AppHdr/CreDt"),
	PR90_CREDT_value("/RequestPayload/AppHdr/CreDt"),
	INSTRID_key("Instr_id"),
	R41_INSTRID_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/PmtId/InstrId"),
	R42_INSTRID_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/PmtId/InstrId"),
	RR42_INSTRID_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/PmtId/InstrId"),
	TXID_key("Tx_id"),
	R41_TXID_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/PmtId/TxId"),
	R42_TXID_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/PmtId/TxId"),
	RR42_TXID_value("/RequestPayload/Document/FinInstnCdtTrf/CdtTrfTxInf/PmtId/TxId"),
	
	SENDERACTNO_key("sender_act_no"),
	R41_SENDERACTNO_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/DbtrAcct/Id/Othr/Id"),
	SENDERNAME_key("sender_name"),
	R41_SENDERNAME_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/Dbtr/Nm"),
	SENDERADDR_key("sender_addr"),
	R41_SENDERADDR_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/Dbtr/PstlAdr/AdrLine"),
	BENEFACCTNO_key("Benef_act_no"),
	R41_BENEFACCTNO_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/CdtrAcct/Id/Othr/Id"),
	BENFNAME_key("benf_name"),
	R41_BENFNAME_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/Cdtr/Nm"),
	BENEFADDR_key("Benf_addr"),
	R41_BENEFADDR_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/Cdtr/PstlAdr/AdrLine"),
	SENDERTORECEIVERINFO_key("sendertoreceiverinfo"),
	SENDERTORECEIVERINFO_value("/RequestPayload/Document/FIToFICstmrCdtTrf/CdtTrfTxInf/RmtInf/Ustrd"),
	
	ACKTYPE_key("Acktype"),
	NR90_ACKTYPE_value("/RequestPayload/Document/SysEvtNtfnV01/EvtInf/EvtCd"),
	
	NR90_NACKERRORCODE_value("/RequestPayload/Document/SysEvtNtfnV01/EvtInf/EvtParam"),
	NR90_REJECTREASON_value("/RequestPayload/Document/SysEvtNtfnV01/EvtInf/EvtDesc"),
	//from here acknack related enums starts
	RTGS22DIGITUTRIDENTIFIER("RINACK"),
	RTGS22DIGITUTRIDENTIFIER_VALUE("/RequestPayload/AppHdr/BizMsgIdr");
	
	private String statusCode;
	
	private int statusId;
	private XmlConfigEnum(String s) {
		statusCode = s;
	}
	private XmlConfigEnum(int i) {
		statusId = i;
	}
 
	public String getStatusCode() {
		return statusCode;
	}
	public int getStatusId() {
		return statusId;
	}
}
