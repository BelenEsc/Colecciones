package colecciones;

import java.util.Objects;

public class Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro1 libro1 = new Libro1("titulo1", "yo", 2596);
		Libro1 libro2 = new Libro1("titulo1", "yo", 2596);
		Libro1 libro3 = new Libro1("titulo2", "yo2", 2554);
		libro1 = libro2;
		System.out.println(libro1.equals(libro2));
		System.out.println(libro1.hashCode());
		System.out.println(libro2.hashCode());
	}

}

class Libro1 {
	public String titulo;
	public String Autor;
	private int isbn;

	public Libro1(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.Autor = autor;
		this.isbn = isbn;

	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro1 other = (Libro1) obj;
		return isbn == other.isbn;
	}

}