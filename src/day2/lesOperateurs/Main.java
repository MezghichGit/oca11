package day2.lesOperateurs;

public class Main {

	public static void main(String[] args) {
		// Les opérateurs unaires
		
		//pré-increment, pré-decremnt
		/*
		int x = 10;
		int y = ++x; // on incrémente le x et puis on l'affecte à y
		
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		*/
		//post-increment, post-decremnt
		/*
		int x = 10;
		int y = x++; // on affecte x à y puis on incrémente x
		
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		*/
		/*
		boolean test = false;
		boolean res = !test;
		System.out.println("res = "+res);
		int x = 10;
		int y = -x;*/
		
		// L'opérateur ternaire
		/*
		int age = 20;
	    String poste = (age>30)?"Manager":"Developpeur";
	    
	    int beugs = 0;
	    int res = (beugs>3)?1:-1;
	    
	    System.out.println("res = "+res);
	    
	    System.out.println((beugs>3)?1:"pas de beugs");*/
		/*
		int x = 10; int y = 20;
		
		int res = (x>9)?(y>100)?1:-1:-10;
		System.out.println("res = "+res);*/
		/*
		int x = 10;
		int y = ++x;*/
		
		// 2) Les opérateurs logiques binaires
		/*
		int x = 10;
		int y = 20;
		
		boolean res = ((x<4) && (++y>10)); // AND via &&
		//boolean res = ((x<4) & (++y>10));// AND via &
		
		//boolean res = ((x>4) || (++y>10)); // OR via ||
		//boolean res = ((x>4) | (++y>10));// OR via |
		 
		System.out.println("res = "+res);
		System.out.println("y = "+y);
		System.out.println("x = "+x);*/
		
		// 3)Les opérateurs d'affectation et ceux d'affectation composés
		/*
		int x = 10;
		int y = 1;
		y += x;  // y = y + x;
		y *= x ; // y = y*x;*/
		
		// 4)Règles de promotion
		/*
		System.out.println(Byte.MAX_VALUE);
		byte x = 100;
		byte y = 2;
		char u ='a';
		char v = 'b';
		int w = u+v;
		int z = x*y;
		
		double h = x+y;
		System.out.println(h);*/
		/*
		double x = 39.21;
		float y = 2.1f;
		
		double z = x+y;*/
		/*byte x = 5;
		byte y = 10;
		double z = x+y;*/
		///long x = 10;
		//int y = 2 * (int)x;
		//long y = 2 * x;
		
		// 5) Les priorités en Java
		
		//int x = 2 * 5 + 3 * 4 - 8;  // 10 + 12 - 8 = 22 - 8 = 14
		int x = 2 * ((5 + 3) * 4 - 8); // 2 * (8*4-8) = 2 * (32-8) = 2 * 24 = 48
		System.out.println(x);

	}

}
