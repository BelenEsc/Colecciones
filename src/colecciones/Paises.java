package colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Paises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> listaPaises = new LinkedList<>();
		listaPaises.add("Espana");
		listaPaises.add("Mexico");
		listaPaises.add("Peru");
		listaPaises.add("Bolivia");

		LinkedList<String> listaCapitales = new LinkedList<>();
		listaCapitales.add("Madrid");
		listaCapitales.add("D.F.");
		listaCapitales.add("Lima");
		listaCapitales.add("Sucre");

		System.out.println(listaPaises);
		System.out.println(listaCapitales);

		ListIterator<String> iter = listaPaises.listIterator();
		ListIterator<String> iter2 = listaCapitales.listIterator();

		while (iter2.hasNext()) {
			if (iter.hasNext()) {
				iter.next();
				iter.add(iter2.next());
			}

		}

		System.out.println(listaPaises);

		iter2 = listaCapitales.listIterator();
		while (iter2.hasNext()) {
			iter2.next();
			if (iter2.hasNext()) {
				iter2.next();
				iter2.remove();
			}
		}
		
		System.out.println(listaCapitales);
		System.out.println(listaPaises);
		
		listaPaises.removeAll(listaCapitales);
		System.out.println(listaPaises);

	}

}
