package ejerciciosUd11Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class TestOrdenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CPU miCPU = new CPU(3.2, 8, "Intel");
		Pantalla miPantalla = new Pantalla (32, "1.920 x 1.080");
		Teclado miTeclado = new Teclado ("Español", 49, true, "USB");
		Raton miRaton = new Raton (3, 130.0);
		Ordenador miOrdenador = new Ordenador (16, "Windows 11", miCPU, miPantalla, miTeclado, miRaton);
		System.out.println(miOrdenador);
	}

}
