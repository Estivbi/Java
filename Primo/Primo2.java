package ejerciciosUd9Entregar;

/**
 * 
 * @author Carolina Rodríguez DAM online
 * @version 1
 */
public class Primo2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Primo x = new Primo(1);

		// Si es primo lo imprime por pantalla
		if (x.esPrimo())
			System.out.println("ES PRIMO " + x.getValue());

		x.setValue(5);
		if (x.esPrimo())
			System.out.println("ES PRIMO " + x.getValue());
		x.setValue(8);
		if (x.esPrimo())
			System.out.println("ES PRIMO " + x.getValue());
		x.setValue(11);
		if (x.esPrimo())
			System.out.println("ES PRIMO " + x.getValue());

	}

}
