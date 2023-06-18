package day6.overriding;

public interface Rodent {

	public Number chew() ;
	
	public default  void info() {}

}
