package day5_chapitre4;

public class PassageDeParametres {
	
	// 1) cas des types primitifs
	public static void permutation(int a, int b)
	{
		int aux = a;
		a = b;
		b = aux;
	}
    //2) cas des types références mutables : StringBuilder
	
	public static void modifySB(StringBuilder sb)
	{
		sb.append("-ocp");
	}
	//3) cas des types références immutables : String
	public static void modifyString(String st)
	{
		st.concat("-ocp");
		//st = st.concat("-ocp");
	}
	
	public static void main(String[] args) {
		/*
		int x = 10; int y = 20;
		permutation(x,y);
		System.out.println("x = "+x);
		System.out.println("y = "+y);*/
		//StringBuilder sb1 = new StringBuilder("oca");
		String s = new String("oca");
		//System.out.println("sb1 = "+sb1);
		System.out.println("s = "+s);
		//modifySB(sb1);
		modifyString(s);
		//System.out.println("sb1 = "+sb1);
		System.out.println("s = "+s);
	}

}
