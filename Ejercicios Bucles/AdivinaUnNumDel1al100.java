package EjerciciosUd1Entregar;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class AdivinaUnNumDel1al100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generador = new Random();
		int adivinarNum = generador.nextInt(100) + 1;
		int intentos = 0;
		boolean numAdivinado = false;

		System.out.println("Bienvenido al juego de adivinar un número!!!");
		System.out.println("--------------------------------------------");

		while (intentos < 10 && !numAdivinado) {
			intentos++;
			System.out.println("Intento " + intentos + " - Introduce un número (1-100): ");
			int numeroUsr = sc.nextInt();

			if (numeroUsr < 1 || numeroUsr > 100) {
				System.out.println("Introduce un número del 1 al 100");
			} else if (numeroUsr < adivinarNum) {
				System.out.println(" ");
				System.out.println("El número es mayor");
			} else if (numeroUsr > adivinarNum) {
				System.out.println(" ");
				System.out.println("El número es menor");
			} else {
				numAdivinado = true;
			}
		}sc.close();
		if (numAdivinado) {
			System.out.println("Eres un crack!!! Lo has adivinado!!!");
		} else {
			System.out
					.println("Ohhhh, no lo has adivinado!! Has superado el número máximo de intentos. El número era el "
							+ numAdivinado + ".");
		}
	}

}
