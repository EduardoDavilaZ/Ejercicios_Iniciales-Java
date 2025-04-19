package ejercicio01;

import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private String direccion;
	private Fecha fechaNac;
	private char sexo;

	public Persona(String nombre, String direccion, Fecha fechaNac, char sexo) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
	}
	
	public void introducir() {
		Scanner t = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = t.nextLine();
		System.out.print("Direccion: ");
		direccion = t.nextLine();
		System.out.print("Fecha de nacimiento: ");
		fechaNac = new Fecha();
		do {
			fechaNac.introducir();
		} while(!fechaNac.validarFecha());
		System.out.print("Sexo: ");
		sexo = t.nextLine().charAt(0);
	}
	
	public void visualizar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		fechaNac.visualizar();
		System.out.println("Sexo: " + sexo);
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}