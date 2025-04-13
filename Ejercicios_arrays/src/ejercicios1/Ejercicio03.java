package ejercicios1;

import java.util.Scanner;

public class Ejercicio03 {
	static Scanner scn = new Scanner(System.in);

	/*Escribir un programa que lea las dimensiones de una matriz, lea y visualice la
	matriz y a continuación encuentre el mayor y menor elemento de la matriz y sus
	posiciones.*/
	
	public static void main(String[] args) {
		int x = dimensionar("ancho");
		int y = dimensionar("alto");
		int t[][] = new int[y][x];
		introducir(t);
		buscar(t);
	}
	
	private static int dimensionar(String msg) {
		System.out.print("Introduce el " + msg + ": ");
		int n = scn.nextInt();
		return n;
	}
	
	private static void introducir(int t[][]) {
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				System.out.print("T["+i+"]["+j+"]: ");
				t[i][j] = scn.nextInt();
			}
		}
	}
	
	private static void buscar(int t[][]) {
		int[] mayor = new int[3];
		int[] menor= new int[3];
		
		for (int i=0; i<t.length; i++) {
			for (int j=0; j<t[0].length; j++) {
				if (t[i][j] > mayor[0] || (i == 0 && j == 0)) {
					mayor[0] = t[i][j];
					mayor[1] = i;
					mayor[2] = j;
				}
				
				if (t[i][j] < menor[0] || (i == 0 && j == 0)) {
					menor[0] = t[i][j];
					menor[1] = i;
					menor[2] = j;
				}
			}
		}
		
		visualizar(mayor, "mayor");
		visualizar(menor, "menor");
	}

	private static void visualizar(int t[], String msg) {
		System.out.println("El " + msg + " es: " + t[0]);
		System.out.println("Posicion: " + "(" + t[1] + ", " + t[2] + ").");
	}
}
