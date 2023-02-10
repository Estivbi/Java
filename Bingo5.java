package ejerciciosUd7Entregar;

import java.util.HashSet;
import java.util.Scanner;

public class Bingo5 {

	public static void main(String[] args) {
		HashSet<Integer> boleto = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        // Ingreso de números del boleto
        System.out.println("Ingrese los números de su boleto de bingo, separados por un espacio:");
        String[] numeros = sc.nextLine().split(" ");
        for (String numero : numeros) {
            boleto.add(Integer.parseInt(numero));
        }

        // Juego del bingo
        int numeroBombo;
        while (boleto.size() > 0) {
            System.out.println("Ingrese un número del bombo:");
            numeroBombo = sc.nextInt();
            if (boleto.contains(numeroBombo)) {
                boleto.remove(numeroBombo);
                System.out.println("Número encontrado en el boleto! Quedan " + boleto.size() + " números por encontrar.");
            } else {
                System.out.println("Número no encontrado en el boleto. Sigue intentando!");
            }
        }sc.close();

        // Impresión de "BINGO"
        System.out.println("BINGO!");
    }
}
