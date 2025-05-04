package Ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);
	
	/*Escribir el código de un programa en el cual se defina un bloque try y dos manejadores catch, de
	forma que cuando se genere la excepción que es capturada por el catch descrito, pero que
	posteriormente a mostrarnos la excepción nos vuelva al código hasta que se introduzcan los
	datos sin errores. 
	Escribir un programa en el que se genere la excepción del ejercicio anterior y se capture.*/

	public static void main(String[] args) {
		int a, b;
		boolean valido = false;
		while(!valido) {
			try {
				System.out.print("Primer número: ");
				a = scn.nextInt();
				System.out.print("Segundo número: ");
				b = scn.nextInt();
				System.out.println("División: " + a / b);
				valido = true;
			} catch(InputMismatchException e) {
				System.out.println("Introduce solo números.");
				scn.next();
			} catch(ArithmeticException e) {
				System.out.println("No es posible la división entre 0.");
			}
		}
	}
}
