package lazy;

public class Singleton {

	//lazy Approach
	private static Singleton uniqueInstance;
/* 
 * Eager Approach
 * 
 * private static Singleton uniqueInstance=new Singleton;
 * private Singleton(){}
 * public static singleton getInstance()
 * {
 * return uniqueInstance;
 * }
 * */
	private Singleton()
	{

	}
	public static synchronized Singleton getInstance()
	{
		if(uniqueInstance==null)
		{
			uniqueInstance =new Singleton();
		}
		return uniqueInstance;
	}
	public String getDescription()
	{
		return "I'm a thread safe singleton !";
	}
}
