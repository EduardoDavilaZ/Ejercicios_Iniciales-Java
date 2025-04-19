package ejercicio01;

import java.util.Scanner;

public class Estudiante extends Persona{

	private int nExpediente;
	private int nota;
	
	public Estudiante(String nombre, String direccion, Fecha fechaNac, char sexo, int nExpediente, int nota) {
		super(nombre, direccion, fechaNac, sexo);
		this.nExpediente = nExpediente;
		this.nota = nota;
	}
	
	public void introducir() {
		Scanner t = new Scanner(System.in);
		super.introducir();
		System.out.print("Numero de expediente: ");
		nExpediente = t.nextInt();
		System.out.print("Notas: ");
		nota = t.nextInt();
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("N Expediente: " + nExpediente);
		System.out.println("Nota: " + nota);
	}

	public int getnExpediente() {
		return nExpediente;
	}

	public void setnExpediente(int nExpediente) {
		this.nExpediente = nExpediente;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
}
