package ejercicios1;

import java.util.Scanner;

public class Ejercicio05 {
	static Scanner t = new Scanner(System.in);
	/*Escribir un programa que solicite al usuario la longitud y anchura de una
	habitación y a continuación visualice su superficie.*/
	
	public static void main(String[] args) {
		System.out.print("Longitud: ");
		double l = t.nextDouble();
		System.out.print("Anchura: ");
		double a = t.nextDouble();
		
		System.out.println("Superficie: " + l * a);
	}
}
