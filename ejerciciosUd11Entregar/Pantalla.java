package ejerciciosUd11Entregar;

/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class Pantalla {
	private double pulgadas;
	private String resolucion;

	public Pantalla(double pulgadas, String resolucion) { // Constructor
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}

	/**
	 * @return the pulgadas
	 */
	public double getPulgadas() {
		return pulgadas;
	}

	/**
	 * @param pulgadas the pulgadas to set
	 */
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	/**
	 * @return the resolucion
	 */
	public String getResolucion() {
		return resolucion;
	}

	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override			//Método toString para imprimir la información
	public String toString() {
		return "Pantalla [pulgadas=" + pulgadas + ", resolucion=" + resolucion + "]";
	}

}
