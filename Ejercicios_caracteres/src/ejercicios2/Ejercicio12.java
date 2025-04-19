package ejercicios2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio12 {
	static Scanner t = new Scanner(System.in);

	/*Escribir un programa que tenga como entrada una palabra y n líneas. Se quiere determinar el
	número de veces que se encuentra la palabra en las n líneas.*/
	
	public static void main(String[] args) {
		int tam = dimensionar();
		String lineas[] = new String[tam];
		introducirArray(lineas);
		String palabra = introducir();
		System.out.println("Numero de ocurrencias: " + contarOcurrencias(lineas, palabra));
	}
	
	private static int dimensionar() {
		System.out.print("Tamaño: ");
		return t.nextInt();
	}
	
	private static void introducirArray(String[] lineas) {
		t.nextLine();
		for (int i=0; i<lineas.length; i++) {
			System.out.print("- ");
			lineas[i] = t.nextLine();
		}
	}
	
	private static String introducir() {
		System.out.print("Palabra: ");
		return t.nextLine();
	}
	
	private static int contarOcurrencias(String[] lineas, String palabra) {
		int c = 0;
		for (int i=0; i<lineas.length; i++) {
			StringTokenizer tk = new StringTokenizer(lineas[i]);
			while(tk.hasMoreTokens()) {
				if (palabra.equals(tk.nextToken())) {
					c++;
				}
			}
		}
		return c;
	}
}
