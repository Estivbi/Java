package ejerciciosUd9Entregar;

/**
 * 
 * @author Carolina Rodr�guez DAM online
 * @version 1
 */

public class Primo {
	// Atributo para almacenar el numero a saber si es primo o no.
	private int num;

	/**
	 * Constructor de la clase Primo.
	 * 
	 * @param num Valor inicial para el atributo num.
	 */
	public Primo(int num) {
		this.num = num;
	}

	/**
	 * Setter para cambiar el valor del n�mero.
	 * 
	 * @param num Nuevo valor para el atributo num.
	 */
	public void setValue(int num) {
		this.num = num;
	}

	/**
	 * Getter para consultar el valor del n�mero.
	 * 
	 * @return Valor actual del atributo num.
	 */

	public int getValue() {
		return this.num;
	}

	/**
	 * M�todo para consultar si el n�mero es primo o no.
	 * 
	 * @return True si el n�mero es primo, False en caso contrario.
	 */
	public boolean esPrimo() {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;
		return true;
	}

}