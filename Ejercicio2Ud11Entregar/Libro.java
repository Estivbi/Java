package Ejercicio2Ud11Entregar;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Carolina Rodríguez DAM online
 *
 */

public class Libro { 
	private String titulo;
	private long isbn;
	private String autor;
	private int añoPublicacion;
	private List<Pagina> paginas;

	public Libro(String titulo, long isbn, String autor, int añoPublicacion) { //Constructor
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
		this.paginas = new ArrayList<>();
	}

	public void agregarPagina(Pagina pagina) { //Agrega una nueva página al libro
		paginas.add(pagina);

	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the isbn
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the añoPublicacion
	 */
	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	/**
	 * @param añoPublicacion the añoPublicacion to set
	 */
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	/**
	 * @return the paginas
	 */
	public List<Pagina> getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(List<Pagina> paginas) {
		this.paginas = paginas;
	}

	@Override 					//Devuelve la información del libro en forma de cadena de caracteres
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Libro [titulo=").append(titulo);
		sb.append(", isbn=").append(isbn);
		sb.append(", autor=").append(autor);
		sb.append(", añoPublicacion=").append(añoPublicacion);
		sb.append("][\n");
		int i = 1;
		for (Pagina pagina : paginas) {
			sb.append("\t").append("Página ").append(i).append(" - ").append(pagina.toString()).append(",\n");
			i++;
		}
		sb.append("]");
		return sb.toString();
	}
	/*Incialmente el toString lo había hecho usando String, para concatenar como en otros ejercicios. Pero leyendo la documentación 
	 * y sino recuerdo mal en los primeros temas, vimos la clase StringBuilder, esta es mucho mas eficiente y permite una mejor gestión de la memoria.
	 * 
	 * @Override public String toString() { String result = "Libro [titulo=" +
	 * titulo + ", isbn=" + isbn + ", autor=" + autor + ", anoPublicacion=" +
	 * añoPublicacion + "][\n"; int i = 1; for (Pagina pagina : paginas) { result +=
	 * "\tPágina " + i + " - " + pagina.toString() + ",\n"; i++; } result += "]";
	 * return result; }
	 */

}
