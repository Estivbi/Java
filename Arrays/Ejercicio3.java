package ejerciciosUd4Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio3 {
	/**
	 * Para montar un mueble tenemos un manual que nos indica que tenemos 10 piezas
	 * de madera. Cuando vamos a montarlo nos damos cuenta de que nos falta una de
	 * ellas. Por suerte, cada piezaestá numerada. Realiza un programa que lea 10
	 * números, que representan las piezas de maderaque hay y muestre por pantalla
	 * la pieza que falta.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] piezas = new int[10];

		// lectura de las piezas
		for (int i = 0; i < 9; i++) {
			System.out.print("Pieza (1 - 10): ");
			piezas[i] = sc.nextInt();

		}
		// Calculo de la pieza faltante
		int suma = 0;
		for (int i : piezas) {
			suma += i;
		}
		int sumaDeNums = 55; //// Suma de los números del 1 al 10
		int piezaFaltante = sumaDeNums - suma;

		System.out.println("Falta la pieza numero " + piezaFaltante);
		sc.close();
	}

}
