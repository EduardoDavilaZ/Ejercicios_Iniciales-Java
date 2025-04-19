package ejercicios1;

import java.util.Scanner;

public class Ejercicio07 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un método que tenga tres argumentos, el primero un array de cadenas, el segundo
	una cadena c1 y el tercero la cadena c2. Se quiere reemplazar todas las ocurrencias de c1
	por c2.*/
	
	public static void main(String[] args) {
		String c[] = introducirArray("Cadena principal: ");
		String c1 = introducir("Cadena a reemplazar: ");
		String c2 = introducir("Cadena nueva: ");
		
		reemplazar(c, c1, c2);
		visualizar(c);
	}
	
	private static String[] introducirArray(String msg) {
		String c[] = new String[30];
		int i = -1;
		System.out.print(msg);
		do {
			i++;
			c[i] = t.nextLine();
		} while(!c[i].equals("FIN"));
		return c;
	}

	private static String introducir(String msg) {
		System.out.print(msg);
		return t.nextLine();
	}
	
	private static void reemplazar(String c[], String c1, String c2) {
		for (int i=0; i<c.length; i++) {
			if (c[i] != null) {
				c[i] = c[i].replace(c1, c2);
			}
		}
	}
	
	private static void visualizar(String[] c) {
		for (int i=0; i<c.length; i++) {
			if (c[i] != null) {
				System.out.println(c[i]);
			}
		}
	}
}