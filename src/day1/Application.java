package day1;

import java.util.Date;
/*
import day2.A;
import day2.B;*/
import day2.*;
import day2.Cours;
import day2.day22.H;
//import day3.Calcul;
import static day3.Calcul.*; //un import static
//import static day3.Calcul.pi;
//import static day3.Calcul.getVal;
//import day3.*;
import day2.B;

public class Application {

	public static void main(String[] args) {
		Integer x2 = 10;
		x2 = null;
		int x=52;  // variable locale
		System.out.println(Etudiant.total);
		Etudiant e = new Etudiant();
		System.out.println(e.nom);
		System.out.println(x);
		
		System.out.println(pi);
		getVal();
		/*
		A a = new A();
		day2.B b = new day2.B();
		day3.B b2 = new day3.B();
		H h = new H();
		C c2 = new C();
		Cours c = new Cours();
		Date d = new Date();
		Etudiant e1 = new Etudiant();
		System.out.println("*******");
		Etudiant e2 = new Etudiant(); 
		
		double res = Operation.produit(20);*/
		
		//System.out.println(Etudiant.total);
		
		//Etudiant e1 = new Etudiant(); //constructeur par défaut implicite/explicite
		/*
		e1.display();
		
		//Etudiant e2 = new Etudiant();
		Etudiant e3 = new Etudiant("amine",25); // constructeur avec 2 paramètres
		e3.display();
		
		Etudiant.getNbEtudiant(); // methode de classe(static)
		*/
		/*
		e1.nom = "amine";
		Etudiant.total = 1;
		
		System.out.println(e1.nom);
		System.out.println(e2.nom);
		System.out.println(Etudiant.total);
		System.out.println(e1.total);
		e1.total = 2;
		System.out.println(e2.total);*/

	}

}
