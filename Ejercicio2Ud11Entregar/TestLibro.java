package Ejercicio2Ud11Entregar;
/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class TestLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro = new Libro("El Señor de los Anillos: La Comunidad del Anillo", 9788445075764L, "J.R.R. Tolkien", 1954);
		libro.agregarPagina(new Pagina("No todos los que vagan están perdidos..."));
		libro.agregarPagina(new Pagina("Si hubiera conocido todas las historias, no habría sido posible que la oscuridad cayera sobre mí ..."));
		libro.agregarPagina(new Pagina("La sombra se extiende sobre la tierra..."));
		libro.agregarPagina(new Pagina("No hay nada como mirar, si lo haces adecuadamente..."));
		libro.agregarPagina(new Pagina("Incluso las cosas más pequeñas pueden cambiar el curso del futuro..."));
		System.out.println(libro.toString());
	}

}
