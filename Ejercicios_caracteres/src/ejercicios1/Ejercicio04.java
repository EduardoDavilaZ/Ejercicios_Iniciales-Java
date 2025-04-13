package ejercicios1;

import java.util.Scanner;

public class Ejercicio04 {
	static Scanner t = new Scanner(System.in);
	/*Escribir un método que devuelva el número de ocurrencias de un carácter en una cadena.*/
	
	public static void main(String[] args) {
		String cadena = introducir("una cadena");
		char c = introducir("un caracter").charAt(0);
		int o = obtenerOcurrencias(cadena, c);
		visualizar(o, c);
	}

	private static String introducir(String msg) {
		System.out.print("Introduce " + msg + ": ");
		return t.nextLine();
	}
	
	private static int obtenerOcurrencias(String cadena, char c) {
		int cont = 0;
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i) == c) {
				cont++;
			}
		}
		return cont;
	}
	
	private static void visualizar(int o, char c) {
		if (o > 0) {
			System.out.println("Se han encontrado " + o + " ocurrencias de " + c);
		} else {
			System.out.println("No se han encontrado ocurrencias.");
		}
	}
}
