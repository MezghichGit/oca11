package day4_10062023;

public class Etudiant extends Object{
	int cin;
	String nom;
	
	public Etudiant(int cin, String nom) {
		this.cin = cin;
		this.nom = nom;
	}
	
	
	// Overriding ou redefinition (rédéfinition d'un comportement se trouvant dans la classe mère)
	@Override
	public String toString() {
        return "Etudiant : "+ this.nom +" "+this.cin;
    }

	@Override
	 public boolean equals(Object obj) {
	       Etudiant temp = (Etudiant)obj;
	       return ( (this.cin == temp.cin) && (this.nom.equals(temp.nom)));
	}

}
