package ejercicio03;

import java.util.Scanner;

public class Casa extends Edificio{

	private int dormitorios;
	private int baños;
	
	public Casa() {}

	public void introducir() {
		Scanner scn = new Scanner(System.in);
		super.introducir();
		System.out.print("Dormitorios: ");
		dormitorios = scn.nextInt();
		System.out.print("Baños: ");
		baños = scn.nextInt();
	}

	public int getDormitorios() {
		return dormitorios;
	}

	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}

	public int getBaños() {
		return baños;
	}

	public void setBaños(int baños) {
		this.baños = baños;
	}
	
	@Override
	public String toString() {
		return "Casa [ " + super.toString() + " baños = " + baños + ", dormitorios = " + dormitorios + "]";
	}
}
