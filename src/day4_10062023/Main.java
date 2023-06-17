package day4_10062023;

public class Main {

	public static void main(String[] args) {
		/*
		String c1 = "OCA";
		String c2 = new String("OCA");
		String c3 = "OCA";
		
		System.out.println("c1 == c2 : "+(c1 == c2));
		System.out.println("c1 == c3 : "+(c1 == c3));
		
		System.out.println("c1.equals(c2) : "+c1.equals(c2));
		System.out.println("c1.equals(c3) : "+c1.equals(c3));
		*/
		/*
		Animal a1 = new Animal(1);
		System.out.println(a1);
		Animal a2 = new Animal(1);
		System.out.println(a2);
		// par défaut la méthode equals
		System.out.println("a1 == a2 : "+(a1 == a2)); //false
		System.out.println("a1.equals(a2) : "+a1.equals(a2)); // true
		*/
		/*
		Etudiant e1 = new Etudiant(123,"Amine");
		Etudiant e2 = new Etudiant(123,"Amine");
		
		System.out.println(e1);
		System.out.println(e1.toString()); //par défaut(dans la classe Object)=>retourne le HashCode
		System.out.println(e2);
		System.out.println(e1.equals(e2)); //par défaut(dans la classe Object)=>retourne l'égalité au sens ==
	*/
		
		// La classe String est immutable, la classe StringBuilder est mutable(modifiable)
		/*
		String ch = "oca"; // immutable
		System.out.println(ch.concat("-ocp"));
		System.out.println(ch);
		
		System.out.println(ch.length());
		
		StringBuilder sb = new StringBuilder("oca");//mutable
		System.out.println(sb.append("-ocp"));
		System.out.println(sb);
		System.out.println(sb.length());*/
		/*
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length()); // nbre de caractères effectives = 0
		System.out.println(sb.capacity()); // capacité maximale initiale
		sb.append("ocaocp");
		System.out.println(sb.length()); //6
		System.out.println(sb.capacity()); //16
		sb.append("ocaocpocpococaocpocpocpocpocABC");
		System.out.println(sb.length()); //15
		System.out.println(sb.capacity());//16*/
		
		/*String ch = "ocp11";
		StringBuilder sb = new StringBuilder(ch);
		//StringBuilder sb = new StringBuilder(8);
		System.out.println(sb.length()); //0
		System.out.println(sb.capacity()); //8**/
		
		//Les méthodes de la classe String
		//String ch = "\t un Animal dans le ZOO \n";
		//System.out.println(ch.length());
		//System.out.println(ch.charAt(0));
		//System.out.println(ch.indexOf("animal"));
		//System.out.println(ch.toUpperCase());
		//System.out.println(ch.toLowerCase());
		//System.out.println(ch);
		//System.out.println(ch.trim());
		
		/*String ch = "ocaocp";
		System.out.println(ch.substring(2));
		System.out.println(ch.substring(2,4));
		
		String result = "AniMaL ".trim().toLowerCase().replace("an", "An");
		System.out.println(result); */
		StringBuilder sb = new StringBuilder("animals");//16 + 7 = 23
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
