package day6.polymorphisme;

public class Main {
    //Polymorphisme d'héritage
	public static void main(String[] args) {
		Oiseau o = new Oiseau();
		Animal a = new Animal();
		
		//a = o; // UpCasting ==> OK
		//o = a;  // DownCasting KO ==> Erreur de compilation
		
		a = new Oiseau();  // upCasting
		o = (Oiseau) a;  // Cas Downcasting + Cast explicite ==> Exception : ClassCastException
		
		//o = (Oiseau) a;// Cas Downcasting + Cast explicite  + UpCating avant ==> OK
				

	}

}
