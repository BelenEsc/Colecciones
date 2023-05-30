package colecciones;

import java.sql.NClob;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente("Cliente1", "00001", 20000);
		Cliente cliente2 = new Cliente("Cliente2", "00002", 20000);
		Cliente cliente3 = new Cliente("Cliente3", "00003", 60000);
		Cliente cliente4 = new Cliente("Cliente4", "00004", 70000);
		Cliente cliente5 = new Cliente("Cliente5", "00005", 80000);

		Set<Cliente> clientesBanco = new HashSet<>();

		clientesBanco.add(cliente1);
		clientesBanco.add(cliente2);
		clientesBanco.add(cliente3);
		clientesBanco.add(cliente4);
		clientesBanco.add(cliente5);

//		for (Cliente cl : clientesBanco) {
//
//			if (cl.getNombre().equals("Cliente1")) {
//				clientesBanco.remove(cl);
//			}
//
////			System.out.println("nombre: " + cliente.getNombre() + " numeros de cuenta: " + cliente.getnCuenta()
////					+ " el saldo en cuenta es: " + cliente.getSaldo());
//		}

		Iterator <Cliente> it = clientesBanco.iterator();
		while (it.hasNext()) {
			String nomCli = it.next().getNombre();
			if (nomCli=="Cliente2") {
				it.remove();
			}
			
		}
		
		for (Cliente cliente : clientesBanco) {

			System.out.println("nombre: " + cliente.getNombre() + " numeros de cuenta: " + cliente.getnCuenta()
					+ " el saldo en cuenta es: " + cliente.getSaldo());
		}

// Iterator<Cliente> iterador = clientesBanco.iterator();
//		while (iterador.hasNext()) {
//			String nombreCliente= iterador.next().getNombre();
//			System.out.println(nombreCliente);
//			
//			
//		}
	}

}
