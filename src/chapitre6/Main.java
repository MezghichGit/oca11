package chapitre6;

public class Main {
	
	public int somme(int x) throws Exception
	{
		if(x<0)
			throw new Exception("Nombre négatif");
		
		return 2;
	}

	public static void main(String[] args) throws Exception {
		int x = 10;
		int y = 0;
		try {
				System.out.println(x/y);
		}
		catch(Exception ex)
		{
			System.out.println("Oups un problème : "+ex.getMessage());
			System.out.println("=======");
			ex.printStackTrace(); // plus de détails sur le beug
			//return;  // sortie immediate de la fonction
			throw new Exception("Problème");
		}
		finally { // il force l'exécution des instructions dans ce bloc
			System.out.println("Suite du programme...");
		}

	}

}
