package EjerciciosUd1Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class TablaDeMultiplicar {
	/**
	 * Realizar un programa que pida un número y nos muestre su tabla de multiplicar.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número del que quieras saber su tabla de multiplicar: ");
		int multiplicaNum = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int resultado = multiplicaNum * i;
			System.out.println(multiplicaNum + "x" + i + " = " + resultado);
		}sc.close();
		System.out.println("\n*****Fin del programa******");
	}

}
