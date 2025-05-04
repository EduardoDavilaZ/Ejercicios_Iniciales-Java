package Ejercicio02;

import java.util.Scanner;

public class Ecuacion {
	
	private int a;
	private int b;
	private int c;

	public Ecuacion() {
		a = b = c = 1;
	}
	
	public void introducir() {
		Scanner scn = new Scanner(System.in);
		System.out.print("A: ");
		a = scn.nextInt();
		System.out.print("B: ");
		b = scn.nextInt();
		System.out.print("C: ");
		c = scn.nextInt();
	}
	
	public double primerResultado() {
	    return ((-1.0 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
	}

	public double segundoResultado() {
	    return ((-1.0 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
