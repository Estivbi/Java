package ejerciciosUd7Entregar;

import java.util.ArrayList;
import java.util.Scanner;

public class Intolerancia2 {

	public static void main(String[] args) {
		/*Eduardo acaba de descubrir que tiene intolerancia a algunos alimentos, pero no sabe cuáles. 
		 * La comida de hoy le ha sentado bien, pero la de ayer no. 
		 * El programa debe solicitar los ingredientesque comió en ayer y los que comió hoy. 
		 * Todos los que comió hoy se consideran seguros, pero alguno de los que comió ayer 
		 * es potencialmente peligroso, ¿sabrías decir cuáles?
		 */
		   ArrayList<String> alimentos = new ArrayList<String>();
	        Scanner sc = new Scanner(System.in);
	        
	        // Pedir alimentos del día 1
	        System.out.println("Ingrese los alimentos que consumió en el día 1 (ingrese 'fin' para terminar):");
	        while (true) {
	            String alimento = sc.nextLine();
	            if (alimento.equalsIgnoreCase("fin")) {
	                break;
	            }
	            if (alimento.isEmpty()){
	                System.out.println("No ha ingresado un alimento, ingrese un alimento válido");
	            }else if(alimento.matches("[0-9]+")){
	                System.out.println("No se permiten numeros, ingrese un alimento válido");
	            }else{
	                alimentos.add(alimento);
	            }
	        }
	        
	        // Pedir alimentos del día 2
	        System.out.println("Ingrese los alimentos que consumió en el día 2 (ingrese 'fin' para terminar):");
	        while (true) {
	            String alimento = sc.nextLine();
	            if (alimento.equalsIgnoreCase("fin")) {
	                break;
	            }
	            if (alimento.isEmpty()){
	                System.out.println("No ha ingresado un alimento, ingrese un alimento válido");
	            }else if(alimento.matches("[0-9]+")){
	                System.out.println("No se permiten numeros, ingrese un alimento válido");
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