package ejerciciosUd9Entregar;

/**
 * 
 * @author Carolina Rodríguez DAM online
 * @version 1
 */

public class PruebaCoche {

	public static void main(String[] args) {

		// Instanciamos dos objetos de la clase Coche.
		Coche mini = new Coche(0, 0);
		Coche porche = new Coche(0, 0);

		// Establecemos velocidad inicial del primer Coche y aceleramos el Coche.
		mini.setVelocidad(70);
		mini.acelerar(20);
		mini.acelerar(40);

		// Establecemos la velocidad inicial del segundo Coche y frenamos el Coche.
		porche.setVelocidad(120);
		porche.frenar(90);
		porche.frenar(40);

		// imprimir por pantalla velocidad actual de coche mini y porche y cantidad de
		// ruedas
		System.out.println(mini);
		System.out.println(porche);

	}

}
