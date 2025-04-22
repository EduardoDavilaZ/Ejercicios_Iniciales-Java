package ejercicio10;

import java.util.Scanner;

public class Coche extends Vehiculo{
	
	private int numPlazas;
	
	public Coche() {
		numPlazas = 1;
	}
	
	public Coche(int potencia, int numPlazas) {
		super(potencia);
		this.numPlazas = numPlazas;
	}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		super.introducir();
		System.out.print("Plazas del coche: ");
		numPlazas = scn.nextInt();
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Plazas del coche: " + numPlazas);
	}

}
