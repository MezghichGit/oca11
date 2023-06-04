package day2;

public class Application {

	public static void main(String[] args) {
		//String formation=null;
		//System.out.println(formation.length());
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a1 = a2;
		a3 = null;
		System.gc(); // Un appel au garbage collector : We suggest but java is free to ignore the request
		for(int i = 0; i<1000; i++)
		{
			System.out.println("i = "+i);
		}
		System.out.println("Fin du programme");
	}

}
