package ejercicio02;

import java.util.Scanner;

public class Director extends Gerente{
	
	private String empresa;

	public Director() {}

	public void introducir() {
		Scanner t = new Scanner(System.in);
		super.introducir();
		System.out.print("Empresa a cargo: ");
		empresa = t.nextLine();
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Empresa a cargo: " + empresa);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
