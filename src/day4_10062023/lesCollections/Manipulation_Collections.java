package day4_10062023.lesCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import day2.Animal;

public class Manipulation_Collections {

	public static void main(String[] args) {
		/*List<String> list;
		List<Animal>list2;
		List<Integer> list3;
		
		ArrayList<String> la;*/
		List<String> names2 = new LinkedList<>();
				
				
		List<String> names = new ArrayList<>();
		//Set<String> names = new HashSet<>();
		System.out.println(names);
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		System.out.println(names.add("amine"));
		System.out.println(names.add("sami"));
		System.out.println(names.add("amine"));
		System.out.println("######");
		System.out.println(names);
		System.out.println(names.remove("amine2"));
		System.out.println(names);
		
		/*System.out.println(names.isEmpty());
		System.out.println(names.size());
		System.out.println(names.contains("samii"));*/
		
		List<String> cours = new ArrayList<>();
		cours = new LinkedList<>();
		ArrayList<String> cours2 = new ArrayList<>();
		//cours2 = new LinkedList<>();
		cours.add("oca");
		cours.add("12");
		cours.add("true");
		for(Object obj : cours)
		{
			System.out.println((String) obj);
		}
		
	}

}
