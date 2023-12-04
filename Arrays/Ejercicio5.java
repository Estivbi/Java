package ejerciciosUd4Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio5 {
	/**
	 * Las margaritas no poseen siempre la misma cantidad de pétalos, 
	 * pero su número es siempre untérmino de la sucesión de Fibonacci. 
	 * Por ejemplo: 13, 21, 34, 55, 89, 144, etc. Es una secuencia infinita de números naturales 
	 * cuyos dos primeros términos son 1 y 1 y tal que, cualquier otro término 
	 * se obtiene sumando los dos inmediatamente anteriores. 
	 * Realizar un programa quealmacene en un Array la secuencia de Fibonacci hasta el número que nos proporcione el usuario.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//entrada de datos
		System.out.print("¿Término de Fibonacci a calcular? ");
		int n = sc.nextInt();
		int[] fibonacciArray = calcularFibonacci(n);
		
		//mostrar la secuencia de Fibonacci
		System.out.print("FIBONACCI: ");
		for (int i = 0; i < n; i++) {
		    System.out.print(fibonacciArray[i]);
		    if (i < n - 1) {
		        System.out.print(",");
		    }
		}
		sc.close();
	}
	//metodo para calcular la secuencia de Fibonacci
	private static int[] calcularFibonacci(int n) {
		int[] fibonacciArray = new int[n];
	    fibonacciArray[0] = 1;
	    fibonacciArray[1] = 1;

	    for (int i = 2; i < n; i++) {
	        fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
	    }

	    return fibonacciArray;
	}
	}


