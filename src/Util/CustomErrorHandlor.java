package Util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CustomErrorHandlor {
	public static String exceptionStacktraceToString(Exception e)
	{
		String returnStr="";
		 ByteArrayOutputStream baos = null;
		try{
		    baos = new ByteArrayOutputStream();
		    PrintStream ps = new PrintStream(baos);
		    e.printStackTrace(ps);
		    ps.close();
		    returnStr = baos.toString();
	    }catch (Exception ie) {
			ie.printStackTrace();
		}finally{
			if(baos!=null){
				try {
					baos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				baos=null;
			}
		}
		return returnStr;
	}
}
