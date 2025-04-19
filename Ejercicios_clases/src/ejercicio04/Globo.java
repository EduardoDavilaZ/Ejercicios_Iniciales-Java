package ejercicio04;

import java.util.Scanner;

public class Globo extends Aeroplano {

	private char tipoCombustible;
	private double altitud;
	
	public Globo() {}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		super.introducir();
		do {
			System.out.print("Tipo de combustible (h/e): ");
			tipoCombustible = scn.nextLine().charAt(0);
		} while(tipoCombustible != 'h' && tipoCombustible != 'e');
		System.out.print("Altitud: ");
		altitud = scn.nextDouble();
	}

	public char getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(char tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return "Globo [ " + super.toString() + " tipoCombustible = " + tipoCombustible + ", altitud = " + altitud + "]";
	}
}
