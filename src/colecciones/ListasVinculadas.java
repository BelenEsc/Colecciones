package colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListasVinculadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> personas= new LinkedList<>();
		personas.add("Juan");
		personas.add("Pedro");
		personas.add("Juana");
		personas.add("Pedra");
		
		ListIterator<String> it = personas.listIterator() ;
			it.next();
			it.add("Jhon");
		
		//this is a commentar
		
		for (String x : personas) {
			System.out.println(x);
		}
		
	}

}
