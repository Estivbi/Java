package Ejercicio2Ud11Entregar;
/**
 * 
 * @author Carolina Rodr�guez DAM online
 *
 */

public class TestLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro = new Libro("El Se�or de los Anillos: La Comunidad del Anillo", 9788445075764L, "J.R.R. Tolkien", 1954);
		libro.agregarPagina(new Pagina("No todos los que vagan est�n perdidos..."));
		libro.agregarPagina(new Pagina("Si hubiera conocido todas las historias, no habr�a sido posible que la oscuridad cayera sobre m� ..."));
		libro.agregarPagina(new Pagina("La sombra se extiende sobre la tierra..."));
		libro.agregarPagina(new Pagina("No hay nada como mirar, si lo haces adecuadamente..."));
		libro.agregarPagina(new Pagina("Incluso las cosas m�s peque�as pueden cambiar el curso del futuro..."));
		System.out.println(libro.toString());
	}

}
