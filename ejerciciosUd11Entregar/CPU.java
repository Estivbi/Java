package ejerciciosUd11Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class CPU {
	
	private double frecuencia;
	private int nucleos;
	private String fabricante;
	
	public CPU(double frecuencia, int nucleos, String fabricante) { //Constructor
		this.frecuencia = frecuencia;
		this.nucleos = nucleos;
		this.fabricante = fabricante;
	}

	/**
	 * @return the frecuencia
	 */
	public double getFrecuencia() {
		return frecuencia;
	}

	/**
	 * @return the nucleos
	 */
	public int getNucleos() {
		return nucleos;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	@Override				//Método toString para imprimir la información
	public String toString() {
		return "CPU [frecuencia=" + frecuencia + ", nucleos=" + nucleos + ", fabricante=" + fabricante + "]";
	}
	
	
}
