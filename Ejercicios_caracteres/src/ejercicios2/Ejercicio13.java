package ejercicios2;

import java.util.Scanner;

public class Ejercicio13 {
	static Scanner t = new Scanner(System.in);

	/*Escribir un programa que convierta un número romano (en forma cadena de caracteres) en
	números arábigos.
	Reglas de conversión M(1000), D(500), C(100), L(50), X(10), V(5), I(1)*/
	
	public static void main(String[] args) {
		String cadena = introducir();
		char nr[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		if (obtenerNumero(cadena, nr) != -1) {
			System.out.println("Numero arábigo: " + obtenerNumero(cadena, nr));
		} else {
			System.out.println("Numero inválido");
		}
	}
	
	private static String introducir() {
		System.out.print("Numeros romanos: ");
		return t.nextLine();
	}

	private static int obtenerNumero(String cadena, char[] nr) {
		if (!validar(cadena, nr)) return -1;

		int n = 0;
		int a, b;

		for (int i = 0; i < cadena.length(); i++) {
			a = valorRomano(cadena.charAt(i));

			if (i + 1 < cadena.length()) {
				b = valorRomano(cadena.charAt(i + 1));
				if (a < b) {
					n -= a;
				} else {
					n += a;
				}
			} else {
				n += a;
			}
		}
		return n;
	}

	
	private static boolean validar(String cadena, char nr[]) {
		for (int i=0; i<cadena.length(); i++) {
			int sw = 0;
			for (int j=0; j<nr.length; j++) {
				if (cadena.charAt(i) == nr[j]) {
					sw = 1;
				}
			}
			if (sw == 0) return false;
		}
		return true;
	}
	
	private static int valorRomano(char c) {
		switch (c) {
			case 'M': return 1000;
			case 'D': return 500;
			case 'C': return 100;
			case 'L': return 50;
			case 'X': return 10;
			case 'V': return 5;
			case 'I': return 1;
			default: return -1;
		}
	}
}
