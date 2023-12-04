package ejerciciosUd4Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Definir el array bidimensional para almacenar las notas de los alumnos y asignaturas
        double[][] notas = new double[5][4];

        // Solicitar y almacenar las notas
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Introduce la nota del alumno " + i + " para la asignatura " + j + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Calcular la nota más alta y la media por asignatura
        double[] notaMasAlta = new double[4];
        double[] notaMedia = new double[4];

        for (int j = 0; j < 4; j++) {
            // Inicializar la nota más alta con la primera nota del primer alumno
            notaMasAlta[j] = notas[0][j];
            
            // Calcular la media de la asignatura
            double sumaAsignatura = 0;
            for (int i = 0; i < 5; i++) {
                sumaAsignatura += notas[i][j];

                // Actualizar la nota más alta si encontramos una más alta
                if (notas[i][j] > notaMasAlta[j]) {
                    notaMasAlta[j] = notas[i][j];
                }
            }
            notaMedia[j] = sumaAsignatura / 5;
        }

        // Calcular la nota media de todos los alumnos en todas las asignaturas
        double notaMediaTotal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                notaMediaTotal += notas[i][j];
            }
        }
        notaMediaTotal /= (5 * 4);

        // Mostrar resultados
        for (int j = 0; j < 4; j++) {
            System.out.println("Nota más alta de la asignatura " + j + ": " + notaMasAlta[j]);
            System.out.println("Nota media de la asignatura " + j + ": " + notaMedia[j]);
        }

        System.out.println("Nota media de los alumnos en todas las asignaturas: " + notaMediaTotal);

        sc.close();

	}

}
