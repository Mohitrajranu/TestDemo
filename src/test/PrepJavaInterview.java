package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class PrepJavaInterview {

	public static BigDecimal round(float d,int decimalPlace){
		BigDecimal bd = new BigDecimal(Float.toString(d));
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd;
	}
	public static Double roundTwoDecimals(Double d){
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}
	public static void main(String[] args) {
		String filePath="/home/ubuntu/pyscript/ESSAR_FILES/InputFile/2201201908/Price Correction Steel Customer.xls";
		int index = filePath.lastIndexOf('/');
        String fileName = filePath.substring(index + 1);
        System.out.println("File Name is "+fileName);
       // String multiFiles = "E://ExcelData/InputFile/2301201901/Price Correction for  Silver Copper- 2100182639-HR.xls, E://ExcelData/InputFile/2301201901/Price Correction for Silver Copper- 2100181953.xls";
        String multiFiles = "E://ExcelData/InputFile/2301201901/Price Correction for  Silver Copper- 2100182639-HR.xls,";     
        if (multiFiles.length() > 1) {
        	multiFiles = multiFiles.substring(0, multiFiles.length() - 1);
			System.out.println("Files being sent in the attachment are "+multiFiles);
		}
        String []arr = multiFiles.split("\\,");
        for(String file:arr){
        	System.out.println("File being sent is "+file);
        }
        Date dth = new Date(System.currentTimeMillis() - 3600 * 1000);
        System.out.println( new SimpleDateFormat("HH:mm").format(dth) );
        System.out.println( new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime()) );

        String []attfiles ={"Mohit,Ranu"};
        System.out.println("Files attached in the array are "+Arrays.toString(attfiles));
        // 
		/*float pf = 2.445585454f;
		Double db = 45.25585242465;
		Double ant= roundTwoDecimals(db);
		BigDecimal res;
		res = round(pf,2);
		float x = res.floatValue();
		System.out.println(x);
		System.out.println(ant);*/
		/*
		Reqvo reqvo = new Reqvo();
		reqvo.setCircle("MU");
		List<Reqvo> user = null;
		int count = 3;
		try {
			user = new ArrayList<Reqvo>(10);
			if(user != null && user.size() > 0){
				System.out.println("list is not null");
			}
			else {
				System.out.println("list is null");
			}
			while(count > 0){
				count--;
				if(count > 0){
				break;
				}
				System.out.println("Exit out of while loop");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		String modDate = "1512201711";
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat(
                "ddMMyyyyHH");
        String stringDate = dateFormat.format(date);
        System.out.println(stringDate);
        int dt = Integer.parseInt(stringDate);
        int dt1 = Integer.parseInt(modDate);
        int resDate = dt - dt1;
        if(resDate > 0){
        	
        }
	
*/}}
