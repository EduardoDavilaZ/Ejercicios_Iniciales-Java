package ejercicios1;

import java.util.Scanner;

public class Ejercicio08 {
	static Scanner t = new Scanner(System.in);
	
	/*Escribir un método que tenga como argumento una cadena con la fecha en formato:
	dd/mm/aa y devuelva una cadena con la fecha en formato dd de mes (nominal) de año. Por
	ejemplo 23/12/1999 debe transformarse a 23 de diciembre de 1999.*/
	
	public static void main(String[] args) {
		String fecha = introducir();
		fecha = formatoNominal(fecha);
		if (fecha != null) {
			System.out.println(fecha);
		} else {
			System.out.println("Fecha no válida");
		}
	}
	
	private static String introducir() {
		System.out.print("Fecha en formato dd/mm/aaaa: ");
		return t.nextLine();
	}
	
	private static boolean validaciones(String fecha) {
		if (fecha.length() != 10) {
			return false;
		}
		int c = 0;
		for (int i=0; i<fecha.length(); i++) {
			if (fecha.charAt(i) == '/') {
				c++;
			} else {
				if (!Character.isDigit(fecha.charAt(i))) {
					return false;
				}
			}
		}
		if (c != 2) {
			return false;
		}
		return true;
	}
	
	private static String formatoNominal(String fecha) {
	    if (!validaciones(fecha)) return null;

	    String d = fecha.substring(0, 2);
	    String m = obtenerMes(fecha.substring(3, 5));
	    String a = fecha.substring(6, 10);
	    
	    if (m == null) return null;
	    
	    return d + " de " + m + " de " + a;
	}
	
	private static String obtenerMes(String m) {
		switch (m) {
			case "01": return "enero";
			case "02": return "febrero";
			case "03": return "marzo";
			case "04": return "abril";
			case "05": return "mayo";
			case "06": return "junio";
			case "07": return "julio";
			case "08": return "agosto";
			case "09": return "septiembre";
			case "10": return "octubre";
			case "11": return "noviembre";
			case "12": return "diciembre";
			default: return null;
		}
	}
}
