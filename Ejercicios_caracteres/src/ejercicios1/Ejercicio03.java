package ejercicios1;

import java.util.Scanner;

public class Ejercicio03 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un método que introduzca una cadena y un carácter y visualice la posición que se
	encuentra el primer carácter que estamos buscando.*/
	
	public static void main(String[] args) {
		String cadena = introducir("una cadena");
		char c = introducir("un caracter").charAt(0);
		int p = obtenerPrimeraPos(cadena, c);
		visualizar(p, c);
	}

	private static String introducir(String msg) {
		System.out.print("Introduce " + msg + ": ");
		return t.next();
	}
	
	private static int obtenerPrimeraPos(String cadena, char c) {
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}
	
	private static void visualizar(int p, char c) {
		if (p != -1) {
			System.out.println("Primera posición de '" + c + "' es: " + p);
		} else {
			System.out.println("No se encuentra el caracter.");
		}
	}
}
