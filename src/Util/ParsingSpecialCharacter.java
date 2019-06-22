package Util;

import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.log4j.Logger;

import enums.MessageTypeEnum;


public class ParsingSpecialCharacter {
	
	//String SpecialCharacter[] = {"!","@","#","$","%","^","&","*","--","=",";","<",">","~","`","[","]","|","_"};
		
	
	public static String generateFileName(int ourThere, String msgType, String groupId, String sequence)
	{
		String returnVal="", today="";
		try{
			ParsingSpecialCharacter pspc = new ParsingSpecialCharacter();
			Properties props = new Properties();
			props.load(pspc.getPropertyfile());
			String bankInitial=props.getProperty("YSBInitial");
			if(groupId.equals("YBL")){
				if(ourThere==0){
					today = Date_prog.getCurrentDate();
					//generate CBS naming convention
					if(msgType.equals(MessageTypeEnum.FreshIncoming.getStatusCode())
							|| msgType.equals(MessageTypeEnum.AcknowledgementOfOutwardTransaction.getStatusCode())|| msgType.equals(MessageTypeEnum.IncomingPositiveAck.getStatusCode())){
						returnVal="NEFT_"+today+"_"+sequence+".TXT";
					}else if(msgType.equals(MessageTypeEnum.NEFTCONFIRMATION.getStatusCode())){
						returnVal="RTGSRBI_NEFT_"+today+"_"+sequence+".TXT";
					}
					
				}else{
					//generate Opposite bank naming convention
					today = Date_prog.getCurrentDateYBL();
					if(msgType.equals(MessageTypeEnum.FreshOutgoing.getStatusCode())|| msgType.equals(MessageTypeEnum.IncomingReverse.getStatusCode())
							|| msgType.equals(MessageTypeEnum.OutgoingPositiveAck.getStatusCode())){
						returnVal = "YES"+bankInitial+today+sequence+msgType+".txt";
					}else if(msgType.equals(MessageTypeEnum.RTGS_OUTWARD.getStatusCode())|| msgType.equals(MessageTypeEnum.RTGS_RETURN_TRANSACTION.getStatusCode()) || msgType.equals(MessageTypeEnum.RTGS_RETURN_R42.getStatusCode())){
						returnVal = "YES"+bankInitial+today+sequence+"Pac008"+".xml";
					}
				}
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return returnVal;
	}
	
	public static String SpecialCharacter(String str)
	{
		String SpecialCharacter[] = {"&","--","=",";","<",">","~","`","[","]","|","_"};
		for(int i=0 ; i<SpecialCharacter.length;i++)
		{
			try{
			if(str.contains(SpecialCharacter[i]))
			{
//				//System.out.println(" Inside Parse " + SpecialCharacter[i]);
				str=str.replace(SpecialCharacter[i], "");
			}
			}catch (Exception e) {
				str="";
			}
		}
		return str;
	}
	public static int isNumber(String str){
		int retNum=0;
		try{
			retNum = Integer.parseInt(str);
		}catch (Exception e) {
//			logger.error( ParsingSpecialCharacter.getExceptionString(e)+"/n"+ParsingSpecialCharacter.getCurrentTimeStampStr());
		}
		return retNum;
	}
	public static String getCurrentTimeStampStr() {
		String val="";
		Timestamp val2 = new Timestamp(System.currentTimeMillis());
		val = val2.toString();
		return val;
	}
	public static String getExceptionString(Exception e) {
		Writer writer = new StringWriter();
		PrintWriter printWriter = new PrintWriter(writer);
		e.printStackTrace(printWriter);
		String s = writer.toString();
		return s;
	}
	
	public static String convertToSixteenChar(String utr){

        int    utrLen = utr.length();
        int reqLen=0;
        if(utrLen<16){
            reqLen = 16 - utr.length();
        }
        if(reqLen ==1){
            utr = utr+" ";

        }else if(reqLen ==2){
            utr = utr+"  ";

        }else if(reqLen ==3){
            utr = utr+"   ";

        }else if(reqLen ==4){
            utr = utr+"    ";

        }else if(reqLen ==5){
            utr = utr+"     ";

        }else if(reqLen ==6){
            utr = utr+"      ";

        }else if(reqLen ==7){
            utr = utr+"       ";

        }else if(reqLen ==8){
            utr = utr+"        ";

        }else if(reqLen ==9){
            utr = utr+"         ";

        }else if(reqLen ==10){
            utr = utr+"          ";

        }else if(reqLen ==11){
            utr = utr+"           ";

        }else if(reqLen ==12){
            utr = utr+"            ";

        }else if(reqLen ==13){
            utr = utr+"             ";

        }else if(reqLen ==14){
            utr = utr+"              ";

        }else if(reqLen ==15){
            utr = utr+"               ";

        }else if(reqLen ==16){
            utr = utr;

        }

        return utr;

    } 
	public static Timestamp getCurrentTimeStamp() {

		// java.util.Date today = new java.util.Date();
		// return new java.sql.Timestamp(today.getTime());
		return new Timestamp(System.currentTimeMillis());

	}
	
	public InputStream getPropertyfile() {
		InputStream in;
		String propertyfile = "/Property/testYBL.properties";
		in = ParsingSpecialCharacter.class.getResourceAsStream(propertyfile);
		return in;
	}

//	public static Logger provideLogger(String msgType, String bankname, String flow){
//		bankname = bankname.toUpperCase();
//		Logger logger = Logger.getLogger("CommonLogger");
//		if(msgType!=null && !msgType.equals("") && bankname!=null && !bankname.equals("")){
//			if(flow!=null && !flow.equals("")){
//				if(flow.equals("10")){
//					if(msgType.equals("N02")||msgType.equals("N09")){
//						logger = Logger.getLogger(bankname+"NeftIncmLogger");
//					}else if(msgType.equals("F27")||msgType.equals("N10")){
//						logger = Logger.getLogger(bankname+"NeftIncmAckLogger");
//					}else if(msgType.equals("R41")||msgType.equals("R42")||msgType.equals("RR42")){
//						logger = Logger.getLogger(bankname+"RtgsIncmLogger");
//					}else if(msgType.equals("R09")||msgType.equals("R90")){
//						logger = Logger.getLogger(bankname+"RtgsIncmAckLogger");
//					}
//				}else if(flow.equals("01")){
//					if(msgType.equals("N06")||msgType.equals("N07")){
//						logger = Logger.getLogger(bankname+"NeftOutLogger");
//					}else if(msgType.equals("N10")){
//						logger = Logger.getLogger(bankname+"NeftOutAckLogger");
//					}else if(msgType.equals("R41")||msgType.equals("R42")||msgType.equals("RR42")){
//						logger = Logger.getLogger(bankname+"RtgsOutLogger");
//					}
//				}
//			}
//			
//			
//		}
//		return logger;
//	}
	public static String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);    
        return dateFormat.format(cal.getTime());
	}	
	public static String getYesterdayDateString2() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);    
        return dateFormat.format(cal.getTime());
	}	
	
}
