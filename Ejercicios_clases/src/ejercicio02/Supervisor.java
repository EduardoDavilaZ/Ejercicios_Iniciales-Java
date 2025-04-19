package ejercicio02;

import java.util.Scanner;

public class Supervisor extends Empleado{
	
	private int empleados;

	public Supervisor() {}

	public void introducir() {
		Scanner t = new Scanner(System.in);
		super.introducir(); 
		System.out.print("Empleados a cargo: ");
		empleados = t.nextInt();
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Empleados a cargo: " + empleados);
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}
}
