package ejercicios1;

import java.util.Scanner;

public class Ejercicio09 {
	static Scanner t = new Scanner(System.in);
	
	/*Dada una cadena fuente y una secuencia de caracteres guardados en un array, escribir un
	método que devuelva la posición de la primera ocurrencia de cualquiera de los caracteres
	del array en la cadena.*/
	
	public static void main(String[] args) {
		String cadena = introducir("Cadena fuente: ");
		String caracteres = introducir("Caracteres: ");
		char[] c = caracteres.toCharArray();
		
		if (buscarOcurrencia(cadena, c)) {
			System.out.println("Ocurrencia encontrada");
		} else {
			System.out.println("No hay ocurrencias");
		}
	}
	
	private static String introducir(String msg) {
		System.out.print(msg);
		return t.nextLine();
	}
	
	private static boolean buscarOcurrencia(String cadena, char c[]) {
		for (int i=0; i<cadena.length(); i++) {
			for (int j=0; j<c.length; j++) {
				if (cadena.charAt(i) == c[j]) {
					System.out.println("Letra '" + c[j] + "' encontrada en la posición " + i);
					return true;
				}
			}
		}
		return false;
	}
}