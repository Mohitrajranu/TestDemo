package test;


public class Checkwhile {
	private String test = null;
	public static void main(String[] args) {
		Checkwhile chck = new Checkwhile();
		StringBuffer output1 = chck._outputcheck();
		System.out.println(output1.toString());
		output1.append("test");
		System.out.println(output1.toString());
		}
public String getdescription(){
	return this.test;
	
}

public void getresult(){
	test ="Mohit Raj";
	
	
}
private StringBuffer _outputcheck(){
	StringBuffer output =null;
	try {
		output = new StringBuffer(110);
		output.append("Some text");
		int count =4;
		
		for (int i = 0; i < count; i++) {
		  output.append(i);
		}
		System.out.println(output.toString());
		output.setLength(0);
		for (int i = 0; i < count; i++) {
			  output.append(i);
			}
			System.out.println(output.toString());
			output.setLength(0);
			
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		output.setLength(0);
	}
	finally{
		output.setLength(0);
	}
	return output;
	
	
}
}
