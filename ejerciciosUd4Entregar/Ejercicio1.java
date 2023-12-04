package ejerciciosUd4Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio1 {
	/**
	 * Realiza un programa que solicite las notas (de tipo double) de 10 alumnos que
	 * se van a guardaren un array. Una vez almacenados todos los datos, recorre el
	 * array para encontrar la nota más altade los aprobados, la nota más alta de
	 * los suspensos, la más baja de los aprobados, la más baja delos suspensos y la
	 * nota media de los aprobados y la nota media de todos los alumnos.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[10];

		// Solicitamos las notas y las almacenamos en el array
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota del alumno" + i + ": ");
			notas[i] = sc.nextDouble();
		}

		double notaMasAltaAprob = -1;
		double notaMasBajaAprob = Double.MAX_VALUE;
		double notaMasAltaSuspen = -1;
		double notaMasBajaSuspen = Double.MAX_VALUE;
		double sumaNotasAprob = 0;
		int contadorAprob = 0;

		// Recorremos el Array para realizar los calculos
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) { // aprobado
				if (notas[i] > notaMasAltaAprob) {
					notaMasAltaAprob = notas[i];
				}
				if (notas[i] < notaMasBajaAprob) {
					notaMasBajaAprob = notas[i];
				}
				sumaNotasAprob += notas[i];
				contadorAprob++;
			} else {// suspenso
				if (notas[i] > notaMasAltaSuspen) {
					notaMasAltaSuspen = notas[i];
				}
				if (notas[i] < notaMasBajaSuspen) {
					notaMasBajaSuspen = notas[i];
				}
			}

		}
		
		//Calculamos las medias
		double mediaAprob;
		if (contadorAprob > 0) {
			mediaAprob = sumaNotasAprob / contadorAprob;
		}else {
			mediaAprob = 0;
		}
		double mediaCurso;
		if (contadorAprob > 0) {
			mediaCurso = sumaNotasAprob / 10;
		}else {
			mediaCurso = 0;
		}
		
		
		//mostramos los resultados
		System.out.println("Nota mas alta de los aprobados: " + notaMasAltaAprob);
		System.out.println("Nota mas baja de los aprobados: " + notaMasBajaAprob);
		System.out.println("Nota mas alta de los suspensos: " + notaMasAltaSuspen);
		System.out.println("Nota mas baja de los suspenso: " + notaMasBajaSuspen);
		System.out.println("Nota media de los aprobados: " + mediaAprob);
		System.out.println("Nota media del curso: " + mediaCurso);
		
		sc.close();
	}

}
