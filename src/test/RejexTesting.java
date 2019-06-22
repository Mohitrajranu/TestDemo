package test;

public class RejexTesting {

	public static void main(String[] args) {

		String rgx = "Mohit Raj╔ singh , is ..cool û";
		//o.replaceAll("[╔,û]", "")
		System.out.println(rgx.replaceAll("[\\s.╔,û#]", ""));
		
	}

}
