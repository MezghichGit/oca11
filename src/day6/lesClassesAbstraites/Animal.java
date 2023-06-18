package day6.lesClassesAbstraites;

public abstract class Animal {
	String espece;
	int age;
	
	public void info() {
		System.out.println(this.espece+" "+this.age);
	}
	public abstract void seDeplacer();
	
}
