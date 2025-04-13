package ejercicios1;

import java.util.Scanner;

public class Ejercicio06 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un método que transforme una cadena formada por dígitos hexadecimales en un
	entero largo. El método devuelve una cadena con los caracteres del número entero, o null si
	no es posible la conversión.*/
	
	public static void main(String[] args) {
		String hex = introducir();
		String resultado = convertir(hex);
		System.out.println("Resultado: " + resultado);
	}
	
	private static String introducir() {
		System.out.print("Introduce el numero hexadecimal: ");
		return t.nextLine();
	}
	
	private static String convertir(String hex) {
		long resultado = Long.parseLong(hex, 16);
		return String.valueOf(resultado);
	}
}
