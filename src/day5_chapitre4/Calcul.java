package day5_chapitre4;

public class Calcul {
	
	// Exemples de surcharge (overlaod) de méthodes
	/*
	public static void operation(byte x, byte y)
	{
		System.out.println("byte x, byte y");
	}
	public static void operation(short x, short y)
	{
		System.out.println("short x, short y");
	}*/
	
	public static void operation(int x, int y)
	{
		System.out.println("int x, int y");
	}
	public static void operation(float x, float y)
	{
		System.out.println("float x, float y");
	}
	public static void operation(double x, double y)
	{
		System.out.println("double x, double y");
	}
	public static void operation(Integer x, Integer y)
	{
		System.out.println("Integer x, Integer y");
	}
	public static void operation(int ...tab)
	{
		System.out.println("int ...tab");
	}
	public static void main(String[] args) {
		operation(10,20); // deux entiers(valeurs litérales)
	}
}
