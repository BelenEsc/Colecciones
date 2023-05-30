package colecciones;

public class Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro1 libro1 = new Libro1("titulo", "yo", 2596);
		Libro1 libro2 = new Libro1("titulo", "yo", 2596);
		Libro1 libro3 = new Libro1("titulo2", "yo2", 2554);

		System.out.println(libro1.equals(libro2));
	}

}

class Libro1 {
	private String titulo;
	private String Autor;
	private int isbn;

	public Libro1(String titulo, String autor, int isbn) {
		this.titulo = titulo;
		this.Autor = autor;
		this.isbn = isbn;

	}
	
//	public boolean equals(Object x) {
//		
//		return x;
//	}

}