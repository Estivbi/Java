package ejerciciosUd9Entregar;

/**
 * 
 * @author Carolina Rodríguez DAM online
 * @version 1
 */

public class CuentaCorriente {
	
	//Atributo
	String saldo;

	// Constructor sin parámetro que establece el saldo a "0".
	public CuentaCorriente() {
		this.saldo = "0";

	}

	/**
	 * Obtener el saldo actual de la cuenta.
	 * 
	 * @return El saldo actual de la cuenta bancaria como una cadena de caracteres.
	 */
	public String getSaldo() {
		return saldo;
	}

	/**
	 * Realiza una imposicion (ingreso) en la cuenta.
	 * 
	 * @param x La cantidad de dinero a imponer, como cadena de caracteres.
	 */
	public void imposicion(int x) {
		saldo = String.valueOf(Integer.parseInt(saldo) + x);
	}

	/**
	 * Realiza un reintegro (extraccion) de la cuenta.
	 * 
	 * @param x La cantidad de dinero a retirar, como una cadena de caracteres.
	 */
	public void reintegro(int x) {
		saldo = String.valueOf(Integer.parseInt(saldo) - x);
	}

}
