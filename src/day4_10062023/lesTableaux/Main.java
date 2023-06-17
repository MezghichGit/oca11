package day4_10062023.lesTableaux;

import java.util.Arrays;

public class Main {

	public static void main(String args []) {
		/*
		int [] tab = new int[3];
		tab[0] = 1;
		tab[1] = 10;
		tab[2] = 100;
		//int []tab = {10,2,4};
		//int tab2[] = {10,2,4};
		
		System.out.println(tab.length);
		
		for(int e : tab)
		{
			System.out.println(e);
		}*/
		
		/*String[] names = {"amine","sami","alaa"};
		for(String name : names)
		{
			System.out.print(name+" \t");
		}*/
		/*
		int []tab = {10,2,4};
		
		for(int e : tab)
		{
			System.out.print(e+" \t");
		}
		Arrays.sort(tab); //un tri par odre croissant
		
		System.out.println();
		for(int e : tab)
		{
			System.out.print(e+" \t");
		}*/
		/*
		int tab[] = {14,10,3,8,6};
		Arrays.sort(tab);
		for(int e : tab)
		{
			System.out.print(e+" \t");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(tab, 14));*/
		/*
		int[][]tab = {{1,4,6},{10,20,14,56},{1,8}};
		//System.out.println(tab[1][2]);
		
		for(int t[] : tab)
		{
			for(int e : t)
			{
				System.out.print(e+"\t");
			}
			System.out.println();
		}*/
		
		Etudiant etudiants [] = new Etudiant[3];
		etudiants[0] = new Etudiant("amine",22);
		etudiants[1] = new Etudiant("sami",24);
		etudiants[2] = new Etudiant("nada",25);
		
		System.out.println(etudiants);
		
		for(Etudiant etudiant : etudiants)
		{
			//System.out.print(etudiant.toString()+" \t");
			System.out.print(etudiant.toString()+" \t");
		}
		
	}
}
