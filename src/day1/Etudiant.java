package day1;

import java.util.ArrayList;
 class Toto{}
 public class Etudiant {
	
	//les attributs d'instance
	String nom;
	int age;
	
	//les attributs de classe, attribut shareable
	
	static int total;
	
	//Des constructeurs
	public Etudiant()
	{
		System.out.println("Constructeur par defaut");
	}
	
	public Etudiant(String nom, int age)
	{
		this.nom = nom;
		this.age = age;
		System.out.println("Constructeur par defaut");
	}
	
	// Des méthodes d'instance
	
	public void display()
	{
		System.out.println(this.nom +" : "+this.age);
	}
	
	//Des méthodes de classe
	
	public static void getNbEtudiant()
	{
		System.out.println(total);
	}
	
	{
		this.age = 10;
		System.out.println("Bloc d'initialisation d'instance");
	}
	
	static {

		System.out.println("Bloc d'initialisation de classe");
	}

}
