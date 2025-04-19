package ejercicios2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio11 {
	static Scanner t = new Scanner(System.in);
	
	/*Haciendo uso de la cadena StringTockenizer, obtener una cadena leída del flujo de entrada
	todos los números decimales; se supone que están separados por un blanco o fin de línea.*/
	
	public static void main(String[] args) {
		String cadena = introducir();
		visualizar(cadena);
	}

	private static String introducir() {
		System.out.print("Cadena: ");
		return t.nextLine();
	}
	
	private static void visualizar(String cadena) {
		StringTokenizer st = new StringTokenizer(cadena);

		while(st.hasMoreTokens()) {
			String aux = st.nextToken();
			if (esDecimal(aux)) {
				System.out.println(aux);
			}
		}
	}
	
	private static boolean esDecimal(String c) {
		try {
		    @SuppressWarnings("unused")
			float f = Float.parseFloat(c);
		} catch (NumberFormatException e) {
		    return false;
		}
		return true;
	}
}
