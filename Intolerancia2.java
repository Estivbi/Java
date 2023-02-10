package ejerciciosUd7Entregar;

import java.util.ArrayList;
import java.util.Scanner;

public class Intolerancia2 {

	public static void main(String[] args) {
		/*Eduardo acaba de descubrir que tiene intolerancia a algunos alimentos, pero no sabe cu�les. 
		 * La comida de hoy le ha sentado bien, pero la de ayer no. 
		 * El programa debe solicitar los ingredientesque comi� en ayer y los que comi� hoy. 
		 * Todos los que comi� hoy se consideran seguros, pero alguno de los que comi� ayer 
		 * es potencialmente peligroso, �sabr�as decir cu�les?
		 */
		   ArrayList<String> alimentos = new ArrayList<String>();
	        Scanner sc = new Scanner(System.in);
	        
	        // Pedir alimentos del d�a 1
	        System.out.println("Ingrese los alimentos que consumi� en el d�a 1 (ingrese 'fin' para terminar):");
	        while (true) {
	            String alimento = sc.nextLine();
	            if (alimento.equalsIgnoreCase("fin")) {
	                break;
	            }
	            if (alimento.isEmpty()){
	                System.out.println("No ha ingresado un alimento, ingrese un alimento v�lido");
	            }else if(alimento.matches("[0-9]+")){
	                System.out.println("No se permiten numeros, ingrese un alimento v�lido");
	            }else{
	                alimentos.add(alimento);
	            }
	        }
	        
	        // Pedir alimentos del d�a 2
	        System.out.println("Ingrese los alimentos que consumi� en el d�a 2 (ingrese 'fin' para terminar):");
	        while (true) {
	            String alimento = sc.nextLine();
	            if (alimento.equalsIgnoreCase("fin")) {
	                break;
	            }
	            if (alimento.isEmpty()){
	                System.out.println("No ha ingresado un alimento, ingrese un alimento v�lido");
	            }else if(alimento.matches("[0-9]+")){
	                System.out.println("No se permiten numeros, ingrese un alimento v�lido");
	            }else{
	                alimentos.add(alimento);
	            }sc.close();
	        }
	        
	        // Determinar alimentos saludables
	        System.out.println("Alimentos saludables:");
	        for (String alimento : alimentos) {
	            if (alimento.equalsIgnoreCase("frutas") || alimento.equalsIgnoreCase("verduras") 
	                || alimento.equalsIgnoreCase("pescado") || alimento.equalsIgnoreCase("carne magra")
	                || alimento.equalsIgnoreCase("legumbres")|| alimento.equalsIgnoreCase("yogurt")
	                || alimento.equalsIgnoreCase("cereales integrales")) {
	                System.out.println(alimento);
	            }
	        }
	    }
}