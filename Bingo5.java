package ejerciciosUd7Entregar;

import java.util.HashSet;
import java.util.Scanner;

public class Bingo5 {

	public static void main(String[] args) {
		HashSet<Integer> boleto = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Ingreso de n�meros del boleto
        System.out.println("Ingrese los n�meros de su boleto de bingo, separados por un espacio:");
        String[] numeros = sc.nextLine().split(" ");
        for (String numero : numeros) {
            boleto.add(Integer.parseInt(numero));
        }

        // Juego del bingo
        int numeroBombo;
        while (boleto.size() > 0) {
            System.out.println("Ingrese un n�mero del bombo:");
            numeroBombo = sc.nextInt();
            if (boleto.contains(numeroBombo)) {
                boleto.remove(numeroBombo);
                System.out.println("N�mero encontrado en el boleto! Quedan " + boleto.size() + " n�meros por encontrar.");
            } else {
                System.out.println("N�mero no encontrado en el boleto. Sigue intentando!");
            }
        }sc.close();

        // Impresi�n de "BINGO"
        System.out.println("BINGO!");
    }
}
