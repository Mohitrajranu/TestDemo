package test;

public class GlobalAccess {
int x =10;
int y =5;
int z;
	private int sum(){
		z = x +y;
		++x;
		return z;
		
	}
	private int result(){
		return x++;
		
	}
	
	public static void main(String[] args) {
		try{
			Reqvo req = new Reqvo();
			req.setVar("");
			String ranu="";
			if(("").equalsIgnoreCase(req.getVar())){
				System.out.println("hello");
			}
		String a ="Mohit";
		String c = a+"|"+"Raj";
		System.out.println(c);
		String moh="JD423_LS";
		String ran=moh.replaceAll("_LS", "");
		System.out.println(ran);
		//System.out.println(ran[1]);
			
		GlobalAccess gbac = new GlobalAccess();
		String s="";
		int mn=Integer.parseInt(s);
		System.out.println(mn);
		int p =gbac.sum();
		System.out.println(~p);
		int q =gbac.result();
		System.out.println(q++);
		System.out.println(gbac.result());
		}
		catch (Exception e) {
			if(e instanceof NumberFormatException){
				System.out.println("AIO");
			}
	}
}}

