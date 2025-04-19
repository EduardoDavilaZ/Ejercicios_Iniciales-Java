package ejercicios2;

import java.util.Scanner;

public class Ejercicio14 {
	static Scanner t = new Scanner(System.in);

	/*Realizar un programa para jugar al ahorcado. Sugerencia: almacenar una lista de palabras en
	un array y seleccionar palabras aletoriamente.*/
	
	public static void main(String[] args) {
		String[] palabras = {"programacion", "abstracion", "encapsulamiento", "herencia", "polimorfismo"};
		String cadena = palabras[(int) (Math.random() * (palabras.length-1))];
		String cadenaOculta = ocultar(cadena);
		
		ahorcado(cadena, cadenaOculta, 10);
	}
	
	private static String ocultar(String cadena) {
		String nuevaCadena = "";
		for (int i=0; i<cadena.length(); i++) {
			nuevaCadena += "_";
		}
		return nuevaCadena;
	}
	
	private static void ahorcado(String cadena, String cadenaOculta, int i) {
		do {
			visualizar(cadenaOculta);
			char c = t.nextLine().charAt(0);
			if (actualizar(cadena, cadenaOculta, c) != null) {
				cadenaOculta = actualizar(cadena, cadenaOculta, c);
			} else {
				i--;
			}
		} while (i > 0 && !cadena.equals(cadenaOculta));
		visualizar(cadenaOculta);
		resultado(i);
	}
	
	private static String actualizar(String cadena, String cadenaOculta, char c) {
		char aux[] = cadenaOculta.toCharArray();
		if (cadena.indexOf(c) != -1) {
			for (int i=0; i<cadena.length(); i++) {
				if (cadena.charAt(i) == c) {
					aux[i] = c;
				}
			}
			cadenaOculta = new String(aux);
			return cadenaOculta;
		}
		return null;
	}
	
	private static void visualizar(String cadena) {
		System.out.println(cadena);
	}
	
	private static void resultado(int i) {
		if (i > 0) {
			System.out.println("Ganaeste!");
		} else {
			System.out.println("Perdiste!");
		}
	}
}