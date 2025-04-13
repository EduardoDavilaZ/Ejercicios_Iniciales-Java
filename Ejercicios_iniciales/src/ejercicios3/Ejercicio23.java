package ejercicios3;

import java.util.Scanner;

public class Ejercicio23 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que lea un entero positivo y a continuación llame a un
	método que visualice sus factores primos.*/
	
	public static void main(String[] args) {
		System.out.print("Introduce un número: ");
		int n = t.nextInt();
		
		visualizarFactores(n);
	}
	
	public static void visualizarFactores(int n) {
		System.out.println("Factores primos: ");
		for (int i=1; i<=n; i++) {
			if (n % i == 0 && esPrimo(i)) {
				System.out.println(" - " + i);
			}
		}
	}

	public static boolean esPrimo(int n) {
		int i = 2;
		while(i < n && n % i != 0) {
			i++;
		}
		return i == n ? true : false;
	}
}
