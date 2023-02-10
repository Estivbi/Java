package ejerciciosUd8Entregar;

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;

/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class ProgramaBasic {

	public static void main(String[] args) {
		// Declarar variables
		Map<Integer, String> instrucciones = new LinkedHashMap<>();
		Scanner scn = new Scanner(System.in);
		String entrada;
		String[] campos;
		

		System.out.println("Introduce las instrucciones en el formato: numero_linea instruccion:");
		do {
			entrada = scn.nextLine().trim();
			if (!entrada.equalsIgnoreCase("fin")) {
				// comprobamos que el formato sea correcto
				if (entrada.matches("[0-9]+ +(PRINT|GOTO|REM|END).*")) {
					campos = entrada.split(" +", 2);
					int numLinea = Integer.parseInt(campos[0]);
					String instruccion = campos[1];
					instrucciones.put(numLinea, instruccion);
				} else {
					System.out.println("Formato incorrecto, vuelve a intentarlo");
				}
			}
		} while (!entrada.equalsIgnoreCase("fin"));

		// Recorrer líneas de código
		int currentLine = 0;
		while (true) {
			currentLine++;
			String instruccion1 = instrucciones.get(currentLine);
			if (instruccion1 != null) {
				if (instruccion1.startsWith("PRINT")) {
					String textoAImprimir = instruccion1.substring(instruccion1.indexOf(" ") + 1,
							instruccion1.length() - 1);

					{
						System.out.println(textoAImprimir.replaceAll("\"", ""));

						break;
					}
				}
			} else {
				continue;
			}
		}

		while (true) {
			// Obtenemos la siguiente línea de código
			String instruccion = instrucciones.get(currentLine);
			if (instruccion == null) {
				// Si no hay más líneas de código, salimos del bucle
				break;
			}

			// Separamos la instrucción en un array
			String[] partes = instruccion.split(" ", 2);
			String comando = partes[0];
			String parametros = "";
			if (partes.length > 1) {
				parametros = partes[1];
			}
			// Ejecutamos la instrucción
			switch (comando.toUpperCase()) {
			case "PRINT":
				// System.out.println(parametros);
				break;
			case "GOTO":
				currentLine = Integer.parseInt(parametros);
				// Volvemos al inicio del bucle para ejecutar la nueva línea
				continue;
			case "REM":
				// El comando REM no hace nada
				break;
			case "END":
				// Salimos del bucle
				return;
			default:
				System.out.println("Comando desconocido: " + comando);
				break;
			}
			currentLine++;
		}
		scn.close();
	}
}