package test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CheckPhone {
  
  @Test
  public void testSimpleTrue() {
//	  Pattern p = Pattern.compile("bankIfsc[\\S]*today+.txt");
//	  Matcher m = p.matcher("bankIfscsfdfoday.txt");
	  
	  Pattern p = Pattern.compile("YESB0VSB[\\S]*06042015+.txt");
	  Matcher m = p.matcher("YSB0VSBN1504061722431606042015.txt");
	  
	  if(m.find()){
		  System.out.println("true");
	  }
  }
  
//  @Test
  public void testList() {
	 ArrayList<String> al = new ArrayList<String>();
	 al.add("a");
	 al.add("b");
	 al.add("c");
	 al.add("d");
	 al.add("e");
	 al.add("f");
	 System.out.println("1st"+al.get(1));
	 System.out.println("last"+al.get(5));
	 
  }
//  @Test
  public void testsubSTr() {
//	  WBSC0000001
//	  RBIN0RTGS00
//	  YESB
	  String hdr = "{A:CBSF01O298N06WBSC00000SCRBIP0NEFTSC222000YESBN150400100942EFT2015020911052000061290XXXXXXXXXYESBN1504001009499}{4:";
		String hr = hdr.substring(77,86);
		System.out.println(hr);
		
  }
//  @Test
  public void testStr() {
	 String s="abc";
	  String upToNCharacters = s.substring(0, Math.min(s.length(), 4));

	 System.out.println(">"+upToNCharacters+"<");
	 
  }
} 
