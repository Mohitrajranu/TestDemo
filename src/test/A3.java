package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Util.GenericConstants;





   class A3 {  
	   
	   protected  GenericConstants.REQ_DEACT_MODE deactMode = null;
	   public GenericConstants.REQ_DEACT_MODE getDeactMode() {
			return deactMode;
		}
		/**
		 * @param deactMode the deactMode to set
		 */
		public void setDeactMode(GenericConstants.REQ_DEACT_MODE deactMode) {
			this.deactMode = deactMode;
		}
	 public static final String DATE_FORMAT = "yyyyMMddHHmmssss";
	
	/*public static void main(String args[]) {
		// Database_connect dc = new Database_connect();
		// int depth=dc.getcurrentdepth();
		// System.out.println("depth--->"+depth);
		String a = "0123456789";
		System.out.println(a.substring(1, 2));
		Object object = new Object();
		object.equals(null);
	}*/
	 
	 public static boolean isNullString (String text)
     {
             if (null != text)
             {

                     if (text.trim().length()==0) return true;
                     return false;
             }
             else
             {
                return true;
             }
     }
	 
	 public static String convertUtilDateToString(java.util.Date date, String pattern)
	    {
	            try
	            {
	                java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(pattern);
	                formatter.setLenient(false);
	                return formatter.format(date);
	            }
	            catch(Exception ex)
	            {
	                        return null;
	            }

	    }
	 public static void main(String[] args) {
		 
		
	/*	 Reqvo reqvo = new Reqvo();
	String dt = new SimpleDateFormat("ddMMyyHHmmssss").format(Calendar.getInstance().getTime());
     long currentTimeinSec = Long.parseLong(dt);
		 System.out.println(currentTimeinSec);
		 */
		 
		 /* String str = "D";
		 if (str.matches("^[NY]")){
			 System.out.println("True");
		 }
		 */
		 /*if (("").equals(str.trim())){
			 errorCode = "-999";
			 System.out.println("True"+errorCode);
		 }*/
		 //Running Mode Check condition
		/* if(str.matches("^[OCE]") || str.matches("^[E][R]{1}")){
			 System.out.println("True");
		 }
		
		 */
		 //service Group check condition
		 /*if((("VAS").equals(str) || ("DIG").equals(str))){
			 System.out.println("True");
		 }*/
		 //subscription Type check condition
		/* if (str.matches("^[012]")){
			 System.out.println("True");
		 }
		*/ 
		 //subscription Status Check condition
		  /* if (str.matches("^[AGSCDEI]")){
			 System.out.println("True");
		 }
		*/
		 //service Type check condition
		 /*  if (str.matches("^[Z][0-9]{4}$")){
			 System.out.println("True");
		 }*/
		 
		// String only like circle,servicePriority,serviceId
		 /* if (str.matches("[a-zA-Z]+")){
			 System.out.println("True");
		 }*/
		 
		 //Number Only like record limit,batch size,delay for Records etc
		  /* if (str.matches("^[0-9]*$")){
			 System.out.println("True");
		 }else if (("").equals(str.trim())){
			 errorCode = "-999";
			 System.out.println("True"+errorCode);
		 }
		 
		 */
		 
		/* else{
			 System.out.println("False");
		 }*/
	/*	 String vasChck = "_VASSDRSE00_";
		 String digChck = "_SDRSE00_";
		 String downloadPattern = "*"+vasChck+"*";
		 
		 System.out.println(downloadPattern);
		long currentDateMs = new Date().getTime();
		int a=(int)(currentDateMs / 1000);
		System.out.println(currentDateMs);
		System.out.println(a);
		 String FileName="105_0000_SDRSE00_20170527092322_DIG.cdr";
		 String VAS_FileName="105_0000_VASSDRSE00_20170527092322_VAS.cdr";
		 if(VAS_FileName.contains("SDRSE00"))
		 {
			 System.out.println("TrueFlag");
		 }
		 else{
			 System.out.println("FalseFlag"); 
		 }
		 System.out.println("Time is"+A3.convertUtilDateToString(new java.util.Date(), DATE_FORMAT));
		 
		 String time = A3.convertUtilDateToString(new java.util.Date(), DATE_FORMAT).substring(0, 10);
			String t1=time.substring(0, 10);
			System.out.println(t1);
			
      String filedate_time=FileName.substring(17, 27);
		 System.out.println("DIG="+filedate_time);
		 System.out.println(VAS_FileName.substring(20, 30));
		 if(!(t1.equals(filedate_time))){
			System.out.println("Date time condition is validated"); 
		 }
		 else{
			 System.out.println("Date time condition is Invalidated"); 
		 }*/
	      /* String servicType = "16_0000_SDRSE00_20170610090000_DIG.cdr";
	       String comma = " _ ";
	        String sep = "\\"+comma.trim();
	        String[] serviceTypeArr = servicType.split(sep);
	        String fileTime = serviceTypeArr[3];
	        System.out.println(fileTime);
	      */  
		 /*for(int j =0; j<serviceTypeArr.length;j++)
	        {
	        	 System.out.println(j+"value"+serviceTypeArr[3]);
	        }*/
		/* A3 a3 = new A3();
		 int a =a3.myTest();
	     System.out.println(a);
		*/ 
		/*String s="hello      world\rrafter\nnafter\ffafter";
		System.out.println("hello      world\rrafter\nnafter\ffafter");
	   System.out.println(s.replaceAll("\n|\r|\f|\\s",  " "));
	 */
		try {
			
			/*String value="'Z0031','Z0016','Z0026'";
			Pattern pattern = Pattern.compile("'(.*)','(.*)','(.*)'|'(.*)'");
		    Matcher matcher = pattern.matcher(value);
		    boolean match = matcher.matches();
		    if(match){
		    System.out.println(matcher.group());
		    }*/
			/*String value="SERVICE_TYPE,PLAN_ID,SUBSCRIPTION_ID";
			
			if (("").equals(value) || value.matches("^[a-zA-Z][a-zA-Z,_]+")){
				
				System.out.println("True");
			}*/
			/*System.out.println(value);
			if (value.matches("^[0-9,]*$")){
				 System.out.println("True");
			 }*/
			// trxnStatus = (trxnStatus == null) ? GenericConstants.SAP_OCS_TRXN_TYPE_DEBIT : trxnStatus;
		/*	String trxnType = "Mohit";
			if("Y".equals("")){
				System.out.println("Mohit is legend");
			}
			else{
				System.out.println("Mohit is genius");
			}
			String trxnStatus = "";
			
			trxnStatus = (isNullString(trxnStatus)) ? trxnType : trxnStatus;
			System.out.println(trxnStatus);
			
			float f= 4.5f;
			System.out.println("The Number is =" +(double)f);
			//^[a-zA-Z/][a-zA-Z_/]+
			System.out.println("Number is" + Math.floor(f));
			System.out.println("Number is" + Math.ceil(f));*/
			A3 avc = new A3();
			//avc.setDeactMode(GenericConstants.REQ_DEACT_MODE.S);
			double db = 17300;
			float flt = 0.0f;
			Float Fl = null;
			Fl = (float)db;
			double f= 4.4098764545f;
			System.out.println("Number is" + Math.floor(f));
			System.out.println("Number is" + Math.ceil(f));
			 System.out.println("Value received for particular price is: "+Fl);
			
			if(GenericConstants.REQ_DEACT_MODE.F.toString().equals(avc.getDeactMode())){
				System.out.println("The deact mode is not set to null");
			}else{
				System.out.println("The deact mode is set to null");
			}
			
		   //System.out.println("The value of ReqActMode = "+avc.getDeactMode().toString());
			System.out.println(GenericConstants.REQ_DEACT_MODE.S.toString());
			String num="1011#F|1021#S|1028#S";
			/*if (num.matches("^[a-zA-Z/][a-zA-Z_/]+")){
				 System.out.println("True");
			 }*/
			String[] a= num.split("\\|", -1);
			Set<String> myset = new HashSet<String>();
			Collections.addAll(myset, a);
			System.out.println("HashSet elements are "+myset);
			boolean flag =myset.contains("1034");
			System.out.println("Element needs to be checked in the hashSet "+flag);
			/*String[] c = null;
			String b = null;
			HashMap <String, String>mapst = new HashMap<String, String>();
			for(int j =0; j<a.length; j++)
	        {
				b = a[j];
	        	System.out.println("Outervalue = "+b);
	        	c = b.split("\\#", -1);
	        	
	        	mapst.put(c[0] ,c[1]);
	        }
			
			if(mapst.containsKey("1211"))
				{
				System.out.println("True value found"+mapst.get("1011"));
				}
			else{
				System.out.println("False value found");
			    }
			*///double num1 = 1.49E2;
			/*String value = "1.49E2";
			double num1 = 1.49E2;
			String num = String.valueOf(num1);
			System.out.println(num);
			if (value.matches("^[0-9]\\d*(\\.\\d+)?$"))
			{
				System.out.println("Correct"+value);
			}
			else{
				System.out.println("Wrong"+value);
			}*/
			System.out.println(System.nanoTime());
			System.out.println(System.currentTimeMillis());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 //@SuppressWarnings("finally")
	public int myTest(){
		 try{
			 int[] myIntArray = {1,2,3};
			 System.out.println(myIntArray[5]);
			 
			 return 1;
		 }catch (Exception e) {
			if(e instanceof ArrayIndexOutOfBoundsException){
				System.out.println("AIO");
				return 3;
			}
		
		}finally{
			return 4;
		}
	
	 }
	}  