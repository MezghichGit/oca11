package day6;

public class Personne {
	
	String nom = "Personne";
	
	public String getNom()
	{
		return this.nom;
	}
	
   public Personne(String nom)
   {
	  System.out.println("Constructeur Personne avec 1 param"); 
   }
   public Personne()
   {
	  System.out.println("Constructeur Personne sans param");  
   }
}
