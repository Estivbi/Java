package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class NumAprobadosDoWhile {
	/**
	 * Utilizando la instrucción do-while, realiza un programa que lea una secuencia
	 * de calificaciones hasta que se introduzca una calificación negativa.
	 * Finalmente se mostrará cuántos aprobados (notamayor o igual a 5) hay
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int notas;
		int aprobados = 0;
		System.out.println("Las calificaciones deben ser de 0 a 10, -1 para finalizar: ");
		do {
			System.out.print("Introduce una calificación: ");
			notas = sc.nextInt();
			if (notas >= 5) {
				aprobados++;

			}
		} while (notas >= 0);
		System.out.println("Total de aprobados: " + aprobados);

		sc.close();
	}

}
