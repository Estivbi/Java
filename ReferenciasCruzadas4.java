package ejerciciosUd8Entregar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/**
 * 
 * @author Carolina Rodr�guez DAM online
 *
 */

public class ReferenciasCruzadas4 {

	public static void main(String[] args) {
		
		        // Declarar un mapa para almacenar las palabras y sus referencias
		        Map<String, List<Integer>> references = new HashMap<>();
		        // Declarar un esc�ner para leer las l�neas del texto
		        Scanner sc = new Scanner(System.in);
		        // Contador para llevar el n�mero de l�nea actual
		        int lineaNumero = 0;
		        
		        // Leer las l�neas hasta encontrar "fin"
		        while (true) {
		            String linea = sc.nextLine();
		            if (linea.equals("fin")) {
		                break;
		            }
		            lineaNumero++;

		            // Dividir la l�nea en palabras
		            String[] palabras = linea.split("\\W+"); // split usando una expresi�n regular que selecciona caracteres no alfanum�ricos como delimitadores
		            for (String palabra : palabras) {
		                // Convertir la palabra a min�sculas para evitar duplicados
		                palabra = palabra.toLowerCase();
		                // Obtener la lista de referencias para esta palabra (o crear una nueva si no existe)
		                List<Integer> palabraReferences = references.getOrDefault(palabra, new ArrayList<>());
		                // A�adir la l�nea actual a la lista de referencias
		                palabraReferences.add(lineaNumero);
		                // Actualizar el mapa con la nueva lista de referencias
		                references.put(palabra, palabraReferences);
		            }
		        }

		        // Ordenar las palabras alfab�ticamente
		        List<String> palabras = new ArrayList<>(references.keySet());
		        palabras.sort(String::compareTo);

		        // Imprimir las palabras y sus referencias
		        for (String palabra : palabras) {
		            System.out.print(palabra + ": ");
		            List<Integer> palabraReferences = references.get(palabra);
		            palabraReferences.sort(Integer::compareTo);
		            for (Integer referencia : palabraReferences) {
		                System.out.print(referencia + " ");
		            }
		System.out.println();

		        }sc.close();
		    }
		}
