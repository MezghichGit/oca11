package chapitre6;

public class Application {

	
	public static void info1() throws Exception // Checked
	{
		//System.out.println("Hello World 1");
		throw new Exception("Danger"); // déclencher une exception
	}
	
	public static void info2() throws RuntimeException  // UnChecked
	{
		System.out.println("Hello World 2");
	}
	public static void main(String[] args) {
		try {
			info1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		info2();
		
		System.out.println("Hello World");

	}

}
