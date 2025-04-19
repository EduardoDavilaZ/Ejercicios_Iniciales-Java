package ejercicio02;

import java.util.Scanner;

import ejercicio01.Fecha;

public class Empleado {

	private String nombre;
	private String direccion;
	private Fecha fechaNac;
	
	public Empleado() {}
	
	public void introducir () {
		Scanner t = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = t.nextLine();
		System.out.print("Dirección: ");
		direccion = t.nextLine();
		System.out.print("Fecha: ");
		fechaNac = new Fecha();
		do {
			fechaNac.introducir();
		} while(!fechaNac.validarFecha());
	}
	
	public void visualizar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		fechaNac.visualizar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Fecha getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Fecha fechaNac) {
		this.fechaNac = fechaNac;
	}
}
