package bean;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateFormatter {

	public static Calendar toCalendar(String isoDate){
		Calendar cal = GregorianCalendar.getInstance();
		try{
			Date dt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(isoDate);
			cal.setTime(dt);
		}
		catch(Exception e){
		}
		return cal;
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date javaUtilDate= new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String Date = formatter.format(javaUtilDate);
		Calendar cal = toCalendar(Date);
		System.out.println(cal);
		//cal.setTime(javaUtilDate);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(Date);
            GregorianCalendar ts = xmlCalendar.toGregorianCalendar();
         /*  Date convertedDate = ;
            System.out.println("Date is:"+ts.toString());
         */   
        } catch (DatatypeConfigurationException ex) {
        
        }



       	/*Calendar cal = Calendar.getInstance();
		
		
		Date javaUtilDate= new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String Date = formatter.format(javaUtilDate);
		

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
		Date result;
	//	result = df.parse(Date);
		//cal.setTime(result);
		try {
		    result = df.parse(Date);
		    System.out.println("date:"+result); //prints date in current locale
		    cal.setTime(result);
		}
		catch(Exception e){
			
		}
*/		
		
	}

}
