package day6.lesinterfaces;

public abstract interface Imprimante {
	
	public static final int dureeVie = 100;
	// int dureeVie=100;
	
	//avant java 8
	 abstract void imprimer(); // par defaut c'est public
	
	public void allumer();
	
	// a partir de la version 8
	
	public default void getInfo()
	{
		System.out.println("Je suis une imprimante");
	}
	
	public static void getInfoStatic()
	{
		System.out.println("Je suis une imprimante avec static method");
	}

}
