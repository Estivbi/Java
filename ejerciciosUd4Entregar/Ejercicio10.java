package ejerciciosUd4Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Crear una matriz 3x3 para representar el tablero del Sudoku
        int[][] sudoku = new int[3][3];

        // Solicitar al usuario que ingrese los valores del Sudoku
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduzca la coordenada (" + (i + 1) + "," + (j + 1) + "): ");
                sudoku[i][j] = sc.nextInt();

                // Verificar si el número ya está en la fila, columna o cuadrado
                if (!esValido(sudoku, i, j)) {
                    System.out.println("NO");
                    return; // Salir del programa si se encuentra un dígito repetido
                }
            } 
        }

        // Si se recorre toda la matriz sin encontrar dígitos repetidos, imprimir "SI"
        System.out.println("SI");

        sc.close();
    }

    // Función para verificar si el dígito en la coordenada (fila, columna) es válido
    private static boolean esValido(int[][] sudoku, int fila, int columna) {
        int digito = sudoku[fila][columna];

        // Verificar la fila
        for (int j = 0; j < 3; j++) {
            if (j != columna && sudoku[fila][j] == digito) {
                return false;
            }
        }

        // Verificar la columna
        for (int i = 0; i < 3; i++) {
            if (i != fila && sudoku[i][columna] == digito) {
                return false;
            }
        }

        // Verificar el cuadrado 3x3 al que pertenece la coordenada
        int cuadradoInicioFila = (fila / 3) * 3;
        int cuadradoInicioColumna = (columna / 3) * 3;

        for (int i = cuadradoInicioFila; i < cuadradoInicioFila + 3; i++) {
            for (int j = cuadradoInicioColumna; j < cuadradoInicioColumna + 3; j++) {
                if (i != fila && j != columna && sudoku[i][j] == digito) {
                    return false;
                }
            }
        }

        return true; // El dígito es válido en la coordenada dada

	}

}
