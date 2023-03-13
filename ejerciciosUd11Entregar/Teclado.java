package ejerciciosUd11Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class Teclado {
	private String idiomas;
	private int numTeclas;
	private boolean retroiluminacion;
    private String tipoDeConector;
    
	public Teclado (String idiomas, int numTeclas, boolean retroiluminacion, String tipoDeConector) {  //Constructor
		this.idiomas = idiomas;
		this.numTeclas = numTeclas;
		this.retroiluminacion = retroiluminacion;
        this.tipoDeConector = tipoDeConector;
	}
	

	/**
	 * @return the idiomas
	 */
	public String getIdiomas() {
		return idiomas;
	}


	/**
	 * @param idiomas the idiomas to set
	 */
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}


	/**
	 * @return the numTeclas
	 */
	public int getNumTeclas() {
		return numTeclas;
	}


	/**
	 * @param numTeclas the numTeclas to set
	 */
	public void setNumTeclas(int numTeclas) {
		this.numTeclas = numTeclas;
	}


	/**
	 * @return the retroiluminacion
	 */
	public boolean isRetroiluminacion() {
		return retroiluminacion;
	}


	/**
	 * @param retroiluminacion the retroiluminacion to set
	 */
	public void setRetroiluminacion(boolean retroiluminacion) {
		this.retroiluminacion = retroiluminacion;
	}


	/**
	 * @return the tipoDeConector
	 */
	public String getTipoDeConector() {
		return tipoDeConector;
	}


	/**
	 * @param tipoDeConector the tipoDeConector to set
	 */
	public void setTipoDeConector(String tipoDeConector) {
		this.tipoDeConector = tipoDeConector;
	}


	@Override 			//Método toString para imprimir la información
	public String toString() {
		return "Teclado [idiomas=" + idiomas + ", numTeclas=" + numTeclas + ", retroiluminacion=" + retroiluminacion
				+ ", tipoDeConector=" + tipoDeConector + "]";
	}
	
	
}
