package day4_10062023;

public class Animal {
	
	int id;

	public Animal(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj)
	{
		Animal temp = (Animal)obj;
		return this.id == temp.id;
	}
}
