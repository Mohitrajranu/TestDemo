package test;

import org.json.simple.JSONObject;

public class JsonIter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		JSONObject json = new JSONObject(); 
       for(int i=0;i<1;i++)
       {
		json.put("amount", 1.E49); 
       }
     //  Double price = (Double) json.get("amount");
      // String value = price.toString();
      String pp_Price = (String)json.get("amount");
       System.out.println(pp_Price);
	}

}
