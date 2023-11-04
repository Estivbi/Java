package EjerciciosUd1Entregar;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Multiplosde2y3While {
	/**
	 * Utilizando la instrucción while, realiza un programa que muestre los números
	 * que sean múltiplosde 2 y múltiplos de 3 a la vez, entre el 1 y el 100, y
	 * cuente cuántos son.
	 * 
	 */

	public static void main(String[] args) {
		int num = 6; // 6 es el primer minimo comun multiplo de 2 y 3.
		int contador = 0;

		while (num <= 100) {
			System.out.println("Múltiplo de 2 y de 3: " + num);
			contador++;
			num += 6;
		}

		System.out.println("Total de números que son múltiplos de 2 y 3 a la vez: " + contador);
	}

}
