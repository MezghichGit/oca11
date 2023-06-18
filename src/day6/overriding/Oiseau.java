package day6.overriding;

import java.io.IOException;

public class Oiseau extends Animal{

	@Override
	public Oiseau info() throws IOException{
		return new Oiseau();
	}
}
