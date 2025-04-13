package ejercicios1;

import java.util.Scanner;

public class Ejercicio02 {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir un método que determine si una cadena de caracteres es un palíndromo (un
	palíndromo es aquella cadena que se lee igual de izquierda a derecha que de derecha a
	izquierda).*/
	
	public static void main(String[] args) {
		String cadena = introducir();
		if (esPalindromo(cadena)) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
	}
	
	private static String introducir() {
		System.out.print("Introduce: ");
		return scn.nextLine();
	}

	private static boolean esPalindromo(String cadena) {
		cadena = quitarEspacios(cadena);
		for (int i=0; i<cadena.length() / 2; i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length()-i-1)) {
				return false;
			}
		}
		return true;
	}

	private static String quitarEspacios(String cadena) {
		return cadena.replace(" ", "");
	}
}
