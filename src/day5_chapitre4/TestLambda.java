package day5_chapitre4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestLambda {

	public static void main(String[] args) {
		/*
		Prediction p1 =(String ch)->{return ch.contains("oc");}; // expression verbose
		
		System.out.println(p1.test("ocp"));
		
		Prediction p2= str->str.startsWith("oc"); //expression réduite
		
		System.out.println(p2.test("ocp"));
		
		Prediction p3=(String str)->{return str.endsWith("op");};*/
		
		Predicate<String> filter = (String ch)->{return ch.startsWith("c");};
		
		ArrayList<String> langages = new ArrayList<>();
		langages.add("java");
		langages.add("c++");
		langages.add("c");
		langages.add("python");
		System.out.println(langages);
		langages.removeIf(filter);
		System.out.println(langages);
		
		ICalcul som = (double x, double y)->{return x+y;}; // expression complete
		ICalcul prod = (x,y)->x*y;// expression réduite
		System.out.println(som.operation(10, 20));
		System.out.println(prod.operation(10, 20));

	}

}
