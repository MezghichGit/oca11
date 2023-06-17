package day5_chapitre4;

public class Animal {
	
	private int age; // attribut d'instance, private
	double poids; // attribut d'instance : package private
	protected double taille;
	public String espece;
	
	static int nbr;
	// Exemples de surcharge (overlaod) de construcueur
	public static void display()
	{
		Animal a = new Animal();
		a.info();
		//info();
	}
	public void info() //méthode d'instance
	{
		//display();
		System.out.println(nbr);
	}
	public Animal() // constructeur par défaut
	{
		this(10,1.5); //appel au constructeur avec 2 paramèters
		System.out.println("constructeur par défaut");
	}  
	
	public Animal(int age) // constructeur avec 1 seul paramètre
	{
		this(); //appel au constructeur par défaut
		System.out.println("constructeur avec 1 seul paramètre");
	}
	
	public Animal(int age, double poids) // constructeur avec 2 paramètres
	{
		//this();
		System.out.println("constructeur avec 2 paramètres");
		this.age = age;
		this.poids = poids;
	}
	
	public static void somme(String x, int ... v)
	{
		System.out.println(v.length);
	}
	
	public static synchronized final double getPoids(double v) throws ArithmeticException, IllegalArgumentException
	{
		return 2.5;
	}

	public static void main(String[] args) {
		somme("ch");
		somme("ch",10,52);
		somme("ch",10,52,2,6);

	}

}
