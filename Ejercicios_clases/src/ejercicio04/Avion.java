package ejercicio04;

import java.util.Scanner;

public class Avion extends Aeroplano {

	private char tipoMotor;
	private double rango;
	
	public Avion() {}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		super.introducir();
		do {
			System.out.print("Tipo de motor (p/j): ");
			tipoMotor = scn.nextLine().charAt(0);
		} while(tipoMotor != 'p' && tipoMotor != 'j');
		System.out.print("Rango: ");
		rango = scn.nextDouble();
	}

	public char getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(char tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public double getRango() {
		return rango;
	}

	public void setRango(double rango) {
		this.rango = rango;
	}

	@Override
	public String toString() {
		return "Avion [ " + super.toString() +" tipoMotor = " + tipoMotor + ", rango = " + rango + "]";
	}
}
