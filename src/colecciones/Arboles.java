package colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Arboles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<String> arbolesPersonas = new TreeSet<>();
//		arbolesPersonas.add("Ramiro");
//		arbolesPersonas.add("Sandra");
//		arbolesPersonas.add("Claudia");
//		for (String x : arbolesPersonas) {
//			System.out.println(x);
//		}

		Articulo primero = new Articulo(1, "primer articulo");
		Articulo segundo = new Articulo(2, "segundo articulo");
		Articulo tercero = new Articulo(3, "tercero articulo");
		Articulo cuarto = new Articulo(4, "cuarto articulo");

		TreeSet<Articulo> listaArticulo = new TreeSet<>();
		listaArticulo.add(primero);
		listaArticulo.add(cuarto);
		listaArticulo.add(tercero);
		listaArticulo.add(segundo);

		for (Articulo x : listaArticulo) {
			System.out.println(x.descripcion());
		}
		System.out.println("equis");
		
		Articulo comparadorArticulo = new Articulo();
		TreeSet<Articulo> paraComparar = new TreeSet<>(comparadorArticulo);
		paraComparar.add(primero);
		paraComparar.add(cuarto);
		paraComparar.add(segundo);
		
		for (Articulo x : paraComparar) {
			System.out.println(x.descripcion());
		}
	}

}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

	public int num;
	private String desc;

	public Articulo() {
	}

	public Articulo(int num, String desc) {
		this.num = num;
		this.desc = desc;
	}

	public String descripcion() {
		return desc;
	}

	@Override
	public int compareTo(Articulo o) {
		return num - o.num;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descA = o1.descripcion();
		String descB = o2.descripcion();

		return descA.compareTo(descB);
	}

}