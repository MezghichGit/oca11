package day1;

import day5_chapitre4.Animal;

public class Oiseau extends Animal{
	
	public void affichage()
	{
		Animal a = new Animal();
		a.espece ="Oiseau";
		System.out.println(this.espece+" "+this.taille);
	}

}
