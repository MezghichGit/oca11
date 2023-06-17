package day4_10062023.lesTableaux;

public class Etudiant {
	int age;
	String nom;
	
	@Override
	public String toString() {
		return "Etudiant [age=" + age + ", nom=" + nom + "]";
	}
	public Etudiant(String nom,int age) {
		this.age = age;
		this.nom = nom;
	}
	

}
