package day6.lesinterfaces;

public class Test {

	public static void main(String[] args) {
		
		Imprimante.getInfoStatic();// appel direct de la méthode static de l'interface
		MutliFonctions mult = new MutliFonctions();
		mult.scan();
		mult.tirage();
		mult.imprimer();
	}

}
