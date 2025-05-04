package ejercicio10;

import java.util.Scanner;

public class Vehiculo {
	
	private int potencia;
	
	public Vehiculo() {}
	
	public Vehiculo(int potencia) {
		this.potencia = potencia;
	}

	public void introducir() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Potencia: ");
		potencia = scn.nextInt();
	}
	
	public void visualizar() {
		System.out.println("Potencia: " + potencia);
	}
}