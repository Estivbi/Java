package ejerciciosUd4Entregar;
/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio7 {

	private int[][] datos;

    // Constructor para inicializar la matriz
    public Ejercicio7() {
        datos = new int[3][3];
    }

    // Método para asignar datos a la matriz
    public void asignarDatos(int[] vector) {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                datos[i][j] = vector[contador];
                contador++;
            }
        }
    }

    // Método para sumar otra matriz a la actual
    public void suma(Ejercicio7 m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                datos[i][j] += m.datos[i][j];
            }
        }
    }

    // Método para multiplicar por otra matriz
    public void producto(Ejercicio7 m) {
        int[][] resultado = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int suma = 0;
                for (int k = 0; k < 3; k++) {
                    suma += datos[i][k] * m.datos[k][j];
                }
                resultado[i][j] = suma;
            }
        }

        // Copiar el resultado a la matriz original
        datos = resultado;
    }

    // Método para mostrar el contenido de la matriz
    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(datos[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
