package ejerciciosUd9Entregar;

/**
 * 
 * @author Carolina Rodríguez DAM online
 * @version 1
 */

public class Coche {
	// Atributos.
	int ruedas;
	int velocidad;

	/**
	 * Constructor.
	 * 
	 * @param ruedas    = 4.
	 * @param velocidad = 0.
	 */
	public Coche(int ruedas, int velocidad) {
		this.ruedas = 4;
		this.velocidad = 0;
	}

	/**
	 * Método getter que devuelve la cantidad de ruedas del coche.
	 * 
	 * @return Cantidad de ruedas.
	 */
	public int getRuedas() {
		return ruedas;
	}

	/**
	 * Método setter que establece la cantidad de ruedas del coche.
	 * 
	 * @param ruedas Cantidad de ruedas.
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * Método getter que devuelve la velocidad actual del coche.
	 * 
	 * @return velocidad actual del coche.
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Método getter que establece la velocidad actual del coche.
	 * 
	 * @param velocidad Velocidad actual del coche.
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Método que permite acelerar el coche en una determinada cantidad. La
	 * velocidad resultante no debe superar los 120km/h
	 * 
	 * @param cantidad Cantidad a acelerar.
	 */
	public void acelerar(int cantidad) {
		int nuevaVelocidad = velocidad + cantidad;
		if (nuevaVelocidad <= 120) {
			velocidad = nuevaVelocidad;
		}
	}

	/**
	 * Método que permite frenar el coche en una determinada cantidad. La velocidad
	 * resultante no debe ser inferior a 0 km/h.
	 * 
	 * @param cantidad Cantidad a frenar.
	 */

	public void frenar(int cantidad) {
		int nuevaVelocidad = velocidad - cantidad;
		if (nuevaVelocidad >= 0) {
			velocidad = nuevaVelocidad;
		}

	}

	/**
	 * Método que devuelve una representación en String de los atributos del objeto.
	 */
	@Override

	public String toString() {
		return "Coche [ruedas=" + ruedas + ", velocidad=" + velocidad + "]";
	}
}
