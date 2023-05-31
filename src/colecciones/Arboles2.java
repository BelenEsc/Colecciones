package colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Arboles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<String> arbolesPersonas = new TreeSet<>();
//		arbolesPersonas.add("Ramiro");
//		arbolesPersonas.add("Sandra");
//		arbolesPersonas.add("Claudia");
//		for (String x : arbolesPersonas) {
//			System.out.println(x);
//		}

		Articulo2 primero = new Articulo2(1, "primer articulo");
		Articulo2 segundo = new Articulo2(2, "segundo articulo");
		Articulo2 tercero = new Articulo2(3, "tercero articulo");
		Articulo2 cuarto = new Articulo2(4, "cuarto articulo");

		TreeSet<Articulo2> listaArticulo = new TreeSet<>();
		listaArticulo.add(primero);
		listaArticulo.add(cuarto);
		listaArticulo.add(tercero);
		listaArticulo.add(segundo);

		for (Articulo2 x : listaArticulo) {
			System.out.println(x.descripcion());
		}
		System.out.println("equis");

//		Articulo2 comparadorArticulo = new Articulo2();
//		TreeSet<Articulo2> paraComparar = new TreeSet<>(comparadorArticulo);

		Comparator<Articulo2> compArticulos = new Comparator<Articulo2>() {
			@Override
			public int compare(Articulo2 o1, Articulo2 o2) {

				String descA = o1.descripcion();
				String descB = o2.descripcion();
				return descA.compareTo(descB);
			}

		};

		TreeSet<Articulo2> paraComparar = new TreeSet<>(compArticulos);
		paraComparar.add(primero);
		paraComparar.add(cuarto);
		paraComparar.add(segundo);

		for (Articulo2 x : paraComparar) {
			System.out.println(x.descripcion());
		}
	}

}

class Articulo2 implements Comparable<Articulo2> {

	public int num;
	private String desc;

	public Articulo2(int num, String desc) {
		this.num = num;
		this.desc = desc;
	}

	public String descripcion() {
		return desc;
	}

	@Override
	public int compareTo(Articulo2 o) {
		return num - o.num;
	}

}
