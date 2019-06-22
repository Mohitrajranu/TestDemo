package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;


class JsonDecodeDemo {
	 public static boolean isNullString (String text)
     {
             if (text != null )
             {
			if( "null".equalsIgnoreCase(text)){
			  return true;
			}

                     if (text.trim().length()==0) return true;
                     return false;
             }
             else
             {
                return true;
             }
     }//end of isNullString
   public static void main(String[] args){
	
      JSONParser parser = new JSONParser();
      //[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]
      Calendar currDate = Calendar.getInstance();
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
      
      String date = formatter.format(currDate.getTime());
     // String s ="[]";
     //String s = "[{\"tax_id\":\"\n\nSEDef1001\", \"tax_amount\":\"null\"}]";
      String s = "[{\"tax_id\":\"\n\nSEDef1001\", \"tax_amount\":0.0}]";
	  String taxId = null;
      try{
         Object obj = parser.parse(s);
         JSONArray array = (JSONArray)obj;
		 
		 if(array.isEmpty()){
			 System.out.println("Array is empty");
			 System.exit(0);
		 }
		 JSONObject obj2 = (JSONObject)array.get(0);
		 if(!isNullString((String)obj2.get("tax_id"))){
			 taxId = obj2.get("tax_id").toString().replaceAll("\n|\r", " ");
             }else{
            	 taxId = (String)obj2.get("tax_id");
             }
		
         System.out.println("Field \"1\"");
         System.out.println(taxId);  
         obj2.put("start_date", date);
         System.out.println(array);
        System.out.println(" Tax_Amount is :"+String.valueOf(obj2.get("tax_amount"))); 
         /*
         Set<String> set1 = new HashSet<String>(FileUtils.readLines(file1));

         Set<String> set2 = new HashSet<String>(FileUtils.readLines(file2));
         grep -xvFf file2 file1 > file3
         awk 'FNR==NR{a[$0];next};!($0 in a)' file1 file2 > file3
         
         Explanation:

FNR == NR: This test is true when the number of records is equal to the number of records in the file.
This is only true for the first file, for the second file NR will be equal to the number of lines of file1 + FNR.
a[$1]: Create an array element index of the first field of file1.
next: skip to the next record so no more processing is done on file1.
!($1 in a): See if the first field ($1) is present in the array, ie in file1, and print the whole line (to file3).

         Set<String> similars = new HashSet<String>(set1);

         similars.retainAll(set2);

         set1.removeAll(similars); //now set1 contains distinct lines in file1
         set2.removeAll(similars); //now set2 contains distinct lines in file2
         System.out.println(set1); //prints distinct lines in file1;
         System.out.println(set2); //prints distinct lines in file2
*/             }
      
      catch(ParseException pe){
		
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
   }
  
  }
