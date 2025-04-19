package ejercicios1;

import java.util.Scanner;

public class Ejercicio10 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un método que tenga como argumento un array de cadenas y escriba por pantalla
	aquellas cadenas que tengan las cinco vocales.*/
	
	public static void main(String[] args) {
		int tam = introducir("Tamaño: ");
		String[] cadenas = new String[tam];
		introducirArray(cadenas);
		visualizar(cadenas);
	}

	private static int introducir(String msg) {
		System.out.print(msg);
		int n = t.nextInt();
		t.nextLine();
		return n;
	}

	private static void introducirArray(String[] cadenas) {
		for (int i=0; i<cadenas.length; i++) {
			cadenas[i] = t.nextLine();
		}
	}
	
	private static void visualizar(String[] cadenas) {
		for (int i=0; i<cadenas.length; i++) {
			if (tieneCincoVocales(cadenas[i])){
				System.out.println(cadenas[i]);
			}
		}
	}
	
	private static boolean tieneCincoVocales(String cadena) {
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		
		for (int i=0; i<vocales.length; i++) {
			if (cadena.indexOf(vocales[i]) == -1) {
				return false;
			}
		}
		
		return true;
	}
}
