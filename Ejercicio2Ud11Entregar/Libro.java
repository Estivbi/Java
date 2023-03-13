package Ejercicio2Ud11Entregar;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Carolina Rodr�guez DAM online
 *
 */

public class Libro { 
	private String titulo;
	private long isbn;
	private String autor;
	private int a�oPublicacion;
	private List<Pagina> paginas;

	public Libro(String titulo, long isbn, String autor, int a�oPublicacion) { //Constructor
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.a�oPublicacion = a�oPublicacion;
		this.paginas = new ArrayList<>();
	}

	public void agregarPagina(Pagina pagina) { //Agrega una nueva p�gina al libro
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
	 * @return the a�oPublicacion
	 */
	public int getA�oPublicacion() {
		return a�oPublicacion;
	}

	/**
	 * @param a�oPublicacion the a�oPublicacion to set
	 */
	public void setA�oPublicacion(int a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
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

	@Override 					//Devuelve la informaci�n del libro en forma de cadena de caracteres
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Libro [titulo=").append(titulo);
		sb.append(", isbn=").append(isbn);
		sb.append(", autor=").append(autor);
		sb.append(", a�oPublicacion=").append(a�oPublicacion);
		sb.append("][\n");
		int i = 1;
		for (Pagina pagina : paginas) {
			sb.append("\t").append("P�gina ").append(i).append(" - ").append(pagina.toString()).append(",\n");
			i++;
		}
		sb.append("]");
		return sb.toString();
	}
	/*Incialmente el toString lo hab�a hecho usando String, para concatenar como en otros ejercicios. Pero leyendo la documentaci�n 
	 * y sino recuerdo mal en los primeros temas, vimos la clase StringBuilder, esta es mucho mas eficiente y permite una mejor gesti�n de la memoria.
	 * 
	 * @Override public String toString() { String result = "Libro [titulo=" +
	 * titulo + ", isbn=" + isbn + ", autor=" + autor + ", anoPublicacion=" +
	 * a�oPublicacion + "][\n"; int i = 1; for (Pagina pagina : paginas) { result +=
	 * "\tP�gina " + i + " - " + pagina.toString() + ",\n"; i++; } result += "]";
	 * return result; }
	 */

}
