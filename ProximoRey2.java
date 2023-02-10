package ejerciciosUd8Entregar;
import java.util.ArrayList;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodr�guez DAM online
 *
 */

public class ProximoRey2 {

	public static void main(String[] args) {
		/*
		 * Jaimito est� estudiando historia y acaba de idear una idea para saber el
		 * n�mero que lecorresponde a un rey. Primero va a leer todos los reyes de una
		 * dinast�a en orden cronol�gico, de talforma que, si cuando lee un nombre ya ha
		 * reinado otro, le corresponde un n�mero m�s que elanterior.Despu�s de leer
		 * toda la dinast�a, debe leerse otro nombre para saber el n�mero que le
		 * toca.�Ser�as capaz de hacer el mismo programa que Jaimito?
		 * 
		 */
		
		//EL PROGRAMA NO FUNCIONA COMO DEBER�A. AL ESCRIBIR POR PANTALLA EL VALOR DEL REY DESEADO NO SALE EL NUMERO QUE DEBER�A SINO UNO MENOS.

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
                System.out.println("El n�mero del rey " + rey + " es: " + (pos+1));
            } else {
                System.out.println("Error: el rey ingresado no se encuentra en la dinast�a.");
            }
        }sc.close();
    }
}
