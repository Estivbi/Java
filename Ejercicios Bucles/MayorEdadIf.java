package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class MayorEdadIf {
	/**
	 * Realiza un programa que solicita un nombre y la edad por teclado y luego
	 * muestra por pantallael texto "Hola " seguido del nombre introducido, de forma
	 * que, si tiene 18 años o más le muestra un mensaje que le permite acceder al
	 * sistema, y, en caso contrario, no se lo permite
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = sc.next();
		System.out.print("Introduzca su edad: ");
		int edad = sc.nextInt();

		if (edad >= 18) {
			System.out.println("Hola " + nombre + edad + ", es mayor de edad y tiene permiso para acceder al sistema.");
		} else {
			System.out.println("Hola " + nombre + ", es menor de edad y no tiene permiso para acceder al sistema.");
		}

		sc.close();
	}

}
