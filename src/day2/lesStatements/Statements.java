package day2.lesStatements;

public class Statements {
	
	enum Saison{
		ETE, PRINTEMPS,HIVER, AUTOMNE
	}

	public static void main(String[] args) {
		// switch
		
		int x = 14;
		final int y = 10;
		//y = 12;
		switch(x)
		{
		case 1 : System.out.println("Un"); break;
		case y :  System.out.println("Dix");  break;
		case 100 :  System.out.println("Cent"); break;
		default : System.out.println("Autre valeur");
		}
		/*
		String jour = "abc";
		switch(jour)
		{
		case "lundi": case "mardi" :case "mercredi" : System.out.println("Travail"); break;
		case "jeudi": case "vendredi" : System.out.println("sport");break;
		case "samedi": case "dimanche" : System.out.println("repos");break;
		default : System.out.println("valeur invalide");
		}*/
		
		Saison temp = Saison.AUTOMNE;
		switch(temp)
		{
		case ETE: System.out.println("Vacances"); break;
		case PRINTEMPS: System.out.println("Travail");break;
		case AUTOMNE:  System.out.println("Etude");break;
		case HIVER: System.out.println("Travail");
		default :  System.out.println("Invalide value");
		}

	}

}
