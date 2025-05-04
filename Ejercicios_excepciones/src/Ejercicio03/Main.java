package Ejercicio03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	/*Escribir un programa java, capaz de dividir un array de 10 elementos que se introducen
	desde teclado, entre 10 números aleatorios. Deberemos controlar las siguientes excepciones:
	a. Array más allá de su rango.
	b. Imposibilidad de introducir caracteres no numéricos.
	c. Posible división entre valor 0.*/

	public static void main(String[] args) {
		int[] t = new int[10];
		introducir(t);
		visualizar(t);
		dividir(t);
		visualizar(t);
	}
	
	private static void introducir(int t[]) {
		Scanner scn = new Scanner(System.in);
		for (int i=0; i<t.length; i++) {
			boolean valido = false;
			while (!valido) {
			    try {
			        System.out.print("T[" + i + "]: ");
			        t[i] = scn.nextInt();
			        valido = true;
			    } catch (InputMismatchException e) {
			        System.out.println("Introduce un número válido.");
			        scn.next();
			    }
			}
		}
	}
	
	private static void dividir(int t[]) {
		int[] r = arrayAleatorio();
		visualizar(r);
		for (int i=0; i<t.length; i++) {
			try {
				t[i] = t[i] / r[i];
			} catch(ArithmeticException e) {
				System.out.print("No se puede dividir entre 0.\n");
				t[i] = 0;
				//e.printStackTrace();
			}
				
		}
	}
	
	private static void visualizar(int t[]) {
		try {
			for (int i=0; i<=t.length; i++) {
				System.out.print("\t" + t[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("\nFuera de rango");
		}
		System.out.println();
	}
	
	private static int[] arrayAleatorio() {
		int[] t = new int[10];
		for (int i=0; i<t.length; i++) {
			Random rand = new Random();
			t[i] = rand.nextInt(10);
		}
		return t;
	}
}