package ejercicios1;

import java.util.Scanner;

public class Ejercicio01 {
static Scanner t = new Scanner(System.in);
	
	/*Escribir un programa que tenga como entrada una cadena y devuelva el número de vocales,
	de consonantes y de dígitos de la cadena.*/
	
	public static void main(String[] args) {
		String cadena = null;
		cadena = introducir();
		System.out.println("Vocales: " + obtenerVocales(cadena));
		System.out.println("Consonantes: " + obtenerConsonantes(cadena));
		System.out.println("Digitos: " + obtenerDigitos(cadena));
	}
	
	private static String introducir() {
		System.out.print("Introduce: ");
		return t.nextLine();
	}

	private static int obtenerVocales(String cadena) {
		cadena = cadena.toLowerCase();
		int cont = 0;
		for (int i=0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isLetter(c) && "aeiou".contains(String.valueOf(c))) {
				cont++;
			}
		}
		return cont;
	}

	private static int obtenerConsonantes(String cadena) {
		cadena = cadena.toLowerCase();
		int cont = 0;
		for (int i=0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (Character.isLetter(c) && !"aeiou".contains(String.valueOf(c))) {
				cont++;
			}
		}
		return cont;
	}

	private static int obtenerDigitos(String cadena) {
		return cadena.length();
	}
}
