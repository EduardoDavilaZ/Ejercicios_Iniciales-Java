package ejercicio02;

import java.util.Scanner;

public class Gerente extends Supervisor{
	
	private String departamento;

	public Gerente() {}
	
	public void introducir() {
		Scanner t = new Scanner(System.in);
		super.introducir();
		System.out.print("Departamento: ");
		departamento = t.nextLine();
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Departamento: " + departamento);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
