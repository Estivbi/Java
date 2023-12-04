package ejerciciosUd4Entregar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio2 {
	/**
	 * Realiza un programa que busque un valor en un array y lo elimine. No se puede
	 * incluir un ceroen la posición borrada. Sugerencia: Utiliza un nuevo array
	 * para el resultado.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arrayOriginal = { 5, 7, 4, 8, 5, 9, 2, 4, 0, 3 };
		System.out.println(Arrays.toString(arrayOriginal));

		System.out.println("Introduce el número a eliminar del array: ");
		int numAEliminar = sc.nextInt();

		// Creamos un nuevo array para el resultado
		int[] arrayResultado = eliminarNum(arrayOriginal, numAEliminar);

		// Mostrar el resultado
		System.out.print("Resultado = ");
		for (int i : arrayResultado) {
			System.out.print(i + " ");
		}

		sc.close();
	}

	private static int[] eliminarNum(int[] arrayOriginal, int numAEliminar) {
		// creamos metodo para eliminar un numero del array
		int contador = 0;

		// Contamos la cantidad de ocurrencias del numero en el array
		for (int i : arrayOriginal) {
			if (i == numAEliminar) {
				contador++;
			}
		}
		// Crear un nuevo array con longitud ajustada
		int[] arrayResultado = new int[arrayOriginal.length - contador];
		int j = 0;

		// Copiar elementos al nuevo array, omitiendo el número a eliminar
		for (int i : arrayOriginal) {
			if (i != numAEliminar) {
				arrayResultado[j] = i;
				j++;
			}
		}

		return arrayResultado;
	}

}
