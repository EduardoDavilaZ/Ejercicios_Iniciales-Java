package ejercicio07;

import java.util.Scanner;

public class Empleado {
	
	private long dni;
	private String nombre;
	private double sueldo;
	private double pagoHoraExtra;
	private double hExtras;
	private int irpf;
	private boolean casado;
	private int hijos;
	
	public Empleado(long dni) {
		this.dni = dni;
	}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = scn.nextLine();
		System.out.print("Sueldo: ");
		sueldo = scn.nextDouble();
		System.out.print("Pago por hora extra: ");
		pagoHoraExtra = scn.nextDouble();
		System.out.print("Horas extra realizadas: ");
		hExtras = scn.nextDouble();
		System.out.print("IRPF: ");
		do {
			irpf = scn.nextInt();
		} while(irpf > 99 || irpf < 1);
		System.out.print("¿Está casado? (true/false): ");
		casado = scn.nextBoolean();
		System.out.print("Cantidad de hijos: ");
		hijos = scn.nextInt();
	}
	
	public double devHorasExtra() {
		return pagoHoraExtra * hExtras;
	}
	
	public double devSueldoBruto() {
		return sueldo + devHorasExtra();
	}
	
	public double retencionesIrpf() {
		if (casado) {
			irpf -= 2;
		}
		if (hijos != 0) {
			irpf -= hijos;
		}
		return (sueldo * irpf / 100);
	}
	
	public double devSueldoNeto() {
		return devSueldoBruto() - retencionesIrpf();
	}
	
	public void informacionBasica() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
	}
	
	public void informacionLaboral() {
		informacionBasica();
		System.out.println("Sueldo base: " + sueldo);
		System.out.println("Complemento de horas extra: " + devHorasExtra());
		System.out.println("Sueldo bruto: " + devSueldoBruto());
		System.out.println("Retenciones por IRPF: " + retencionesIrpf());
		System.out.println("Sueldo neto: " + devSueldoNeto());
	}
}