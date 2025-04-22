package ejercicio09;

import java.util.Scanner;

public class Empleado {
	
	private String nombre;
	private int id;

	public Empleado() {
		nombre = "";
		id = 0;
	}
	
	public void leerDatos() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = scn.nextLine();
		System.out.print("Número del empleado: ");
		id = scn.nextInt();
	}
	
	public void verDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Número del empleado: " + id);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}