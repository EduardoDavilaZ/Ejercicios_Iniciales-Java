package Ejercicio06;

import java.util.Scanner;

public class Main {
	
	/*Definir una clase para tratar los errores en el manejo de cadena de caracteres. A continuación,
	definir una subclase para tratar el error supuesto de cadenas de longitud mayor de 30
	caracteres, y otra subclase que maneje los errores de cadenas que tienen caracteres no
	alfabéticos.
	Escribir un programa java en el que se de una entrada a cadena de caracteres y se capturen
	excepciones del tipo mencionado antes*/

	public static void main(String[] args) {
		String cadena = introducir();
		visualizar(cadena);
	}
	
	private static String introducir () {
		Scanner scn = new Scanner(System.in);
		String cadena = "";
		boolean valido = false;
		while(!valido) {
			try {
				System.out.print("Introduce: ");
				cadena = scn.nextLine();
				if (cadena.length() > 30) {
					throw new LongitudFueraDeRango("La cadena excede los 30 caracteres.");
				}
				if (!validarCaracteres(cadena)) {
	                throw new CaracteresNoAlfabeticos("La cadena contiene caracteres no alfabéticos.");
	            }
				valido = true;
			} catch(LongitudFueraDeRango e) {
				e.printStackTrace();
			} catch(CaracteresNoAlfabeticos e) {
				e.printStackTrace();
			}
		}
		return cadena;
	}
	
	private static void visualizar (String cadena) {
		System.out.println(cadena);
	}
	
	public static boolean validarCaracteres(String cadena) {
        return cadena.matches("[a-zA-Z]+");
    }
}