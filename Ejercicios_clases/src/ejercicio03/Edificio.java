package ejercicio03;

import java.util.Scanner;

public class Edificio {

	private int plantas;
	private int habitaciones;
	private double superficie;
	
	public Edificio() {}

	public void introducir() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Plantas: ");
		plantas = scn.nextInt();
		System.out.print("Habitaciones: ");
		habitaciones = scn.nextInt();
		System.out.print("Superficie: ");
		superficie = scn.nextDouble();
	}
	
	public int getPlantas() {
		return plantas;
	}

	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Edificio [plantas = " + plantas + ", habitaciones = " + habitaciones + ", superficie = " + superficie + "]";
	}
}