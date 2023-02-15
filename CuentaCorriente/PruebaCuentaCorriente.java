package ejerciciosUd9Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 * @version 1
 */

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		CuentaCorriente cc=new CuentaCorriente();
		cc.imposicion(200);
		cc.reintegro(300);
		System.out.println(cc.getSaldo()); //imprimir el saldo actual por pantalla.

	}

}
