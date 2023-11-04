package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class BilletesYMonedas {
	/**
	 * Realiza un programa que solicite una cantidad de dinero expresado en euros
	 * nos indique cuántos billetes y monedas se puede tener como mínimo. No se
	 * tendrán en cuenta los céntimos de euro.
	 *
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce la cantidad en euros: ");
		int cantidad = sc.nextInt();
		sc.close();
		int billetes200 = 0;
		int billetes100 = 0;
		int billetes50 = 0;
		int billetes20 = 0;
		int billetes10 = 0;
		int billetes5 = 0;
		int monedas2 = 0;
		int monedas1 = 0;

		while (cantidad >= 200) {
			billetes200++;
			cantidad -= 200;
		}
		while (cantidad >= 100) {
			billetes100++;
			cantidad -= 100;
		}
		while (cantidad >= 50) {
			billetes50++;
			cantidad -= 50;
		}
		while (cantidad >= 20) {
			billetes20++;
			cantidad -= 20;
		}
		while (cantidad >= 10) {
			billetes10++;
			cantidad -= 10;
		}
		while (cantidad >= 5) {
			billetes5++;
			cantidad -= 5;
		}
		while (cantidad >= 2) {
			monedas2++;
			cantidad -= 2;
		}
		while (cantidad >= 1) {
			monedas1++;
			cantidad -= 1;
		}

		if (billetes200 > 0) {
			System.out.println("Billetes de 200€: " + billetes200);
		}

		if (billetes100 > 0) {
			System.out.println("Billetes de 100€: " + billetes100);
		}
		if (billetes50 > 0) {
			System.out.println("Billetes de 50€: " + billetes50);
		}
		if (billetes20 > 0) {
			System.out.println("Billetes de 20€: " + billetes20);
		}
		if (billetes10 > 0) {
			System.out.println("Billetes de 10€: " + billetes10);
		}
		if (billetes5 > 0) {
			System.out.println("Billetes de 5€: " + billetes5);
		}
		if (monedas2 > 0) {
			System.out.println("Monedas de 2€: " + monedas2);
		}
		if (monedas1 > 0) {
			System.out.println("Monedas de 1€: " + monedas1);
		}

	}
}
