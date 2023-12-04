package ejerciciosUd4Entregar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Definir dos arrays de tamaño 10
	        int[] array1 = new int[10];
	        int[] array2 = new int[10];

	        // Solicitar y almacenar valores para el primer array
	        System.out.println("Valores para el primer array");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Introduce el elemento nº" + i + ": ");
	            array1[i] = sc.nextInt();
	        }

	        // Solicitar y almacenar valores para el segundo array
	        System.out.println("Valores para el segundo array");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Introduce el elemento nº" + i + ": ");
	            array2[i] = sc.nextInt();
	        }

	        // Ordenar ambos arrays
	        Arrays.sort(array1);
	        Arrays.sort(array2);

	        // Combinar los dos arrays ordenados en un tercer array
	        int[] arrayCombinado = new int[20];
	        System.arraycopy(array1, 0, arrayCombinado, 0, 10);
	        System.arraycopy(array2, 0, arrayCombinado, 10, 10);
	        Arrays.sort(arrayCombinado);

	        // Mostrar el array resultado ordenado
	        System.out.println("Array resultado ordenado");
	        for (int i = 0; i < 20; i++) {
	            System.out.print(arrayCombinado[i]);
	        }

	        sc.close();

	}

}
