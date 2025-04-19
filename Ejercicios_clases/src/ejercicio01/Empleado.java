package ejercicio01;

import java.util.Scanner;

public class Empleado extends Persona{

	private int nss;
	private double sueldo;
	
	public Empleado(String nombre, String direccion, Fecha fechaNac, char sexo, int nss, double sueldo) {
		super(nombre, direccion, fechaNac, sexo);
		this.nss = nss;
		this.sueldo = sueldo;
	}

	public void introducir() {
		Scanner t = new Scanner(System.in);
		super.introducir();
		System.out.print("Numero de expediente: ");
		nss = t.nextInt();
		System.out.print("Sueldo: ");
		sueldo = t.nextDouble();
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("NSS: " + nss);
		System.out.println("Sueldo: " + sueldo);
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
