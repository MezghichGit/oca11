package day6.lesinterfaces;

public interface Scanner {
	
	public void scan();
	public default void getInfo()
	{
		System.out.println("Je suis une imprimante");
	}

}
