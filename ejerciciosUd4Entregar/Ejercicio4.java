package ejerciciosUd4Entregar;

import java.util.Scanner;

/**
 * 
 * @author Carolina Rodriguez
 */

public class Ejercicio4 {
	/**
	 * Realizar un programa que calcule el sueldo total de cada empleado de una empresa que cuentacon 5 empleados, 
	 * los cuales ganan de sueldo base 1100€ mensuales, y una cantidad adicional por las horas trabajadas 
	 * que sobrepasen a las 160 horas del mes. Si trabaja más de 160 y hasta 180horas, 
	 * cada hora adicional se le pagará a 10€, y si supera las 180 horas se les pagarán a 11€.
	 * Se pide crear un Array para registrar el número de horas trabajadas por cada trabajador .
	 * Guardar en otro Array el salario total a cobrar por cada uno de los trabajadores. 
	 * Queremos saberpara cada trabajador cuántas horas ha trabajado y cuánto se le ha pagado. 
	 * Por otra parte,necesitamos saber el sueldo medio y el total pagado a todos los empleados. 
	 * Controlar que el númerode horas trabajadas sea como mínimo 160, si ha trabajado menos volverá a pedir ese número.
	 *
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEmpleados = 5;
		int horasBase = 160;
		double sueldoBase = 1100.0;
		double [] horasTrabajadas = new double[numEmpleados];
		double [] salarioTotal = new double[numEmpleados];
		double totalPagado = 0;
		
		//entrada de datos
		for (int i = 0; i < numEmpleados; i++) {
			do {
				System.out.print("Horas trabajadas por el empleado número " + (i+1) + ": ");
				horasTrabajadas[i] = sc.nextDouble();
				if (horasTrabajadas[i] < 160) {
					System.out.println("el número de horas trabajadas debe ser minimo de 160. Intentalo de nuevo.");
				}
			} while (horasTrabajadas[i] < 160);
			double horasExtras = horasTrabajadas[i] - horasBase;
            double salarioHorasExtras = 0;

            if (horasExtras > 0 && horasExtras <= 20) {
                salarioHorasExtras = horasExtras * 10;
            } else if (horasExtras > 20) {
                salarioHorasExtras = 20 * 10 + (horasExtras - 20) * 11;
            }

            salarioTotal[i] = sueldoBase + salarioHorasExtras;
            totalPagado += salarioTotal[i];
           
            System.out.println("Empleado nº" + (i + 1) + " - Horas trabajadas: " + horasTrabajadas[i] +
                               " - Salario: " + salarioTotal[i] + "€");
            System.out.println("");
        }

        double salarioMedio = totalPagado / numEmpleados;

        System.out.println("\nEl salario medio pagado a los trabajadores es " + salarioMedio + "€");
        System.out.println("Total pagado: " + totalPagado + "€");

        sc.close();
		}
	}


