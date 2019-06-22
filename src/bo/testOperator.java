package bo;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class testOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calendar cal = Calendar.getInstance();
		boolean flag = false;
		cal.setTime(new Date());
		
		sdf = new SimpleDateFormat("ddMMyyyy");
		currentDate = new Date();
		
		System.out.println("The flag set is= "+(!flag));
		cal.add(Calendar.DATE, 1);
		System.out.println("Current Date is ="+cal.getTime().getDate());
		java.sql.Timestamp tmp = (Timestamp) cal.getTime();
		cal.add(Calendar.DATE, -1);
		System.out.println("Subtracted date is ="+cal.getTime().getDate());
		
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = true;
		if(!(flag1) && flag2 && (!flag3) && !flag4 && flag5){
			System.out.println("Flag checking logic is right");
		}else{

			System.out.println("Flag checking logic is not right");
			
		}
*/		
		String str= "name"+2;
		System.out.println(str.charAt(2));
		String pq=str.substring(1, 2);
		System.out.println(pq);

		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);
	}

}
