package colecciones;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emp1 = new Empleado("Carlos");
		Map<String, Empleado> mapaEmpleado = new HashMap<>();
		mapaEmpleado.put("1", emp1);
		mapaEmpleado.put("2", new Empleado("Ana"));
		mapaEmpleado.put("3", new Empleado("Olga"));
		mapaEmpleado.put("4", new Empleado("Helga"));
		System.out.println(mapaEmpleado);
		mapaEmpleado.remove("3");
		System.out.println(mapaEmpleado);
		mapaEmpleado.replace("2",emp1);
		System.out.println(mapaEmpleado);
//		System.out.println(mapaEmpleado.entrySet());

		for (Map.Entry<String, Empleado> ele: mapaEmpleado.entrySet()) {
			System.out.println(ele.getKey());
		}
	}

}

class Empleado {

	private String nombre;
	private double sueldo;

	public Empleado(String n) {
		nombre = n;
		sueldo = 4000;
	}

	public String toString() {
		return "nombre: " + nombre + " sueldo: " + sueldo;
	}
}