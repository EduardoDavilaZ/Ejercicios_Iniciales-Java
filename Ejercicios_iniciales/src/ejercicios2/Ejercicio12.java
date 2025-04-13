package ejercicios2;

import java.util.Scanner;

public class Ejercicio12 {

	static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que lea tres enteros y emita un mensaje que indique si
	están o no en orden numérico.*/
	
	public static void main(String[] args) {
		int[] n = new int[3];
		
		introducir(n);
		if (comprobar(n)) {
			System.out.println("Estan ordenados");
		} else {
			System.out.println("No están ordenados");
		}
	}
	
	private static void introducir(int[] n) {
		for (int i=0; i < n.length; i++) {
			System.out.print("Introduce[" + i + "] : ");
			n[i] = t.nextInt();
		}
	}
	
	private static boolean comprobar(int[] n) {
		for (int i=0; i < n.length - 1; i++) {
			if (n[i] > n[i+1]) return false;
		}
		return true;
	}
}
