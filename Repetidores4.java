package ejerciciosUd7Entregar;

import java.util.ArrayList;
import java.util.Scanner;

public class Repetidores4 {

	public static void main(String[] args) {
		ArrayList<String> alumnosAnterior = new ArrayList<>();
        ArrayList<String> alumnosActual = new ArrayList<>();
        ArrayList<String> alumnosRepetidores = new ArrayList<>();
        
        String nombreAlumno;
        boolean ingresandoAlumnosAnterior=true; //variable de control para determinar si se están ingresando los alumnos del año pasado o de este año.

        // Ingreso de alumnos del año pasado y este año
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de los alumnos, separados por una nueva línea. Escriba 'fin' al finalizar.");
        while(true){ //utilizo un "while" para recibir los nombres de los alumnos 
            nombreAlumno = sc.nextLine();
            if (nombreAlumno.equals("fin")) {
                if(ingresandoAlumnosAnterior)
                    ingresandoAlumnosAnterior=false;
                else
                    break;
            }else if(nombreAlumno.matches("^[a-zA-Z\\s]*$")) {
                if(ingresandoAlumnosAnterior)
                    alumnosAnterior.add(nombreAlumno);
                else
                    alumnosActual.add(nombreAlumno);
            }else {
                System.out.println("Nombre de alumno no válido. Por favor, ingrese solo letras.");
            }
        }sc.close();

        // Obtención de alumnos repetidores
        for (String alumno : alumnosAnterior) {
            if (alumnosActual.contains(alumno)) {
                alumnosRepetidores.add(alumno);
            }
        }

        // Impresión de alumnos repetidores
        System.out.println("Alumnos repetidores:");
        for (String alumno : alumnosRepetidores) {
            System.out.println(alumno);
        }
    }
}
