package ejercicio04;

import java.util.Scanner;

public class Aeroplano {

	private int pasajeros;
	private double carga;
	
	public Aeroplano() {}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Pasajeros: ");
		pasajeros = scn.nextInt();
		System.out.print("Cantidad de carga: ");
		carga = scn.nextDouble();
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Aeroplano [pasajeros = " + pasajeros + ", carga = " + carga + "]";
	}
}
