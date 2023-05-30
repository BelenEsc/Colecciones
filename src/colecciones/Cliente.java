package colecciones;

public class Cliente {

	private String nombre;
	private double saldo;
	private String nCuenta;

	public Cliente(String nombre, String nCuenta, double saldo) {
		this.nombre = nombre;
		this.nCuenta = nCuenta;
		this.saldo = saldo;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public String toString() {
		return "el nombre es: " + nombre + " el N de cuenta es: " + nCuenta + " el saldo en la cuenta es de: " + saldo;
	}
}
