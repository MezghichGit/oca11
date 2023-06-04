package day2;

public class Animal {
	
	public void finalize() // c'est fonction qui s'execute lors de l'appel du garbage collector
	{
		System.out.println("Desctruction d'un objet Animal");
	}

}
