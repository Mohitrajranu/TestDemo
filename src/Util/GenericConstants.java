package Util;

public class GenericConstants {
	
	   public enum REQ_DEACT_MODE{F, S};
	   public enum SUBSCRIBER_TYPE {
       PREPAID(1, "Prepaid Number"), POSTPAID(2, "Postpaid Number"), HYBRID(3, "Hybrid"), UNKNOWN(-1, "Unknown Number");
       private  int value;
     	private String description;
     	   
     	private SUBSCRIBER_TYPE(int value, String description){
     		this.value = value;
     		this.description = description;
     	}
     	
     	public String getDescription() {
             return description;
         }

         public int getValue() {
             return value;
         }
     }

}
