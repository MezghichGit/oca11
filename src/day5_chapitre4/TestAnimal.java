package day5_chapitre4;

public class TestAnimal {

	public static void main(String[] args) {
		//Animal a = new Animal();// un appel au constructeur par défaut
		
		Animal a1 = new Animal(10); // un appel au constructeur avec 1 seul paramètre
		a1.espece = "animal";
		a1.poids = 1.5;
		a1.taille = 2.5;
	}

}
