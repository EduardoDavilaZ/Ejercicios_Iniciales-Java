package ejercicios1;

import java.util.Scanner;

/*Escribir un programa para calcular la longitud de la circunferencia y el área del
círculo para un radio introducido por teclado.*/

public class Ejercicio02 {
	static Scanner t = new Scanner(System.in);
	public static double pi = 3.1416;
	
	public static void main(String[] args) {
		double r;
		System.out.print("Introducir radio: ");
		r = t.nextDouble();
		
		System.out.println("Circunferencia: " + calcularCircunferencia(r));
		System.out.println("Area: " + calcularArea(r));
	}

	private static double calcularCircunferencia(double r) {
		return 2 * pi * r;
	}
	
	private static double calcularArea(double r) {
		return pi * r * r;
	}
}