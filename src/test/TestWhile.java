package test;

public class TestWhile {

	public static void main(String[] args) {
		int i =4;
		while(true)
		{
			try {
				if(i==0){
					System.out.println(i);
					break;
				}
				else{
					System.out.println(i);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			finally{
				System.out.println("I am Genius");
			}
			i--;
		}
		System.out.println("I am Legend");
	}
	
	
}
