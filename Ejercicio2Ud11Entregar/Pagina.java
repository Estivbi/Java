package Ejercicio2Ud11Entregar;

/**
 * 
 * @author Carolina Rodr�guez DAM online
 *
 */

public class Pagina {
	private String texto;

	public Pagina(String texto) { //Constructor
		this.texto = texto;
	}

	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override			 //Devuelve la informaci�n contenida en texto
	public String toString() {
		return texto;
	}

}
