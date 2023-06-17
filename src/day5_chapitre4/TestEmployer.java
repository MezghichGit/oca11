package day5_chapitre4;

public class TestEmployer {

	public static void main(String[] args) {
		
		Employer emp = new Employer();
		//emp.age = -10;
		
		try {
			emp.setSalaire(2000);
			emp.setAge(21);
			emp.setNom("Amine");

		} catch (IllegalArgumentException ex) {
			System.out.println("Problème : " + ex.getMessage());
		}
		//System.out.println(emp.toString());
		
		System.out.println(emp.getAge());
	
	}

}
