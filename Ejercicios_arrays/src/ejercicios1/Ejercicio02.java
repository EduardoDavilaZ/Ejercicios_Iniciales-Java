package ejercicios1;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir una tabla con los 10 primeros números primos y los visualice.*/
	
	public static void main(String[] args) {
		int[] p = new int[10];
		introducir(p);
		visualizar(p);
	}
	
	private static void introducir(int[] p) {
		int primos = 0, i = 1;
		while(primos <= 9) {
			if (esPrimo(i)) {
				p[primos] = i;
				primos++;
			}
			i++;
		}
	}
	
	private static void visualizar(int[] p) {
		for (int i=0; i<p.length; i++) {
			System.out.print("\t" + p[i]);
		}
	}

	private static boolean esPrimo(int n) {
		int i;
		for (i = 2; i < n && n % i != 0; i++);
		return i == n ? true : false;
	}
}
