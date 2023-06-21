package chapitre6;

public class Demo {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			System.out.println(x / y);
		} 
		catch(ArithmeticException ex) // une exception spécifique
		{
			System.out.println("Oups un problème : " + ex.getMessage());
		}
		catch (Exception ex) { // une exception générale
			System.out.println("Oups un problème ");

		} finally { // il force l'exécution des instructions dans ce bloc
			System.out.println("Suite du programme...");
		}

	}

}
