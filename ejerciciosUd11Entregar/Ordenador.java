package ejerciciosUd11Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class Ordenador {
	private int RAM;
	private String SO;
	private CPU miCPU;
	private Pantalla miPantalla;
	private Teclado miTeclado;
	private Raton miRaton;
	
	public Ordenador(int RAM, String SO, CPU miCPU, Pantalla miPantalla, Teclado miTeclado, Raton miRaton) {   //Constructor
		this.RAM = RAM;
		this.SO = SO;
		this.miCPU = miCPU;
        this.miPantalla = miPantalla;
        this.miTeclado = miTeclado;
        this.miRaton = miRaton;
	}

	/**
	 * @return the rAM
	 */
	public int getRAM() {
		return RAM;
	}

	/**
	 * @param rAM the rAM to set
	 */
	public void setRAM(int rAM) {
		RAM = rAM;
	}

	/**
	 * @return the sO
	 */
	public String getSO() {
		return SO;
	}

	/**
	 * @param sO the sO to set
	 */
	public void setSO(String sO) {
		SO = sO;
	}

	/**
	 * @return the miCPU
	 */
	public CPU getMiCPU() {
		return miCPU;
	}

	/**
	 * @param miCPU the miCPU to set
	 */
	public void setMiCPU(CPU miCPU) {
		this.miCPU = miCPU;
	}

	/**
	 * @return the miPantalla
	 */
	public Pantalla getMiPantalla() {
		return miPantalla;
	}

	/**
	 * @param miPantalla the miPantalla to set
	 */
	public void setMiPantalla(Pantalla miPantalla) {
		this.miPantalla = miPantalla;
	}

	/**
	 * @return the miTeclado
	 */
	public Teclado getMiTeclado() {
		return miTeclado;
	}

	/**
	 * @param miTeclado the miTeclado to set
	 */
	public void setMiTeclado(Teclado miTeclado) {
		this.miTeclado = miTeclado;
	}

	/**
	 * @return the miRaton
	 */
	public Raton getMiRaton() {
		return miRaton;
	}

	/**
	 * @param miRaton the miRaton to set
	 */
	public void setMiRaton(Raton miRaton) {
		this.miRaton = miRaton;
	}

	
	@Override			//Método toString para imprimir la información
	public String toString() {
		return "Ordenador [RAM=" + RAM + ", SO=" + SO + ", miCPU=" + miCPU + ", miPantalla=" + miPantalla
				+ ", miTeclado=" + miTeclado + ", miRaton=" + miRaton + "]";
	}

	
	
	
}
