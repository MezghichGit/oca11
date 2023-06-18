package day6.lesClassesAbstraites;

public class Main {
	
	public static void infoAnimal(Animal a) // la méthode présente le polymorphisme générique
	{}

	public static void main(String[] args) {
		infoAnimal(new Oiseau()); // upcasting
		
		infoAnimal(new Poisson()); // upcasting
		
		Animal animals[] = new Animal[4];  //animals : type polymophe, polymorphisme générique
		animals[0] = new Poisson();
		animals[1] = new Oiseau();
		animals[2] = new Chien();
		animals[3] = new Serpent();
		
		for (Animal animal : animals) {
			animal.seDeplacer();
		}

	}

}
