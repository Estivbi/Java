package ejerciciosUd11Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class Raton {
	private int numBotones;
	private double peso;
	
	public Raton(int numBotones, double peso) {  //Constructor
		this.numBotones = numBotones;
		this.peso = peso;
	}
	

	/**
	 * @return the numBotones
	 */
	public int getNumBotones() {
		return numBotones;
	}


	/**
	 * @param numBotones the numBotones to set
	 */
	public void setNumBotones(int numBotones) {
		this.numBotones = numBotones;
	}


	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}


	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override				//Método toString para imprimir la información
	public String toString() {
		return "Raton [numBotones=" + numBotones + ", peso=" + peso + "]";
	}
	
}
