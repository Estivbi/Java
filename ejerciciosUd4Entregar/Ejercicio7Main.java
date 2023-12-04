package ejerciciosUd4Entregar;

public class Ejercicio7Main {

	public static void main(String[] args) {
		// Crear dos matrices de tamaño 3x3
		Ejercicio7 matriz1 = new Ejercicio7();
		Ejercicio7 matriz2 = new Ejercicio7();

        // Rellenar la primera matriz con los datos: 3, 2, 1, 1, 2, 3, 2, 3, 1
        int[] datosMatriz1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        matriz1.asignarDatos(datosMatriz1);

        // Rellenar la segunda matriz con los datos: 1, 1, 2, 2, 1, 1, 1, 2, 1
        int[] datosMatriz2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        matriz2.asignarDatos(datosMatriz2);

        // Mostrar el contenido de ambas matrices
        System.out.println("Matriz 1");
        matriz1.mostrar();

        System.out.println("Matriz 2");
        matriz2.mostrar();

        // Multiplicar la primera por la segunda y mostrar el resultado
        matriz1.producto(matriz2);
        System.out.println("Producto");
        matriz1.mostrar();

        // Sumar la primera por la segunda y mostrar el resultado
        matriz1.suma(matriz2);
        System.out.println("Suma");
        matriz1.mostrar();

	}

}
