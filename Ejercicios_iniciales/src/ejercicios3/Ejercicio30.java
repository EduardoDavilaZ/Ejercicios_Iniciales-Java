package ejercicios3;

import java.util.Scanner;

public class Ejercicio30 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que determine todos los años bisiestos del siglo XXI. Un
	año es bisiesto si es divisible por 400, o si es divisible por 4 pero no por 100.*/
	
	public static void main(String[] args) {
		System.out.println("Años bisiestos del siglo XXI");
		for (int i=2000; i<2100; i++) {
			if (esBisiesto(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean esBisiesto(int a) {
		return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
	}
}
