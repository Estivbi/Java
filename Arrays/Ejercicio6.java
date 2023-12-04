package ejerciciosUd4Entregar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leer los elementos del array desde teclado
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el elemento nº" + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Ordenar el array de menor a mayor
        Arrays.sort(numeros);

        // Mostrar el array ordenado
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + (i + 1) + ": " + numeros[i]);
        }

        sc.close();

	}

}
