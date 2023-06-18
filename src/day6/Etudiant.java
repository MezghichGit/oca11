package day6;

public class Etudiant extends Personne {
	
	public Etudiant()
	{
		super("Amine"); // un appel au constructeur par défaut de la classe mère
		//this("ab");
		System.out.println("Constructeur Etudiant sans paramètre");
	}
	
	
	public Etudiant(String nom)
	{
		super("Amine"); // un appel au constructeur par défaut de la classe mère
		System.out.println("Constructeur Etudiant avec 1 paramètre");
	}
	
	String nom = "Etudiant";

	public void info() {
		
		System.out.println(this.nom+" "+super.nom);
		
		
		System.out.println(this.getNom() +" "+super.getNom());

	}
	
	public String getNom()
	{
		return this.nom;
	}
}
