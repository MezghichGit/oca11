package day6.lesinterfaces;

public class ImprimanteLaser implements Imprimante{

	@Override
	public void imprimer() {
		this.getInfo();  // c'est une méthode concréte qu'on hérite de l'interface
		System.out.println("Une impression avec Laser");
		
	}

	@Override
	public void allumer() {
		System.out.println("cliquer sur le bouton demarrer");
		
	}

}
