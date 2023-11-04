package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */
public class MayorMenorValorMedioPares {
	/**
	 * Realiza un programa que solicite la cantidad de números a introducir (más de uno) 
	 * y luego los pida por teclado (los números serán enteros). 
	 * El programa debe determinar cuál es el menor de ellos, 
	 * el mayor de todos ellos y el valor medio de los números pares que se hayan escrito. 
	 * Si no se ha escrito ningún par, se informará de ello.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int totalNum;
		System.out.print("Introduce la cantidad total de numeros que quieres: ");
		totalNum = sc.nextInt();
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int suma = 0;
		int hayPares = 0;
		int totalPares = 0;
		
		for (int i = 0; i < totalNum; i++) {
			System.out.print("Introduce un numero entero: ");
			int num = sc.nextInt();
			
			if (num > mayor) {
				mayor = num;
			}
			if (num < menor) {
				menor = num;
			}
			
			suma+=num;
			
			if (num % 2 == 0) {
				hayPares+=num;
				totalPares++;
			}
			
		}
		if (totalNum > 0) {
			int media = (int) suma / totalNum;
			
			System.out.println("El mayor es el: " + mayor);
			System.out.println("El menor es el: " + menor);
			
			if (hayPares > 0) {
				System.out.println("La media de los números pares es: " + media);
		
			} else {
				System.out.println("No hay ningún número par.");
			}
			sc.close();
		}
		
	}

}
