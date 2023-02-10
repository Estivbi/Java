package ejerciciosUd8Entregar;
import java.util.ArrayList;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class ProximoRey2 {

	public static void main(String[] args) {
		/*
		 * Jaimito está estudiando historia y acaba de idear una idea para saber el
		 * número que lecorresponde a un rey. Primero va a leer todos los reyes de una
		 * dinastía en orden cronológico, de talforma que, si cuando lee un nombre ya ha
		 * reinado otro, le corresponde un número más que elanterior.Después de leer
		 * toda la dinastía, debe leerse otro nombre para saber el número que le
		 * toca.¿Serías capaz de hacer el mismo programa que Jaimito?
		 * 
		 */
		
		//EL PROGRAMA NO FUNCIONA COMO DEBERÍA. AL ESCRIBIR POR PANTALLA EL VALOR DEL REY DESEADO NO SALE EL NUMERO QUE DEBERÍA SINO UNO MENOS.

		// Declarar las variables
		 ArrayList<String> reyes = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean error = false;
        boolean terminar = false;
        
        // leer la cantidad de reyes
        while (!terminar) {
            System.out.println("Ingresa el nombre del rey o escribir 'fin' para terminar:");
            String nombreRey = sc.nextLine();
            if (!nombreRey.matches("[a-zA-Z\\s]+")) {
                error = true;
                break;
            }else if(nombreRey.equals("fin")){
                terminar = true;
            }else{
                reyes.add(nombreRey);
            }
        }
        // leer los nombres de los reyes 
        if (error) {
            System.out.println("Error: el nombre del rey debe contener solo letras y espacios.");
        } else {
            System.out.println("Ingresa el nombre del rey para conocer su numero:");
            String rey = sc.nextLine();
            int pos = reyes.lastIndexOf(rey);
            if (pos != -1) {
                System.out.println("El número del rey " + rey + " es: " + (pos+1));
            } else {
                System.out.println("Error: el rey ingresado no se encuentra en la dinastía.");
            }
        }sc.close();
    }
}
