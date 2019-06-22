package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class DataHolder {
	  private final ArrayList<String> stringList = new ArrayList<String>();

	  public ArrayList<String> getStringList() {
	    return stringList;
	  }
	

	public static void main(String[] args) {
	  DataHolder data = new DataHolder();
	  List<String> nodata= new ArrayList<String>(10);
	  HashMap<String, String> map = new HashMap<String, String>();
	  HashMap<String, String> map1 = new HashMap<String, String>();
		map.put("1", "SS");
		map.put("2", "MI");
		map.put("3", "HH");
		map.put("4", "DD");
		map.put("5", "MM");
		map.put("6", "YY");
		String st = "4";
	    String value = map.get(st);
	    System.out.println(map1.containsKey("null"));
	    System.out.println("The value found is:-"+value);
	  data.getStringList().add("foo");
	  data.getStringList().add("mohit");
	  data.getStringList().add("raj");
	  System.out.println(data.getStringList());
	  System.out.println(nodata.size());
	  nodata.clear();
	}
	}