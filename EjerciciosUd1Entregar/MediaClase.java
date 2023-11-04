package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class MediaClase {
	/**
	 * Realiza un programa que calcule la calificación media de un grupo de alumnos.
	 * Para ello, deberápedir el número de alumnos y las calificaciones medias de
	 * cada uno de ellos
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de alumnos: ");
		int numAlumnos = sc.nextInt();
		double sumaCalificaciones = 0;

		for (int i = 1; i <= numAlumnos; i++) {
			System.out.print("Introduce la calificación media del alumno" + i + ": ");
			double calificacion = sc.nextDouble();

			sumaCalificaciones += calificacion;
		}
		if (numAlumnos > 0) {
			double calificacionMedia = sumaCalificaciones / numAlumnos;
			System.out.println("La calificación media del grupo es: " + calificacionMedia);
		} else {
			System.out.println("No se han ingresado calificaciones \nCerrando programa...");
		}sc.close();
	}

}
