package day1;

public class LesTypesJava {

	public static void main(String[] args) {
		//System.out.println(Byte.MAX_VALUE);
		//System.out.println(Byte.MIN_VALUE);
		
		//System.out.println(Short.MAX_VALUE);
		//System.out.println(Short.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		   //9223372036854775807
		         //2147483647
		long x =  92233720368547L; //problème d'évaluation des litérals
		float k = 12.5F;  //problème d'affactation
		
		int v = 10_000_000;
		int s = 0X3EF;  // base hexa
		int s1 = 014;  // base octale
		int s2 = 0b11;  // base binaire
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		String ch = "formation";
		ch.length();
		int $x = 10;
		int _x = 10;

	}

}
