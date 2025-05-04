package Ejercicio07;

import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);
	
	/*Implementar una clase Matricula de coche que va a estar formada por dos variables: letra y
	número. En el método main debe crear objetos matrícula, para ello se le pedirá al usuario que
	introduzca por teclado la letra y el número. La matrícula se considerará valida si la letra
	introducida es igual a la letra „a‟ o a la letra „b‟ y si el número tiene 4 dígitos. Si la matrícula
	introducida es correcta se creará un objeto matrícula y se mostrarán por pantalla los valores de
	sus variables de ejemplar. En caso de que la letra sea incorrecta se lanzará una excepción que
	muestre un mensaje indicando que el formato es erróneo. En el caso que el número de matrícula
	introducido no tenga cuatro dígitos se lanzará una excepción que indique “Error en la longitud de
	los números”. Para lanzar estas excepciones deberá crear una excepción.*/
	
	public static void main(String[] args) {
		char letra = introducirLetra();
		char[] numero = introducirNumero();
		Matricula matricula = new Matricula(letra, numero);
		System.out.println(matricula.toString());
	}
	
	private static char introducirLetra() {
		char c = 0;
		boolean valido = false;
		
		while (!valido) {
			try {
				System.out.print("Letra: ");
				c = scn.next().charAt(0);
				if (c != 'A' && c != 'B') {
					throw new FormatoErroneo("Error de formato, la letra debe ser 'A' o 'B'.");
				}
				valido = true;
			} catch(FormatoErroneo e) {
				e.printStackTrace();
			}
		}
		
		scn.nextLine();
		return c;
	}
	
	private static char[] introducirNumero() {
		String n = "";
		boolean valido = false;
		
		while (!valido) {
			try {
				System.out.print("Número: ");
				n = scn.nextLine();
				if (n.length() != 4) {
					throw new LongitudIncorrecta("Error de la longitud.");
				}
				if (!n.matches("\\d+")) {
					throw new FormatoErroneo("Error de formato, debes introducir solo números.");
				}
				valido = true;
			} catch(FormatoErroneo e) {
				e.printStackTrace();
			} catch(LongitudIncorrecta e) {
				e.printStackTrace();
			}
		}
		
		return n.toCharArray();
	}

}
