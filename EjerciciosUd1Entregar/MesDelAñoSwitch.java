package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class MesDelAñoSwitch {
	/**
	 * Utilizando la instrucción switch, escribe un programa en que dado un número
	 * del 1 a 12 escriba el correspondiente nombre del mes. En caso de introducir
	 * un número fuera del rango, se informaráal usuario de su error.
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número del 1 al 12 para saber el mes del año: ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembnre");
			break;
		default:
			System.out.println("Comando no válido. Saliendo del programa...");
		}

		sc.close();
	}

}
