package day309062023;

import java.time.LocalDate;

public class ImmutableVSMutable {

	public static void main(String[] args) {
		// Cas d'objets immutable
		
		// Un objet immutable est un objet qu'on peut plus changer de valeur d'attributs une fois il est crée
		//Exemple de classes immutable : String, LocalDate,LocalTime, LocalDateTime
		// Un objet mutable c'est l'inverse(modifiable): StringBuilder
		
		String ch = "ocp";
		System.out.println(ch.concat("-spring"));
		System.out.println(ch);
		
		StringBuilder sb = new StringBuilder("ocp");
		sb.append("-spring");
		System.out.println(sb);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		ld.plusDays(2);
		ld =  ld.plusDays(2);
		System.out.println(ld.plusDays(2));
		System.out.println(ld);

	}

}
