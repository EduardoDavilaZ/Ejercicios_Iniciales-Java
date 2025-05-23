package ejercicios3;

import java.util.Scanner;

public class Ejercicio22 {
	static Scanner t = new Scanner(System.in);
	
	/*Determinar si un número leído desde teclado es primo o no.*/
	
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("Numero: ");
			n = t.nextInt();
			if (esPrimo(n)) {
				System.out.println("Es primo");
			} else {
				System.out.println("No es primo");
			}
		} while(n != 0);

	}
	
	public static boolean esPrimo(int n) {
		int i;
		for (i = 2; i < n && n % i != 0; i++);
		return i == n ? true : false;
	}
}
