package EjerciciosUd1Entregar;
import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class ParesImparesPositivoNegativoFor {
	/**
	 * Utilizando la instrucción for, realiza un programa que lea por teclado 10 números enteros 
	 * y determine e imprima cuántos son pares, impares, positivos y negativos 
	 * (se considerará el 0 como positivo para este ejercicio)
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;
		
		for (int i = 0; i <10; i++) {
			System.out.print("introduce un número: ");
			int numero = sc.nextInt();
			if (numero % 2 == 0) {
		        pares++;
			}
			if (numero % 2 != 0) {
				impares++;
			}
			if (numero >=0) {
				positivos++;
			}else {
				negativos++;
			}
			
		}
		sc.close();
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
	}

}
               