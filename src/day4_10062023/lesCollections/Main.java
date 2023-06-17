package day4_10062023.lesCollections;
import java.util.*;
public class Main {

	public static void disaply(List<String>list)
	{
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		List<String>li = new ArrayList<>();
		
		
		ArrayList<String> as = new ArrayList<>();
		LinkedList<String>ls = new LinkedList<>();
		li = ls;
		disaply(as);
		disaply(ls);
	/*	
		List list = new ArrayList();
		List<String> list2 = new ArrayList<String>(); //version 5 : 2005
		List<String> list3 = new ArrayList<>(); //version 7 : 2007*/
		
		//var list4 = new ArrayList<String>();

	}

}
