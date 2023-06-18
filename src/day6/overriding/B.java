package day6.overriding;

public class B extends A{
	@Override
	public  void info() {
		super.info();
		System.out.println("Info de B");
	}
}
